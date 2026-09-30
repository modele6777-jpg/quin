package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zz8 {
    public static final long a = sfc.d(0.5f, 0.0f);

    /* JADX WARN: Code duplicated, block: B:100:0x0121  */
    /* JADX WARN: Code duplicated, block: B:103:0x0128  */
    /* JADX WARN: Code duplicated, block: B:106:0x0138  */
    /* JADX WARN: Code duplicated, block: B:110:0x0141  */
    /* JADX WARN: Code duplicated, block: B:113:0x014a  */
    /* JADX WARN: Code duplicated, block: B:115:0x015c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0196 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:133:0x0198  */
    /* JADX WARN: Code duplicated, block: B:134:0x019b  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:140:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:150:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:154:0x01df  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:157:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:158:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:161:0x0228  */
    /* JADX WARN: Code duplicated, block: B:163:0x022e  */
    /* JADX WARN: Code duplicated, block: B:169:0x024e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x0250  */
    /* JADX WARN: Code duplicated, block: B:173:0x0271  */
    /* JADX WARN: Code duplicated, block: B:176:0x027e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0284  */
    /* JADX WARN: Code duplicated, block: B:184:0x0295  */
    /* JADX WARN: Code duplicated, block: B:185:0x0297  */
    /* JADX WARN: Code duplicated, block: B:188:0x029f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:189:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:192:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:196:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:198:0x02c6 A[PHI: r38
  0x02c6: PHI (r38v3 int) = (r38v1 int), (r38v4 int) binds: [B:197:0x02c4, B:195:0x02bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:199:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:202:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:203:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:206:0x02d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:207:0x02da  */
    /* JADX WARN: Code duplicated, block: B:210:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:213:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:217:0x0304  */
    /* JADX WARN: Code duplicated, block: B:219:0x030a A[PHI: r19
  0x030a: PHI (r19v14 int) = (r19v11 int), (r19v16 int) binds: [B:218:0x0308, B:216:0x0301] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:220:0x030c  */
    /* JADX WARN: Code duplicated, block: B:223:0x031c  */
    /* JADX WARN: Code duplicated, block: B:224:0x031e  */
    /* JADX WARN: Code duplicated, block: B:227:0x0326 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:228:0x0328  */
    /* JADX WARN: Code duplicated, block: B:231:0x038b  */
    /* JADX WARN: Code duplicated, block: B:233:0x0397  */
    /* JADX WARN: Code duplicated, block: B:235:0x039d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:241:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:243:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:245:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:247:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:250:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:252:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:90:0x0103 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    /* JADX WARN: Code duplicated, block: B:97:0x0116  */
    /* JADX WARN: Code duplicated, block: B:99:0x011e  */
    public static final void a(final x16 x16Var, j09 j09Var, ted tedVar, float f, boolean z, x4d x4dVar, final long j, long j2, long j3, l26 l26Var, l26 l26Var2, a09 a09Var, final dd2 dd2Var, l46 l46Var, final int i, final int i2, final int i3) {
        int i4;
        j09 j09Var2;
        ted tedVarF;
        int i5;
        int i6;
        int i7;
        x4d x4dVarB;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z2;
        final float f2;
        final boolean z3;
        final l26 l26Var3;
        final l26 l26Var4;
        final a09 a09Var2;
        final x4d x4dVar2;
        final j09 j09Var3;
        final ted tedVar2;
        final long j4;
        final long j5;
        ojb ojbVarV;
        j09 j09Var4;
        float f3;
        boolean z4;
        long jB;
        int i18;
        long jB2;
        l26 l26Var5;
        l26 l26Var6;
        l26 l26Var7;
        int i19;
        l26 l26Var8;
        int i20;
        x4d x4dVar3;
        j09 j09Var5;
        a09 a09Var3;
        Object objZ;
        Object objZ2;
        Object objZ3;
        int i21;
        boolean zI;
        Object objR;
        Object obj;
        Object objR2;
        aw2 aw2Var;
        int i22;
        boolean z5;
        boolean z6;
        Object objR3;
        int i23;
        boolean z7;
        boolean z8;
        boolean z9;
        Object objR4;
        Object objR5;
        jx jxVar;
        int i24;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objR6;
        int i25;
        int i26;
        ted tedVar3;
        boolean z13;
        Object objR7;
        int i27;
        int i28;
        int i29;
        l46Var.h0(1904798512);
        if ((i & 6) == 0) {
            i4 = (l46Var.i(x16Var) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i30 = i3 & 2;
        if (i30 == 0) {
            if ((i & 48) == 0) {
                j09Var2 = j09Var;
                i4 |= l46Var.g(j09Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i3 & 4) == 0) {
                    tedVarF = tedVar;
                    if (l46Var.g(tedVarF)) {
                        i29 = 256;
                    }
                    i4 |= i29;
                } else {
                    tedVarF = tedVar;
                }
                i29 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                i4 |= i29;
            } else {
                tedVarF = tedVar;
            }
            i5 = i4 | 3072;
            i6 = i3 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    if (l46Var.h(z)) {
                        i7 = 16384;
                    } else {
                        i7 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i5 |= i7;
                }
                if ((i & 196608) == 0) {
                    x4dVarB = x4dVar;
                    if ((i3 & 32) == 0 || !l46Var.g(x4dVarB)) {
                        i28 = 65536;
                    } else {
                        i28 = 131072;
                    }
                    i5 |= i28;
                } else {
                    x4dVarB = x4dVar;
                }
                if ((i & 1572864) == 0) {
                    if (l46Var.f(j)) {
                        i27 = 1048576;
                    } else {
                        i27 = 524288;
                    }
                    i5 |= i27;
                }
                if ((i & 12582912) == 0) {
                    i5 |= 4194304;
                }
                i8 = i5 | 100663296;
                if ((i & 805306368) == 0) {
                    if ((i3 & 512) == 0) {
                        i9 = i30;
                        int i31 = l46Var.f(j3) ? 536870912 : 268435456;
                        i8 |= i31;
                    } else {
                        i9 = i30;
                    }
                    i8 |= i31;
                } else {
                    i9 = i30;
                }
                i10 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
                if (i10 != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (l46Var.i(l26Var)) {
                        i12 = 4;
                    } else {
                        i12 = 2;
                    }
                    i11 = i2 | i12;
                } else {
                    i11 = i2;
                }
                i13 = i11 | (((i3 & 2048) == 0 || !l46Var.i(l26Var2)) ? 16 : 32);
                i14 = i3 & 4096;
                if (i14 != 0) {
                    i16 = i13 | 384;
                } else {
                    i15 = i13;
                    if ((i2 & 384) != 0) {
                        if (l46Var.g(a09Var)) {
                            i17 = 256;
                        } else {
                            i17 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                        }
                        i15 |= i17;
                    }
                    i16 = i15;
                }
                if ((i8 & 306783379) == 306783378 || (i16 & 1171) != 1170) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (l46Var.W(i8 & 1, z2)) {
                    l46Var.b0();
                    if ((i & 1) != 0 || l46Var.C()) {
                        if (i9 != 0) {
                            j09Var4 = g09.a;
                        } else {
                            j09Var4 = j09Var2;
                        }
                        if ((i3 & 4) != 0) {
                            i8 &= -897;
                            tedVarF = f(0, 3, null, l46Var);
                        }
                        f3 = y11.b;
                        if (i6 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if ((i3 & 32) != 0) {
                            y11 y11Var = y11.a;
                            x4dVarB = u5d.b(tm7.z, l46Var);
                            i8 &= -458753;
                        }
                        jB = o82.b(j, l46Var);
                        i18 = i8 & (-29360129);
                        if ((i3 & 512) != 0) {
                            y11 y11Var2 = y11.a;
                            jB2 = y11.b(l46Var);
                            i18 = i8 & (-1908408321);
                        } else {
                            jB2 = j3;
                        }
                        if (i10 != 0) {
                            l26Var5 = ae2.a;
                        } else {
                            l26Var5 = l26Var;
                        }
                        if ((i3 & 2048) != 0) {
                            l26Var6 = y.I0;
                            i16 &= -113;
                        } else {
                            l26Var6 = l26Var2;
                        }
                        if (i14 != 0) {
                            int i32 = i18;
                            l26Var7 = l26Var6;
                            i19 = i32;
                            l26Var8 = l26Var5;
                            i20 = i16;
                            x4dVar3 = x4dVarB;
                            j09Var5 = j09Var4;
                            a09Var3 = new a09(true, true);
                        } else {
                            int i33 = i18;
                            l26Var7 = l26Var6;
                            i19 = i33;
                            l26Var8 = l26Var5;
                            i20 = i16;
                            x4dVar3 = x4dVarB;
                            j09Var5 = j09Var4;
                        }
                        l46Var.s();
                        t39 t39Var = t39.a;
                        objZ = vpf.Z(t39Var, l46Var);
                        objZ2 = vpf.Z(t39Var, l46Var);
                        objZ3 = vpf.Z(t39.d, l46Var);
                        x4d x4dVar4 = x4dVar3;
                        i21 = (i19 & 896) ^ 384;
                        a09 a09Var4 = a09Var3;
                        zI = ((i21 <= 256 && l46Var.g(tedVarF)) || (i19 & 384) == 256) | l46Var.i(objZ2) | l46Var.i(objZ3) | l46Var.i(objZ);
                        objR = l46Var.R();
                        obj = sf2.a;
                        if (zI || objR == obj) {
                            objR = new jr(tedVarF, objZ2, objZ3, objZ, 18);
                            l46Var.p0(objR);
                        }
                        af1.u((x16) objR, l46Var);
                        objR2 = l46Var.R();
                        if (objR2 == obj) {
                            objR2 = af1.E(l46Var);
                            l46Var.p0(objR2);
                        }
                        aw2Var = (aw2) objR2;
                        boolean zI2 = ((i21 <= 256 && l46Var.g(tedVarF)) || (i19 & 384) == 256) | l46Var.i(aw2Var);
                        i22 = i19 & 14;
                        if (i22 == 4) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = zI2 | z5;
                        objR3 = l46Var.R();
                        if (z6 || objR3 == obj) {
                            objR3 = new m50(tedVarF, aw2Var, x16Var, 3);
                            l46Var.p0(objR3);
                        }
                        x16 x16Var2 = (x16) objR3;
                        boolean zI3 = l46Var.i(aw2Var);
                        if (i21 > 256 || !l46Var.g(tedVarF)) {
                            i23 = i20;
                            if ((i19 & 384) != 256) {
                                z7 = false;
                            }
                            boolean z14 = zI3 | z7;
                            if (i22 == 4) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            z9 = z14 | z8;
                            objR4 = l46Var.R();
                            if (z9 || objR4 == obj) {
                                objR4 = new it3(aw2Var, tedVarF, x16Var, 23);
                                l46Var.p0(objR4);
                            }
                            a26 a26Var = (a26) objR4;
                            objR5 = l46Var.R();
                            if (objR5 == obj) {
                                objR5 = qk2.d(0.0f);
                                l46Var.p0(objR5);
                            }
                            jxVar = (jx) objR5;
                            if (i21 > 256 || !l46Var.g(tedVarF)) {
                                i24 = i21;
                                if ((i19 & 384) != 256) {
                                    z10 = false;
                                }
                                boolean zI4 = z10 | l46Var.i(aw2Var) | l46Var.i(jxVar);
                                if (i22 == 4) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                z12 = z11 | zI4;
                                objR6 = l46Var.R();
                                if (z12 || objR6 == obj) {
                                    objR6 = new jr(19, x16Var, tedVarF, aw2Var, jxVar);
                                    l46Var.p0(objR6);
                                }
                                i25 = i19;
                                i26 = i24;
                                long j6 = jB;
                                tedVar3 = tedVarF;
                                db6.k((x16) objR6, j6, a09Var4, jxVar, af1.b0(1010026864, new oz8(jB2, x16Var2, tedVar3, a09Var4, jxVar, aw2Var, a26Var, j09Var5, f3, z4, x4dVar4, j, j6, l26Var8, l26Var7, dd2Var), l46Var), l46Var, (i23 & 896) | 28672);
                                if (tedVar3.d.d().a.containsKey(ued.b)) {
                                    l46Var.f0(748459762);
                                    z13 = (i26 <= 256 && l46Var.g(tedVar3)) || (i25 & 384) == 256;
                                    objR7 = l46Var.R();
                                    if (z13 || objR7 == obj) {
                                        objR7 = new pz8(tedVar3, null);
                                        l46Var.p0(objR7);
                                    }
                                    af1.o((l26) objR7, l46Var, tedVar3);
                                    l46Var.r(false);
                                } else {
                                    l46Var.f0(748521266);
                                    l46Var.r(false);
                                }
                                x4dVar2 = x4dVar4;
                                j09Var3 = j09Var5;
                                f2 = f3;
                                z3 = z4;
                                j4 = j6;
                                l26Var3 = l26Var8;
                                l26Var4 = l26Var7;
                                a09Var2 = a09Var4;
                                tedVar2 = tedVar3;
                                j5 = jB2;
                            } else {
                                i24 = i21;
                            }
                            z10 = true;
                            boolean zI5 = z10 | l46Var.i(aw2Var) | l46Var.i(jxVar);
                            if (i22 == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            z12 = z11 | zI5;
                            objR6 = l46Var.R();
                            if (z12) {
                                objR6 = new jr(19, x16Var, tedVarF, aw2Var, jxVar);
                                l46Var.p0(objR6);
                            } else {
                                objR6 = new jr(19, x16Var, tedVarF, aw2Var, jxVar);
                                l46Var.p0(objR6);
                            }
                            i25 = i19;
                            i26 = i24;
                            long j7 = jB;
                            tedVar3 = tedVarF;
                            db6.k((x16) objR6, j7, a09Var4, jxVar, af1.b0(1010026864, new oz8(jB2, x16Var2, tedVar3, a09Var4, jxVar, aw2Var, a26Var, j09Var5, f3, z4, x4dVar4, j, j7, l26Var8, l26Var7, dd2Var), l46Var), l46Var, (i23 & 896) | 28672);
                            if (tedVar3.d.d().a.containsKey(ued.b)) {
                                l46Var.f0(748459762);
                                if (i26 <= 256) {
                                }
                                objR7 = l46Var.R();
                                if (z13) {
                                    objR7 = new pz8(tedVar3, null);
                                    l46Var.p0(objR7);
                                } else {
                                    objR7 = new pz8(tedVar3, null);
                                    l46Var.p0(objR7);
                                }
                                af1.o((l26) objR7, l46Var, tedVar3);
                                l46Var.r(false);
                            } else {
                                l46Var.f0(748521266);
                                l46Var.r(false);
                            }
                            x4dVar2 = x4dVar4;
                            j09Var3 = j09Var5;
                            f2 = f3;
                            z3 = z4;
                            j4 = j7;
                            l26Var3 = l26Var8;
                            l26Var4 = l26Var7;
                            a09Var2 = a09Var4;
                            tedVar2 = tedVar3;
                            j5 = jB2;
                        } else {
                            i23 = i20;
                        }
                        z7 = true;
                        boolean z15 = zI3 | z7;
                        if (i22 == 4) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        z9 = z15 | z8;
                        objR4 = l46Var.R();
                        if (z9) {
                            objR4 = new it3(aw2Var, tedVarF, x16Var, 23);
                            l46Var.p0(objR4);
                        } else {
                            objR4 = new it3(aw2Var, tedVarF, x16Var, 23);
                            l46Var.p0(objR4);
                        }
                        a26 a26Var2 = (a26) objR4;
                        objR5 = l46Var.R();
                        if (objR5 == obj) {
                            objR5 = qk2.d(0.0f);
                            l46Var.p0(objR5);
                        }
                        jxVar = (jx) objR5;
                        if (i21 > 256) {
                            i24 = i21;
                            if ((i19 & 384) != 256) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        } else {
                            i24 = i21;
                            if ((i19 & 384) != 256) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                        boolean zI6 = z10 | l46Var.i(aw2Var) | l46Var.i(jxVar);
                        if (i22 == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z11 | zI6;
                        objR6 = l46Var.R();
                        if (z12) {
                            objR6 = new jr(19, x16Var, tedVarF, aw2Var, jxVar);
                            l46Var.p0(objR6);
                        } else {
                            objR6 = new jr(19, x16Var, tedVarF, aw2Var, jxVar);
                            l46Var.p0(objR6);
                        }
                        i25 = i19;
                        i26 = i24;
                        long j8 = jB;
                        tedVar3 = tedVarF;
                        db6.k((x16) objR6, j8, a09Var4, jxVar, af1.b0(1010026864, new oz8(jB2, x16Var2, tedVar3, a09Var4, jxVar, aw2Var, a26Var2, j09Var5, f3, z4, x4dVar4, j, j8, l26Var8, l26Var7, dd2Var), l46Var), l46Var, (i23 & 896) | 28672);
                        if (tedVar3.d.d().a.containsKey(ued.b)) {
                            l46Var.f0(748459762);
                            if (i26 <= 256) {
                            }
                            objR7 = l46Var.R();
                            if (z13) {
                                objR7 = new pz8(tedVar3, null);
                                l46Var.p0(objR7);
                            } else {
                                objR7 = new pz8(tedVar3, null);
                                l46Var.p0(objR7);
                            }
                            af1.o((l26) objR7, l46Var, tedVar3);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(748521266);
                            l46Var.r(false);
                        }
                        x4dVar2 = x4dVar4;
                        j09Var3 = j09Var5;
                        f2 = f3;
                        z3 = z4;
                        j4 = j8;
                        l26Var3 = l26Var8;
                        l26Var4 = l26Var7;
                        a09Var2 = a09Var4;
                        tedVar2 = tedVar3;
                        j5 = jB2;
                    } else {
                        l46Var.Z();
                        if ((i3 & 4) != 0) {
                            i8 &= -897;
                        }
                        if ((i3 & 32) != 0) {
                            i8 &= -458753;
                        }
                        int i34 = i8 & (-29360129);
                        if ((i3 & 512) != 0) {
                            i34 = i8 & (-1908408321);
                        }
                        if ((i3 & 2048) != 0) {
                            i16 &= -113;
                        }
                        f3 = f;
                        jB = j2;
                        jB2 = j3;
                        l26Var8 = l26Var;
                        l26Var7 = l26Var2;
                        i20 = i16;
                        i19 = i34;
                        x4dVar3 = x4dVarB;
                        j09Var5 = j09Var2;
                        z4 = z;
                    }
                    a09Var3 = a09Var;
                    l46Var.s();
                    t39 t39Var2 = t39.a;
                    objZ = vpf.Z(t39Var2, l46Var);
                    objZ2 = vpf.Z(t39Var2, l46Var);
                    objZ3 = vpf.Z(t39.d, l46Var);
                    x4d x4dVar5 = x4dVar3;
                    i21 = (i19 & 896) ^ 384;
                    a09 a09Var5 = a09Var3;
                    zI = ((i21 <= 256 && l46Var.g(tedVarF)) || (i19 & 384) == 256) | l46Var.i(objZ2) | l46Var.i(objZ3) | l46Var.i(objZ);
                    objR = l46Var.R();
                    obj = sf2.a;
                    if (zI) {
                        objR = new jr(tedVarF, objZ2, objZ3, objZ, 18);
                        l46Var.p0(objR);
                    } else {
                        objR = new jr(tedVarF, objZ2, objZ3, objZ, 18);
                        l46Var.p0(objR);
                    }
                    af1.u((x16) objR, l46Var);
                    objR2 = l46Var.R();
                    if (objR2 == obj) {
                        objR2 = af1.E(l46Var);
                        l46Var.p0(objR2);
                    }
                    aw2Var = (aw2) objR2;
                    boolean zI7 = ((i21 <= 256 && l46Var.g(tedVarF)) || (i19 & 384) == 256) | l46Var.i(aw2Var);
                    i22 = i19 & 14;
                    if (i22 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = zI7 | z5;
                    objR3 = l46Var.R();
                    if (z6) {
                        objR3 = new m50(tedVarF, aw2Var, x16Var, 3);
                        l46Var.p0(objR3);
                    } else {
                        objR3 = new m50(tedVarF, aw2Var, x16Var, 3);
                        l46Var.p0(objR3);
                    }
                    x16 x16Var3 = (x16) objR3;
                    boolean zI8 = l46Var.i(aw2Var);
                    if (i21 > 256) {
                        i23 = i20;
                        if ((i19 & 384) != 256) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                    } else {
                        i23 = i20;
                        if ((i19 & 384) != 256) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                    }
                    boolean z16 = zI8 | z7;
                    if (i22 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = z16 | z8;
                    objR4 = l46Var.R();
                    if (z9) {
                        objR4 = new it3(aw2Var, tedVarF, x16Var, 23);
                        l46Var.p0(objR4);
                    } else {
                        objR4 = new it3(aw2Var, tedVarF, x16Var, 23);
                        l46Var.p0(objR4);
                    }
                    a26 a26Var3 = (a26) objR4;
                    objR5 = l46Var.R();
                    if (objR5 == obj) {
                        objR5 = qk2.d(0.0f);
                        l46Var.p0(objR5);
                    }
                    jxVar = (jx) objR5;
                    if (i21 > 256) {
                        i24 = i21;
                        if ((i19 & 384) != 256) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        i24 = i21;
                        if ((i19 & 384) != 256) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    boolean zI9 = z10 | l46Var.i(aw2Var) | l46Var.i(jxVar);
                    if (i22 == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z11 | zI9;
                    objR6 = l46Var.R();
                    if (z12) {
                        objR6 = new jr(19, x16Var, tedVarF, aw2Var, jxVar);
                        l46Var.p0(objR6);
                    } else {
                        objR6 = new jr(19, x16Var, tedVarF, aw2Var, jxVar);
                        l46Var.p0(objR6);
                    }
                    i25 = i19;
                    i26 = i24;
                    long j9 = jB;
                    tedVar3 = tedVarF;
                    db6.k((x16) objR6, j9, a09Var5, jxVar, af1.b0(1010026864, new oz8(jB2, x16Var3, tedVar3, a09Var5, jxVar, aw2Var, a26Var3, j09Var5, f3, z4, x4dVar5, j, j9, l26Var8, l26Var7, dd2Var), l46Var), l46Var, (i23 & 896) | 28672);
                    if (tedVar3.d.d().a.containsKey(ued.b)) {
                        l46Var.f0(748459762);
                        if (i26 <= 256) {
                        }
                        objR7 = l46Var.R();
                        if (z13) {
                            objR7 = new pz8(tedVar3, null);
                            l46Var.p0(objR7);
                        } else {
                            objR7 = new pz8(tedVar3, null);
                            l46Var.p0(objR7);
                        }
                        af1.o((l26) objR7, l46Var, tedVar3);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(748521266);
                        l46Var.r(false);
                    }
                    x4dVar2 = x4dVar5;
                    j09Var3 = j09Var5;
                    f2 = f3;
                    z3 = z4;
                    j4 = j9;
                    l26Var3 = l26Var8;
                    l26Var4 = l26Var7;
                    a09Var2 = a09Var5;
                    tedVar2 = tedVar3;
                    j5 = jB2;
                } else {
                    l46Var.Z();
                    f2 = f;
                    z3 = z;
                    l26Var3 = l26Var;
                    l26Var4 = l26Var2;
                    a09Var2 = a09Var;
                    x4dVar2 = x4dVarB;
                    j09Var3 = j09Var2;
                    tedVar2 = tedVarF;
                    j4 = j2;
                    j5 = j3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new l26() { // from class: iz8
                        @Override // defpackage.l26
                        public final Object z(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int iP = k99.P(i | 1);
                            int iP2 = k99.P(i2);
                            zz8.a(x16Var, j09Var3, tedVar2, f2, z3, x4dVar2, j, j4, j5, l26Var3, l26Var4, a09Var2, dd2Var, (l46) obj2, iP, iP2, i3);
                            return wef.a;
                        }
                    };
                }
            }
            i5 = i4 | 27648;
            if ((i & 196608) == 0) {
                x4dVarB = x4dVar;
                if ((i3 & 32) == 0) {
                    i28 = 65536;
                } else {
                    i28 = 65536;
                }
                i5 |= i28;
            } else {
                x4dVarB = x4dVar;
            }
            if ((i & 1572864) == 0) {
                if (l46Var.f(j)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i5 |= i27;
            }
            if ((i & 12582912) == 0) {
                i5 |= 4194304;
            }
            i8 = i5 | 100663296;
            if ((i & 805306368) == 0) {
                if ((i3 & 512) == 0) {
                    i9 = i30;
                    if (l46Var.f(j3)) {
                    }
                    i8 |= i31;
                } else {
                    i9 = i30;
                }
                i8 |= i31;
            } else {
                i9 = i30;
            }
            i10 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i10 != 0) {
                i11 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (l46Var.i(l26Var)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i2 | i12;
            } else {
                i11 = i2;
            }
            i13 = i11 | (((i3 & 2048) == 0 || !l46Var.i(l26Var2)) ? 16 : 32);
            i14 = i3 & 4096;
            if (i14 != 0) {
                i16 = i13 | 384;
            } else {
                i15 = i13;
                if ((i2 & 384) != 0) {
                    if (l46Var.g(a09Var)) {
                        i17 = 256;
                    } else {
                        i17 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i15 |= i17;
                }
                i16 = i15;
            }
            if ((i8 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (l46Var.W(i8 & 1, z2)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i3 & 4) != 0) {
                        i8 &= -897;
                        tedVarF = f(0, 3, null, l46Var);
                    }
                    f3 = y11.b;
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 32) != 0) {
                        y11 y11Var3 = y11.a;
                        x4dVarB = u5d.b(tm7.z, l46Var);
                        i8 &= -458753;
                    }
                    jB = o82.b(j, l46Var);
                    i18 = i8 & (-29360129);
                    if ((i3 & 512) != 0) {
                        y11 y11Var4 = y11.a;
                        jB2 = y11.b(l46Var);
                        i18 = i8 & (-1908408321);
                    } else {
                        jB2 = j3;
                    }
                    if (i10 != 0) {
                        l26Var5 = ae2.a;
                    } else {
                        l26Var5 = l26Var;
                    }
                    if ((i3 & 2048) != 0) {
                        l26Var6 = y.I0;
                        i16 &= -113;
                    } else {
                        l26Var6 = l26Var2;
                    }
                    if (i14 != 0) {
                        int i35 = i18;
                        l26Var7 = l26Var6;
                        i19 = i35;
                        l26Var8 = l26Var5;
                        i20 = i16;
                        x4dVar3 = x4dVarB;
                        j09Var5 = j09Var4;
                        a09Var3 = new a09(true, true);
                    } else {
                        int i36 = i18;
                        l26Var7 = l26Var6;
                        i19 = i36;
                        l26Var8 = l26Var5;
                        i20 = i16;
                        x4dVar3 = x4dVarB;
                        j09Var5 = j09Var4;
                        a09Var3 = a09Var;
                    }
                } else {
                    if (i9 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i3 & 4) != 0) {
                        i8 &= -897;
                        tedVarF = f(0, 3, null, l46Var);
                    }
                    f3 = y11.b;
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 32) != 0) {
                        y11 y11Var5 = y11.a;
                        x4dVarB = u5d.b(tm7.z, l46Var);
                        i8 &= -458753;
                    }
                    jB = o82.b(j, l46Var);
                    i18 = i8 & (-29360129);
                    if ((i3 & 512) != 0) {
                        y11 y11Var6 = y11.a;
                        jB2 = y11.b(l46Var);
                        i18 = i8 & (-1908408321);
                    } else {
                        jB2 = j3;
                    }
                    if (i10 != 0) {
                        l26Var5 = ae2.a;
                    } else {
                        l26Var5 = l26Var;
                    }
                    if ((i3 & 2048) != 0) {
                        l26Var6 = y.I0;
                        i16 &= -113;
                    } else {
                        l26Var6 = l26Var2;
                    }
                    if (i14 != 0) {
                        int i37 = i18;
                        l26Var7 = l26Var6;
                        i19 = i37;
                        l26Var8 = l26Var5;
                        i20 = i16;
                        x4dVar3 = x4dVarB;
                        j09Var5 = j09Var4;
                        a09Var3 = new a09(true, true);
                    } else {
                        int i38 = i18;
                        l26Var7 = l26Var6;
                        i19 = i38;
                        l26Var8 = l26Var5;
                        i20 = i16;
                        x4dVar3 = x4dVarB;
                        j09Var5 = j09Var4;
                        a09Var3 = a09Var;
                    }
                }
                l46Var.s();
                t39 t39Var3 = t39.a;
                objZ = vpf.Z(t39Var3, l46Var);
                objZ2 = vpf.Z(t39Var3, l46Var);
                objZ3 = vpf.Z(t39.d, l46Var);
                x4d x4dVar6 = x4dVar3;
                i21 = (i19 & 896) ^ 384;
                a09 a09Var6 = a09Var3;
                zI = ((i21 <= 256 && l46Var.g(tedVarF)) || (i19 & 384) == 256) | l46Var.i(objZ2) | l46Var.i(objZ3) | l46Var.i(objZ);
                objR = l46Var.R();
                obj = sf2.a;
                if (zI) {
                    objR = new jr(tedVarF, objZ2, objZ3, objZ, 18);
                    l46Var.p0(objR);
                } else {
                    objR = new jr(tedVarF, objZ2, objZ3, objZ, 18);
                    l46Var.p0(objR);
                }
                af1.u((x16) objR, l46Var);
                objR2 = l46Var.R();
                if (objR2 == obj) {
                    objR2 = af1.E(l46Var);
                    l46Var.p0(objR2);
                }
                aw2Var = (aw2) objR2;
                boolean zI10 = ((i21 <= 256 && l46Var.g(tedVarF)) || (i19 & 384) == 256) | l46Var.i(aw2Var);
                i22 = i19 & 14;
                if (i22 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = zI10 | z5;
                objR3 = l46Var.R();
                if (z6) {
                    objR3 = new m50(tedVarF, aw2Var, x16Var, 3);
                    l46Var.p0(objR3);
                } else {
                    objR3 = new m50(tedVarF, aw2Var, x16Var, 3);
                    l46Var.p0(objR3);
                }
                x16 x16Var4 = (x16) objR3;
                boolean zI11 = l46Var.i(aw2Var);
                if (i21 > 256) {
                    i23 = i20;
                    if ((i19 & 384) != 256) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                } else {
                    i23 = i20;
                    if ((i19 & 384) != 256) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                }
                boolean z17 = zI11 | z7;
                if (i22 == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z17 | z8;
                objR4 = l46Var.R();
                if (z9) {
                    objR4 = new it3(aw2Var, tedVarF, x16Var, 23);
                    l46Var.p0(objR4);
                } else {
                    objR4 = new it3(aw2Var, tedVarF, x16Var, 23);
                    l46Var.p0(objR4);
                }
                a26 a26Var4 = (a26) objR4;
                objR5 = l46Var.R();
                if (objR5 == obj) {
                    objR5 = qk2.d(0.0f);
                    l46Var.p0(objR5);
                }
                jxVar = (jx) objR5;
                if (i21 > 256) {
                    i24 = i21;
                    if ((i19 & 384) != 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    i24 = i21;
                    if ((i19 & 384) != 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                boolean zI12 = z10 | l46Var.i(aw2Var) | l46Var.i(jxVar);
                if (i22 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | zI12;
                objR6 = l46Var.R();
                if (z12) {
                    objR6 = new jr(19, x16Var, tedVarF, aw2Var, jxVar);
                    l46Var.p0(objR6);
                } else {
                    objR6 = new jr(19, x16Var, tedVarF, aw2Var, jxVar);
                    l46Var.p0(objR6);
                }
                i25 = i19;
                i26 = i24;
                long j10 = jB;
                tedVar3 = tedVarF;
                db6.k((x16) objR6, j10, a09Var6, jxVar, af1.b0(1010026864, new oz8(jB2, x16Var4, tedVar3, a09Var6, jxVar, aw2Var, a26Var4, j09Var5, f3, z4, x4dVar6, j, j10, l26Var8, l26Var7, dd2Var), l46Var), l46Var, (i23 & 896) | 28672);
                if (tedVar3.d.d().a.containsKey(ued.b)) {
                    l46Var.f0(748459762);
                    if (i26 <= 256) {
                    }
                    objR7 = l46Var.R();
                    if (z13) {
                        objR7 = new pz8(tedVar3, null);
                        l46Var.p0(objR7);
                    } else {
                        objR7 = new pz8(tedVar3, null);
                        l46Var.p0(objR7);
                    }
                    af1.o((l26) objR7, l46Var, tedVar3);
                    l46Var.r(false);
                } else {
                    l46Var.f0(748521266);
                    l46Var.r(false);
                }
                x4dVar2 = x4dVar6;
                j09Var3 = j09Var5;
                f2 = f3;
                z3 = z4;
                j4 = j10;
                l26Var3 = l26Var8;
                l26Var4 = l26Var7;
                a09Var2 = a09Var6;
                tedVar2 = tedVar3;
                j5 = jB2;
            } else {
                l46Var.Z();
                f2 = f;
                z3 = z;
                l26Var3 = l26Var;
                l26Var4 = l26Var2;
                a09Var2 = a09Var;
                x4dVar2 = x4dVarB;
                j09Var3 = j09Var2;
                tedVar2 = tedVarF;
                j4 = j2;
                j5 = j3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: iz8
                    @Override // defpackage.l26
                    public final Object z(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iP = k99.P(i | 1);
                        int iP2 = k99.P(i2);
                        zz8.a(x16Var, j09Var3, tedVar2, f2, z3, x4dVar2, j, j4, j5, l26Var3, l26Var4, a09Var2, dd2Var, (l46) obj2, iP, iP2, i3);
                        return wef.a;
                    }
                };
            }
        }
        i4 |= 48;
        j09Var2 = j09Var;
        if ((i & 384) == 0) {
            if ((i3 & 4) == 0) {
                tedVarF = tedVar;
                if (l46Var.g(tedVarF)) {
                    i29 = 256;
                }
                i4 |= i29;
            } else {
                tedVarF = tedVar;
            }
            i29 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            i4 |= i29;
        } else {
            tedVarF = tedVar;
        }
        i5 = i4 | 3072;
        i6 = i3 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                if (l46Var.h(z)) {
                    i7 = 16384;
                } else {
                    i7 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i5 |= i7;
            }
            if ((i & 196608) == 0) {
                x4dVarB = x4dVar;
                if ((i3 & 32) == 0) {
                    i28 = 65536;
                } else {
                    i28 = 65536;
                }
                i5 |= i28;
            } else {
                x4dVarB = x4dVar;
            }
            if ((i & 1572864) == 0) {
                if (l46Var.f(j)) {
                    i27 = 1048576;
                } else {
                    i27 = 524288;
                }
                i5 |= i27;
            }
            if ((i & 12582912) == 0) {
                i5 |= 4194304;
            }
            i8 = i5 | 100663296;
            if ((i & 805306368) == 0) {
                if ((i3 & 512) == 0) {
                    i9 = i30;
                    if (l46Var.f(j3)) {
                    }
                    i8 |= i31;
                } else {
                    i9 = i30;
                }
                i8 |= i31;
            } else {
                i9 = i30;
            }
            i10 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
            if (i10 != 0) {
                i11 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (l46Var.i(l26Var)) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                i11 = i2 | i12;
            } else {
                i11 = i2;
            }
            i13 = i11 | (((i3 & 2048) == 0 || !l46Var.i(l26Var2)) ? 16 : 32);
            i14 = i3 & 4096;
            if (i14 != 0) {
                i16 = i13 | 384;
            } else {
                i15 = i13;
                if ((i2 & 384) != 0) {
                    if (l46Var.g(a09Var)) {
                        i17 = 256;
                    } else {
                        i17 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i15 |= i17;
                }
                i16 = i15;
            }
            if ((i8 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (l46Var.W(i8 & 1, z2)) {
                l46Var.b0();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i3 & 4) != 0) {
                        i8 &= -897;
                        tedVarF = f(0, 3, null, l46Var);
                    }
                    f3 = y11.b;
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 32) != 0) {
                        y11 y11Var7 = y11.a;
                        x4dVarB = u5d.b(tm7.z, l46Var);
                        i8 &= -458753;
                    }
                    jB = o82.b(j, l46Var);
                    i18 = i8 & (-29360129);
                    if ((i3 & 512) != 0) {
                        y11 y11Var8 = y11.a;
                        jB2 = y11.b(l46Var);
                        i18 = i8 & (-1908408321);
                    } else {
                        jB2 = j3;
                    }
                    if (i10 != 0) {
                        l26Var5 = ae2.a;
                    } else {
                        l26Var5 = l26Var;
                    }
                    if ((i3 & 2048) != 0) {
                        l26Var6 = y.I0;
                        i16 &= -113;
                    } else {
                        l26Var6 = l26Var2;
                    }
                    if (i14 != 0) {
                        int i39 = i18;
                        l26Var7 = l26Var6;
                        i19 = i39;
                        l26Var8 = l26Var5;
                        i20 = i16;
                        x4dVar3 = x4dVarB;
                        j09Var5 = j09Var4;
                        a09Var3 = new a09(true, true);
                    } else {
                        int i310 = i18;
                        l26Var7 = l26Var6;
                        i19 = i310;
                        l26Var8 = l26Var5;
                        i20 = i16;
                        x4dVar3 = x4dVarB;
                        j09Var5 = j09Var4;
                        a09Var3 = a09Var;
                    }
                } else {
                    if (i9 != 0) {
                        j09Var4 = g09.a;
                    } else {
                        j09Var4 = j09Var2;
                    }
                    if ((i3 & 4) != 0) {
                        i8 &= -897;
                        tedVarF = f(0, 3, null, l46Var);
                    }
                    f3 = y11.b;
                    if (i6 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if ((i3 & 32) != 0) {
                        y11 y11Var9 = y11.a;
                        x4dVarB = u5d.b(tm7.z, l46Var);
                        i8 &= -458753;
                    }
                    jB = o82.b(j, l46Var);
                    i18 = i8 & (-29360129);
                    if ((i3 & 512) != 0) {
                        y11 y11Var10 = y11.a;
                        jB2 = y11.b(l46Var);
                        i18 = i8 & (-1908408321);
                    } else {
                        jB2 = j3;
                    }
                    if (i10 != 0) {
                        l26Var5 = ae2.a;
                    } else {
                        l26Var5 = l26Var;
                    }
                    if ((i3 & 2048) != 0) {
                        l26Var6 = y.I0;
                        i16 &= -113;
                    } else {
                        l26Var6 = l26Var2;
                    }
                    if (i14 != 0) {
                        int i311 = i18;
                        l26Var7 = l26Var6;
                        i19 = i311;
                        l26Var8 = l26Var5;
                        i20 = i16;
                        x4dVar3 = x4dVarB;
                        j09Var5 = j09Var4;
                        a09Var3 = new a09(true, true);
                    } else {
                        int i312 = i18;
                        l26Var7 = l26Var6;
                        i19 = i312;
                        l26Var8 = l26Var5;
                        i20 = i16;
                        x4dVar3 = x4dVarB;
                        j09Var5 = j09Var4;
                        a09Var3 = a09Var;
                    }
                }
                l46Var.s();
                t39 t39Var4 = t39.a;
                objZ = vpf.Z(t39Var4, l46Var);
                objZ2 = vpf.Z(t39Var4, l46Var);
                objZ3 = vpf.Z(t39.d, l46Var);
                x4d x4dVar7 = x4dVar3;
                i21 = (i19 & 896) ^ 384;
                a09 a09Var7 = a09Var3;
                zI = ((i21 <= 256 && l46Var.g(tedVarF)) || (i19 & 384) == 256) | l46Var.i(objZ2) | l46Var.i(objZ3) | l46Var.i(objZ);
                objR = l46Var.R();
                obj = sf2.a;
                if (zI) {
                    objR = new jr(tedVarF, objZ2, objZ3, objZ, 18);
                    l46Var.p0(objR);
                } else {
                    objR = new jr(tedVarF, objZ2, objZ3, objZ, 18);
                    l46Var.p0(objR);
                }
                af1.u((x16) objR, l46Var);
                objR2 = l46Var.R();
                if (objR2 == obj) {
                    objR2 = af1.E(l46Var);
                    l46Var.p0(objR2);
                }
                aw2Var = (aw2) objR2;
                boolean zI13 = ((i21 <= 256 && l46Var.g(tedVarF)) || (i19 & 384) == 256) | l46Var.i(aw2Var);
                i22 = i19 & 14;
                if (i22 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = zI13 | z5;
                objR3 = l46Var.R();
                if (z6) {
                    objR3 = new m50(tedVarF, aw2Var, x16Var, 3);
                    l46Var.p0(objR3);
                } else {
                    objR3 = new m50(tedVarF, aw2Var, x16Var, 3);
                    l46Var.p0(objR3);
                }
                x16 x16Var5 = (x16) objR3;
                boolean zI14 = l46Var.i(aw2Var);
                if (i21 > 256) {
                    i23 = i20;
                    if ((i19 & 384) != 256) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                } else {
                    i23 = i20;
                    if ((i19 & 384) != 256) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                }
                boolean z18 = zI14 | z7;
                if (i22 == 4) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z18 | z8;
                objR4 = l46Var.R();
                if (z9) {
                    objR4 = new it3(aw2Var, tedVarF, x16Var, 23);
                    l46Var.p0(objR4);
                } else {
                    objR4 = new it3(aw2Var, tedVarF, x16Var, 23);
                    l46Var.p0(objR4);
                }
                a26 a26Var5 = (a26) objR4;
                objR5 = l46Var.R();
                if (objR5 == obj) {
                    objR5 = qk2.d(0.0f);
                    l46Var.p0(objR5);
                }
                jxVar = (jx) objR5;
                if (i21 > 256) {
                    i24 = i21;
                    if ((i19 & 384) != 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    i24 = i21;
                    if ((i19 & 384) != 256) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                boolean zI15 = z10 | l46Var.i(aw2Var) | l46Var.i(jxVar);
                if (i22 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z11 | zI15;
                objR6 = l46Var.R();
                if (z12) {
                    objR6 = new jr(19, x16Var, tedVarF, aw2Var, jxVar);
                    l46Var.p0(objR6);
                } else {
                    objR6 = new jr(19, x16Var, tedVarF, aw2Var, jxVar);
                    l46Var.p0(objR6);
                }
                i25 = i19;
                i26 = i24;
                long j11 = jB;
                tedVar3 = tedVarF;
                db6.k((x16) objR6, j11, a09Var7, jxVar, af1.b0(1010026864, new oz8(jB2, x16Var5, tedVar3, a09Var7, jxVar, aw2Var, a26Var5, j09Var5, f3, z4, x4dVar7, j, j11, l26Var8, l26Var7, dd2Var), l46Var), l46Var, (i23 & 896) | 28672);
                if (tedVar3.d.d().a.containsKey(ued.b)) {
                    l46Var.f0(748459762);
                    if (i26 <= 256) {
                    }
                    objR7 = l46Var.R();
                    if (z13) {
                        objR7 = new pz8(tedVar3, null);
                        l46Var.p0(objR7);
                    } else {
                        objR7 = new pz8(tedVar3, null);
                        l46Var.p0(objR7);
                    }
                    af1.o((l26) objR7, l46Var, tedVar3);
                    l46Var.r(false);
                } else {
                    l46Var.f0(748521266);
                    l46Var.r(false);
                }
                x4dVar2 = x4dVar7;
                j09Var3 = j09Var5;
                f2 = f3;
                z3 = z4;
                j4 = j11;
                l26Var3 = l26Var8;
                l26Var4 = l26Var7;
                a09Var2 = a09Var7;
                tedVar2 = tedVar3;
                j5 = jB2;
            } else {
                l46Var.Z();
                f2 = f;
                z3 = z;
                l26Var3 = l26Var;
                l26Var4 = l26Var2;
                a09Var2 = a09Var;
                x4dVar2 = x4dVarB;
                j09Var3 = j09Var2;
                tedVar2 = tedVarF;
                j4 = j2;
                j5 = j3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: iz8
                    @Override // defpackage.l26
                    public final Object z(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iP = k99.P(i | 1);
                        int iP2 = k99.P(i2);
                        zz8.a(x16Var, j09Var3, tedVar2, f2, z3, x4dVar2, j, j4, j5, l26Var3, l26Var4, a09Var2, dd2Var, (l46) obj2, iP, iP2, i3);
                        return wef.a;
                    }
                };
            }
        }
        i5 = i4 | 27648;
        if ((i & 196608) == 0) {
            x4dVarB = x4dVar;
            if ((i3 & 32) == 0) {
                i28 = 65536;
            } else {
                i28 = 65536;
            }
            i5 |= i28;
        } else {
            x4dVarB = x4dVar;
        }
        if ((i & 1572864) == 0) {
            if (l46Var.f(j)) {
                i27 = 1048576;
            } else {
                i27 = 524288;
            }
            i5 |= i27;
        }
        if ((i & 12582912) == 0) {
            i5 |= 4194304;
        }
        i8 = i5 | 100663296;
        if ((i & 805306368) == 0) {
            if ((i3 & 512) == 0) {
                i9 = i30;
                if (l46Var.f(j3)) {
                }
                i8 |= i31;
            } else {
                i9 = i30;
            }
            i8 |= i31;
        } else {
            i9 = i30;
        }
        i10 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i10 != 0) {
            i11 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (l46Var.i(l26Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i2 | i12;
        } else {
            i11 = i2;
        }
        i13 = i11 | (((i3 & 2048) == 0 || !l46Var.i(l26Var2)) ? 16 : 32);
        i14 = i3 & 4096;
        if (i14 != 0) {
            i16 = i13 | 384;
        } else {
            i15 = i13;
            if ((i2 & 384) != 0) {
                if (l46Var.g(a09Var)) {
                    i17 = 256;
                } else {
                    i17 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i15 |= i17;
            }
            i16 = i15;
        }
        if ((i8 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (l46Var.W(i8 & 1, z2)) {
            l46Var.b0();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if ((i3 & 4) != 0) {
                    i8 &= -897;
                    tedVarF = f(0, 3, null, l46Var);
                }
                f3 = y11.b;
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if ((i3 & 32) != 0) {
                    y11 y11Var11 = y11.a;
                    x4dVarB = u5d.b(tm7.z, l46Var);
                    i8 &= -458753;
                }
                jB = o82.b(j, l46Var);
                i18 = i8 & (-29360129);
                if ((i3 & 512) != 0) {
                    y11 y11Var12 = y11.a;
                    jB2 = y11.b(l46Var);
                    i18 = i8 & (-1908408321);
                } else {
                    jB2 = j3;
                }
                if (i10 != 0) {
                    l26Var5 = ae2.a;
                } else {
                    l26Var5 = l26Var;
                }
                if ((i3 & 2048) != 0) {
                    l26Var6 = y.I0;
                    i16 &= -113;
                } else {
                    l26Var6 = l26Var2;
                }
                if (i14 != 0) {
                    int i313 = i18;
                    l26Var7 = l26Var6;
                    i19 = i313;
                    l26Var8 = l26Var5;
                    i20 = i16;
                    x4dVar3 = x4dVarB;
                    j09Var5 = j09Var4;
                    a09Var3 = new a09(true, true);
                } else {
                    int i314 = i18;
                    l26Var7 = l26Var6;
                    i19 = i314;
                    l26Var8 = l26Var5;
                    i20 = i16;
                    x4dVar3 = x4dVarB;
                    j09Var5 = j09Var4;
                    a09Var3 = a09Var;
                }
            } else {
                if (i9 != 0) {
                    j09Var4 = g09.a;
                } else {
                    j09Var4 = j09Var2;
                }
                if ((i3 & 4) != 0) {
                    i8 &= -897;
                    tedVarF = f(0, 3, null, l46Var);
                }
                f3 = y11.b;
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if ((i3 & 32) != 0) {
                    y11 y11Var13 = y11.a;
                    x4dVarB = u5d.b(tm7.z, l46Var);
                    i8 &= -458753;
                }
                jB = o82.b(j, l46Var);
                i18 = i8 & (-29360129);
                if ((i3 & 512) != 0) {
                    y11 y11Var14 = y11.a;
                    jB2 = y11.b(l46Var);
                    i18 = i8 & (-1908408321);
                } else {
                    jB2 = j3;
                }
                if (i10 != 0) {
                    l26Var5 = ae2.a;
                } else {
                    l26Var5 = l26Var;
                }
                if ((i3 & 2048) != 0) {
                    l26Var6 = y.I0;
                    i16 &= -113;
                } else {
                    l26Var6 = l26Var2;
                }
                if (i14 != 0) {
                    int i315 = i18;
                    l26Var7 = l26Var6;
                    i19 = i315;
                    l26Var8 = l26Var5;
                    i20 = i16;
                    x4dVar3 = x4dVarB;
                    j09Var5 = j09Var4;
                    a09Var3 = new a09(true, true);
                } else {
                    int i316 = i18;
                    l26Var7 = l26Var6;
                    i19 = i316;
                    l26Var8 = l26Var5;
                    i20 = i16;
                    x4dVar3 = x4dVarB;
                    j09Var5 = j09Var4;
                    a09Var3 = a09Var;
                }
            }
            l46Var.s();
            t39 t39Var5 = t39.a;
            objZ = vpf.Z(t39Var5, l46Var);
            objZ2 = vpf.Z(t39Var5, l46Var);
            objZ3 = vpf.Z(t39.d, l46Var);
            x4d x4dVar8 = x4dVar3;
            i21 = (i19 & 896) ^ 384;
            a09 a09Var8 = a09Var3;
            zI = ((i21 <= 256 && l46Var.g(tedVarF)) || (i19 & 384) == 256) | l46Var.i(objZ2) | l46Var.i(objZ3) | l46Var.i(objZ);
            objR = l46Var.R();
            obj = sf2.a;
            if (zI) {
                objR = new jr(tedVarF, objZ2, objZ3, objZ, 18);
                l46Var.p0(objR);
            } else {
                objR = new jr(tedVarF, objZ2, objZ3, objZ, 18);
                l46Var.p0(objR);
            }
            af1.u((x16) objR, l46Var);
            objR2 = l46Var.R();
            if (objR2 == obj) {
                objR2 = af1.E(l46Var);
                l46Var.p0(objR2);
            }
            aw2Var = (aw2) objR2;
            boolean zI16 = ((i21 <= 256 && l46Var.g(tedVarF)) || (i19 & 384) == 256) | l46Var.i(aw2Var);
            i22 = i19 & 14;
            if (i22 == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = zI16 | z5;
            objR3 = l46Var.R();
            if (z6) {
                objR3 = new m50(tedVarF, aw2Var, x16Var, 3);
                l46Var.p0(objR3);
            } else {
                objR3 = new m50(tedVarF, aw2Var, x16Var, 3);
                l46Var.p0(objR3);
            }
            x16 x16Var6 = (x16) objR3;
            boolean zI17 = l46Var.i(aw2Var);
            if (i21 > 256) {
                i23 = i20;
                if ((i19 & 384) != 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            } else {
                i23 = i20;
                if ((i19 & 384) != 256) {
                    z7 = true;
                } else {
                    z7 = false;
                }
            }
            boolean z19 = zI17 | z7;
            if (i22 == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            z9 = z19 | z8;
            objR4 = l46Var.R();
            if (z9) {
                objR4 = new it3(aw2Var, tedVarF, x16Var, 23);
                l46Var.p0(objR4);
            } else {
                objR4 = new it3(aw2Var, tedVarF, x16Var, 23);
                l46Var.p0(objR4);
            }
            a26 a26Var6 = (a26) objR4;
            objR5 = l46Var.R();
            if (objR5 == obj) {
                objR5 = qk2.d(0.0f);
                l46Var.p0(objR5);
            }
            jxVar = (jx) objR5;
            if (i21 > 256) {
                i24 = i21;
                if ((i19 & 384) != 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                i24 = i21;
                if ((i19 & 384) != 256) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            boolean zI18 = z10 | l46Var.i(aw2Var) | l46Var.i(jxVar);
            if (i22 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z11 | zI18;
            objR6 = l46Var.R();
            if (z12) {
                objR6 = new jr(19, x16Var, tedVarF, aw2Var, jxVar);
                l46Var.p0(objR6);
            } else {
                objR6 = new jr(19, x16Var, tedVarF, aw2Var, jxVar);
                l46Var.p0(objR6);
            }
            i25 = i19;
            i26 = i24;
            long j12 = jB;
            tedVar3 = tedVarF;
            db6.k((x16) objR6, j12, a09Var8, jxVar, af1.b0(1010026864, new oz8(jB2, x16Var6, tedVar3, a09Var8, jxVar, aw2Var, a26Var6, j09Var5, f3, z4, x4dVar8, j, j12, l26Var8, l26Var7, dd2Var), l46Var), l46Var, (i23 & 896) | 28672);
            if (tedVar3.d.d().a.containsKey(ued.b)) {
                l46Var.f0(748459762);
                if (i26 <= 256) {
                }
                objR7 = l46Var.R();
                if (z13) {
                    objR7 = new pz8(tedVar3, null);
                    l46Var.p0(objR7);
                } else {
                    objR7 = new pz8(tedVar3, null);
                    l46Var.p0(objR7);
                }
                af1.o((l26) objR7, l46Var, tedVar3);
                l46Var.r(false);
            } else {
                l46Var.f0(748521266);
                l46Var.r(false);
            }
            x4dVar2 = x4dVar8;
            j09Var3 = j09Var5;
            f2 = f3;
            z3 = z4;
            j4 = j12;
            l26Var3 = l26Var8;
            l26Var4 = l26Var7;
            a09Var2 = a09Var8;
            tedVar2 = tedVar3;
            j5 = jB2;
        } else {
            l46Var.Z();
            f2 = f;
            z3 = z;
            l26Var3 = l26Var;
            l26Var4 = l26Var2;
            a09Var2 = a09Var;
            x4dVar2 = x4dVarB;
            j09Var3 = j09Var2;
            tedVar2 = tedVarF;
            j4 = j2;
            j5 = j3;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: iz8
                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = k99.P(i | 1);
                    int iP2 = k99.P(i2);
                    zz8.a(x16Var, j09Var3, tedVar2, f2, z3, x4dVar2, j, j4, j5, l26Var3, l26Var4, a09Var2, dd2Var, (l46) obj2, iP, iP2, i3);
                    return wef.a;
                }
            };
        }
    }

    public static final void b(final jx jxVar, final aw2 aw2Var, final x16 x16Var, final a26 a26Var, final j09 j09Var, final ted tedVar, final float f, final boolean z, final x4d x4dVar, final long j, final long j2, final float f2, final l26 l26Var, final l26 l26Var2, final dd2 dd2Var, l46 l46Var, final int i) {
        l46Var.h0(-37400432);
        int i2 = i | (l46Var.i(jxVar) ? 32 : 16) | (l46Var.i(aw2Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        boolean zI = l46Var.i(x16Var);
        int i3 = UserMetadata.MAX_ATTRIBUTE_SIZE;
        int i4 = i2 | (zI ? 2048 : 1024);
        boolean zI2 = l46Var.i(a26Var);
        int i5 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        int i6 = i4 | (zI2 ? 16384 : 8192) | (l46Var.g(j09Var) ? 131072 : 65536) | (l46Var.g(tedVar) ? 1048576 : 524288) | (l46Var.d(f) ? 8388608 : 4194304) | (l46Var.h(z) ? 67108864 : 33554432) | (l46Var.g(x4dVar) ? 536870912 : 268435456);
        int i7 = (l46Var.f(j) ? 4 : 2) | (l46Var.f(j2) ? 32 : 16) | (l46Var.d(f2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.i(l26Var)) {
            i3 = 2048;
        }
        int i8 = i7 | i3;
        if (l46Var.i(l26Var2)) {
            i5 = 16384;
        }
        int i9 = i8 | i5 | (l46Var.i(dd2Var) ? 131072 : 65536);
        if (l46Var.W(i6 & 1, ((i6 & 306783379) == 306783378 && (i9 & 74899) == 74898) ? false : true)) {
            l46Var.b0();
            if ((i & 1) != 0 && !l46Var.C()) {
                l46Var.Z();
            }
            l46Var.s();
            String strH = tgc.h(R.string.m3c_bottom_sheet_pane_title, l46Var);
            j09 j09VarC = b.c(b.q(0.0f, f, d31.a.a(j09Var, ndb.c), 1), 1.0f);
            j09 j09VarS = g09.a;
            Object obj = sf2.a;
            if (z) {
                l46Var.f0(-1582035383);
                boolean z2 = (((i6 & 3670016) ^ 1572864) > 1048576 && l46Var.g(tedVar)) || (i6 & 1572864) == 1048576;
                Object objR = l46Var.R();
                if (z2 || objR == obj) {
                    x6f x6fVar = red.a;
                    objR = new qed(tedVar, a26Var);
                    l46Var.p0(objR);
                }
                j09VarS = dj6.S(j09VarS, (pc9) objR, null);
                l46Var.r(false);
            } else {
                l46Var.f0(-1582020872);
                l46Var.r(false);
            }
            j09 j09VarD = j09VarC.D(j09VarS);
            lo loVar = tedVar.d;
            lo loVar2 = tedVar.d;
            int i10 = (i6 & 3670016) ^ 1572864;
            boolean z3 = (i10 > 1048576 && l46Var.g(tedVar)) || (i6 & 1572864) == 1048576;
            Object objR2 = l46Var.R();
            if (z3 || objR2 == obj) {
                objR2 = new wf8(2, tedVar);
                l46Var.p0(objR2);
            }
            j09 j09VarJ = y41.j(j09VarD, loVar, (l26) objR2);
            ko koVar = loVar2.f;
            boolean z4 = z && tedVar.e();
            boolean z5 = loVar2.k.getValue() != null;
            boolean z6 = (i6 & 57344) == 16384;
            Object objR3 = l46Var.R();
            if (z6 || objR3 == obj) {
                objR3 = new sz8(null, a26Var);
                l46Var.p0(objR3);
            }
            j09 j09VarA = ul4.a(j09VarJ, koVar, ks9.a, z4, null, z5, (n26) objR3, false, 168);
            boolean zG = l46Var.g(strH);
            Object objR4 = l46Var.R();
            if (zG || objR4 == obj) {
                objR4 = new bt5(strH, 10);
                l46Var.p0(objR4);
            }
            j09 j09VarB = vwc.b(j09VarA, false, (a26) objR4);
            int iJ = (int) loVar2.i.j();
            if (iJ < 0) {
                iJ = 0;
            }
            j09 j09VarC2 = eb3.C(j09VarB, m93.o(iJ, 13));
            boolean z7 = ((i10 > 1048576 && l46Var.g(tedVar)) || (i6 & 1572864) == 1048576) | ((i6 & 112) == 32 || l46Var.i(jxVar));
            Object objR5 = l46Var.R();
            if (z7 || objR5 == obj) {
                objR5 = new so5(29, tedVar, jxVar);
                l46Var.p0(objR5);
            }
            int i11 = i9 << 6;
            nae.a(bzd.x(bzd.x(j09VarC2, (a26) objR5), new z11(tedVar, 1)), x4dVar, j, j2, f2, 0.0f, null, af1.b0(728743275, new yz8(l26Var2, jxVar, tedVar, l26Var, dd2Var, x16Var, aw2Var, z), l46Var), l46Var, ((i6 >> 24) & 112) | 12582912 | (i11 & 896) | (i11 & 7168) | (i11 & 57344), 96);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(aw2Var, x16Var, a26Var, j09Var, tedVar, f, z, x4dVar, j, j2, f2, l26Var, l26Var2, dd2Var, i) { // from class: hz8
                public final /* synthetic */ l26 X;
                public final /* synthetic */ l26 Y;
                public final /* synthetic */ dd2 Z;
                public final /* synthetic */ aw2 b;
                public final /* synthetic */ x16 c;
                public final /* synthetic */ a26 d;
                public final /* synthetic */ j09 e;
                public final /* synthetic */ ted f;
                public final /* synthetic */ float g;
                public final /* synthetic */ boolean v;
                public final /* synthetic */ x4d w;
                public final /* synthetic */ long x;
                public final /* synthetic */ long y;
                public final /* synthetic */ float z;

                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = k99.P(71);
                    zz8.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, this.x, this.y, this.z, this.X, this.Y, this.Z, (l46) obj2, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void c(long j, x16 x16Var, boolean z, boolean z2, l46 l46Var, int i) {
        boolean z3;
        l46Var.h0(-391613911);
        int i2 = i | (l46Var.f(j) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        int i3 = 0;
        if (!l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            l46Var.Z();
        } else if (j != 16) {
            l46Var.f0(-1438582326);
            h0e h0eVarB = vx.b(z ? 1.0f : 0.0f, vpf.Z(t39.c, l46Var), null, null, l46Var, 0, 28);
            Object objH = tgc.h(R.string.close_sheet, l46Var);
            j09 j09VarB = g09.a;
            Object obj = sf2.a;
            if (z2) {
                l46Var.f0(-1438283579);
                int i4 = i2 & 112;
                boolean z4 = i4 == 32;
                Object objR = l46Var.R();
                if (z4 || objR == obj) {
                    objR = new fu1(3, x16Var);
                    l46Var.p0(objR);
                }
                j09 j09VarA = ibe.a(j09VarB, x16Var, (PointerInputEventHandler) objR);
                boolean zG = (i4 == 32) | l46Var.g(objH);
                Object objR2 = l46Var.R();
                if (zG || objR2 == obj) {
                    objR2 = new kz8(i3, objH, x16Var);
                    l46Var.p0(objR2);
                }
                z3 = true;
                j09VarB = vwc.b(j09VarA, true, (a26) objR2);
                l46Var.r(false);
            } else {
                z3 = true;
                l46Var.f0(-1437857391);
                l46Var.r(false);
            }
            j09 j09VarD = b.c.D(j09VarB);
            boolean zG2 = l46Var.g(h0eVarB) | ((i2 & 14) == 4 ? z3 : false);
            Object objR3 = l46Var.R();
            if (zG2 || objR3 == obj) {
                objR3 = new gz8(j, h0eVarB, i3);
                l46Var.p0(objR3);
            }
            nk8.e(0, (a26) objR3, l46Var, j09VarD);
            l46Var.r(false);
        } else {
            l46Var.f0(-1437676103);
            l46Var.r(false);
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qb0(j, x16Var, z, z2, i);
        }
    }

    public static final float d(g0c g0cVar, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (g0cVar.G0 >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (abg.P(0.0f, Math.min(g0cVar.I0.getDensity() * 48.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final float e(g0c g0cVar, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (g0cVar.G0 & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (abg.P(0.0f, Math.min(g0cVar.I0.getDensity() * 24.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    public static final ted f(int i, int i2, a26 a26Var, l46 l46Var) {
        Object obj;
        final int i3 = 1;
        final byte b = 0;
        boolean z = (i2 & 1) == 0;
        int i4 = i2 & 2;
        Object obj2 = sf2.a;
        if (i4 != 0) {
            Object objR = l46Var.R();
            if (objR == obj2) {
                obj = objR;
                Object nd8Var = new nd8(23);
                l46Var.p0(nd8Var);
                obj = nd8Var;
            }
            obj = objR;
            a26Var = (a26) obj;
        }
        a26 a26Var2 = a26Var;
        int i5 = (i & 112) | (i & 14) | 384;
        x6f x6fVar = red.a;
        final float f = y11.c;
        final float f2 = y11.d;
        final sw3 sw3Var = (sw3) l46Var.k(zg2.h);
        boolean zG = l46Var.g(sw3Var) | l46Var.d(f);
        Object objR2 = l46Var.R();
        Object obj3 = objR2;
        if (zG || objR2 == obj2) {
            Object obj4 = new x16() { // from class: ped
                @Override // defpackage.x16
                public final Object invoke() {
                    float fP0;
                    int i6 = b;
                    float f3 = f;
                    sw3 sw3Var2 = sw3Var;
                    switch (i6) {
                        case 0:
                            fP0 = sw3Var2.p0(f3);
                            break;
                        default:
                            fP0 = sw3Var2.p0(f3);
                            break;
                    }
                    return Float.valueOf(fP0);
                }
            };
            l46Var.p0(obj4);
            obj3 = obj4;
        }
        x16 x16Var = (x16) obj3;
        boolean zG2 = l46Var.g(sw3Var) | l46Var.d(f2);
        Object objR3 = l46Var.R();
        Object obj5 = objR3;
        if (zG2 || objR3 == obj2) {
            Object obj6 = new x16() { // from class: ped
                @Override // defpackage.x16
                public final Object invoke() {
                    float fP0;
                    int i6 = i3;
                    float f3 = f2;
                    sw3 sw3Var2 = sw3Var;
                    switch (i6) {
                        case 0:
                            fP0 = sw3Var2.p0(f3);
                            break;
                        default:
                            fP0 = sw3Var2.p0(f3);
                            break;
                    }
                    return Float.valueOf(fP0);
                }
            };
            l46Var.p0(obj6);
            obj5 = obj6;
        }
        Object obj7 = (x16) obj5;
        Object[] objArr = {Boolean.valueOf(z), a26Var2, Boolean.FALSE};
        int i6 = 7;
        vea veaVar = new vea(i6, new dxc(i6, b), new xu(z, x16Var, obj7, a26Var2, 1));
        int i7 = (((((i5 & 14) ^ 6) <= 4 || !l46Var.h(z)) && (i5 & 6) != 4) ? 0 : 1) | (l46Var.g(x16Var) ? 1 : 0) | (l46Var.g(obj7) ? 1 : 0);
        if ((((i5 & 112) ^ 48) <= 32 || !l46Var.g(a26Var2)) && (i5 & 48) != 32) {
            i3 = 0;
        }
        int i8 = i7 | i3 | (l46Var.h(false) ? 1 : 0);
        Object objR4 = l46Var.R();
        if (i8 != 0 || objR4 == obj2) {
            Object h20Var = new h20(z, x16Var, obj7, ued.a, a26Var2, 4);
            l46Var.p0(h20Var);
            objR4 = h20Var;
        }
        return (ted) vfh.J(objArr, veaVar, (x16) objR4, l46Var, 0);
    }
}
