package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xcd implements kb3 {
    public final zcd a;
    public final ycd b;
    public final Context c;
    public final String d;
    public final ace e;
    public final Set f;

    public xcd(x16 x16Var, Set set, zcd zcdVar, ycd ycdVar, Context context, String str) {
        this.a = zcdVar;
        this.b = ycdVar;
        this.c = context;
        this.d = str;
        this.e = new ace(x16Var);
        this.f = set == bdd.a ? null : s72.n1(set);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, zn2 zn2Var) {
        wcd wcdVar;
        if (zn2Var instanceof wcd) {
            wcdVar = (wcd) zn2Var;
            int i = wcdVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                wcdVar.label = i - Integer.MIN_VALUE;
            } else {
                wcdVar = new wcd(this, zn2Var);
            }
        } else {
            wcdVar = new wcd(this, zn2Var);
        }
        Object objZ = wcdVar.result;
        int i2 = wcdVar.label;
        boolean z = true;
        if (i2 == 0) {
            jzb.q(objZ);
            wcdVar.label = 1;
            objZ = this.a.z(obj, wcdVar);
            bw2 bw2Var = bw2.a;
            if (objZ == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objZ);
        }
        if (!((Boolean) objZ).booleanValue()) {
            return Boolean.FALSE;
        }
        ace aceVar = this.e;
        Set set = this.f;
        if (set == null) {
            Map<String, ?> all = ((SharedPreferences) aceVar.getValue()).getAll();
            all.getClass();
            if (all.isEmpty()) {
                z = false;
            }
        } else {
            Set set2 = set;
            SharedPreferences sharedPreferences = (SharedPreferences) aceVar.getValue();
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z = false;
            } else {
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
