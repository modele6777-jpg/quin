package defpackage;

import ai.askquin.R;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.model.DrawCardSaves;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bp4 {
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:70:0x010d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public static final void a(final DrawCardSaves drawCardSaves, boolean z, final x16 x16Var, final a26 a26Var, l46 l46Var, final int i, final int i2) {
        int i3;
        boolean z2;
        boolean z3;
        DrawCardSaves drawCardSaves2;
        final boolean z4;
        ojb ojbVarV;
        l26 l26Var;
        final boolean z5;
        boolean z6;
        boolean zI;
        Object objR;
        int i4;
        int i5;
        l46Var.h0(857260847);
        char c = 4;
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? l46Var.g(drawCardSaves) : l46Var.i(drawCardSaves) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= l46Var.h(z2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (l46Var.i(x16Var)) {
                    i5 = 256;
                } else {
                    i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if (l46Var.i(a26Var)) {
                    i4 = 2048;
                } else {
                    i4 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i3 |= i4;
            }
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i3 & 1, z3)) {
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (drawCardSaves == null) {
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        return;
                    }
                    final int i7 = 0;
                    l26Var = new l26() { // from class: po4
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            int i8 = i7;
                            wef wefVar = wef.a;
                            int i9 = i;
                            switch (i8) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(i9 | 1);
                                    bp4.a(drawCardSaves, z5, x16Var, a26Var, (l46) obj, iP, i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP2 = k99.P(i9 | 1);
                                    bp4.a(drawCardSaves, z5, x16Var, a26Var, (l46) obj, iP2, i2);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                } else {
                    drawCardSaves2 = drawCardSaves;
                    String strQ = afc.q(R.string.alert_exit_title, l46Var);
                    String strQ2 = afc.q(R.string.button_confirm, l46Var);
                    dd2 dd2VarB0 = af1.b0(-178555874, new ci1(z5, c), l46Var);
                    if ((i3 & 896) == 256) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    zI = z6 | ((i3 & 7168) == 2048) | l46Var.i(drawCardSaves2);
                    objR = l46Var.R();
                    if (zI || objR == sf2.a) {
                        objR = new j8((Object) x16Var, a26Var, (Object) drawCardSaves2, 28);
                        l46Var.p0(objR);
                    }
                    kj0.F(strQ, dd2VarB0, strQ2, null, false, false, null, null, x16Var, (x16) objR, l46Var, ((i3 << 18) & 234881024) | 48, 248);
                    z4 = z5;
                }
                ojbVarV.d = l26Var;
            }
            drawCardSaves2 = drawCardSaves;
            l46Var.Z();
            z4 = z2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                final int i8 = 1;
                final DrawCardSaves drawCardSaves3 = drawCardSaves2;
                l26Var = new l26() { // from class: po4
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        int i9 = i8;
                        wef wefVar = wef.a;
                        int i10 = i;
                        switch (i9) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i10 | 1);
                                bp4.a(drawCardSaves3, z4, x16Var, a26Var, (l46) obj, iP, i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iP2 = k99.P(i10 | 1);
                                bp4.a(drawCardSaves3, z4, x16Var, a26Var, (l46) obj, iP2, i2);
                                break;
                        }
                        return wefVar;
                    }
                };
                ojbVarV.d = l26Var;
            }
        }
        i3 |= 48;
        z2 = z;
        if ((i & 384) == 0) {
            if (l46Var.i(x16Var)) {
                i5 = 256;
            } else {
                i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            if (l46Var.i(a26Var)) {
                i4 = 2048;
            } else {
                i4 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var.W(i3 & 1, z3)) {
            if (i6 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (drawCardSaves == null) {
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    return;
                }
                final int i9 = 0;
                l26Var = new l26() { // from class: po4
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        int i10 = i9;
                        wef wefVar = wef.a;
                        int i11 = i;
                        switch (i10) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i11 | 1);
                                bp4.a(drawCardSaves, z5, x16Var, a26Var, (l46) obj, iP, i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iP2 = k99.P(i11 | 1);
                                bp4.a(drawCardSaves, z5, x16Var, a26Var, (l46) obj, iP2, i2);
                                break;
                        }
                        return wefVar;
                    }
                };
            } else {
                drawCardSaves2 = drawCardSaves;
                String strQ3 = afc.q(R.string.alert_exit_title, l46Var);
                String strQ4 = afc.q(R.string.button_confirm, l46Var);
                dd2 dd2VarB1 = af1.b0(-178555874, new ci1(z5, c), l46Var);
                if ((i3 & 896) == 256) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zI = z6 | ((i3 & 7168) == 2048) | l46Var.i(drawCardSaves2);
                objR = l46Var.R();
                if (zI) {
                    objR = new j8((Object) x16Var, a26Var, (Object) drawCardSaves2, 28);
                    l46Var.p0(objR);
                } else {
                    objR = new j8((Object) x16Var, a26Var, (Object) drawCardSaves2, 28);
                    l46Var.p0(objR);
                }
                kj0.F(strQ3, dd2VarB1, strQ4, null, false, false, null, null, x16Var, (x16) objR, l46Var, ((i3 << 18) & 234881024) | 48, 248);
                z4 = z5;
            }
            ojbVarV.d = l26Var;
        }
        drawCardSaves2 = drawCardSaves;
        l46Var.Z();
        z4 = z2;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final int i10 = 1;
            final DrawCardSaves drawCardSaves4 = drawCardSaves2;
            l26Var = new l26() { // from class: po4
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    int i11 = i10;
                    wef wefVar = wef.a;
                    int i12 = i;
                    switch (i11) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i12 | 1);
                            bp4.a(drawCardSaves4, z4, x16Var, a26Var, (l46) obj, iP, i2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP2 = k99.P(i12 | 1);
                            bp4.a(drawCardSaves4, z4, x16Var, a26Var, (l46) obj, iP2, i2);
                            break;
                    }
                    return wefVar;
                }
            };
            ojbVarV.d = l26Var;
        }
    }

    public static final void b(r0 r0Var, eda edaVar, int i, l46 l46Var, int i2) {
        l46Var.h0(1530541644);
        int i3 = (l46Var.i(r0Var) ? 4 : 2) | i2 | (l46Var.i(edaVar) ? 32 : 16) | (l46Var.e(i) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            Integer numValueOf = Integer.valueOf(i);
            boolean z = ((i3 & 14) == 4 || l46Var.i(r0Var)) | ((i3 & 896) == 256) | ((i3 & 112) == 32 || l46Var.i(edaVar));
            Object objR = l46Var.R();
            if (z || objR == sf2.a) {
                objR = new qo4(r0Var, i, edaVar, null);
                l46Var.p0(objR);
            }
            int i4 = r0.j2;
            int i5 = eda.e;
            af1.q(r0Var, edaVar, numValueOf, (l26) objR, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(r0Var, edaVar, i, i2);
        }
    }

    public static final DrawCardSaves c(r0 r0Var, ka9 ka9Var, l46 l46Var) {
        DrawCardSaves drawCardSavesJ = r0Var.J();
        boolean zI = l46Var.i(drawCardSavesJ) | l46Var.i(ka9Var);
        Object objR = l46Var.R();
        if (zI || objR == sf2.a) {
            objR = new ap4(drawCardSavesJ, ka9Var, null);
            l46Var.p0(objR);
        }
        nm4 nm4Var = DrawCardSaves.Companion;
        af1.p(drawCardSavesJ, ka9Var, (l26) objR, l46Var);
        return drawCardSavesJ;
    }
}
