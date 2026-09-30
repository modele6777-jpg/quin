package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.TarotCardType;
import tech.chatmind.api.giftcard.GiftCardItem;
import tech.chatmind.api.seasonal.model.SeasonalHistoryItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n5 implements x16 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public n5(iy7 iy7Var, lnb lnbVar, mmb mmbVar) {
        this.a = 21;
        this.c = iy7Var;
        this.b = mmbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13, types: [ds6] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v22, types: [ay4] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    @Override // defpackage.x16
    public final Object invoke() throws Throwable {
        do7 do7VarB0;
        do7 do7Var;
        ay4 ay4Var;
        int i = this.a;
        ?? r2 = 2;
        char c = 2;
        List list = pu4.a;
        int i2 = 0;
        wef wefVar = wef.a;
        IOException iOException = null;
        iOException = null;
        iOException = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return new o5((p5) obj2, (ge8) obj);
            case 1:
                e7f.b.getClass();
                e7f e7fVar = e7f.c;
                j7f j7fVarH = ((p5) obj2).h();
                List list2 = Collections.EMPTY_LIST;
                j5 j5Var = new j5(c, this);
                yd8 yd8Var = ge8.e;
                yd8Var.getClass();
                return rxg.U(new p18(yd8Var, j5Var), e7fVar, j7fVarH, list2, false);
            case 2:
                StringBuilder sb = new StringBuilder();
                sb.append('@');
                sb.append(((Class) obj).getCanonicalName());
                s72.C0(((Map) obj2).entrySet(), sb, ", ", "(", ")", v8.w, 48);
                return sb.toString();
            case 3:
                szc szcVar = (szc) obj;
                h10 annotations = ((o22) obj2).getAnnotations();
                szcVar.getClass();
                annotations.getClass();
                return b10.b(((mf7) szcVar.b).j, (xf7) ((lw7) szcVar.d).getValue(), annotations);
            case 4:
                szc szcVar2 = (szc) obj;
                h10 h10Var = (h10) obj2;
                szcVar2.getClass();
                h10Var.getClass();
                return b10.b(((mf7) szcVar2.b).j, (xf7) ((lw7) szcVar2.d).getValue(), h10Var);
            case 5:
                ((dc9) obj).g.setValue(Boolean.FALSE);
                ((mma) obj2).n();
                return wefVar;
            case 6:
                TarotCardType tarotCardType = (TarotCardType) obj2;
                ((l26) obj).z(Integer.valueOf(tarotCardType.ordinal()), tarotCardType.getCardKey());
                return wefVar;
            case 7:
                tx3 tx3Var = (tx3) obj;
                String str = (String) obj2;
                xm7 xm7Var = tx3Var.v;
                String str2 = tx3Var.w;
                xm7Var.getClass();
                str2.getClass();
                Collection collectionJ1 = str.equals("<init>") ? s72.j1(xm7Var.H()) : xm7Var.J(t99.e(str));
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : collectionJ1) {
                    if (pa7.t(n8c.c((c36) obj3).i(), str2)) {
                        arrayList.add(obj3);
                    }
                }
                if (arrayList.size() == 1) {
                    return (c36) s72.X0(arrayList);
                }
                String strD0 = s72.D0(collectionJ1, "\n", null, null, tj7.g, 30);
                StringBuilder sbO = ib8.o("Function '", str, "' (JVM signature: ", str2, ") not resolved in ");
                sbO.append(xm7Var);
                sbO.append(':');
                sbO.append(strD0.length() == 0 ? " no members found" : "\n".concat(strD0));
                throw new pt7(sbO.toString());
            case 8:
                zy3 zy3Var = (zy3) obj;
                x16 x16Var = (x16) obj2;
                List listZ = zy3Var.b.Z();
                if (listZ.isEmpty()) {
                    return list;
                }
                ArrayList arrayList2 = new ArrayList(t72.u(listZ, 10));
                int i3 = 0;
                for (Object obj4 : listZ) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        t72.Z();
                        throw null;
                    }
                    i8f i8fVar = (i8f) obj4;
                    zt2 zt2Var = x16Var == null ? null : new zt2(new xy3(zy3Var, 1), i3, i2);
                    if (i8fVar.c()) {
                        do7VarB0 = do7.c;
                    } else {
                        tt7 tt7VarB = i8fVar.b();
                        tt7VarB.getClass();
                        zy3 zy3Var2 = new zy3(tt7VarB, zt2Var, false);
                        int iOrdinal = i8fVar.a().ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                do7Var = new do7(zy3Var2, io7.b);
                            } else {
                                if (iOrdinal != 2) {
                                    ap.c();
                                    return null;
                                }
                                do7Var = new do7(zy3Var2, io7.c);
                            }
                            do7VarB0 = do7Var;
                        } else {
                            do7 do7Var2 = do7.c;
                            do7VarB0 = db6.b0(zy3Var2);
                        }
                    }
                    arrayList2.add(do7VarB0);
                    i3 = i4;
                }
                return arrayList2;
            case 9:
                d04 d04Var = (d04) obj;
                return s72.j1(((tz3) d04Var.z.b).e.j(d04Var.J0, (yya) obj2));
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                cqd cqdVar = new cqd();
                Iterator it = ((e36) obj2).l().iterator();
                while (it.hasNext()) {
                    cqdVar.add(((c36) it.next()).d((q8f) obj));
                }
                return cqdVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((a26) obj).d(((GiftCardItem) obj2).getCardId());
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ?? r10 = (ds6) obj2;
                gs6 gs6Var = (gs6) obj;
                ay4 ay4Var2 = ay4.INTERNAL_ERROR;
                try {
                    try {
                        if (!gs6Var.b(true, this)) {
                            throw new IOException("Required SETTINGS preface not received");
                        }
                        while (gs6Var.b(false, this)) {
                        }
                        ay4 ay4Var3 = ay4.NO_ERROR;
                        try {
                            r10.b(ay4Var3, ay4.CANCEL, null);
                            r2 = ay4Var3;
                        } catch (IOException e) {
                            iOException = e;
                            ay4Var = ay4Var3;
                            ay4 ay4Var4 = ay4.PROTOCOL_ERROR;
                            r10.b(ay4Var4, ay4Var4, iOException);
                            r2 = ay4Var;
                        }
                        ieg.b(gs6Var);
                        return wefVar;
                    } catch (IOException e2) {
                        iOException = e2;
                        ay4Var = ay4Var2;
                    } catch (Throwable th) {
                        th = th;
                        r2 = ay4Var2;
                        r10.b(r2, ay4Var2, iOException);
                        ieg.b(gs6Var);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r10.b(r2, ay4Var2, iOException);
                    ieg.b(gs6Var);
                    throw th;
                }
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return ((mf7) ((szc) obj).b).h.e.j(((rd7) obj2).a).S();
            case 14:
                uj7 uj7Var = (uj7) obj2;
                ge8 ge8Var = (ge8) obj;
                a26 a26Var = uj7Var.b;
                x09 x09Var = uj7Var.a;
                f22 f22Var = new f22((bm3) a26Var.d(x09Var), uj7.g, e09.e, l22.INTERFACE, t72.H(x09Var.e.e()), ge8Var);
                f22Var.u0(new q52(ge8Var, f22Var), xu4.a, null);
                return f22Var;
            case 15:
                yj7 yj7Var = (yj7) obj2;
                x09 x09VarL = yj7Var.l();
                x09VarL.getClass();
                return new bk7(x09VarL, (ge8) obj, new wj7(i2, yj7Var));
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                bk7 bk7Var = (bk7) obj2;
                x09 x09Var2 = bk7Var.c().a;
                uj7.d.getClass();
                return od4.r(x09Var2, uj7.h, new szc((ge8) obj, bk7Var.c().a)).S();
            case 17:
                rx7 rx7Var = (rx7) obj;
                szc szcVar3 = rx7Var.x;
                mf7 mf7Var = (mf7) szcVar3.b;
                szc szcVar4 = new szc(new mf7(mf7Var.a, mf7Var.b, mf7Var.c, mf7Var.d, mf7Var.e, mf7Var.f, mf7Var.g, mf7Var.h, mf7Var.i, mf7Var.j, mf7Var.k, mf7Var.l, mf7Var.m, mf7Var.n), (f8f) szcVar3.c, (lw7) szcVar3.d);
                bm3 bm3VarK = rx7Var.k();
                bm3VarK.getClass();
                return new rx7(szcVar4, bm3VarK, rx7Var.v, (u09) obj2);
            case 18:
                nm7 nm7Var = (nm7) obj2;
                y22 y22VarM = ((tt7) obj).c0().m();
                if (!(y22VarM instanceof u09)) {
                    ho7.m(y22VarM, "Supertype not a class: ");
                    return null;
                }
                Class clsQ = sqf.q((u09) y22VarM);
                if (clsQ == null) {
                    oo3.h("Unsupported superclass of ", nm7Var, ": ", y22VarM);
                    return null;
                }
                Class cls = nm7Var.b;
                if (pa7.t(cls.getSuperclass(), clsQ)) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    genericSuperclass.getClass();
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                interfaces.getClass();
                int iR0 = qd0.r0(interfaces, clsQ);
                if (iR0 < 0) {
                    oo3.h("No superclass of ", nm7Var, " in Java reflection for ", y22VarM);
                    return null;
                }
                Type type = cls.getGenericInterfaces()[iR0];
                type.getClass();
                return type;
            case 19:
                ys7 ys7Var = (ys7) obj;
                g8f g8fVar = (g8f) obj2;
                wq7 wq7Var = ys7Var.b.c;
                if (wq7Var != null) {
                    return abg.d0(wq7Var, smb.d(ys7Var.a.s().d()), g8fVar, new wj7(7, ys7Var), 4);
                }
                pa7.g0("type");
                throw null;
            case 20:
                return new yx7(((zx7) obj).a, (pnb) obj2);
            case 21:
                Object obj5 = ((iy7) obj).b.b;
                ((wxa) ((mmb) obj2).element).getClass();
                return null;
            case 22:
                zt7 zt7Var = (zt7) obj2;
                List list3 = (List) ((ve9) obj).e.getValue();
                if (list3 != null) {
                    list = list3;
                }
                ArrayList arrayList3 = new ArrayList(t72.u(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((jgf) it2.next()).j0(zt7Var));
                }
                return arrayList3;
            case 23:
                ((a26) obj).d((SeasonalHistoryItem) obj2);
                return wefVar;
            case 24:
                ((a26) obj).d(((mmd) obj2).a);
                return wefVar;
            case 25:
                ((a26) obj).d((String) obj2);
                return wefVar;
            case 26:
                a7f a7fVar = (a7f) obj;
                z12 z12Var = (z12) obj2;
                ge8 ge8Var2 = a7fVar.T0;
                s04 s04Var = a7fVar.U0;
                h10 annotations2 = z12Var.getAnnotations();
                int iG = z12Var.g();
                if (iG == 0) {
                    throw null;
                }
                s04 s04Var2 = a7fVar.U0;
                ntd ntdVarE = s04Var2.e();
                ntdVarE.getClass();
                a7f a7fVar2 = new a7f(ge8Var2, s04Var, z12Var, a7fVar, annotations2, iG, ntdVarE);
                a7f.W0.getClass();
                q8f q8fVarD = s04Var2.D0() == null ? null : q8f.d(s04Var2.E0());
                if (q8fVarD == null) {
                    return null;
                }
                nw7 nw7Var = z12Var.y;
                nw7 nw7VarD = nw7Var != null ? nw7Var.d(q8fVarD) : null;
                List listT = z12Var.T();
                listT.getClass();
                ArrayList arrayList4 = new ArrayList(t72.u(listT, 10));
                Iterator it3 = listT.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((nw7) it3.next()).d(q8fVarD));
                }
                List listH0 = s04Var2.h0();
                List listG = a7fVar.G();
                tt7 tt7Var = a7fVar.v;
                tt7Var.getClass();
                a7fVar2.I0(null, nw7VarD, arrayList4, listH0, listG, tt7Var, e09.b, s04Var2.g);
                return a7fVar2;
            default:
                lp0 lp0Var = ((o7f) obj).a;
                return ((tz3) lp0Var.b).e.f((vza) obj2, (u99) lp0Var.c);
        }
    }

    public /* synthetic */ n5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ n5(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
