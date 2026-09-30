package defpackage;

import ai.askquin.ui.conversation.FailReason;
import ai.askquin.ui.conversation.Operation;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.photo.homepage.QuestionInputRoute;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kc4 {
    public static final void a(final tr2 tr2Var, xw9 xw9Var, final kzd kzdVar, final boolean z, final ii6 ii6Var, final boolean z2, l46 l46Var, int i) {
        kzdVar.getClass();
        l46Var.h0(1227434541);
        int i2 = i | (l46Var.i(tr2Var) ? 4 : 2) | (l46Var.g(xw9Var) ? 32 : 16) | (l46Var.i(kzdVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.g(ii6Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.h(z2) ? 131072 : 65536);
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            final r0 r0Var = tr2Var.c;
            j09 j09VarY = ynb.Y(b.c, xw9Var);
            c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarY);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            int i3 = r0.j2;
            boolean zG = l46Var.g(r0Var.a0()) | l46Var.h(r0Var.d0()) | l46Var.g(s72.j1(r0Var.R0)) | l46Var.g(r0Var.M());
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = zrd.b(new qj2(r0Var, 5));
                l46Var.p0(objR);
            }
            h0e h0eVar = (h0e) objR;
            ib4 ib4Var = (ib4) h0eVar.getValue();
            boolean zG2 = l46Var.g(h0eVar) | l46Var.i(r0Var);
            Object objR2 = l46Var.R();
            if (zG2 || objR2 == obj) {
                objR2 = new jc4(r0Var, h0eVar, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, ib4Var);
            p3f p3fVarI0 = g21.i0((ib4) h0eVar.getValue(), "divination", l46Var, 48, 0);
            Object objR3 = l46Var.R();
            if (objR3 == obj) {
                objR3 = new to3(14);
                l46Var.p0(objR3);
            }
            cn1.e(p3fVarI0, null, null, (a26) objR3, af1.b0(641213077, new n26() { // from class: hc4
                /* JADX WARN: Code duplicated, block: B:220:0x046c  */
                /* JADX WARN: Code duplicated, block: B:222:0x0479  */
                /* JADX WARN: Code duplicated, block: B:223:0x0481  */
                /* JADX WARN: Code duplicated, block: B:225:0x0485  */
                /* JADX WARN: Code duplicated, block: B:231:0x049b  */
                /* JADX WARN: Code duplicated, block: B:235:0x04c5  */
                /* JADX WARN: Code duplicated, block: B:239:0x04db  */
                /* JADX WARN: Code duplicated, block: B:244:0x0501  */
                /* JADX WARN: Code duplicated, block: B:30:0x007e  */
                /* JADX WARN: Code duplicated, block: B:73:0x0121  */
                @Override // defpackage.n26
                public final Object m(Object obj2, Object obj3, Object obj4) {
                    boolean z3;
                    ed4 ed4Var;
                    w4b u4bVar;
                    boolean zI;
                    Object objR4;
                    boolean zI2;
                    Object objR5;
                    boolean zI3;
                    Object objR6;
                    dd4 dd4Var;
                    dd4 dd4Var2;
                    boolean z4;
                    boolean z5;
                    String str;
                    j09 j09Var;
                    String str2;
                    String strJ;
                    ib4 ib4Var2 = (ib4) obj2;
                    l46 l46Var2 = (l46) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ib4Var2.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= (iIntValue & 8) == 0 ? l46Var2.g(ib4Var2) : l46Var2.i(ib4Var2) ? 4 : 2;
                    }
                    final int i4 = 1;
                    if (!l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                        l46Var2.Z();
                    } else if (ib4Var2 instanceof gb4) {
                        l46Var2.f0(-1635393495);
                        gb4 gb4Var = (gb4) ib4Var2;
                        jd4 jd4Var = gb4Var.a;
                        List list = gb4Var.b;
                        boolean z6 = gb4Var.c;
                        FailReason failReason = gb4Var.d;
                        final r0 r0Var2 = r0Var;
                        cd4 cd4Var = cd4.a;
                        hd4 hd4Var = hd4.a;
                        String str3 = "";
                        if (z6) {
                            l46Var2.f0(-1635480791);
                            boolean zT = pa7.t(jd4Var, hd4Var);
                            ea8 ea8Var = ea8.Explanation;
                            ea8 ea8Var2 = ea8.Analysis;
                            ea8 ea8Var3 = ea8.QuestionConfirm;
                            if (!zT) {
                                if (jd4Var instanceof gd4) {
                                    if (!(r0Var2.b0() instanceof Operation.UpdateQuestion)) {
                                        ea8Var3 = ea8Var2;
                                    }
                                } else if (jd4Var instanceof fd4) {
                                    if (r0Var2.b0() instanceof Operation.Pattern) {
                                        ea8Var3 = ea8Var2;
                                    }
                                } else if (jd4Var instanceof zc4) {
                                    ea8Var3 = null;
                                } else if (jd4Var instanceof ad4) {
                                    ea8Var3 = ea8Var;
                                } else {
                                    if (!(jd4Var instanceof bd4) && !(jd4Var instanceof id4) && !pa7.t(jd4Var, cd4Var)) {
                                        ap.c();
                                        return null;
                                    }
                                    ea8Var3 = null;
                                }
                            }
                            if (ea8Var3 != null) {
                                l46Var2.f0(-1634597105);
                                i4 = r0Var2.V() == null ? 0 : 1;
                                if (ea8Var3 == ea8Var || i4 != 0) {
                                    z5 = false;
                                    l46Var2.f0(-1634442167);
                                    eec.a(null, jd4Var instanceof dd4 ? (dd4) jd4Var : null, ym8.J(jd4Var), ym8.k(jd4Var), ym8.F(jd4Var), ym8.H(jd4Var), ym8.G(jd4Var), l46Var2, 0);
                                    l46Var2.r(false);
                                } else if (ea8Var3 == ea8Var2) {
                                    l46Var2.f0(-1633922669);
                                    z5 = false;
                                    dxd.d(pu4.a, 0, new quc(0), null, true, false, null, r0Var2.Z(), null, null, null, l46Var2, 24630, 1896);
                                    l46Var2 = l46Var2;
                                    l46Var2.r(false);
                                } else {
                                    z5 = false;
                                    l46Var2.f0(-1633571253);
                                    if (pa7.t(jd4Var, hd4Var)) {
                                        ArrayList arrayList = new ArrayList();
                                        for (Object obj5 : list) {
                                            if (obj5 instanceof nt8) {
                                                arrayList.add(obj5);
                                            }
                                        }
                                        nt8 nt8Var = (nt8) s72.H0(arrayList);
                                        if (nt8Var != null) {
                                            strJ = nt8Var.a;
                                        } else {
                                            strJ = null;
                                        }
                                    } else {
                                        strJ = null;
                                    }
                                    jgb.y(0, l46Var2, null, (strJ == null && (strJ = ym8.J(jd4Var)) == null) ? "" : strJ);
                                    l46Var2.r(false);
                                }
                                l46Var2.r(z5);
                            } else {
                                z5 = false;
                                l46Var2.f0(-1633153683);
                                l46Var2.r(false);
                            }
                            l46Var2.r(z5);
                        } else {
                            final tr2 tr2Var2 = tr2Var;
                            i8c i8cVar = sf2.a;
                            if (failReason != null) {
                                l46Var2.f0(-1633062388);
                                i4 = r0Var2.V() == null ? 0 : 1;
                                if (failReason instanceof FailReason.IllegalContent) {
                                    l46Var2.f0(-1632898212);
                                    gd4 gd4Var = jd4Var instanceof gd4 ? (gd4) jd4Var : null;
                                    if (gd4Var != null && (str2 = gd4Var.d) != null) {
                                        str3 = str2;
                                    }
                                    gd4 gd4Var2 = new gd4(str3, 246);
                                    String message = ((FailReason.IllegalContent) failReason).getMessage();
                                    boolean zI4 = l46Var2.i(r0Var2);
                                    Object objR7 = l46Var2.R();
                                    if (zI4 || objR7 == i8cVar) {
                                        uj3 uj3Var = new uj3(1, r0Var2, r0.class, "confirmQuestion", "confirmQuestion(Ljava/lang/String;)V", 0, 8);
                                        l46Var2.p0(uj3Var);
                                        objR7 = uj3Var;
                                    }
                                    a26 a26Var = (a26) ((ym7) objR7);
                                    boolean zI5 = l46Var2.i(r0Var2);
                                    Object objR8 = l46Var2.R();
                                    if (zI5 || objR8 == i8cVar) {
                                        sk3 sk3Var = new sk3(0, r0Var2, r0.class, "rollbackToWaitQuestion", "rollbackToWaitQuestion()V", 0, 3);
                                        l46Var2.p0(sk3Var);
                                        objR8 = sk3Var;
                                    }
                                    x57.g(tr2Var2, gd4Var2, message, a26Var, (x16) ((ym7) objR8), l46Var2, 72, 0);
                                    l46Var2 = l46Var2;
                                    l46Var2.r(false);
                                    z5 = false;
                                } else {
                                    z5 = false;
                                    if (i4 == 0 && pa7.t(jd4Var, hd4Var)) {
                                        l46Var2.f0(-1632269470);
                                        ArrayList arrayList2 = new ArrayList();
                                        for (Object obj6 : list) {
                                            if (obj6 instanceof nt8) {
                                                arrayList2.add(obj6);
                                            }
                                        }
                                        nt8 nt8Var2 = (nt8) s72.H0(arrayList2);
                                        if (nt8Var2 == null || (str = nt8Var2.a) == null) {
                                            str = "";
                                        }
                                        boolean zI6 = l46Var2.i(r0Var2);
                                        Object objR9 = l46Var2.R();
                                        if (zI6 || objR9 == i8cVar) {
                                            j09Var = null;
                                            sk3 sk3Var2 = new sk3(0, r0Var2, r0.class, "retry", "retry()V", 0, 4);
                                            l46Var2.p0(sk3Var2);
                                            objR9 = sk3Var2;
                                        } else {
                                            j09Var = null;
                                        }
                                        jgb.z(z5, (x16) ((ym7) objR9), l46Var2, j09Var, str);
                                        l46Var2.r(z5);
                                    } else {
                                        z5 = false;
                                        l46Var2.f0(-1631924533);
                                        ga5.b(tr2Var2, failReason, l46Var2, 8);
                                        l46Var2.r(false);
                                    }
                                }
                                l46Var2.r(z5);
                            } else {
                                z3 = false;
                                l46Var2.f0(-1631659762);
                                boolean z7 = jd4Var instanceof id4;
                                kzd kzdVar2 = kzdVar;
                                if (z7) {
                                    l46Var2.f0(-1631728117);
                                    ale aleVarW = r0Var2.W();
                                    boolean zN0 = r0Var2.n0();
                                    boolean zI7 = l46Var2.i(r0Var2);
                                    Object objR10 = l46Var2.R();
                                    if (zI7 || objR10 == i8cVar) {
                                        uj3 uj3Var2 = new uj3(1, r0Var2, r0.class, "selectQuickDrawSpread", "selectQuickDrawSpread(Lai/askquin/ui/spread/TarotSpread;)V", 0, 9);
                                        l46Var2.p0(uj3Var2);
                                        objR10 = uj3Var2;
                                    }
                                    boolean Z = r0Var2.Z();
                                    a26 a26Var2 = (a26) ((ym7) objR10);
                                    boolean zI8 = l46Var2.i(kzdVar2);
                                    Object objR11 = l46Var2.R();
                                    if (zI8 || objR11 == i8cVar) {
                                        objR11 = new uo2(14, kzdVar2);
                                        l46Var2.p0(objR11);
                                    }
                                    z3 = false;
                                    vd0.B(aleVarW, zN0, Z, a26Var2, (x16) objR11, ii6Var, null, l46Var2, 0);
                                    l46Var2.r(false);
                                } else if (pa7.t(jd4Var, cd4Var)) {
                                    l46Var2.f0(-1631261071);
                                    cm4 cm4VarH = r0Var2.H();
                                    if (cm4VarH == null) {
                                        l46Var2.f0(-1631261072);
                                        l46Var2.r(false);
                                        z4 = false;
                                    } else {
                                        l46Var2.f0(-1631261071);
                                        List list2 = cm4VarH.c;
                                        List list3 = cm4VarH.d;
                                        String str4 = r0Var2.H() != null ? r0Var2.C1 : null;
                                        boolean zR0 = r0Var2.r0();
                                        boolean zI9 = l46Var2.i(r0Var2);
                                        Object objR12 = l46Var2.R();
                                        if (zI9 || objR12 == i8cVar) {
                                            z4 = false;
                                            sk3 sk3Var3 = new sk3(0, r0Var2, r0.class, "startQuestionAfterDraw", "startQuestionAfterDraw()V", 0, 5);
                                            l46Var2.p0(sk3Var3);
                                            objR12 = sk3Var3;
                                        } else {
                                            z4 = false;
                                        }
                                        vfh.b(list2, list3, zR0, (x16) ((ym7) objR12), null, z2, str4, l46Var2, 0);
                                        l46Var2.r(z4);
                                    }
                                    l46Var2.r(z4);
                                    z3 = z4;
                                } else if (pa7.t(jd4Var, hd4Var)) {
                                    l46Var2.f0(2025602439);
                                    hkg.J(tr2Var2, l46Var2, 8);
                                    l46Var2.r(false);
                                } else {
                                    boolean z8 = jd4Var instanceof gd4;
                                    if (z8 || (jd4Var instanceof fd4)) {
                                        l46Var2.f0(-1630680162);
                                        if (r0Var2.V() == null && z8) {
                                            gd4 gd4Var3 = (gd4) jd4Var;
                                            if (gd4Var3.a) {
                                                l46Var2.f0(-1629755215);
                                                ed4Var = (ed4) jd4Var;
                                                if (ed4Var instanceof gd4) {
                                                    u4bVar = new v4b((gd4) jd4Var);
                                                } else {
                                                    if (ed4Var instanceof fd4) {
                                                        pd4.i(jd4Var, "Unexpected state: ");
                                                        return null;
                                                    }
                                                    u4bVar = new u4b((fd4) jd4Var);
                                                }
                                                zI = l46Var2.i(r0Var2);
                                                objR4 = l46Var2.R();
                                                if (zI || objR4 == i8cVar) {
                                                    uj3 uj3Var3 = new uj3(1, r0Var2, r0.class, "confirmQuestion", "confirmQuestion(Ljava/lang/String;)V", 0, 10);
                                                    l46Var2.p0(uj3Var3);
                                                    objR4 = uj3Var3;
                                                }
                                                a26 a26Var3 = (a26) ((ym7) objR4);
                                                zI2 = l46Var2.i(r0Var2) | l46Var2.i(tr2Var2);
                                                objR5 = l46Var2.R();
                                                if (zI2 || objR5 == i8cVar) {
                                                    objR5 = new x16() { // from class: ic4
                                                        @Override // defpackage.x16
                                                        public final Object invoke() {
                                                            int i5 = i4;
                                                            hd4 hd4Var2 = hd4.a;
                                                            wef wefVar = wef.a;
                                                            tr2 tr2Var3 = tr2Var2;
                                                            r0 r0Var3 = r0Var2;
                                                            switch (i5) {
                                                                case 0:
                                                                    if (!r0Var3.p0()) {
                                                                        r0Var3.R0.clear();
                                                                        r0Var3.i1();
                                                                        r0Var3.K1(hd4Var2);
                                                                        r0Var3.q();
                                                                    } else {
                                                                        iy9 iy9VarS = r0Var3.S();
                                                                        if (iy9VarS != null) {
                                                                            List list4 = (List) iy9VarS.a();
                                                                            List list5 = (List) iy9VarS.b();
                                                                            tr2Var3.a.d(new to3(15), new QuestionInputRoute(list4, list5));
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    if (!r0Var3.p0()) {
                                                                        r0Var3.i1();
                                                                        r0Var3.K1(hd4Var2);
                                                                    } else {
                                                                        iy9 iy9VarS2 = r0Var3.S();
                                                                        if (iy9VarS2 != null) {
                                                                            List list6 = (List) iy9VarS2.a();
                                                                            List list7 = (List) iy9VarS2.b();
                                                                            tr2Var3.a.d(new to3(17), new QuestionInputRoute(list6, list7));
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                            return wefVar;
                                                        }
                                                    };
                                                    l46Var2.p0(objR5);
                                                }
                                                x16 x16Var = (x16) objR5;
                                                zI3 = l46Var2.i(r0Var2);
                                                objR6 = l46Var2.R();
                                                if (zI3 || objR6 == i8cVar) {
                                                    objR6 = new qj2(r0Var2, 4);
                                                    l46Var2.p0(objR6);
                                                }
                                                z3 = false;
                                                rxg.s(tr2Var2, u4bVar, a26Var3, x16Var, z, (x16) objR6, l46Var2, 8);
                                                l46Var2 = l46Var2;
                                                l46Var2.r(false);
                                            } else {
                                                l46Var2.f0(-1630467006);
                                                String str5 = gd4Var3.d;
                                                String str6 = gd4Var3.e;
                                                String str7 = str6 == null ? "" : str6;
                                                boolean zI10 = l46Var2.i(r0Var2) | l46Var2.i(tr2Var2);
                                                Object objR13 = l46Var2.R();
                                                if (zI10 || objR13 == i8cVar) {
                                                    final int i5 = z3 ? 1 : 0;
                                                    objR13 = new x16() { // from class: ic4
                                                        @Override // defpackage.x16
                                                        public final Object invoke() {
                                                            int i6 = i5;
                                                            hd4 hd4Var2 = hd4.a;
                                                            wef wefVar = wef.a;
                                                            tr2 tr2Var3 = tr2Var2;
                                                            r0 r0Var3 = r0Var2;
                                                            switch (i6) {
                                                                case 0:
                                                                    if (!r0Var3.p0()) {
                                                                        r0Var3.R0.clear();
                                                                        r0Var3.i1();
                                                                        r0Var3.K1(hd4Var2);
                                                                        r0Var3.q();
                                                                    } else {
                                                                        iy9 iy9VarS = r0Var3.S();
                                                                        if (iy9VarS != null) {
                                                                            List list4 = (List) iy9VarS.a();
                                                                            List list5 = (List) iy9VarS.b();
                                                                            tr2Var3.a.d(new to3(15), new QuestionInputRoute(list4, list5));
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    if (!r0Var3.p0()) {
                                                                        r0Var3.i1();
                                                                        r0Var3.K1(hd4Var2);
                                                                    } else {
                                                                        iy9 iy9VarS2 = r0Var3.S();
                                                                        if (iy9VarS2 != null) {
                                                                            List list6 = (List) iy9VarS2.a();
                                                                            List list7 = (List) iy9VarS2.b();
                                                                            tr2Var3.a.d(new to3(17), new QuestionInputRoute(list6, list7));
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                            return wefVar;
                                                        }
                                                    };
                                                    l46Var2.p0(objR13);
                                                }
                                                jgb.h(0, (x16) objR13, l46Var2, null, str5, str7);
                                                l46Var2.r(false);
                                            }
                                        } else {
                                            l46Var2.f0(-1629755215);
                                            ed4Var = (ed4) jd4Var;
                                            if (ed4Var instanceof gd4) {
                                                u4bVar = new v4b((gd4) jd4Var);
                                            } else {
                                                if (ed4Var instanceof fd4) {
                                                    pd4.i(jd4Var, "Unexpected state: ");
                                                    return null;
                                                }
                                                u4bVar = new u4b((fd4) jd4Var);
                                            }
                                            zI = l46Var2.i(r0Var2);
                                            objR4 = l46Var2.R();
                                            if (zI) {
                                                uj3 uj3Var4 = new uj3(1, r0Var2, r0.class, "confirmQuestion", "confirmQuestion(Ljava/lang/String;)V", 0, 10);
                                                l46Var2.p0(uj3Var4);
                                                objR4 = uj3Var4;
                                            } else {
                                                uj3 uj3Var5 = new uj3(1, r0Var2, r0.class, "confirmQuestion", "confirmQuestion(Ljava/lang/String;)V", 0, 10);
                                                l46Var2.p0(uj3Var5);
                                                objR4 = uj3Var5;
                                            }
                                            a26 a26Var4 = (a26) ((ym7) objR4);
                                            zI2 = l46Var2.i(r0Var2) | l46Var2.i(tr2Var2);
                                            objR5 = l46Var2.R();
                                            if (zI2) {
                                                objR5 = new x16() { // from class: ic4
                                                    @Override // defpackage.x16
                                                    public final Object invoke() {
                                                        int i6 = i4;
                                                        hd4 hd4Var2 = hd4.a;
                                                        wef wefVar = wef.a;
                                                        tr2 tr2Var3 = tr2Var2;
                                                        r0 r0Var3 = r0Var2;
                                                        switch (i6) {
                                                            case 0:
                                                                if (!r0Var3.p0()) {
                                                                    r0Var3.R0.clear();
                                                                    r0Var3.i1();
                                                                    r0Var3.K1(hd4Var2);
                                                                    r0Var3.q();
                                                                } else {
                                                                    iy9 iy9VarS = r0Var3.S();
                                                                    if (iy9VarS != null) {
                                                                        List list4 = (List) iy9VarS.a();
                                                                        List list5 = (List) iy9VarS.b();
                                                                        tr2Var3.a.d(new to3(15), new QuestionInputRoute(list4, list5));
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                if (!r0Var3.p0()) {
                                                                    r0Var3.i1();
                                                                    r0Var3.K1(hd4Var2);
                                                                } else {
                                                                    iy9 iy9VarS2 = r0Var3.S();
                                                                    if (iy9VarS2 != null) {
                                                                        List list6 = (List) iy9VarS2.a();
                                                                        List list7 = (List) iy9VarS2.b();
                                                                        tr2Var3.a.d(new to3(17), new QuestionInputRoute(list6, list7));
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                        return wefVar;
                                                    }
                                                };
                                                l46Var2.p0(objR5);
                                            } else {
                                                objR5 = new x16() { // from class: ic4
                                                    @Override // defpackage.x16
                                                    public final Object invoke() {
                                                        int i6 = i4;
                                                        hd4 hd4Var2 = hd4.a;
                                                        wef wefVar = wef.a;
                                                        tr2 tr2Var3 = tr2Var2;
                                                        r0 r0Var3 = r0Var2;
                                                        switch (i6) {
                                                            case 0:
                                                                if (!r0Var3.p0()) {
                                                                    r0Var3.R0.clear();
                                                                    r0Var3.i1();
                                                                    r0Var3.K1(hd4Var2);
                                                                    r0Var3.q();
                                                                } else {
                                                                    iy9 iy9VarS = r0Var3.S();
                                                                    if (iy9VarS != null) {
                                                                        List list4 = (List) iy9VarS.a();
                                                                        List list5 = (List) iy9VarS.b();
                                                                        tr2Var3.a.d(new to3(15), new QuestionInputRoute(list4, list5));
                                                                    }
                                                                }
                                                                break;
                                                            default:
                                                                if (!r0Var3.p0()) {
                                                                    r0Var3.i1();
                                                                    r0Var3.K1(hd4Var2);
                                                                } else {
                                                                    iy9 iy9VarS2 = r0Var3.S();
                                                                    if (iy9VarS2 != null) {
                                                                        List list6 = (List) iy9VarS2.a();
                                                                        List list7 = (List) iy9VarS2.b();
                                                                        tr2Var3.a.d(new to3(17), new QuestionInputRoute(list6, list7));
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                        return wefVar;
                                                    }
                                                };
                                                l46Var2.p0(objR5);
                                            }
                                            x16 x16Var2 = (x16) objR5;
                                            zI3 = l46Var2.i(r0Var2);
                                            objR6 = l46Var2.R();
                                            if (zI3) {
                                                objR6 = new qj2(r0Var2, 4);
                                                l46Var2.p0(objR6);
                                            } else {
                                                objR6 = new qj2(r0Var2, 4);
                                                l46Var2.p0(objR6);
                                            }
                                            z3 = false;
                                            rxg.s(tr2Var2, u4bVar, a26Var4, x16Var2, z, (x16) objR6, l46Var2, 8);
                                            l46Var2 = l46Var2;
                                            l46Var2.r(false);
                                        }
                                        l46Var2.r(z3);
                                    } else if (jd4Var instanceof zc4) {
                                        l46Var2.f0(-1628159955);
                                        zc4 zc4Var = (zc4) jd4Var;
                                        int size = zc4Var.c.size();
                                        ArrayList arrayList3 = new ArrayList();
                                        for (Object obj7 : list) {
                                            if (obj7 instanceof kt8) {
                                                arrayList3.add(obj7);
                                            }
                                        }
                                        kt8 kt8Var = (kt8) s72.x0(arrayList3);
                                        if (kt8Var == null) {
                                            kt8Var = new kt8("", zc4Var.a);
                                        }
                                        int i6 = kzd.e;
                                        ok8.b(tr2Var2, kzdVar2, size, kt8Var, l46Var2, 72);
                                        l46Var2.r(false);
                                    } else {
                                        if (!(jd4Var instanceof ad4) && !(jd4Var instanceof bd4)) {
                                            throw tec.d(2025575796, l46Var2, false);
                                        }
                                        l46Var2.f0(-1627623035);
                                        if (jd4Var instanceof bd4) {
                                            dd4Var2 = ((bd4) jd4Var).b;
                                        } else {
                                            if (jd4Var instanceof dd4) {
                                                dd4Var2 = (dd4) jd4Var;
                                            } else {
                                                dd4Var = null;
                                            }
                                            eec.a(null, dd4Var, ym8.J(jd4Var), ym8.k(jd4Var), ym8.F(jd4Var), ym8.H(jd4Var), ym8.G(jd4Var), l46Var2, 0);
                                            l46Var2.r(false);
                                        }
                                        dd4Var = dd4Var2;
                                        eec.a(null, dd4Var, ym8.J(jd4Var), ym8.k(jd4Var), ym8.F(jd4Var), ym8.H(jd4Var), ym8.G(jd4Var), l46Var2, 0);
                                        l46Var2.r(false);
                                    }
                                }
                                l46Var2.r(z3);
                            }
                            l46Var2.r(z3);
                        }
                        z3 = z5;
                        l46Var2.r(z3);
                    } else {
                        if (!(ib4Var2 instanceof hb4)) {
                            throw tec.d(2025453155, l46Var2, false);
                        }
                        l46Var2.f0(2025728985);
                        l46Var2.r(false);
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 27648, 3);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p91(tr2Var, xw9Var, kzdVar, z, ii6Var, z2, i);
        }
    }
}
