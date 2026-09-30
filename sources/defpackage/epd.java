package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class epd {
    public static final float a = ok8.r;
    public static final float b;
    public static final long c;
    public static final float d;
    public static final float e;
    public static final vtf f;

    static {
        float f2 = ok8.p;
        b = f2;
        float f3 = ok8.n;
        c = cgg.f(f2, f3);
        cgg.f(f3, f2);
        d = 6.0f;
        e = 2.0f;
        f = new vtf(yod.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x0066  */
    /* JADX WARN: Code duplicated, block: B:43:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0071  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x0120  */
    /* JADX WARN: Code duplicated, block: B:74:0x012f  */
    /* JADX WARN: Code duplicated, block: B:76:? A[RETURN, SYNTHETIC] */
    public static final void a(final float f2, final a26 a26Var, j09 j09Var, boolean z, final b62 b62Var, int i, pod podVar, t69 t69Var, l46 l46Var, final int i2, final int i3) {
        int i4;
        final j09 j09Var2;
        int i5;
        int i6;
        final int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        final boolean z3;
        final pod podVar2;
        final t69 t69Var2;
        ojb ojbVarV;
        j09 j09Var3;
        int i11;
        Object objR;
        t69 t69Var3;
        pod podVar3;
        boolean z4;
        int i12;
        l46Var.h0(-202044027);
        if ((i2 & 6) == 0) {
            i4 = (l46Var.d(f2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.i(a26Var) ? 32 : 16;
        }
        int i13 = i3 & 4;
        if (i13 == 0) {
            if ((i2 & 384) == 0) {
                j09Var2 = j09Var;
                i4 |= l46Var.g(j09Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i5 = i4 | 3072;
            if ((i2 & 24576) == 0) {
                if (l46Var.g(b62Var)) {
                    i12 = 16384;
                } else {
                    i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i5 |= i12;
            }
            i6 = i3 & 32;
            if (i6 != 0) {
                if ((196608 & i2) == 0) {
                    i7 = i;
                    if (l46Var.e(i7)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i5 |= i8;
                }
                i9 = 1572864 | i5;
                if ((12582912 & i2) == 0) {
                    i9 = 5767168 | i5;
                }
                i10 = 100663296 | i9;
                if ((38347923 & i10) != 38347922) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i10 & 1, z2)) {
                    l46Var.b0();
                    if ((i2 & 1) != 0 || l46Var.C()) {
                        if (i13 != 0) {
                            j09Var3 = g09.a;
                        } else {
                            j09Var3 = j09Var2;
                        }
                        if (i6 != 0) {
                            i7 = 0;
                        }
                        uod uodVar = uod.a;
                        pod podVarD = uod.d(l46Var);
                        i11 = i10 & (-29360129);
                        objR = l46Var.R();
                        if (objR == sf2.a) {
                            objR = ib8.e(l46Var);
                        }
                        t69Var3 = (t69) objR;
                        podVar3 = podVarD;
                        z4 = true;
                    } else {
                        l46Var.Z();
                        i11 = i10 & (-29360129);
                        podVar3 = podVar;
                        t69Var3 = t69Var;
                        j09Var3 = j09Var2;
                        z4 = z;
                    }
                    l46Var.s();
                    int i14 = i11 >> 6;
                    b(f2, a26Var, j09Var3, z4, podVar3, t69Var3, i7, af1.b0(308249025, new zod(t69Var3, podVar3, z4), l46Var), af1.b0(-1843234110, new uf3(podVar3, z4), l46Var), b62Var, l46Var, (29360128 & (i11 << 6)) | (i11 & 14) | 905969664 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i14) | (i14 & 3670016), (i11 >> 12) & 14);
                    podVar2 = podVar3;
                    t69Var2 = t69Var3;
                    z3 = z4;
                    j09Var2 = j09Var3;
                } else {
                    l46Var.Z();
                    z3 = z;
                    podVar2 = podVar;
                    t69Var2 = t69Var;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: vod
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            epd.a(f2, a26Var, j09Var2, z3, b62Var, i7, podVar2, t69Var2, (l46) obj, k99.P(i2 | 1), i3);
                            return wef.a;
                        }
                    };
                }
            }
            i5 |= 196608;
            i7 = i;
            i9 = 1572864 | i5;
            if ((12582912 & i2) == 0) {
                i9 = 5767168 | i5;
            }
            i10 = 100663296 | i9;
            if ((38347923 & i10) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i10 & 1, z2)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var2;
                    }
                    if (i6 != 0) {
                        i7 = 0;
                    }
                    uod uodVar2 = uod.a;
                    pod podVarD2 = uod.d(l46Var);
                    i11 = i10 & (-29360129);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = ib8.e(l46Var);
                    }
                    t69Var3 = (t69) objR;
                    podVar3 = podVarD2;
                    z4 = true;
                } else {
                    if (i13 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var2;
                    }
                    if (i6 != 0) {
                        i7 = 0;
                    }
                    uod uodVar3 = uod.a;
                    pod podVarD3 = uod.d(l46Var);
                    i11 = i10 & (-29360129);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = ib8.e(l46Var);
                    }
                    t69Var3 = (t69) objR;
                    podVar3 = podVarD3;
                    z4 = true;
                }
                l46Var.s();
                int i15 = i11 >> 6;
                b(f2, a26Var, j09Var3, z4, podVar3, t69Var3, i7, af1.b0(308249025, new zod(t69Var3, podVar3, z4), l46Var), af1.b0(-1843234110, new uf3(podVar3, z4), l46Var), b62Var, l46Var, (29360128 & (i11 << 6)) | (i11 & 14) | 905969664 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i15) | (i15 & 3670016), (i11 >> 12) & 14);
                podVar2 = podVar3;
                t69Var2 = t69Var3;
                z3 = z4;
                j09Var2 = j09Var3;
            } else {
                l46Var.Z();
                z3 = z;
                podVar2 = podVar;
                t69Var2 = t69Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: vod
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        epd.a(f2, a26Var, j09Var2, z3, b62Var, i7, podVar2, t69Var2, (l46) obj, k99.P(i2 | 1), i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 |= 384;
        j09Var2 = j09Var;
        i5 = i4 | 3072;
        if ((i2 & 24576) == 0) {
            if (l46Var.g(b62Var)) {
                i12 = 16384;
            } else {
                i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i5 |= i12;
        }
        i6 = i3 & 32;
        if (i6 != 0) {
            if ((196608 & i2) == 0) {
                i7 = i;
                if (l46Var.e(i7)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i5 |= i8;
            }
            i9 = 1572864 | i5;
            if ((12582912 & i2) == 0) {
                i9 = 5767168 | i5;
            }
            i10 = 100663296 | i9;
            if ((38347923 & i10) != 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (l46Var.W(i10 & 1, z2)) {
                l46Var.b0();
                if ((i2 & 1) != 0) {
                    if (i13 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var2;
                    }
                    if (i6 != 0) {
                        i7 = 0;
                    }
                    uod uodVar4 = uod.a;
                    pod podVarD4 = uod.d(l46Var);
                    i11 = i10 & (-29360129);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = ib8.e(l46Var);
                    }
                    t69Var3 = (t69) objR;
                    podVar3 = podVarD4;
                    z4 = true;
                } else {
                    if (i13 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var2;
                    }
                    if (i6 != 0) {
                        i7 = 0;
                    }
                    uod uodVar5 = uod.a;
                    pod podVarD5 = uod.d(l46Var);
                    i11 = i10 & (-29360129);
                    objR = l46Var.R();
                    if (objR == sf2.a) {
                        objR = ib8.e(l46Var);
                    }
                    t69Var3 = (t69) objR;
                    podVar3 = podVarD5;
                    z4 = true;
                }
                l46Var.s();
                int i16 = i11 >> 6;
                b(f2, a26Var, j09Var3, z4, podVar3, t69Var3, i7, af1.b0(308249025, new zod(t69Var3, podVar3, z4), l46Var), af1.b0(-1843234110, new uf3(podVar3, z4), l46Var), b62Var, l46Var, (29360128 & (i11 << 6)) | (i11 & 14) | 905969664 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i16) | (i16 & 3670016), (i11 >> 12) & 14);
                podVar2 = podVar3;
                t69Var2 = t69Var3;
                z3 = z4;
                j09Var2 = j09Var3;
            } else {
                l46Var.Z();
                z3 = z;
                podVar2 = podVar;
                t69Var2 = t69Var;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: vod
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        epd.a(f2, a26Var, j09Var2, z3, b62Var, i7, podVar2, t69Var2, (l46) obj, k99.P(i2 | 1), i3);
                        return wef.a;
                    }
                };
            }
        }
        i5 |= 196608;
        i7 = i;
        i9 = 1572864 | i5;
        if ((12582912 & i2) == 0) {
            i9 = 5767168 | i5;
        }
        i10 = 100663296 | i9;
        if ((38347923 & i10) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (l46Var.W(i10 & 1, z2)) {
            l46Var.b0();
            if ((i2 & 1) != 0) {
                if (i13 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var2;
                }
                if (i6 != 0) {
                    i7 = 0;
                }
                uod uodVar6 = uod.a;
                pod podVarD6 = uod.d(l46Var);
                i11 = i10 & (-29360129);
                objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = ib8.e(l46Var);
                }
                t69Var3 = (t69) objR;
                podVar3 = podVarD6;
                z4 = true;
            } else {
                if (i13 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var2;
                }
                if (i6 != 0) {
                    i7 = 0;
                }
                uod uodVar7 = uod.a;
                pod podVarD7 = uod.d(l46Var);
                i11 = i10 & (-29360129);
                objR = l46Var.R();
                if (objR == sf2.a) {
                    objR = ib8.e(l46Var);
                }
                t69Var3 = (t69) objR;
                podVar3 = podVarD7;
                z4 = true;
            }
            l46Var.s();
            int i17 = i11 >> 6;
            b(f2, a26Var, j09Var3, z4, podVar3, t69Var3, i7, af1.b0(308249025, new zod(t69Var3, podVar3, z4), l46Var), af1.b0(-1843234110, new uf3(podVar3, z4), l46Var), b62Var, l46Var, (29360128 & (i11 << 6)) | (i11 & 14) | 905969664 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i17) | (i17 & 3670016), (i11 >> 12) & 14);
            podVar2 = podVar3;
            t69Var2 = t69Var3;
            z3 = z4;
            j09Var2 = j09Var3;
        } else {
            l46Var.Z();
            z3 = z;
            podVar2 = podVar;
            t69Var2 = t69Var;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: vod
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    epd.a(f2, a26Var, j09Var2, z3, b62Var, i7, podVar2, t69Var2, (l46) obj, k99.P(i2 | 1), i3);
                    return wef.a;
                }
            };
        }
    }

    public static final void b(final float f2, final a26 a26Var, final j09 j09Var, final boolean z, pod podVar, final t69 t69Var, final int i, final dd2 dd2Var, final dd2 dd2Var2, final b62 b62Var, l46 l46Var, final int i2, final int i3) {
        int i4;
        pod podVar2;
        dd2 dd2Var3;
        int i5;
        l46Var.h0(985901935);
        if ((i2 & 6) == 0) {
            i4 = (l46Var.d(f2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.i(a26Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i4 |= l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i4 |= l46Var.i(null) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i2) == 0) {
            podVar2 = podVar;
            i4 |= l46Var.g(podVar2) ? 131072 : 65536;
        } else {
            podVar2 = podVar;
        }
        if ((1572864 & i2) == 0) {
            i4 |= l46Var.g(t69Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= l46Var.e(i) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            dd2Var3 = dd2Var;
            i4 |= l46Var.i(dd2Var3) ? 67108864 : 33554432;
        } else {
            dd2Var3 = dd2Var;
        }
        if ((805306368 & i2) == 0) {
            i4 |= l46Var.i(dd2Var2) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (l46Var.g(b62Var) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if (l46Var.W(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            l46Var.b0();
            if ((i2 & 1) != 0 && !l46Var.C()) {
                l46Var.Z();
            }
            l46Var.s();
            boolean z2 = ((29360128 & i4) == 8388608) | ((((i5 & 14) ^ 6) > 4 && l46Var.g(b62Var)) || (i5 & 6) == 4);
            Object objR = l46Var.R();
            if (z2 || objR == sf2.a) {
                objR = new gpd(f2, i, b62Var);
                l46Var.p0(objR);
            }
            gpd gpdVar = (gpd) objR;
            gpdVar.getClass();
            gpdVar.d = a26Var;
            gpdVar.d(f2);
            int i6 = ((i4 >> 3) & 1008) | ((i4 >> 6) & 57344);
            int i7 = i4 >> 9;
            c(gpdVar, j09Var, z, null, t69Var, dd2Var3, dd2Var2, l46Var, i6 | (458752 & i7) | (i7 & 3670016));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final pod podVar3 = podVar2;
            ojbVarV.d = new l26() { // from class: wod
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    epd.b(f2, a26Var, j09Var, z, podVar3, t69Var, i, dd2Var, dd2Var2, b62Var, (l46) obj, k99.P(i2 | 1), k99.P(i3));
                    return wef.a;
                }
            };
        }
    }

    public static final void c(gpd gpdVar, j09 j09Var, boolean z, pod podVar, t69 t69Var, dd2 dd2Var, dd2 dd2Var2, l46 l46Var, int i) {
        int i2;
        pod podVar2;
        int i3;
        pod podVarD;
        l46Var.h0(409861960);
        if ((i & 6) == 0) {
            i2 = (l46Var.i(gpdVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(j09Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.g(t69Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.i(dd2Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= l46Var.i(dd2Var2) ? 1048576 : 524288;
        }
        if (l46Var.W(i2 & 1, (599187 & i2) != 599186)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                uod uodVar = uod.a;
                i3 = i2 & (-7169);
                podVarD = uod.d(l46Var);
            } else {
                l46Var.Z();
                i3 = i2 & (-7169);
                podVarD = podVar;
            }
            l46Var.s();
            if (gpdVar.a < 0) {
                qc0.j("steps should be >= 0");
                return;
            } else {
                int i4 = i3 >> 3;
                d(j09Var, gpdVar, z, t69Var, dd2Var, dd2Var2, l46Var, (i3 & 896) | (i4 & 14) | ((i3 << 3) & 112) | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
                podVar2 = podVarD;
            }
        } else {
            l46Var.Z();
            podVar2 = podVar;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fc(gpdVar, j09Var, z, podVar2, t69Var, dd2Var, dd2Var2, i);
        }
    }

    public static final void d(j09 j09Var, gpd gpdVar, boolean z, t69 t69Var, dd2 dd2Var, dd2 dd2Var2, l46 l46Var, int i) {
        int i2;
        gpd gpdVar2;
        ks9 ks9Var;
        j09 hbeVar;
        boolean z2;
        dd2 dd2Var3 = dd2Var;
        dd2 dd2Var4 = dd2Var2;
        qz9 qz9Var = gpdVar.c;
        b62 b62Var = gpdVar.b;
        l46Var.h0(898172835);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(gpdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.g(t69Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.i(dd2Var3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.i(dd2Var4) ? 131072 : 65536;
        }
        int i3 = i2;
        boolean z3 = true;
        if (l46Var.W(i3 & 1, (i3 & 74899) != 74898)) {
            boolean z4 = l46Var.k(zg2.n) == cv7.b;
            gpdVar.i = z4;
            ks9 ks9Var2 = gpdVar.l;
            if (ks9Var2 != ks9.b || !z4) {
                z3 = false;
            }
            g09 g09Var = g09.a;
            if (z) {
                sr srVar = new sr(6, gpdVar);
                hia hiaVar = ibe.a;
                ks9Var = ks9Var2;
                hbeVar = new hbe(gpdVar, t69Var, null, srVar, 4);
            } else {
                ks9Var = ks9Var2;
                hbeVar = g09Var;
            }
            ks9 ks9Var3 = gpdVar.l;
            boolean zBooleanValue = ((Boolean) gpdVar.m.getValue()).booleanValue();
            boolean zI = l46Var.i(gpdVar);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zI || objR == i8cVar) {
                objR = new bpd(gpdVar, null);
                l46Var.p0(objR);
            }
            j09 j09Var2 = hbeVar;
            j09 j09VarA = ul4.a(g09Var, gpdVar, ks9Var3, z, t69Var, zBooleanValue, (n26) objR, z3, 32);
            boolean z5 = z3;
            gpdVar2 = gpdVar;
            qod qodVar = qod.a;
            ks9 ks9Var4 = ks9.a;
            ks9 ks9Var5 = ks9Var;
            j09 j09VarR = ks9Var5 == ks9Var4 ? b.r(vfh.E(g09Var, qodVar)) : b.u(vfh.E(g09Var, qodVar), 3);
            oq6 oq6Var = p77.a;
            j09 j09VarD = j09Var.D(xv8.a);
            float f2 = b;
            float f3 = a;
            float f4 = f3;
            if (ks9Var5 != ks9Var4) {
                f3 = f2;
            }
            if (ks9Var5 == ks9Var4) {
                f4 = f2;
            }
            j09 j09VarD2 = vwc.b(b.j(f3, f4, 0.0f, 0.0f, 12, j09VarD), false, new bs0(z, gpdVar2, 12)).D(ks9Var5 == ks9Var4 ? c7.b : c7.a);
            final float fJ = qz9Var.j();
            final b62 b62Var2 = new b62(b62Var.a, b62Var.b);
            final int i4 = gpdVar2.a;
            j09 j09VarY = ym8.y(vwc.b(j09VarD2, true, new a26() { // from class: cxa
                @Override // defpackage.a26
                public final Object d(Object obj) {
                    Float fValueOf = Float.valueOf(fJ);
                    b62 b62Var3 = b62Var2;
                    exc.l((hxc) obj, new rwa(((Number) mh3.r(fValueOf, b62Var3)).floatValue(), i4, b62Var3));
                    return wef.a;
                }
            }), z, t69Var);
            int i5 = gpdVar2.a;
            float fJ2 = qz9Var.j();
            a26 a26Var = gpdVar2.d;
            if (i5 < 0) {
                qc0.j("steps should be >= 0");
                return;
            }
            j09 j09VarD3 = i7h.G(j09VarY, new cpd(z, a26Var, b62Var, i5, z5, fJ2)).D(j09Var2).D(j09VarA);
            boolean zI2 = l46Var.i(gpdVar2);
            Object objR2 = l46Var.R();
            if (zI2 || objR2 == i8cVar) {
                objR2 = new x68(1, gpdVar2);
                l46Var.p0(objR2);
            }
            xn8 xn8Var = (xn8) objR2;
            int iW = an1.w(l46Var);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD3);
            lf2.q.getClass();
            l46Var.j0();
            boolean z6 = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z6) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, xn8Var);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            he2 he2Var3 = hj6.X;
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW))) {
                tec.r(iW, l46Var, iW, he2Var3);
            }
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            boolean zI3 = l46Var.i(gpdVar2);
            Object objR3 = l46Var.R();
            if (zI3 || objR3 == i8cVar) {
                z2 = false;
                objR3 = new xod(gpdVar2, 0 == true ? 1 : 0);
                l46Var.p0(objR3);
            } else {
                z2 = false;
            }
            j09 j09VarD4 = ym8.D(j09VarR, (a26) objR3);
            lx0 lx0Var = ndb.b;
            xn8 xn8VarC = s21.c(lx0Var, z2);
            int iW2 = an1.w(l46Var);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarD4);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, xn8VarC);
            dec.l(he2Var2, l46Var, u8aVarM2);
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW2))) {
                tec.r(iW2, l46Var, iW2, he2Var3);
            }
            dec.l(he2Var4, l46Var, j09VarJ2);
            int i6 = (i3 >> 3) & 14;
            dd2Var3 = dd2Var;
            dd2Var3.m(gpdVar2, l46Var, Integer.valueOf(((i3 >> 9) & 112) | i6));
            l46Var.r(true);
            j09 j09VarE = vfh.E(g09Var, qod.b);
            xn8 xn8VarC2 = s21.c(lx0Var, false);
            int iW3 = an1.w(l46Var);
            u8a u8aVarM3 = l46Var.m();
            j09 j09VarJ3 = m93.J(l46Var, j09VarE);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, xn8VarC2);
            dec.l(he2Var2, l46Var, u8aVarM3);
            if (l46Var.S || !pa7.t(l46Var.R(), Integer.valueOf(iW3))) {
                tec.r(iW3, l46Var, iW3, he2Var3);
            }
            dec.l(he2Var4, l46Var, j09VarJ3);
            dd2Var4 = dd2Var2;
            dd2Var4.m(gpdVar2, l46Var, Integer.valueOf(((i3 >> 12) & 112) | i6));
            l46Var.r(true);
            l46Var.r(true);
        } else {
            gpdVar2 = gpdVar;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new tg(j09Var, gpdVar2, z, t69Var, dd2Var3, dd2Var4, i);
        }
    }

    public static final float e(float f2, float[] fArr, float f3, float f4) {
        Float fValueOf;
        if (fArr.length == 0) {
            fValueOf = null;
        } else {
            float f5 = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                fValueOf = Float.valueOf(f5);
            } else {
                float fAbs = Math.abs(abg.P(f3, f4, f5) - f2);
                if (1 <= length) {
                    while (true) {
                        float f6 = fArr[i];
                        float fAbs2 = Math.abs(abg.P(f3, f4, f6) - f2);
                        if (Float.compare(fAbs, fAbs2) > 0) {
                            f5 = f6;
                            fAbs = fAbs2;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                fValueOf = Float.valueOf(f5);
            }
        }
        return fValueOf != null ? abg.P(f3, f4, fValueOf.floatValue()) : f2;
    }
}
