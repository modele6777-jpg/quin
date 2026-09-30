package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qdc implements l26 {
    public final /* synthetic */ int a;

    public /* synthetic */ qdc(int i) {
        this.a = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        uuc uucVar;
        txb txbVar;
        uuc uucVar2;
        uuc uucVar3;
        uuc uucVar4;
        txb txbVar2;
        uuc uucVar5;
        uuc uucVar6;
        switch (this.a) {
            case 0:
                pcc pccVar = (pcc) obj;
                ty9 ty9Var = (ty9) obj2;
                Object objA = sdc.a(new jme(ty9Var.a), sdc.s, pccVar);
                Object objA2 = sdc.a(new pne(ty9Var.b), sdc.t, pccVar);
                Object objA3 = sdc.a(new wue(ty9Var.c), sdc.x, pccVar);
                ete eteVar = ty9Var.d;
                ete eteVar2 = ete.c;
                Object objA4 = sdc.a(eteVar, sdc.m, pccVar);
                Object objA5 = sdc.a(ty9Var.e, kn2.w, pccVar);
                y58 y58Var = ty9Var.f;
                y58 y58Var2 = y58.d;
                return t72.q(objA, objA2, objA3, objA4, objA5, sdc.a(y58Var, sdc.C, pccVar), sdc.a(new q58(ty9Var.g), kn2.y, pccVar), sdc.a(new ft6(ty9Var.h), sdc.u, pccVar), sdc.a(ty9Var.i, kn2.z, pccVar));
            case 1:
                return ((shf) obj2).a;
            case 2:
                pcc pccVar2 = (pcc) obj;
                xtd xtdVar = (xtd) obj2;
                y72 y72Var = new y72(xtdVar.a.b());
                rdc rdcVar = sdc.r;
                Object objA6 = sdc.a(y72Var, rdcVar, pccVar2);
                wue wueVar = new wue(xtdVar.b);
                rdc rdcVar2 = sdc.x;
                Object objA7 = sdc.a(wueVar, rdcVar2, pccVar2);
                ar5 ar5Var = xtdVar.c;
                ar5 ar5Var2 = ar5.b;
                Object objA8 = sdc.a(ar5Var, sdc.n, pccVar2);
                Object objA9 = sdc.a(xtdVar.d, sdc.v, pccVar2);
                Object objA10 = sdc.a(xtdVar.e, sdc.w, pccVar2);
                String str = xtdVar.g;
                Object objA11 = sdc.a(new wue(xtdVar.h), rdcVar2, pccVar2);
                Object objA12 = sdc.a(xtdVar.i, sdc.o, pccVar2);
                Object objA13 = sdc.a(xtdVar.j, sdc.l, pccVar2);
                sd8 sd8Var = xtdVar.k;
                sd8 sd8Var2 = sd8.c;
                Object objA14 = sdc.a(sd8Var, sdc.A, pccVar2);
                Object objA15 = sdc.a(new y72(xtdVar.l), rdcVar, pccVar2);
                Object objA16 = sdc.a(xtdVar.m, sdc.k, pccVar2);
                o4d o4dVar = xtdVar.n;
                o4d o4dVar2 = o4d.d;
                return t72.q(objA6, objA7, objA8, objA9, objA10, -1, str, objA11, objA12, objA13, objA14, objA15, objA16, sdc.a(o4dVar, sdc.q, pccVar2));
            case 3:
                pcc pccVar3 = (pcc) obj;
                zte zteVar = (zte) obj2;
                xtd xtdVar2 = zteVar.a;
                vea veaVar = sdc.i;
                return t72.q(sdc.a(xtdVar2, veaVar, pccVar3), sdc.a(zteVar.b, veaVar, pccVar3), sdc.a(zteVar.c, veaVar, pccVar3), sdc.a(zteVar.d, veaVar, pccVar3));
            case 4:
                ofa ofaVar = (ofa) obj2;
                Boolean boolValueOf = Boolean.valueOf(ofaVar.a);
                vea veaVar2 = sdc.a;
                return t72.q(boolValueOf, sdc.a(new xt4(ofaVar.b), kn2.x, (pcc) obj));
            case 5:
                return Integer.valueOf(((xt4) obj2).a);
            case 6:
                return Integer.valueOf(((q58) obj2).a);
            case 7:
                cue cueVar = (cue) obj2;
                return t72.q(sdc.a(new bue(cueVar.a), kn2.X, (pcc) obj), Boolean.valueOf(cueVar.b));
            case 8:
                return Integer.valueOf(((bue) obj2).a);
            case 9:
                return Integer.valueOf(((ghc) obj2).a.j());
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                l46 l46Var = (l46) obj;
                ((Integer) obj2).getClass();
                l46Var.f0(-1105249162);
                rh5 rh5Var = new rh5(0, 0, 0);
                l46Var.r(false);
                return rh5Var;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l46 l46Var2 = (l46) obj;
                ((Integer) obj2).getClass();
                l46Var2.f0(20125681);
                rh5 rh5VarO = m93.o(0, 14);
                l46Var2.r(false);
                return rh5VarO;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                csc cscVar = (csc) obj2;
                ((pcc) obj).getClass();
                cscVar.getClass();
                return Boolean.valueOf(cscVar.a);
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                vuc vucVarD = ((x59) obj).d();
                if (vucVarD != null) {
                    return zBooleanValue ? new vuc(vucVarD.b, vucVarD.a, true) : vucVarD;
                }
                return null;
            case 14:
                return Long.valueOf(((owc) obj2).d.get());
            case 15:
                pcc pccVar4 = (pcc) obj;
                qwc qwcVar = (qwc) obj2;
                List list = (List) qwcVar.c.getValue();
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(((l26) k00.e.b).z(pccVar4, (k00) list.get(i)));
                }
                vuc vucVarA = qwcVar.a();
                Integer numValueOf = (vucVarA == null || (uucVar6 = vucVarA.a) == null) ? null : Integer.valueOf(uucVar6.b);
                vuc vucVarA2 = qwcVar.a();
                Long lValueOf = (vucVarA2 == null || (uucVar5 = vucVarA2.a) == null) ? null : Long.valueOf(uucVar5.c);
                vuc vucVarA3 = qwcVar.a();
                String strName = (vucVarA3 == null || (uucVar4 = vucVarA3.a) == null || (txbVar2 = uucVar4.a) == null) ? null : txbVar2.name();
                vuc vucVarA4 = qwcVar.a();
                Integer numValueOf2 = (vucVarA4 == null || (uucVar3 = vucVarA4.b) == null) ? null : Integer.valueOf(uucVar3.b);
                vuc vucVarA5 = qwcVar.a();
                Long lValueOf2 = (vucVarA5 == null || (uucVar2 = vucVarA5.b) == null) ? null : Long.valueOf(uucVar2.c);
                vuc vucVarA6 = qwcVar.a();
                String strName2 = (vucVarA6 == null || (uucVar = vucVarA6.b) == null || (txbVar = uucVar.a) == null) ? null : txbVar.name();
                vuc vucVarA7 = qwcVar.a();
                return t72.I(arrayList, numValueOf, lValueOf, strName, numValueOf2, lValueOf2, strName2, vucVarA7 != null ? Boolean.valueOf(vucVarA7.c) : null);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                Collection collection = (List) obj;
                List list2 = (List) obj2;
                if (collection == null) {
                    collection = pu4.a;
                }
                return s72.Q0(collection, list2);
            case 17:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList arrayList2 = new ArrayList(list3);
                arrayList2.addAll(list4);
                return arrayList2;
            case 18:
                Float f = (Float) obj;
                ((Float) obj2).getClass();
                return f;
            case 19:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 20:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 21:
                return (i5c) obj;
            case 22:
                return (String) obj;
            case 23:
                return (wef) obj;
            case 24:
                List list5 = (List) obj;
                List list6 = (List) obj2;
                if (list5 == null) {
                    return list6;
                }
                ArrayList arrayList3 = new ArrayList(list5);
                arrayList3.addAll(list6);
                return arrayList3;
            case 25:
                return (x4d) obj;
            case 26:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 27:
                return (en2) obj;
            case 28:
                return (ar) obj;
            default:
                return (yr) obj;
        }
    }
}
