package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import io.sentry.q6;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zv6 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zv6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int largeMemoryClass;
        rg2 rg2Var;
        int i = this.a;
        boolean z = true;
        wef wefVar = wef.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Context context = (Context) ((di2) obj).a;
                double d = 0.2d;
                try {
                    Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d || d > 1.0d) {
                    qc0.j("percent must be in the range [0.0, 1.0].");
                    return null;
                }
                sug sugVar = new sug(15, (byte) 0);
                try {
                    Object systemService2 = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService2.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService2;
                    largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    break;
                } catch (Exception unused2) {
                    largeMemoryClass = 256;
                }
                long j = (long) (d * ((long) largeMemoryClass) * q6.MAX_EVENT_SIZE_BYTES);
                xj0 xj0Var = new xj0();
                xj0Var.a = j;
                xj0Var.b = sugVar;
                y21 y21Var = new y21();
                y21Var.d = xj0Var;
                y21Var.c = new LinkedHashMap(0, 0.75f, true);
                y21Var.a = j;
                if (j > 0) {
                    xj0Var.c = y21Var;
                    return new qib(xj0Var, sugVar);
                }
                qc0.j("maxSize <= 0");
                throw null;
            case 1:
                Object systemService3 = ((View) ((ta0) obj).c).getContext().getSystemService("input_method");
                systemService3.getClass();
                return (InputMethodManager) systemService3;
            case 2:
                Object systemService4 = ((View) ((k47) obj).b).getContext().getSystemService("input_method");
                systemService4.getClass();
                return (InputMethodManager) systemService4;
            case 3:
                QuotaUsage quotaUsageB = ((eab) ((g87) obj).R0).b();
                return Boolean.valueOf(quotaUsageB != null ? pa7.t(quotaUsageB.getNeverPurchased(), Boolean.TRUE) : false);
            case 4:
                w5c w5cVar = ((jb7) obj).a;
                if (w5cVar.k() && !w5cVar.o()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                oc7 oc7Var = (oc7) obj;
                oc7Var.getClass();
                oc7Var.f(new lc7(oc7Var, null));
                return wefVar;
            case 6:
                Object obj2 = ((ao7) obj).a;
                hs7 hs7Var = obj2 instanceof hs7 ? (hs7) obj2 : null;
                if (hs7Var != null) {
                    return hs7Var.findJavaDeclaration();
                }
                return null;
            case 7:
                LayoutNode.a((LayoutNode) obj);
                return wefVar;
            case 8:
                zv7 zv7Var = (zv7) obj;
                if (!((Boolean) zv7Var.g.getValue()).booleanValue() && (rg2Var = zv7Var.c) != null) {
                    rg2Var.n();
                }
                return wefVar;
            case 9:
                return Integer.valueOf(((zw7) ((jx7) obj).e.getValue()).m);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                oa4 oa4Var = ((oz7) obj).j;
                if (oa4Var != null) {
                    qn4.G(oa4Var);
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return new BaseInputConnection(((s38) obj).a, false);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                zk8 zk8Var = (zk8) ((e58) obj).a.b;
                if (!zk8Var.b) {
                    if (zk8Var.c) {
                        fpa.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    zk8Var.a();
                    zk8Var.c = true;
                }
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return Float.valueOf(((eh8) obj).d());
            case 14:
                ListIterator listIterator = ((iu8) obj).a.listIterator();
                while (true) {
                    ql6 ql6Var = (ql6) listIterator;
                    if (!ql6Var.hasNext()) {
                        return wefVar;
                    }
                    fwc fwcVar = ((hu8) ql6Var.next()).a.b;
                    if (fwcVar != null) {
                        fwcVar.m();
                    }
                }
                break;
            case 15:
                ((fz8) obj).e.invoke();
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                o09 o09Var = (o09) obj;
                o09Var.f = false;
                HashSet hashSet = new HashSet();
                i79 i79Var = o09Var.d;
                if (i79Var != null) {
                    Object[] objArr = i79Var.a;
                    int i2 = i79Var.b;
                    for (int i3 = 0; i3 < i2; i3++) {
                        LayoutNode layoutNode = (LayoutNode) objArr[i3];
                        i79 i79Var2 = o09Var.e;
                        if (i79Var2 == null) {
                            i79Var2 = new i79();
                            o09Var.e = i79Var2;
                        }
                        c1b c1bVar = (c1b) i79Var2.b(i3);
                        i09 i09Var = (i09) layoutNode.V0.g;
                        if (i09Var.Y) {
                            o09.b(i09Var, c1bVar);
                        }
                    }
                    i79Var.k();
                    i79 i79Var3 = o09Var.e;
                    if (i79Var3 != null) {
                        i79Var3.k();
                    }
                }
                i79 i79Var4 = o09Var.b;
                if (i79Var4 != null) {
                    Object[] objArr2 = i79Var4.a;
                    int i4 = i79Var4.b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        at0 at0Var = (at0) objArr2[i5];
                        i79 i79Var5 = o09Var.c;
                        if (i79Var5 == null) {
                            i79Var5 = new i79();
                            o09Var.c = i79Var5;
                        }
                        c1b c1bVar2 = (c1b) i79Var5.b(i5);
                        if (at0Var.Y) {
                            o09.b(at0Var, c1bVar2);
                        }
                    }
                    i79Var4.k();
                    i79 i79Var6 = o09Var.c;
                    if (i79Var6 != null) {
                        i79Var6.k();
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((at0) it.next()).n1();
                }
                return wefVar;
            case 17:
                ((ta4) obj).a();
                return wefVar;
            case 18:
                fa9 fa9Var = ((da9) obj).v;
                if (!fa9Var.i) {
                    qc0.p("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                    return null;
                }
                if (fa9Var.j.i == g48.a) {
                    qc0.p("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                    return null;
                }
                da9 da9Var = fa9Var.a;
                jwf jwfVar = (jwf) fa9Var.m.getValue();
                gy2 gy2VarI = hcc.i(da9Var);
                jwfVar.getClass();
                gy2VarI.getClass();
                kxa kxaVar = new kxa(da9Var.g(), jwfVar, gy2VarI);
                em7 em7VarB = job.a.b(ea9.class);
                String strG = em7VarB.g();
                if (strG != null) {
                    return ((ea9) kxaVar.f(em7VarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strG))).b;
                }
                qc0.j("Local and anonymous classes can not be ViewModels");
                return null;
            case 19:
                return ((sc9) obj).d;
            case 20:
                return ((wc9) obj).l1();
            case 21:
                return (gib) ((mib) obj).a.e.getValue();
            case 22:
                return "Unexpected end of input: yet to parse ".concat(((fk9) obj).b());
            case 23:
                return new sm9((um9) obj);
            case 24:
                return ((xf3) ((wf3) obj)).b();
            case 25:
                d1a d1aVar = (d1a) obj;
                return d1aVar.a.p(d1aVar.b);
            case 26:
                ((jca) obj).b.setValue(Boolean.TRUE);
                return wefVar;
            case 27:
                gh1 gh1Var = ((jda) obj).a;
                lc1 lc1Var = new lc1();
                String str = gh1Var.a.a;
                return lc1Var;
            case 28:
                return ub3.l(new StringBuilder("Unexpected end of input: yet to parse '"), ((qea) obj).a, '\'');
            default:
                aja ajaVar = (aja) obj;
                pyc pycVarP = eec.p("kotlinx.serialization.Polymorphic", zia.c, new nyc[0], new p59(16, ajaVar));
                em7 em7Var = ajaVar.a;
                em7Var.getClass();
                return new jn2(pycVarP, em7Var);
        }
    }
}
