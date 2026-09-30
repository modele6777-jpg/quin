package defpackage;

import android.content.Context;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ai implements l26 {
    public final /* synthetic */ int a;

    public /* synthetic */ ai(int i) {
        this.a = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) throws nv3 {
        List list;
        int i = this.a;
        int i2 = 0;
        int i3 = 1;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                nfc nfcVar = (nfc) obj;
                nfcVar.getClass();
                ((nz9) obj2).getClass();
                kob kobVar = job.a;
                return new rw8((xof) nfcVar.g(kobVar.b(xof.class), null, null), (q9b) nfcVar.g(kobVar.b(q9b.class), null, null), (cx8) nfcVar.g(kobVar.b(cx8.class), null, null));
            case 1:
                nfc nfcVar2 = (nfc) obj;
                nfcVar2.getClass();
                ((nz9) obj2).getClass();
                return new cx8((cmd) nfcVar2.g(job.a.b(cmd.class), null, null));
            case 2:
                nfc nfcVar3 = (nfc) obj;
                nz9 nz9Var = (nz9) obj2;
                nfcVar3.getClass();
                nz9Var.getClass();
                kob kobVar2 = job.a;
                return new pi1((Integer) nz9Var.a(kobVar2.b(Integer.class)), (gda) nfcVar3.g(kobVar2.b(gda.class), null, null));
            case 3:
                nz9 nz9Var2 = (nz9) obj2;
                ((nfc) obj).getClass();
                nz9Var2.getClass();
                kob kobVar3 = job.a;
                Object objA = nz9Var2.a(kobVar3.b(List.class));
                if (objA == null) {
                    throw new nv3(kv2.i(kobVar3, List.class, new StringBuilder("No value found for type '"), '\''));
                }
                List list2 = (List) objA;
                Object objA2 = nz9Var2.a(kobVar3.b(Integer.class));
                if (objA2 == null) {
                    throw new nv3(kv2.i(kobVar3, Integer.class, new StringBuilder("No value found for type '"), '\''));
                }
                int iIntValue = ((Number) objA2).intValue();
                Object objA3 = nz9Var2.a(kobVar3.b(Set.class));
                if (objA3 == null) {
                    throw new nv3(kv2.i(kobVar3, Set.class, new StringBuilder("No value found for type '"), '\''));
                }
                Set set = (Set) objA3;
                Object objA4 = nz9Var2.a(kobVar3.b(Boolean.class));
                if (objA4 != null) {
                    return new xp1(list2, iIntValue, set, ((Boolean) objA4).booleanValue());
                }
                throw new nv3(kv2.i(kobVar3, Boolean.class, new StringBuilder("No value found for type '"), '\''));
            case 4:
                nfc nfcVar4 = (nfc) obj;
                nfcVar4.getClass();
                ((nz9) obj2).getClass();
                kob kobVar4 = job.a;
                return new xve((xof) nfcVar4.g(kobVar4.b(xof.class), null, null), (gpf) nfcVar4.g(kobVar4.b(gpf.class), null, null), (t7) nfcVar4.g(kobVar4.b(t7.class), null, null));
            case 5:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                Context context = cn1.P0;
                if (context == null) {
                    list = pu4.a;
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ale.d.iterator();
                    while (it.hasNext()) {
                        String[] stringArray = context.getResources().getStringArray(((ale) it.next()).h());
                        stringArray.getClass();
                        x72.g0(arrayList, qd0.G0(stringArray));
                    }
                    list = arrayList;
                }
                return new y37(list);
            case 6:
                nfc nfcVar5 = (nfc) obj;
                nfcVar5.getClass();
                ((nz9) obj2).getClass();
                return new gg2(t72.I(new fm8(), new ds3(), (y37) nfcVar5.g(job.a.b(y37.class), null, null)));
            case 7:
                l46 l46Var = (l46) obj;
                ((Integer) obj2).getClass();
                l46Var.f0(1390904894);
                WeakHashMap weakHashMap = m8g.w;
                m58 m58Var = new m58(q7c.k(l46Var).l, 48);
                l46Var.r(false);
                return m58Var;
            case 8:
                nfc nfcVar6 = (nfc) obj;
                nfcVar6.getClass();
                ((nz9) obj2).getClass();
                am amVar = new am(nfcVar6, i3);
                nf9 nf9Var = nf9.a;
                try {
                    tx8 tx8Var = (tx8) amVar.invoke();
                    if (tx8Var != null) {
                        return new hy8(tx8Var);
                    }
                    hf8.Q.getClass();
                    ef8.a("Mixpanel").g("Mixpanel unavailable; analytics disabled for this process");
                    return nf9Var;
                } catch (ThreadDeath e) {
                    throw e;
                } catch (VirtualMachineError e2) {
                    throw e2;
                } catch (Throwable th) {
                    hf8.Q.getClass();
                    ef8.a("Mixpanel").g("Mixpanel initialization failed; analytics disabled: " + th.getClass().getSimpleName() + ": " + th.getMessage());
                    return nf9Var;
                }
            case 9:
                nfc nfcVar7 = (nfc) obj;
                nfcVar7.getClass();
                ((nz9) obj2).getClass();
                return new uu3(new am(nfcVar7, i2));
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                xo1.I((LayoutNode) obj).setDensity((sw3) obj2);
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                xo1.I((LayoutNode) obj).setLifecycleOwner((x48) obj2);
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                xo1.I((LayoutNode) obj).setSavedStateRegistryOwner((kdc) obj2);
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                uvf uvfVarI = xo1.I((LayoutNode) obj);
                int iOrdinal = ((cv7) obj2).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        ap.c();
                        return null;
                    }
                    i2 = 1;
                }
                uvfVarI.setLayoutDirection(i2);
                return wefVar;
            case 14:
                xo1.I((LayoutNode) obj).setResetBlock((a26) obj2);
                return wefVar;
            case 15:
                xo1.I((LayoutNode) obj).setUpdateBlock((a26) obj2);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                xo1.I((LayoutNode) obj).setReleaseBlock((a26) obj2);
                return wefVar;
            case 17:
                xo1.I((LayoutNode) obj).setUpdateBlock((a26) obj2);
                return wefVar;
            case 18:
                xo1.I((LayoutNode) obj).setReleaseBlock((a26) obj2);
                return wefVar;
            case 19:
                xo1.I((LayoutNode) obj).setModifier((j09) obj2);
                return wefVar;
            case 20:
                ((Integer) obj2).getClass();
                kn2.n(k99.P(1), (l46) obj);
                return wefVar;
            case 21:
                ((Integer) obj2).getClass();
                kn2.m(k99.P(1), (l46) obj);
                return wefVar;
            case 22:
                ((Integer) obj2).getClass();
                kn2.l(k99.P(1), (l46) obj);
                return wefVar;
            case 23:
                ((Integer) obj2).getClass();
                kn2.x(k99.P(1), (l46) obj);
                return wefVar;
            case 24:
                ((Integer) obj2).getClass();
                kn2.y(k99.P(1), (l46) obj);
                return wefVar;
            case 25:
                ((Integer) obj2).getClass();
                kn2.v(k99.P(1), (l46) obj);
                return wefVar;
            case 26:
                ((Integer) obj2).getClass();
                kn2.o(k99.P(1), (l46) obj);
                return wefVar;
            case 27:
                ((Integer) obj2).getClass();
                kn2.t(k99.P(1), (l46) obj);
                return wefVar;
            case 28:
                ((Integer) obj2).getClass();
                kn2.p(k99.P(1), (l46) obj);
                return wefVar;
            default:
                l46 l46Var2 = (l46) obj;
                ((Integer) obj2).getClass();
                l46Var2.f0(1040626587);
                rh5 rh5VarO = m93.o(0, 14);
                l46Var2.r(false);
                return rh5VarO;
        }
    }

    public /* synthetic */ ai(int i, int i2) {
        this.a = i2;
    }

    public /* synthetic */ ai(eu4 eu4Var, int i) {
        this.a = i;
    }
}
