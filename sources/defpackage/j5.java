package defpackage;

import ai.askquin.services.InAppMessagePollingService;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class j5 implements x16 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ j5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:227:0x09e4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [nw7] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r22v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v0, types: [a7f, c36, ca1, e36] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    @Override // defpackage.x16
    public final Object invoke() {
        q8f q8fVarD;
        q8f q8fVar;
        List list;
        q8f q8fVar2;
        Iterator it;
        q8f q8fVar3;
        ?? r9;
        int iHashCode;
        Collection collection;
        rx4 rx4Var;
        rt7 rt7Var;
        pd0 pd0VarA;
        int i = this.a;
        pu4 pu4Var = pu4.a;
        qu4 qu4Var = qu4.a;
        int i2 = 10;
        int iHashCode2 = 0;
        q8f q8fVar4 = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                s04 s04Var = (s04) obj;
                u09 u09VarD0 = s04Var.D0();
                if (u09VarD0 == null) {
                    return pu4Var;
                }
                Collection collectionP = u09VarD0.p();
                collectionP.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it2 = collectionP.iterator();
                while (it2.hasNext()) {
                    z12 z12Var = (z12) it2.next();
                    uzd uzdVar = a7f.W0;
                    ge8 ge8Var = s04Var.f;
                    z12Var.getClass();
                    uzdVar.getClass();
                    g10 g10Var = hj6.c;
                    ge8Var.getClass();
                    if (s04Var.D0() == null) {
                        q8fVar = q8fVar4;
                    } else {
                        q8fVarD = q8f.d(s04Var.E0());
                    }
                    if (q8fVar == null) {
                        q8fVar = q8fVarD;
                        it = it2;
                        q8f q8fVar5 = q8fVar4;
                        q8fVar3 = q8fVar5;
                        r9 = q8fVar5;
                    } else {
                        q8fVar = q8fVarD;
                        z12 z12VarT0 = z12Var.d(q8fVar);
                        if (z12VarT0 == null) {
                            q8fVar = q8fVarD;
                            it = it2;
                            q8f q8fVar6 = q8fVar4;
                            q8fVar3 = q8fVar6;
                            r9 = q8fVar6;
                        } else {
                            h10 annotations = z12Var.getAnnotations();
                            int iG = z12Var.g();
                            if (iG == 0) {
                                throw q8fVar4;
                            }
                            ntd ntdVarE = s04Var.e();
                            ntdVarE.getClass();
                            ?? a7fVar = new a7f(ge8Var, s04Var, z12VarT0, null, annotations, iG, ntdVarE);
                            List listG = z12Var.G();
                            if (listG == null) {
                                ?? r22 = q8fVar4;
                                e36.k0(28);
                                throw r22;
                            }
                            q8f q8fVar7 = q8fVar;
                            ArrayList arrayListH0 = e36.H0(a7fVar, listG, q8fVar7, false, false, null);
                            if (arrayListH0 == null) {
                                q8fVar = q8fVarD;
                                it = it2;
                                q8f q8fVar8 = q8fVar4;
                                q8fVar3 = q8fVar8;
                                r9 = q8fVar8;
                            } else {
                                tjd tjdVarE = o7c.E(pa7.Z(z12VarT0.v.k0()), s04Var.S());
                                nw7 nw7Var = z12Var.y;
                                dsf dsfVar = dsf.INVARIANT;
                                Object objL = nw7Var != null ? af1.L(a7fVar, q8fVar7.f(nw7Var.getType(), dsfVar), g10Var) : q8fVar4;
                                u09 u09VarD1 = s04Var.D0();
                                if (u09VarD1 != null) {
                                    List listT = z12Var.T();
                                    listT.getClass();
                                    ArrayList arrayList2 = new ArrayList(t72.u(listT, i2));
                                    int i3 = iHashCode2;
                                    q8f q8fVar9 = q8fVar4;
                                    for (Object obj2 : listT) {
                                        int i4 = i3 + 1;
                                        if (i3 < 0) {
                                            ?? r23 = q8fVar9;
                                            t72.Z();
                                            throw r23;
                                        }
                                        nw7 nw7Var2 = (nw7) obj2;
                                        tt7 tt7VarF = q8fVar7.f(nw7Var2.getType(), dsfVar);
                                        ejb ejbVarD0 = nw7Var2.D0();
                                        ejbVarD0.getClass();
                                        Iterator it3 = it2;
                                        in2 in2Var = new in2(u09VarD1, tt7VarF, ((in2) ejbVarD0).B0());
                                        rob robVar = w99.a;
                                        arrayList2.add(new nw7(u09VarD1, in2Var, g10Var, t99.e(w99.b + '_' + i3)));
                                        it2 = it3;
                                        i3 = i4;
                                        q8fVar9 = q8fVar9;
                                    }
                                    list = arrayList2;
                                    q8fVar2 = q8fVar9;
                                } else {
                                    list = pu4Var;
                                    q8fVar2 = q8fVar4;
                                }
                                it = it2;
                                q8fVar3 = q8fVar2;
                                a7fVar.I0(objL, null, list, s04Var.h0(), arrayListH0, tjdVarE, e09.b, s04Var.g);
                                r9 = a7fVar;
                            }
                        }
                    }
                    if (r9 != 0) {
                        arrayList.add(r9);
                    }
                    it2 = it;
                    q8fVar4 = q8fVar3;
                    i2 = 10;
                    iHashCode2 = 0;
                }
                return arrayList;
            case 1:
                return new l5(((m5) obj).a());
            case 2:
                StringBuilder sb = new StringBuilder("Scope for type parameter ");
                n5 n5Var = (n5) obj;
                sb.append(((t99) n5Var.c).b());
                return u3c.e(sb.toString(), ((p5) n5Var.b).getUpperBounds());
            case 3:
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof boolean[]) {
                        iHashCode = Arrays.hashCode((boolean[]) value);
                    } else if (value instanceof char[]) {
                        iHashCode = Arrays.hashCode((char[]) value);
                    } else if (value instanceof byte[]) {
                        iHashCode = Arrays.hashCode((byte[]) value);
                    } else if (value instanceof short[]) {
                        iHashCode = Arrays.hashCode((short[]) value);
                    } else if (value instanceof int[]) {
                        iHashCode = Arrays.hashCode((int[]) value);
                    } else if (value instanceof float[]) {
                        iHashCode = Arrays.hashCode((float[]) value);
                    } else if (value instanceof long[]) {
                        iHashCode = Arrays.hashCode((long[]) value);
                    } else if (value instanceof double[]) {
                        iHashCode = Arrays.hashCode((double[]) value);
                    } else {
                        iHashCode = value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode();
                    }
                    iHashCode2 += iHashCode ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(iHashCode2);
            case 4:
                a51 a51Var = (a51) obj;
                return a51Var.a.j(a51Var.b).S();
            case 5:
                tt7 tt7VarB = ((i8f) obj).b();
                tt7VarB.getClass();
                return tt7VarB;
            case 6:
                return (Class) obj;
            case 7:
                Object obj3 = ((mmb) obj).element;
                if (obj3 != null) {
                    return (ljd) obj3;
                }
                pa7.g0("result");
                throw null;
            case 8:
                fob fobVar = ((j2) obj).a;
                Type type = fobVar != null ? (Type) fobVar.invoke() : null;
                type.getClass();
                return smb.c(type);
            case 9:
                i0f i0fVar = ((jkd) obj).j;
                return new y72(abg.R(i0fVar.a, i0fVar.b, hs4.b.b(0.0f)));
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return new ux3((vx3) obj);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return new wx3((xx3) obj);
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return new yx3((zx3) obj);
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return new ay3((by3) obj);
            case 14:
                return new vy3((wy3) obj);
            case 15:
                mz3 mz3Var = ((jz3) obj).a;
                mz3 mz3Var2 = new mz3();
                a90 a90Var = mz3Var.s;
                wn7[] wn7VarArr = mz3.Z;
                wn7 wn7Var = wn7VarArr[17];
                a90Var.getClass();
                wn7Var.getClass();
                Boolean bool = (Boolean) a90Var.b;
                bool.booleanValue();
                mz3Var2.s.V(wn7VarArr[17], bool);
                mz3Var2.O.V(wn7VarArr[39], Boolean.valueOf(mz3Var.l()));
                o00 o00VarM = mz3Var.m();
                o00VarM.getClass();
                mz3Var2.N.V(wn7VarArr[38], o00VarM);
                a90 a90Var2 = mz3Var.M;
                wn7 wn7Var2 = wn7VarArr[37];
                a90Var2.getClass();
                wn7Var2.getClass();
                mz3Var2.M.V(wn7VarArr[37], (a26) a90Var2.b);
                mz3Var2.X.V(wn7VarArr[48], Boolean.valueOf(mz3Var.n()));
                a90 a90Var3 = mz3Var.i;
                wn7 wn7Var3 = wn7VarArr[7];
                a90Var3.getClass();
                wn7Var3.getClass();
                Boolean bool2 = (Boolean) a90Var3.b;
                bool2.booleanValue();
                mz3Var2.i.V(wn7VarArr[7], bool2);
                mz3Var2.j(mz3Var.o());
                mz3Var2.f(mz3Var.p());
                mz3Var2.z.V(wn7VarArr[24], mz3Var.q());
                a90 a90Var4 = mz3Var.J;
                wn7 wn7Var4 = wn7VarArr[34];
                a90Var4.getClass();
                wn7Var4.getClass();
                Boolean bool3 = (Boolean) a90Var4.b;
                bool3.booleanValue();
                mz3Var2.J.V(wn7VarArr[34], bool3);
                mz3Var2.m.V(wn7VarArr[11], Boolean.valueOf(mz3Var.r()));
                a90 a90Var5 = mz3Var.K;
                wn7 wn7Var5 = wn7VarArr[35];
                a90Var5.getClass();
                wn7Var5.getClass();
                Set set = (Set) a90Var5.b;
                set.getClass();
                mz3Var2.K.V(wn7VarArr[35], set);
                mz3Var2.F(mz3Var.s());
                mz3Var2.T.V(wn7VarArr[44], Boolean.valueOf(mz3Var.t()));
                a90 a90Var6 = mz3Var.u;
                wn7 wn7Var6 = wn7VarArr[19];
                a90Var6.getClass();
                wn7Var6.getClass();
                Boolean bool4 = (Boolean) a90Var6.b;
                bool4.booleanValue();
                mz3Var2.u.V(wn7VarArr[19], bool4);
                a90 a90Var7 = mz3Var.Y;
                wn7 wn7Var7 = wn7VarArr[49];
                a90Var7.getClass();
                wn7Var7.getClass();
                Boolean bool5 = (Boolean) a90Var7.b;
                bool5.booleanValue();
                mz3Var2.Y.V(wn7VarArr[49], bool5);
                mz3Var2.b(mz3Var.u());
                a90 a90Var8 = mz3Var.n;
                wn7 wn7Var8 = wn7VarArr[12];
                a90Var8.getClass();
                wn7Var8.getClass();
                Boolean bool6 = (Boolean) a90Var8.b;
                bool6.booleanValue();
                mz3Var2.n.V(wn7VarArr[12], bool6);
                gu9 gu9VarV = mz3Var.v();
                gu9VarV.getClass();
                mz3Var2.B.V(wn7VarArr[26], gu9VarV);
                a90 a90Var9 = mz3Var.E;
                wn7 wn7Var9 = wn7VarArr[29];
                a90Var9.getClass();
                wn7Var9.getClass();
                mz3Var2.i((kz9) a90Var9.b);
                a90 a90Var10 = mz3Var.U;
                wn7 wn7Var10 = wn7VarArr[45];
                a90Var10.getClass();
                wn7Var10.getClass();
                Boolean bool7 = (Boolean) a90Var10.b;
                bool7.booleanValue();
                mz3Var2.U.V(wn7VarArr[45], bool7);
                a90 a90Var11 = mz3Var.W;
                wn7 wn7Var11 = wn7VarArr[47];
                a90Var11.getClass();
                wn7Var11.getClass();
                Boolean bool8 = (Boolean) a90Var11.b;
                bool8.booleanValue();
                mz3Var2.W.V(wn7VarArr[47], bool8);
                vxa vxaVarW = mz3Var.w();
                vxaVarW.getClass();
                mz3Var2.H.V(wn7VarArr[32], vxaVarW);
                a90 a90Var12 = mz3Var.v;
                wn7 wn7Var12 = wn7VarArr[20];
                a90Var12.getClass();
                wn7Var12.getClass();
                mz3Var2.v.V(wn7VarArr[20], (a26) a90Var12.b);
                a90 a90Var13 = mz3Var.F;
                wn7 wn7Var13 = wn7VarArr[30];
                a90Var13.getClass();
                wn7Var13.getClass();
                mz3Var2.h(((Boolean) a90Var13.b).booleanValue());
                a90 a90Var14 = mz3Var.S;
                wn7 wn7Var14 = wn7VarArr[43];
                a90Var14.getClass();
                wn7Var14.getClass();
                Boolean bool9 = (Boolean) a90Var14.b;
                bool9.booleanValue();
                mz3Var2.S.V(wn7VarArr[43], bool9);
                a90 a90Var15 = mz3Var.G;
                wn7 wn7Var15 = wn7VarArr[31];
                a90Var15.getClass();
                wn7Var15.getClass();
                mz3Var2.g(((Boolean) a90Var15.b).booleanValue());
                a90 a90Var16 = mz3Var.q;
                wn7 wn7Var16 = wn7VarArr[15];
                a90Var16.getClass();
                wn7Var16.getClass();
                Boolean bool10 = (Boolean) a90Var16.b;
                bool10.booleanValue();
                mz3Var2.q.V(wn7VarArr[15], bool10);
                a90 a90Var17 = mz3Var.P;
                wn7 wn7Var17 = wn7VarArr[40];
                a90Var17.getClass();
                wn7Var17.getClass();
                Boolean bool11 = (Boolean) a90Var17.b;
                bool11.booleanValue();
                mz3Var2.P.V(wn7VarArr[40], bool11);
                a90 a90Var18 = mz3Var.I;
                wn7 wn7Var18 = wn7VarArr[33];
                a90Var18.getClass();
                wn7Var18.getClass();
                Boolean bool12 = (Boolean) a90Var18.b;
                bool12.booleanValue();
                mz3Var2.I.V(wn7VarArr[33], bool12);
                a90 a90Var19 = mz3Var.p;
                wn7 wn7Var19 = wn7VarArr[14];
                a90Var19.getClass();
                wn7Var19.getClass();
                Boolean bool13 = (Boolean) a90Var19.b;
                bool13.booleanValue();
                mz3Var2.p.V(wn7VarArr[14], bool13);
                mz3Var2.o.V(wn7VarArr[13], Boolean.valueOf(mz3Var.x()));
                a90 a90Var20 = mz3Var.V;
                wn7 wn7Var20 = wn7VarArr[46];
                a90Var20.getClass();
                wn7Var20.getClass();
                Boolean bool14 = (Boolean) a90Var20.b;
                bool14.getClass();
                mz3Var2.V.V(wn7VarArr[46], bool14);
                a90 a90Var21 = mz3Var.r;
                wn7 wn7Var21 = wn7VarArr[16];
                a90Var21.getClass();
                wn7Var21.getClass();
                Boolean bool15 = (Boolean) a90Var21.b;
                bool15.booleanValue();
                mz3Var2.r.V(wn7VarArr[16], bool15);
                a90 a90Var22 = mz3Var.R;
                wn7 wn7Var22 = wn7VarArr[42];
                a90Var22.getClass();
                wn7Var22.getClass();
                Boolean bool16 = (Boolean) a90Var22.b;
                bool16.booleanValue();
                mz3Var2.R.V(wn7VarArr[42], bool16);
                a90 a90Var23 = mz3Var.Q;
                wn7 wn7Var23 = wn7VarArr[41];
                a90Var23.getClass();
                wn7Var23.getClass();
                Boolean bool17 = (Boolean) a90Var23.b;
                bool17.booleanValue();
                mz3Var2.Q.V(wn7VarArr[41], bool17);
                mz3Var2.A.V(wn7VarArr[25], Boolean.valueOf(mz3Var.y()));
                mz3Var2.g.V(wn7VarArr[5], Boolean.valueOf(mz3Var.z()));
                mz3Var2.a(mz3Var.A());
                mz3Var2.d(mz3Var.B());
                a90 a90Var24 = mz3Var.y;
                wn7 wn7Var24 = wn7VarArr[23];
                a90Var24.getClass();
                wn7Var24.getClass();
                a26 a26Var = (a26) a90Var24.b;
                a26Var.getClass();
                mz3Var2.y.V(wn7VarArr[23], a26Var);
                a90 a90Var25 = mz3Var.t;
                wn7 wn7Var25 = wn7VarArr[18];
                a90Var25.getClass();
                wn7Var25.getClass();
                Boolean bool18 = (Boolean) a90Var25.b;
                bool18.booleanValue();
                mz3Var2.t.V(wn7VarArr[18], bool18);
                a90 a90Var26 = mz3Var.k;
                wn7 wn7Var26 = wn7VarArr[9];
                a90Var26.getClass();
                wn7Var26.getClass();
                Boolean bool19 = (Boolean) a90Var26.b;
                bool19.booleanValue();
                mz3Var2.k.V(wn7VarArr[9], bool19);
                gz3 gz3VarC = mz3Var.C();
                gz3VarC.getClass();
                mz3Var2.C.V(wn7VarArr[27], gz3VarC);
                mz3Var2.j.V(wn7VarArr[8], Boolean.valueOf(mz3Var.D()));
                a90 a90Var27 = mz3Var.c;
                wn7VarArr[1].getClass();
                mz3Var2.c(((Boolean) a90Var27.b).booleanValue());
                a90 a90Var28 = mz3Var.d;
                wn7VarArr[2].getClass();
                Boolean bool20 = (Boolean) a90Var28.b;
                bool20.booleanValue();
                mz3Var2.d.V(wn7VarArr[2], bool20);
                a90 a90Var29 = mz3Var.l;
                wn7 wn7Var27 = wn7VarArr[10];
                a90Var29.getClass();
                wn7Var27.getClass();
                Boolean bool21 = (Boolean) a90Var29.b;
                bool21.booleanValue();
                mz3Var2.l.V(wn7VarArr[10], bool21);
                a90 a90Var30 = mz3Var.x;
                wn7 wn7Var28 = wn7VarArr[22];
                a90Var30.getClass();
                wn7Var28.getClass();
                mz3Var2.e(((Boolean) a90Var30.b).booleanValue());
                mz3Var2.k(mz3Var.E());
                jz3 jz3Var = jz3.c;
                mz3Var2.F(n3d.m(mz3Var2.s(), t72.I(syd.p, syd.q)));
                mz3Var2.a = true;
                return new jz3(mz3Var2);
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                HashSet hashSet = new HashSet();
                d04 d04Var = (d04) ((szc) obj).e;
                c04 c04Var = d04Var.Y;
                lp0 lp0Var = d04Var.z;
                nya nyaVar = d04Var.e;
                Iterator it4 = c04Var.e().iterator();
                while (it4.hasNext()) {
                    for (bm3 bm3Var : mxb.f(((tt7) it4.next()).F(), null, 3)) {
                        if ((bm3Var instanceof hjd) || (bm3Var instanceof wxa)) {
                            hashSet.add(((ea1) bm3Var).getName());
                        }
                    }
                }
                List listR0 = nyaVar.r0();
                listR0.getClass();
                Iterator it5 = listR0.iterator();
                while (it5.hasNext()) {
                    hashSet.add(i7h.v((u99) lp0Var.c, ((dza) it5.next()).g0()));
                }
                List listW0 = nyaVar.w0();
                listW0.getClass();
                Iterator it6 = listW0.iterator();
                while (it6.hasNext()) {
                    hashSet.add(i7h.v((u99) lp0Var.c, ((kza) it6.next()).t0()));
                }
                return n3d.m(hashSet, hashSet);
            case 17:
                o04 o04Var = (o04) obj;
                Set setN = o04Var.n();
                if (setN == null) {
                    return null;
                }
                return n3d.m(n3d.m(o04Var.m(), o04Var.c.c.keySet()), setN);
            case 18:
                Set setKeySet = ((LinkedHashMap) ((k51) obj).x.d).keySet();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : setKeySet) {
                    j22 j22Var = (j22) obj4;
                    if (!j22Var.g() && !h22.c.contains(j22Var)) {
                        arrayList3.add(obj4);
                    }
                }
                ArrayList arrayList4 = new ArrayList(t72.u(arrayList3, 10));
                Iterator it7 = arrayList3.iterator();
                while (it7.hasNext()) {
                    arrayList4.add(((j22) it7.next()).f());
                }
                return arrayList4;
            case 19:
                t04 t04Var = (t04) obj;
                lp0 lp0Var2 = t04Var.z;
                return s72.j1(((tz3) lp0Var2.b).e.h(t04Var.X, (u99) lp0Var2.c));
            case 20:
                px4 px4Var = (px4) obj;
                HashSet hashSet2 = new HashSet();
                for (t99 t99Var : (Set) px4Var.e.w.invoke()) {
                    lf9 lf9Var = lf9.f;
                    hashSet2.addAll(px4Var.b(t99Var, lf9Var));
                    hashSet2.addAll(px4Var.f(t99Var, lf9Var));
                }
                return hashSet2;
            case 21:
                ArrayList arrayList5 = ((o46) obj).a;
                w79 w79Var = new w79(arrayList5.size());
                int size = arrayList5.size();
                while (iHashCode2 < size) {
                    oo7 oo7Var = (oo7) arrayList5.get(iHashCode2);
                    Object obj5 = oo7Var.b;
                    int i5 = oo7Var.a;
                    w59.a(w79Var, obj5 != null ? new tg7(Integer.valueOf(i5), oo7Var.b) : Integer.valueOf(i5), oo7Var);
                    iHashCode2++;
                }
                return new w59(w79Var);
            case 22:
                ib6 ib6Var = (ib6) obj;
                List listH = ib6Var.h();
                ArrayList arrayList6 = new ArrayList(3);
                i0 i0Var = ib6Var.b;
                Collection collectionE = i0Var.h().e();
                collectionE.getClass();
                ArrayList arrayList7 = new ArrayList();
                Iterator it8 = collectionE.iterator();
                while (it8.hasNext()) {
                    x72.g0(arrayList7, mxb.f(((tt7) it8.next()).F(), null, 3));
                }
                ArrayList arrayList8 = new ArrayList();
                for (Object obj6 : arrayList7) {
                    if (obj6 instanceof ea1) {
                        arrayList8.add(obj6);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj7 : arrayList8) {
                    t99 name = ((ea1) obj7).getName();
                    Object arrayList9 = linkedHashMap.get(name);
                    if (arrayList9 == null) {
                        arrayList9 = new ArrayList();
                        linkedHashMap.put(name, arrayList9);
                    }
                    ((List) arrayList9).add(obj7);
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    Object key = entry2.getKey();
                    key.getClass();
                    t99 t99Var2 = (t99) key;
                    List list2 = (List) entry2.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj8 : list2) {
                        Boolean boolValueOf = Boolean.valueOf(((ea1) obj8) instanceof c36);
                        Object arrayList10 = linkedHashMap2.get(boolValueOf);
                        if (arrayList10 == null) {
                            arrayList10 = new ArrayList();
                            linkedHashMap2.put(boolValueOf, arrayList10);
                        }
                        ((List) arrayList10).add(obj8);
                    }
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        boolean zBooleanValue = ((Boolean) entry3.getKey()).booleanValue();
                        List list3 = (List) entry3.getValue();
                        iu9 iu9Var = iu9.c;
                        if (zBooleanValue) {
                            ArrayList arrayList11 = new ArrayList();
                            for (Object obj9 : listH) {
                                if (pa7.t(((cm3) ((c36) obj9)).getName(), t99Var2)) {
                                    arrayList11.add(obj9);
                                }
                            }
                            collection = arrayList11;
                        } else {
                            collection = pu4Var;
                        }
                        iu9Var.h(t99Var2, list3, collection, i0Var, new hb6(arrayList6, ib6Var));
                    }
                }
                return s72.Q0(listH, z7f.z(arrayList6));
            case 23:
                return cgg.A((InAppMessagePollingService) obj).g(job.a.b(cz6.class), null, null);
            case 24:
                Type genericReturnType = ((qd7) obj).b.getGenericReturnType();
                genericReturnType.getClass();
                return vpf.V(genericReturnType, qu4.a, b8f.a, true, false, null, 24);
            case 25:
                return new xe7((ye7) obj);
            case 26:
                return i7h.n((ff7) obj, true);
            case 27:
                Map map = ud7.a;
                umb umbVar = ((nf7) obj).d;
                knb knbVar = umbVar instanceof knb ? (knb) umbVar : null;
                if (knbVar == null || (rt7Var = (rt7) ud7.b.get(t99.e(knbVar.b.name()).b())) == null) {
                    rx4Var = null;
                } else {
                    dx5 dx5Var = syd.v;
                    dx5Var.getClass();
                    rx4Var = new rx4(new j22(dx5Var.b(), dx5Var.a.g()), t99.e(rt7Var.name()));
                }
                Map mapG = rx4Var != null ? bm8.G(new iy9(sd7.c, rx4Var)) : null;
                return mapG == null ? qu4Var : mapG;
            case 28:
                umb umbVar2 = ((of7) obj).d;
                if (umbVar2 instanceof wmb) {
                    Map map2 = ud7.a;
                    pd0VarA = ud7.a(((wmb) umbVar2).a());
                } else if (umbVar2 instanceof knb) {
                    Map map3 = ud7.a;
                    pd0VarA = ud7.a(t72.H(umbVar2));
                } else {
                    pd0VarA = null;
                }
                Map mapG2 = pd0VarA != null ? bm8.G(new iy9(sd7.b, pd0VarA)) : null;
                return mapG2 == null ? qu4Var : mapG2;
            default:
                nj7 nj7Var = (nj7) obj;
                c78 c78VarW = t72.w();
                c78VarW.add(nj7Var.a.a());
                csb csbVar = nj7Var.b;
                if (csbVar != null) {
                    c78VarW.add("under-migration:" + csbVar.a());
                }
                for (Map.Entry entry4 : nj7Var.c.entrySet()) {
                    c78VarW.add("@" + entry4.getKey() + ':' + ((csb) entry4.getValue()).a());
                }
                return (String[]) c78VarW.n().toArray(new String[0]);
        }
    }
}
