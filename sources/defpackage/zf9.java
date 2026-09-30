package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zf9 {
    public static final e79 a;

    static {
        e79 e79Var = ok9.a;
        a = new e79();
    }

    public static final void a(i09 i09Var, int i, int i2) {
        if (!(i09Var instanceof sv3)) {
            b(i09Var, i & i09Var.c, i2);
            return;
        }
        sv3 sv3Var = (sv3) i09Var;
        int i3 = sv3Var.Z;
        b(i09Var, i3 & i, i2);
        int i4 = (~i3) & i;
        for (i09 i09Var2 = sv3Var.E0; i09Var2 != null; i09Var2 = i09Var2.f) {
            a(i09Var2, i4, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(i09 i09Var, int i, int i2) {
        if (i2 != 0 || i09Var.a1()) {
            if ((i & 2) != 0 && (i09Var instanceof kv7)) {
                rs0.F((kv7) i09Var);
                if (i2 == 2) {
                    vd0.p0(i09Var, 2).u1();
                }
            }
            if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 && i2 != 2) {
                vd0.s0(i09Var).S();
            }
            if ((4194304 & i) != 0 && i2 != 2) {
                vd0.s0(i09Var).t0(false);
            }
            if ((i & 256) != 0 && (i09Var instanceof mb6)) {
                if (i2 == 1) {
                    LayoutNode layoutNodeS0 = vd0.s0(i09Var);
                    layoutNodeS0.z0(layoutNodeS0.e1 + 1);
                } else if (i2 == 2) {
                    LayoutNode layoutNodeS1 = vd0.s0(i09Var);
                    layoutNodeS1.z0(layoutNodeS1.e1 - 1);
                }
                if (i2 != 2) {
                    LayoutNode layoutNodeS2 = vd0.s0(i09Var);
                    if (layoutNodeS2.e1 != 0 && !layoutNodeS2.t() && !layoutNodeS2.A() && !layoutNodeS2.d1) {
                        AndroidComposeView androidComposeView = (AndroidComposeView) wv7.a(layoutNodeS2);
                        fz3 fz3Var = (fz3) androidComposeView.i1.f;
                        if (layoutNodeS2.e1 > 0) {
                            ((p89) fz3Var.b).b(layoutNodeS2);
                            layoutNodeS2.d1 = true;
                        }
                        androidComposeView.F(null);
                    }
                }
            }
            if ((i & 4) != 0 && (i09Var instanceof pn4)) {
                qn4.G((pn4) i09Var);
            }
            if ((i & 8) != 0 && (i09Var instanceof wwc)) {
                vd0.s0(i09Var).H0 = true;
            }
            if ((i & 64) != 0 && (i09Var instanceof xz9)) {
                vd0.s0((xz9) i09Var).T();
            }
            if ((i & 2048) != 0 && (i09Var instanceof eo5)) {
                eo5 eo5Var = (eo5) i09Var;
                fl1.b = null;
                eo5Var.K(fl1.a);
                if (fl1.b != null) {
                    i09 i09Var2 = (i09) eo5Var;
                    if (!i09Var2.a.Y) {
                        i37.c("visitChildren called on an unattached node");
                    }
                    p89 p89Var = new p89(0, new i09[16]);
                    i09 i09Var3 = i09Var2.a;
                    i09 i09Var4 = i09Var3.f;
                    if (i09Var4 == null) {
                        vd0.H(p89Var, i09Var3);
                    } else {
                        p89Var.b(i09Var4);
                    }
                    while (true) {
                        int i3 = p89Var.c;
                        if (i3 == 0) {
                            break;
                        }
                        i09 i09VarM0 = (i09) p89Var.k(i3 - 1);
                        if ((i09VarM0.d & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
                            vd0.H(p89Var, i09VarM0);
                        } else {
                            while (i09VarM0 != null) {
                                if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                    p89 p89Var2 = null;
                                    while (i09VarM0 != null) {
                                        if (i09VarM0 instanceof oo5) {
                                            oo5 oo5Var = (oo5) i09VarM0;
                                            vn5 vn5Var = ((bo5) vd0.t0(oo5Var).getFocusOwner()).d;
                                            if (vn5Var.c.e(oo5Var)) {
                                                vn5Var.a();
                                            }
                                        } else if ((i09VarM0.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 && (i09VarM0 instanceof sv3)) {
                                            int i4 = 0;
                                            for (i09 i09Var5 = ((sv3) i09VarM0).E0; i09Var5 != null; i09Var5 = i09Var5.f) {
                                                if ((i09Var5.c & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        i09VarM0 = i09Var5;
                                                    } else {
                                                        if (p89Var2 == null) {
                                                            p89Var2 = new p89(0, new i09[16]);
                                                        }
                                                        if (i09VarM0 != null) {
                                                            p89Var2.b(i09VarM0);
                                                            i09VarM0 = null;
                                                        }
                                                        p89Var2.b(i09Var5);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        i09VarM0 = vd0.m0(p89Var2);
                                    }
                                    break;
                                }
                                i09VarM0 = i09VarM0.f;
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (i09Var instanceof nn5)) {
                nn5 nn5Var = (nn5) i09Var;
                vn5 vn5Var2 = ((bo5) vd0.t0(nn5Var).getFocusOwner()).d;
                if (vn5Var2.d.e(nn5Var)) {
                    vn5Var2.a();
                }
            }
            if ((i & 2097152) != 0 && (i09Var instanceof h27) && i2 == 2) {
                ((h27) i09Var).t0();
            }
        }
    }

    public static final void c(i09 i09Var) {
        if (!i09Var.Y) {
            i37.c("autoInvalidateUpdatedNode called on unattached node");
        }
        a(i09Var, -1, 0);
    }

    public static final int d(h09 h09Var) {
        int i = h09Var instanceof iv7 ? 3 : 1;
        if (h09Var instanceof on4) {
            i |= 4;
        }
        if (h09Var instanceof uwc) {
            i |= 8;
        }
        if (h09Var instanceof via) {
            i |= 16;
        }
        if (h09Var instanceof q09) {
            i |= 32;
        }
        if (h09Var instanceof aqe) {
            i |= 256;
        }
        if (h09Var instanceof wz9) {
            i |= 64;
        }
        return h09Var instanceof h31 ? 524288 | i : i;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0055  */
    /* JADX WARN: Code duplicated, block: B:43:0x005b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0061  */
    /* JADX WARN: Code duplicated, block: B:49:0x0067  */
    /* JADX WARN: Code duplicated, block: B:52:0x006d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0073  */
    /* JADX WARN: Code duplicated, block: B:58:0x0079  */
    /* JADX WARN: Code duplicated, block: B:61:0x007f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0087  */
    /* JADX WARN: Code duplicated, block: B:67:0x008e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0095  */
    /* JADX WARN: Code duplicated, block: B:73:0x009c  */
    /* JADX WARN: Code duplicated, block: B:76:0x00a3  */
    public static final int e(i09 i09Var) {
        int i;
        int i2 = i09Var.c;
        if (i2 != 0) {
            return i2;
        }
        Class<?> cls = i09Var.getClass();
        e79 e79Var = a;
        int iD = e79Var.d(cls);
        if (iD >= 0) {
            return e79Var.c[iD];
        }
        int i3 = i09Var instanceof kv7 ? 3 : 1;
        if (i09Var instanceof pn4) {
            i3 |= 4;
        }
        if (i09Var instanceof wwc) {
            i3 |= 8;
        }
        if (i09Var instanceof ria) {
            i3 |= 16;
        }
        if (i09Var instanceof p09) {
            i3 |= 32;
        }
        if (i09Var instanceof xz9) {
            i3 |= 64;
        }
        if (!(i09Var instanceof hn9)) {
            if (i09Var instanceof zu7) {
                i = 4194432;
            } else if (i09Var instanceof co8) {
                i3 |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if (i09Var instanceof mb6) {
                i3 |= 256;
            }
            if (i09Var instanceof tbd) {
                i3 |= 512;
            }
            if (i09Var instanceof oo5) {
                i3 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            if (i09Var instanceof eo5) {
                i3 |= 2048;
            }
            if (i09Var instanceof nn5) {
                i3 |= 4096;
            }
            if (i09Var instanceof qo7) {
                i3 |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            if (i09Var instanceof aq) {
                i3 |= 16384;
            }
            if (i09Var instanceof ug2) {
                i3 |= 32768;
            }
            if (i09Var instanceof i4f) {
                i3 |= 262144;
            }
            if (i09Var instanceof h31) {
                i3 |= 524288;
            }
            if (i09Var instanceof mff) {
                i3 |= 1048576;
            }
            if (i09Var instanceof h27) {
                i3 |= 2097152;
            }
            if (i09Var instanceof yy7) {
                i3 |= 8388608;
            }
            e79Var.g(i3, cls);
            return i3;
        }
        i = 4194304;
        i3 |= i;
        if (i09Var instanceof mb6) {
            i3 |= 256;
        }
        if (i09Var instanceof tbd) {
            i3 |= 512;
        }
        if (i09Var instanceof oo5) {
            i3 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (i09Var instanceof eo5) {
            i3 |= 2048;
        }
        if (i09Var instanceof nn5) {
            i3 |= 4096;
        }
        if (i09Var instanceof qo7) {
            i3 |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (i09Var instanceof aq) {
            i3 |= 16384;
        }
        if (i09Var instanceof ug2) {
            i3 |= 32768;
        }
        if (i09Var instanceof i4f) {
            i3 |= 262144;
        }
        if (i09Var instanceof h31) {
            i3 |= 524288;
        }
        if (i09Var instanceof mff) {
            i3 |= 1048576;
        }
        if (i09Var instanceof h27) {
            i3 |= 2097152;
        }
        if (i09Var instanceof yy7) {
            i3 |= 8388608;
        }
        e79Var.g(i3, cls);
        return i3;
    }

    public static final int f(i09 i09Var) {
        if (!(i09Var instanceof sv3)) {
            return e(i09Var);
        }
        sv3 sv3Var = (sv3) i09Var;
        int iF = sv3Var.Z;
        for (i09 i09Var2 = sv3Var.E0; i09Var2 != null; i09Var2 = i09Var2.f) {
            iF |= f(i09Var2);
        }
        return iF;
    }

    public static final boolean g(int i) {
        return ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) | ((i & 4194304) != 0);
    }
}
