package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.adjust.sdk.sig.r3;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tb2 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ vb2 h;

    public tb2(vb2 vb2Var) {
        this.h = vb2Var;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        gf gfVar = (gf) this.e.get(str);
        if ((gfVar != null ? gfVar.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                gfVar.a.j(gfVar.b.R(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new xe(intent, i2));
        return true;
    }

    public final void b(int i, mh3 mh3Var, Object obj, eb3 eb3Var) {
        Bundle bundle;
        int i2;
        vb2 vb2Var = this.h;
        ze zeVarI = mh3Var.I(vb2Var, obj);
        if (zeVarI != null) {
            new Handler(Looper.getMainLooper()).post(new fe1(this, i, zeVarI, 1));
            return;
        }
        Intent intentU = mh3Var.u(vb2Var, obj);
        if (intentU.getExtras() != null) {
            Bundle extras = intentU.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                intentU.setExtrasClassLoader(vb2Var.getClassLoader());
            }
        }
        if (intentU.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = intentU.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentU.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = eb3Var != null ? ((ue) eb3Var).Z.toBundle() : null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentU.getAction())) {
            String[] stringArrayExtra = intentU.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            rd.Z(vb2Var, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentU.getAction())) {
            vb2Var.startActivityForResult(intentU, i, bundle2);
            return;
        }
        j77 j77Var = (j77) intentU.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            j77Var.getClass();
            i2 = i;
            try {
                vb2Var.startIntentSenderForResult(j77Var.a, i2, j77Var.b, j77Var.c, j77Var.d, 0, bundle2);
            } catch (IntentSender.SendIntentException e) {
                e = e;
                new Handler(Looper.getMainLooper()).post(new fe1(this, i2, e, 2));
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }

    public final jf c(String str, mh3 mh3Var, ye yeVar) {
        str.getClass();
        d(str);
        this.e.put(str, new gf(yeVar, mh3Var));
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            yeVar.j(obj);
        }
        Bundle bundle = this.g;
        xe xeVar = (xe) abg.C(bundle, str, xe.class);
        if (xeVar != null) {
            bundle.remove(str);
            yeVar.j(mh3Var.R(xeVar.b, xeVar.a));
        }
        return new jf(this, str, mh3Var, 1);
    }

    public final void d(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : (el2) fyc.t(new q(7))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        r3.n("Sequence contains no element matching the predicate.");
    }

    public final void e(String str) {
        Integer num;
        str.getClass();
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        LinkedHashMap linkedHashMap = this.f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbP = tec.p("Dropping pending result for request ", str, ": ");
            sbP.append(linkedHashMap.get(str));
            b1.l("ActivityResultRegistry", sbP.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            b1.l("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((xe) abg.C(bundle, str, xe.class)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.c;
        hf hfVar = (hf) linkedHashMap2.get(str);
        if (hfVar != null) {
            ArrayList arrayList = hfVar.b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hfVar.a.b((u48) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
