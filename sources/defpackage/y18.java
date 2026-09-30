package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y18 extends u09 {
    public final u09 a;
    public final q8f b;
    public q8f c;
    public ArrayList d;
    public ArrayList e;
    public r22 f;

    public y18(u09 u09Var, q8f q8fVar) {
        this.a = u09Var;
        this.b = q8fVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    public static /* synthetic */ void s0(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? 3 : 2];
        if (i == 2) {
            objArr[0] = "typeArguments";
        } else if (i == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 8) {
            objArr[0] = "typeArguments";
        } else if (i == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                objArr[1] = "getMemberScope";
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10) {
            objArr[2] = "getMemberScope";
        } else if (i == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 8 && i != 10 && i != 13 && i != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    @Override // defpackage.bm3
    public final Object D(fm3 fm3Var, Object obj) {
        return fm3Var.w(this, obj);
    }

    @Override // defpackage.u09
    public final l22 E() {
        l22 l22VarE = this.a.E();
        if (l22VarE != null) {
            return l22VarE;
        }
        s0(25);
        throw null;
    }

    @Override // defpackage.u09
    public final dr8 M(o8f o8fVar) {
        qz3.h(oz3.c(this));
        return Z(o8fVar, zt7.p);
    }

    @Override // defpackage.u09, defpackage.y22
    public final tjd S() {
        e7f e7fVarE;
        List listD = w8f.d(h().getParameters());
        h10 annotations = getAnnotations();
        if (annotations.isEmpty()) {
            e7f.b.getClass();
            e7fVarE = e7f.c;
        } else {
            lqb lqbVar = e7f.b;
            List listH = t72.H(new k10(annotations));
            lqbVar.getClass();
            e7fVarE = lqb.e(listH);
        }
        return rxg.U(k0(), e7fVarE, h(), listD, false);
    }

    @Override // defpackage.u09
    public final dr8 Z(o8f o8fVar, zt7 zt7Var) {
        dr8 dr8VarZ = this.a.Z(o8fVar, zt7Var);
        if (!this.b.a.e()) {
            return new w7e(dr8VarZ, t0());
        }
        if (dr8VarZ != null) {
            return dr8VarZ;
        }
        s0(7);
        throw null;
    }

    @Override // defpackage.u09
    /* JADX INFO: renamed from: a0 */
    public final u09 a() {
        u09 u09VarA = this.a.a();
        if (u09VarA != null) {
            return u09VarA;
        }
        s0(21);
        throw null;
    }

    @Override // defpackage.u09
    public final dr8 c0() {
        dr8 dr8VarC0 = this.a.c0();
        if (dr8VarC0 != null) {
            return dr8VarC0;
        }
        s0(15);
        throw null;
    }

    @Override // defpackage.v7e
    public final dm3 d(q8f q8fVar) {
        if (q8fVar != null) {
            o8f o8fVar = q8fVar.a;
            return o8fVar.e() ? this : new y18(this, q8f.e(o8fVar, t0().a));
        }
        s0(23);
        throw null;
    }

    @Override // defpackage.dm3
    public final ntd e() {
        return ntd.T;
    }

    @Override // defpackage.tq8
    public final boolean e0() {
        return this.a.e0();
    }

    @Override // defpackage.f00
    public final h10 getAnnotations() {
        h10 annotations = this.a.getAnnotations();
        if (annotations != null) {
            return annotations;
        }
        s0(19);
        throw null;
    }

    @Override // defpackage.bm3
    public final t99 getName() {
        t99 name = this.a.getName();
        if (name != null) {
            return name;
        }
        s0(20);
        throw null;
    }

    @Override // defpackage.u09, defpackage.tq8, defpackage.gm3
    public final rz3 getVisibility() {
        rz3 visibility = this.a.getVisibility();
        if (visibility != null) {
            return visibility;
        }
        s0(27);
        throw null;
    }

    @Override // defpackage.y22
    public final j7f h() {
        j7f j7fVarH = this.a.h();
        if (this.b.a.e()) {
            if (j7fVarH != null) {
                return j7fVarH;
            }
            s0(0);
            throw null;
        }
        r22 r22Var = this.f;
        if (r22Var != null) {
            return r22Var;
        }
        q8f q8fVarT0 = t0();
        Collection collectionE = j7fVarH.e();
        ArrayList arrayList = new ArrayList(collectionE.size());
        Iterator it = collectionE.iterator();
        while (it.hasNext()) {
            arrayList.add(q8fVarT0.h((tt7) it.next(), dsf.INVARIANT));
        }
        r22 r22Var2 = new r22(this, this.d, arrayList, ge8.e);
        this.f = r22Var2;
        return r22Var2;
    }

    @Override // defpackage.u09, defpackage.z22
    public final List h0() {
        t0();
        ArrayList arrayList = this.e;
        if (arrayList != null) {
            return arrayList;
        }
        s0(30);
        throw null;
    }

    @Override // defpackage.u09, defpackage.tq8
    public final e09 i() {
        e09 e09VarI = this.a.i();
        if (e09VarI != null) {
            return e09VarI;
        }
        s0(26);
        throw null;
    }

    @Override // defpackage.u09
    public final nw7 i0() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tq8
    public final boolean isExternal() {
        return this.a.isExternal();
    }

    @Override // defpackage.u09
    public final boolean isInline() {
        return this.a.isInline();
    }

    @Override // defpackage.z22
    public final boolean j() {
        return this.a.j();
    }

    @Override // defpackage.u09
    public final dr8 j0() {
        dr8 dr8VarJ0 = this.a.j0();
        if (dr8VarJ0 != null) {
            return dr8VarJ0;
        }
        s0(28);
        throw null;
    }

    @Override // defpackage.bm3
    public final bm3 k() {
        bm3 bm3VarK = this.a.k();
        if (bm3VarK != null) {
            return bm3VarK;
        }
        s0(22);
        throw null;
    }

    @Override // defpackage.u09
    public final dr8 k0() {
        qz3.h(oz3.c(this.a));
        return l0(zt7.p);
    }

    @Override // defpackage.u09
    public final dr8 l0(zt7 zt7Var) {
        dr8 dr8VarL0 = this.a.l0(zt7Var);
        if (!this.b.a.e()) {
            return new w7e(dr8VarL0, t0());
        }
        if (dr8VarL0 != null) {
            return dr8VarL0;
        }
        s0(14);
        throw null;
    }

    @Override // defpackage.u09
    public final z12 m0() {
        return this.a.m0();
    }

    @Override // defpackage.u09
    public final orf n0() {
        orf orfVarN0 = this.a.n0();
        if (orfVarN0 == null) {
            return null;
        }
        boolean z = orfVarN0 instanceof m37;
        dsf dsfVar = dsf.INVARIANT;
        q8f q8fVar = this.b;
        if (z) {
            m37 m37Var = (m37) orfVarN0;
            t99 t99Var = m37Var.a;
            tjd tjdVar = (tjd) m37Var.b;
            if (tjdVar != null && !q8fVar.a.e()) {
                tjdVar = (tjd) t0().h(tjdVar, dsfVar);
            }
            return new m37(t99Var, tjdVar);
        }
        if (!(orfVarN0 instanceof y49)) {
            ap.c();
            return null;
        }
        ArrayList<iy9> arrayList = ((y49) orfVarN0).a;
        ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
        for (iy9 iy9Var : arrayList) {
            t99 t99Var2 = (t99) iy9Var.a();
            tjd tjdVar2 = (tjd) ((w4c) iy9Var.b());
            if (tjdVar2 != null && !q8fVar.a.e()) {
                tjdVar2 = (tjd) t0().h(tjdVar2, dsfVar);
            }
            arrayList2.add(new iy9(t99Var2, tjdVar2));
        }
        return new y49(arrayList2);
    }

    @Override // defpackage.u09
    public final boolean o0() {
        return this.a.o0();
    }

    @Override // defpackage.u09
    public final Collection p() {
        Collection<z12> collectionP = this.a.p();
        ArrayList arrayList = new ArrayList(collectionP.size());
        for (z12 z12Var : collectionP) {
            z12Var.getClass();
            d36 d36VarJ0 = z12Var.J0(q8f.b);
            d36VarJ0.e = z12Var.a();
            d36VarJ0.s(z12Var.i());
            d36VarJ0.q(z12Var.getVisibility());
            d36VarJ0.d(z12Var.g());
            d36VarJ0.X = false;
            arrayList.add(((z12) d36VarJ0.M0.G0(d36VarJ0)).d(t0()));
        }
        return arrayList;
    }

    @Override // defpackage.u09
    public final boolean p0() {
        return this.a.p0();
    }

    @Override // defpackage.u09
    public final boolean q0() {
        return this.a.q0();
    }

    @Override // defpackage.u09
    public final boolean r0() {
        return this.a.r0();
    }

    public final q8f t0() {
        if (this.c == null) {
            q8f q8fVar = this.b;
            if (q8fVar.a.e()) {
                this.c = q8fVar;
            } else {
                List parameters = this.a.h().getParameters();
                ArrayList arrayList = new ArrayList(parameters.size());
                this.d = arrayList;
                this.c = xo1.M(parameters, q8fVar.a, this, arrayList);
                ArrayList arrayList2 = this.d;
                arrayList2.getClass();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (!((c8f) obj).Q()) {
                        arrayList3.add(obj);
                    }
                }
                this.e = arrayList3;
            }
        }
        return this.c;
    }

    @Override // defpackage.u09
    public final List v() {
        List list = Collections.EMPTY_LIST;
        if (list != null) {
            return list;
        }
        s0(17);
        throw null;
    }

    @Override // defpackage.tq8
    public final boolean w() {
        return this.a.w();
    }
}
