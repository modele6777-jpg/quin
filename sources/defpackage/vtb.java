package defpackage;

import ai.askquin.R;
import android.graphics.RectF;
import android.hardware.camera2.CaptureRequest;
import android.text.Layout;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.io.Serializable;
import java.text.Bidi;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.ArcanaGroup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vtb {
    /* JADX WARN: Code duplicated, block: B:106:0x0193  */
    /* JADX WARN: Code duplicated, block: B:109:0x019d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:117:0x0205  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0044  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0076  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x008f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00af  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:81:0x0102  */
    /* JADX WARN: Code duplicated, block: B:83:0x0111  */
    /* JADX WARN: Code duplicated, block: B:86:0x0128  */
    /* JADX WARN: Code duplicated, block: B:87:0x012b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0164  */
    /* JADX WARN: Code duplicated, block: B:93:0x016e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0171  */
    /* JADX WARN: Code duplicated, block: B:97:0x017c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0182  */
    public static final void a(String str, String str2, j09 j09Var, float f, o8b o8bVar, boolean z, x16 x16Var, x16 x16Var2, l46 l46Var, int i, int i2) {
        float f2;
        o8b o8bVarS;
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        x16 x16Var3;
        int i9;
        int i10;
        int i11;
        x16 x16Var4;
        int i12;
        int i13;
        boolean z3;
        j09 j09Var2;
        float f3;
        o8b o8bVar2;
        x16 x16Var5;
        boolean z4;
        x16 x16Var6;
        ojb ojbVarV;
        int i14;
        i8c i8cVar;
        g09 g09Var;
        j09 j09Var3;
        Object objR;
        int i15;
        Object objR2;
        float f4;
        x4d x4dVar;
        boolean z5;
        boolean z6;
        Object objR3;
        x16 x16Var7;
        o8b o8bVar3;
        x16 x16Var8;
        str.getClass();
        l46Var.h0(1182065239);
        int i16 = (l46Var.g(str) ? 4 : 2) | i;
        int i17 = i16 | 384;
        int i18 = i2 & 8;
        if (i18 == 0) {
            if ((i & 3072) == 0) {
                f2 = f;
                i17 |= l46Var.d(f2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            if ((i2 & 16) == 0) {
                o8bVarS = o8bVar;
                if (l46Var.g(o8bVarS)) {
                    i3 = 16384;
                }
                i4 = i17 | i3;
                i5 = i2 & 32;
                if (i5 != 0) {
                    i7 = i4 | 196608;
                    z2 = z;
                } else {
                    z2 = z;
                    if (l46Var.h(z2)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i7 = i4 | i6;
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i10 = i7 | 1572864;
                    x16Var3 = x16Var;
                } else {
                    x16Var3 = x16Var;
                    if (l46Var.i(x16Var3)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i10 = i7 | i9;
                }
                i11 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                if (i11 != 0) {
                    i13 = i10 | 12582912;
                    x16Var4 = x16Var2;
                } else {
                    x16Var4 = x16Var2;
                    if (l46Var.i(x16Var4)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i13 = i10 | i12;
                }
                if ((i13 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i13 & 1, z3)) {
                    l46Var.b0();
                    i14 = i & 1;
                    i8cVar = sf2.a;
                    if (i14 != 0 || l46Var.C()) {
                        if (i18 != 0) {
                            f2 = 12.0f;
                        }
                        if ((i2 & 16) != 0) {
                            i13 &= -57345;
                            o8bVarS = s(l46Var);
                        }
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if (i8 != 0) {
                            objR2 = l46Var.R();
                            if (objR2 == i8cVar) {
                                objR2 = new ond(24);
                                l46Var.p0(objR2);
                            }
                            x16Var3 = (x16) objR2;
                        }
                        g09Var = g09.a;
                        if (i11 != 0) {
                            objR = l46Var.R();
                            if (objR == i8cVar) {
                                objR = new yqf(5);
                                l46Var.p0(objR);
                            }
                            j09Var3 = g09Var;
                            i15 = i13;
                            x16Var4 = (x16) objR;
                        } else {
                            j09Var3 = g09Var;
                        }
                        boolean z7 = z2;
                        l46Var.s();
                        u51 u51VarM = c8b.m(l46Var);
                        if (k8b.f((e8b) l46Var.k(l8b.a))) {
                            f4 = 40.0f;
                        } else {
                            f4 = 48.0f;
                        }
                        j09 j09VarG = k8b.g(k8b.h(b.f(f4, 0.0f, j09Var3, 2), new fp4(2, f2), l46Var, 0), new agb(19), l46Var, 0);
                        long j = u51VarM.a;
                        long j2 = u51VarM.b;
                        u51 u51VarA = u51VarM.a(j, j2, j, j2);
                        x4dVar = a7c.a;
                        x4dVar.getClass();
                        if (we6.e(l46Var)) {
                            x4dVar = g21.f;
                        }
                        x4d x4dVar2 = x4dVar;
                        if ((3670016 & i15) == 1048576) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = z5 | ((((57344 & i15) ^ 24576) <= 16384 && l46Var.i(o8bVarS)) || (i15 & 24576) == 16384) | ((29360128 & i15) == 8388608);
                        objR3 = l46Var.R();
                        if (!z6 || objR3 == i8cVar) {
                            o8b o8bVar4 = o8bVarS;
                            x16 x16Var9 = x16Var4;
                            x16 x16Var10 = x16Var3;
                            objR3 = new zlb(4, x16Var10, o8bVar4, x16Var9, str2);
                            x16Var7 = x16Var10;
                            o8bVar3 = o8bVar4;
                            x16Var8 = x16Var9;
                            l46Var.p0(objR3);
                        } else {
                            o8bVar3 = o8bVarS;
                            x16Var8 = x16Var4;
                            x16Var7 = x16Var3;
                        }
                        cgg.a((x16) objR3, j09VarG, z7, x4dVar2, u51VarA, null, null, null, af1.b0(-1327205817, new a3g(str, 0), l46Var), l46Var, ((i15 >> 9) & 896) | 805306368, 480);
                        o8bVar2 = o8bVar3;
                        z4 = z7;
                        j09Var2 = j09Var3;
                        x16Var6 = x16Var7;
                        x16Var5 = x16Var8;
                        f3 = f2;
                    } else {
                        l46Var.Z();
                        if ((i2 & 16) != 0) {
                            i13 &= -57345;
                        }
                        j09Var3 = j09Var;
                    }
                    i15 = i13;
                    boolean z8 = z2;
                    l46Var.s();
                    u51 u51VarM2 = c8b.m(l46Var);
                    if (k8b.f((e8b) l46Var.k(l8b.a))) {
                        f4 = 40.0f;
                    } else {
                        f4 = 48.0f;
                    }
                    j09 j09VarG2 = k8b.g(k8b.h(b.f(f4, 0.0f, j09Var3, 2), new fp4(2, f2), l46Var, 0), new agb(19), l46Var, 0);
                    long j3 = u51VarM2.a;
                    long j4 = u51VarM2.b;
                    u51 u51VarA2 = u51VarM2.a(j3, j4, j3, j4);
                    x4dVar = a7c.a;
                    x4dVar.getClass();
                    if (we6.e(l46Var)) {
                        x4dVar = g21.f;
                    }
                    x4d x4dVar3 = x4dVar;
                    if ((3670016 & i15) == 1048576) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = z5 | ((((57344 & i15) ^ 24576) <= 16384 && l46Var.i(o8bVarS)) || (i15 & 24576) == 16384) | ((29360128 & i15) == 8388608);
                    objR3 = l46Var.R();
                    if (z6) {
                        o8b o8bVar5 = o8bVarS;
                        x16 x16Var11 = x16Var4;
                        x16 x16Var12 = x16Var3;
                        objR3 = new zlb(4, x16Var12, o8bVar5, x16Var11, str2);
                        x16Var7 = x16Var12;
                        o8bVar3 = o8bVar5;
                        x16Var8 = x16Var11;
                        l46Var.p0(objR3);
                    } else {
                        o8b o8bVar6 = o8bVarS;
                        x16 x16Var13 = x16Var4;
                        x16 x16Var14 = x16Var3;
                        objR3 = new zlb(4, x16Var14, o8bVar6, x16Var13, str2);
                        x16Var7 = x16Var14;
                        o8bVar3 = o8bVar6;
                        x16Var8 = x16Var13;
                        l46Var.p0(objR3);
                    }
                    cgg.a((x16) objR3, j09VarG2, z8, x4dVar3, u51VarA2, null, null, null, af1.b0(-1327205817, new a3g(str, 0), l46Var), l46Var, ((i15 >> 9) & 896) | 805306368, 480);
                    o8bVar2 = o8bVar3;
                    z4 = z8;
                    j09Var2 = j09Var3;
                    x16Var6 = x16Var7;
                    x16Var5 = x16Var8;
                    f3 = f2;
                } else {
                    l46Var.Z();
                    j09Var2 = j09Var;
                    f3 = f2;
                    o8bVar2 = o8bVarS;
                    x16Var5 = x16Var4;
                    z4 = z2;
                    x16Var6 = x16Var3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new zs1(str, str2, j09Var2, f3, o8bVar2, z4, x16Var6, x16Var5, i, i2);
                }
            }
            o8bVarS = o8bVar;
            i3 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            i4 = i17 | i3;
            i5 = i2 & 32;
            if (i5 != 0) {
                i7 = i4 | 196608;
                z2 = z;
            } else {
                z2 = z;
                if (l46Var.h(z2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i7 = i4 | i6;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i10 = i7 | 1572864;
                x16Var3 = x16Var;
            } else {
                x16Var3 = x16Var;
                if (l46Var.i(x16Var3)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i10 = i7 | i9;
            }
            i11 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i11 != 0) {
                i13 = i10 | 12582912;
                x16Var4 = x16Var2;
            } else {
                x16Var4 = x16Var2;
                if (l46Var.i(x16Var4)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i13 = i10 | i12;
            }
            if ((i13 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i13 & 1, z3)) {
                l46Var.b0();
                i14 = i & 1;
                i8cVar = sf2.a;
                if (i14 != 0) {
                    if (i18 != 0) {
                        f2 = 12.0f;
                    }
                    if ((i2 & 16) != 0) {
                        i13 &= -57345;
                        o8bVarS = s(l46Var);
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        objR2 = l46Var.R();
                        if (objR2 == i8cVar) {
                            objR2 = new ond(24);
                            l46Var.p0(objR2);
                        }
                        x16Var3 = (x16) objR2;
                    }
                    g09Var = g09.a;
                    if (i11 != 0) {
                        objR = l46Var.R();
                        if (objR == i8cVar) {
                            objR = new yqf(5);
                            l46Var.p0(objR);
                        }
                        j09Var3 = g09Var;
                        i15 = i13;
                        x16Var4 = (x16) objR;
                    } else {
                        j09Var3 = g09Var;
                        i15 = i13;
                    }
                } else {
                    if (i18 != 0) {
                        f2 = 12.0f;
                    }
                    if ((i2 & 16) != 0) {
                        i13 &= -57345;
                        o8bVarS = s(l46Var);
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        objR2 = l46Var.R();
                        if (objR2 == i8cVar) {
                            objR2 = new ond(24);
                            l46Var.p0(objR2);
                        }
                        x16Var3 = (x16) objR2;
                    }
                    g09Var = g09.a;
                    if (i11 != 0) {
                        objR = l46Var.R();
                        if (objR == i8cVar) {
                            objR = new yqf(5);
                            l46Var.p0(objR);
                        }
                        j09Var3 = g09Var;
                        i15 = i13;
                        x16Var4 = (x16) objR;
                    } else {
                        j09Var3 = g09Var;
                        i15 = i13;
                    }
                }
                boolean z9 = z2;
                l46Var.s();
                u51 u51VarM3 = c8b.m(l46Var);
                if (k8b.f((e8b) l46Var.k(l8b.a))) {
                    f4 = 40.0f;
                } else {
                    f4 = 48.0f;
                }
                j09 j09VarG3 = k8b.g(k8b.h(b.f(f4, 0.0f, j09Var3, 2), new fp4(2, f2), l46Var, 0), new agb(19), l46Var, 0);
                long j5 = u51VarM3.a;
                long j6 = u51VarM3.b;
                u51 u51VarA3 = u51VarM3.a(j5, j6, j5, j6);
                x4dVar = a7c.a;
                x4dVar.getClass();
                if (we6.e(l46Var)) {
                    x4dVar = g21.f;
                }
                x4d x4dVar4 = x4dVar;
                if ((3670016 & i15) == 1048576) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z5 | ((((57344 & i15) ^ 24576) <= 16384 && l46Var.i(o8bVarS)) || (i15 & 24576) == 16384) | ((29360128 & i15) == 8388608);
                objR3 = l46Var.R();
                if (z6) {
                    o8b o8bVar7 = o8bVarS;
                    x16 x16Var15 = x16Var4;
                    x16 x16Var16 = x16Var3;
                    objR3 = new zlb(4, x16Var16, o8bVar7, x16Var15, str2);
                    x16Var7 = x16Var16;
                    o8bVar3 = o8bVar7;
                    x16Var8 = x16Var15;
                    l46Var.p0(objR3);
                } else {
                    o8b o8bVar8 = o8bVarS;
                    x16 x16Var17 = x16Var4;
                    x16 x16Var18 = x16Var3;
                    objR3 = new zlb(4, x16Var18, o8bVar8, x16Var17, str2);
                    x16Var7 = x16Var18;
                    o8bVar3 = o8bVar8;
                    x16Var8 = x16Var17;
                    l46Var.p0(objR3);
                }
                cgg.a((x16) objR3, j09VarG3, z9, x4dVar4, u51VarA3, null, null, null, af1.b0(-1327205817, new a3g(str, 0), l46Var), l46Var, ((i15 >> 9) & 896) | 805306368, 480);
                o8bVar2 = o8bVar3;
                z4 = z9;
                j09Var2 = j09Var3;
                x16Var6 = x16Var7;
                x16Var5 = x16Var8;
                f3 = f2;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                f3 = f2;
                o8bVar2 = o8bVarS;
                x16Var5 = x16Var4;
                z4 = z2;
                x16Var6 = x16Var3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new zs1(str, str2, j09Var2, f3, o8bVar2, z4, x16Var6, x16Var5, i, i2);
            }
        }
        i17 = i16 | 3456;
        f2 = f;
        if ((i2 & 16) == 0) {
            o8bVarS = o8bVar;
            if (l46Var.g(o8bVarS)) {
                i3 = 16384;
            }
            i4 = i17 | i3;
            i5 = i2 & 32;
            if (i5 != 0) {
                i7 = i4 | 196608;
                z2 = z;
            } else {
                z2 = z;
                if (l46Var.h(z2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i7 = i4 | i6;
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i10 = i7 | 1572864;
                x16Var3 = x16Var;
            } else {
                x16Var3 = x16Var;
                if (l46Var.i(x16Var3)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i10 = i7 | i9;
            }
            i11 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i11 != 0) {
                i13 = i10 | 12582912;
                x16Var4 = x16Var2;
            } else {
                x16Var4 = x16Var2;
                if (l46Var.i(x16Var4)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i13 = i10 | i12;
            }
            if ((i13 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i13 & 1, z3)) {
                l46Var.b0();
                i14 = i & 1;
                i8cVar = sf2.a;
                if (i14 != 0) {
                    if (i18 != 0) {
                        f2 = 12.0f;
                    }
                    if ((i2 & 16) != 0) {
                        i13 &= -57345;
                        o8bVarS = s(l46Var);
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        objR2 = l46Var.R();
                        if (objR2 == i8cVar) {
                            objR2 = new ond(24);
                            l46Var.p0(objR2);
                        }
                        x16Var3 = (x16) objR2;
                    }
                    g09Var = g09.a;
                    if (i11 != 0) {
                        objR = l46Var.R();
                        if (objR == i8cVar) {
                            objR = new yqf(5);
                            l46Var.p0(objR);
                        }
                        j09Var3 = g09Var;
                        i15 = i13;
                        x16Var4 = (x16) objR;
                    } else {
                        j09Var3 = g09Var;
                        i15 = i13;
                    }
                } else {
                    if (i18 != 0) {
                        f2 = 12.0f;
                    }
                    if ((i2 & 16) != 0) {
                        i13 &= -57345;
                        o8bVarS = s(l46Var);
                    }
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if (i8 != 0) {
                        objR2 = l46Var.R();
                        if (objR2 == i8cVar) {
                            objR2 = new ond(24);
                            l46Var.p0(objR2);
                        }
                        x16Var3 = (x16) objR2;
                    }
                    g09Var = g09.a;
                    if (i11 != 0) {
                        objR = l46Var.R();
                        if (objR == i8cVar) {
                            objR = new yqf(5);
                            l46Var.p0(objR);
                        }
                        j09Var3 = g09Var;
                        i15 = i13;
                        x16Var4 = (x16) objR;
                    } else {
                        j09Var3 = g09Var;
                        i15 = i13;
                    }
                }
                boolean z10 = z2;
                l46Var.s();
                u51 u51VarM4 = c8b.m(l46Var);
                if (k8b.f((e8b) l46Var.k(l8b.a))) {
                    f4 = 40.0f;
                } else {
                    f4 = 48.0f;
                }
                j09 j09VarG4 = k8b.g(k8b.h(b.f(f4, 0.0f, j09Var3, 2), new fp4(2, f2), l46Var, 0), new agb(19), l46Var, 0);
                long j7 = u51VarM4.a;
                long j8 = u51VarM4.b;
                u51 u51VarA4 = u51VarM4.a(j7, j8, j7, j8);
                x4dVar = a7c.a;
                x4dVar.getClass();
                if (we6.e(l46Var)) {
                    x4dVar = g21.f;
                }
                x4d x4dVar5 = x4dVar;
                if ((3670016 & i15) == 1048576) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z5 | ((((57344 & i15) ^ 24576) <= 16384 && l46Var.i(o8bVarS)) || (i15 & 24576) == 16384) | ((29360128 & i15) == 8388608);
                objR3 = l46Var.R();
                if (z6) {
                    o8b o8bVar9 = o8bVarS;
                    x16 x16Var19 = x16Var4;
                    x16 x16Var110 = x16Var3;
                    objR3 = new zlb(4, x16Var110, o8bVar9, x16Var19, str2);
                    x16Var7 = x16Var110;
                    o8bVar3 = o8bVar9;
                    x16Var8 = x16Var19;
                    l46Var.p0(objR3);
                } else {
                    o8b o8bVar10 = o8bVarS;
                    x16 x16Var111 = x16Var4;
                    x16 x16Var112 = x16Var3;
                    objR3 = new zlb(4, x16Var112, o8bVar10, x16Var111, str2);
                    x16Var7 = x16Var112;
                    o8bVar3 = o8bVar10;
                    x16Var8 = x16Var111;
                    l46Var.p0(objR3);
                }
                cgg.a((x16) objR3, j09VarG4, z10, x4dVar5, u51VarA4, null, null, null, af1.b0(-1327205817, new a3g(str, 0), l46Var), l46Var, ((i15 >> 9) & 896) | 805306368, 480);
                o8bVar2 = o8bVar3;
                z4 = z10;
                j09Var2 = j09Var3;
                x16Var6 = x16Var7;
                x16Var5 = x16Var8;
                f3 = f2;
            } else {
                l46Var.Z();
                j09Var2 = j09Var;
                f3 = f2;
                o8bVar2 = o8bVarS;
                x16Var5 = x16Var4;
                z4 = z2;
                x16Var6 = x16Var3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new zs1(str, str2, j09Var2, f3, o8bVar2, z4, x16Var6, x16Var5, i, i2);
            }
        }
        o8bVarS = o8bVar;
        i3 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        i4 = i17 | i3;
        i5 = i2 & 32;
        if (i5 != 0) {
            i7 = i4 | 196608;
            z2 = z;
        } else {
            z2 = z;
            if (l46Var.h(z2)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i7 = i4 | i6;
        }
        i8 = i2 & 64;
        if (i8 != 0) {
            i10 = i7 | 1572864;
            x16Var3 = x16Var;
        } else {
            x16Var3 = x16Var;
            if (l46Var.i(x16Var3)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i10 = i7 | i9;
        }
        i11 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i11 != 0) {
            i13 = i10 | 12582912;
            x16Var4 = x16Var2;
        } else {
            x16Var4 = x16Var2;
            if (l46Var.i(x16Var4)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i13 = i10 | i12;
        }
        if ((i13 & 4793491) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var.W(i13 & 1, z3)) {
            l46Var.b0();
            i14 = i & 1;
            i8cVar = sf2.a;
            if (i14 != 0) {
                if (i18 != 0) {
                    f2 = 12.0f;
                }
                if ((i2 & 16) != 0) {
                    i13 &= -57345;
                    o8bVarS = s(l46Var);
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if (i8 != 0) {
                    objR2 = l46Var.R();
                    if (objR2 == i8cVar) {
                        objR2 = new ond(24);
                        l46Var.p0(objR2);
                    }
                    x16Var3 = (x16) objR2;
                }
                g09Var = g09.a;
                if (i11 != 0) {
                    objR = l46Var.R();
                    if (objR == i8cVar) {
                        objR = new yqf(5);
                        l46Var.p0(objR);
                    }
                    j09Var3 = g09Var;
                    i15 = i13;
                    x16Var4 = (x16) objR;
                } else {
                    j09Var3 = g09Var;
                    i15 = i13;
                }
            } else {
                if (i18 != 0) {
                    f2 = 12.0f;
                }
                if ((i2 & 16) != 0) {
                    i13 &= -57345;
                    o8bVarS = s(l46Var);
                }
                if (i5 != 0) {
                    z2 = true;
                }
                if (i8 != 0) {
                    objR2 = l46Var.R();
                    if (objR2 == i8cVar) {
                        objR2 = new ond(24);
                        l46Var.p0(objR2);
                    }
                    x16Var3 = (x16) objR2;
                }
                g09Var = g09.a;
                if (i11 != 0) {
                    objR = l46Var.R();
                    if (objR == i8cVar) {
                        objR = new yqf(5);
                        l46Var.p0(objR);
                    }
                    j09Var3 = g09Var;
                    i15 = i13;
                    x16Var4 = (x16) objR;
                } else {
                    j09Var3 = g09Var;
                    i15 = i13;
                }
            }
            boolean z11 = z2;
            l46Var.s();
            u51 u51VarM5 = c8b.m(l46Var);
            if (k8b.f((e8b) l46Var.k(l8b.a))) {
                f4 = 40.0f;
            } else {
                f4 = 48.0f;
            }
            j09 j09VarG5 = k8b.g(k8b.h(b.f(f4, 0.0f, j09Var3, 2), new fp4(2, f2), l46Var, 0), new agb(19), l46Var, 0);
            long j9 = u51VarM5.a;
            long j10 = u51VarM5.b;
            u51 u51VarA5 = u51VarM5.a(j9, j10, j9, j10);
            x4dVar = a7c.a;
            x4dVar.getClass();
            if (we6.e(l46Var)) {
                x4dVar = g21.f;
            }
            x4d x4dVar6 = x4dVar;
            if ((3670016 & i15) == 1048576) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z5 | ((((57344 & i15) ^ 24576) <= 16384 && l46Var.i(o8bVarS)) || (i15 & 24576) == 16384) | ((29360128 & i15) == 8388608);
            objR3 = l46Var.R();
            if (z6) {
                o8b o8bVar11 = o8bVarS;
                x16 x16Var113 = x16Var4;
                x16 x16Var114 = x16Var3;
                objR3 = new zlb(4, x16Var114, o8bVar11, x16Var113, str2);
                x16Var7 = x16Var114;
                o8bVar3 = o8bVar11;
                x16Var8 = x16Var113;
                l46Var.p0(objR3);
            } else {
                o8b o8bVar12 = o8bVarS;
                x16 x16Var115 = x16Var4;
                x16 x16Var116 = x16Var3;
                objR3 = new zlb(4, x16Var116, o8bVar12, x16Var115, str2);
                x16Var7 = x16Var116;
                o8bVar3 = o8bVar12;
                x16Var8 = x16Var115;
                l46Var.p0(objR3);
            }
            cgg.a((x16) objR3, j09VarG5, z11, x4dVar6, u51VarA5, null, null, null, af1.b0(-1327205817, new a3g(str, 0), l46Var), l46Var, ((i15 >> 9) & 896) | 805306368, 480);
            o8bVar2 = o8bVar3;
            z4 = z11;
            j09Var2 = j09Var3;
            x16Var6 = x16Var7;
            x16Var5 = x16Var8;
            f3 = f2;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            f3 = f2;
            o8bVar2 = o8bVarS;
            x16Var5 = x16Var4;
            z4 = z2;
            x16Var6 = x16Var3;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new zs1(str, str2, j09Var2, f3, o8bVar2, z4, x16Var6, x16Var5, i, i2);
        }
    }

    public static final void b(jkc jkcVar, egd egdVar, boolean z, x16 x16Var, x16 x16Var2, j09 j09Var, l46 l46Var, int i) {
        l46Var.h0(-1492821833);
        int i2 = i | (l46Var.i(jkcVar) ? 4 : 2) | (l46Var.g(egdVar) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.g(j09Var) ? 131072 : 65536);
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            tn4 tn4VarG = jkcVar.g();
            rs0.a(((i2 >> 12) & 112) | 384, af1.b0(-2062829890, new l30(tn4VarG, z, jkcVar, x16Var2, x16Var), l46Var), l46Var, j09Var, hcc.k(tn4VarG, egdVar, jkcVar.h() != null, l46Var, i2 & 112));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new jt(jkcVar, egdVar, z, x16Var, x16Var2, j09Var, i);
        }
    }

    public static final void c(int i, x16 x16Var, l46 l46Var, j09 j09Var, String str) {
        j09 j09Var2;
        l46Var.h0(-1487570319);
        int i2 = i | (l46Var.g(str) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | 384;
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            g09 g09Var = g09.a;
            j09 j09VarC = b.c(b.q(0.0f, 380.0f, b.b(0.0f, 56.0f, g09Var, 1), 1), 1.0f);
            x4d x4dVar = eze.a(l46Var).a.a;
            bx9 bx9Var = v51.a;
            cgg.a(x16Var, j09VarC, false, x4dVar, v51.a(bx5.b(l46Var).a, ((e8b) l46Var.k(l8b.a)).v, 0L, 0L, l46Var, 12), null, null, null, af1.b0(1391234657, new ob0(str, 21), l46Var), l46Var, ((i2 >> 3) & 14) | 805306368, 484);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r(str, x16Var, j09Var2, i, 2);
        }
    }

    public static final void d(mic micVar, boolean z, a26 a26Var, x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        mic micVar2;
        micVar.getClass();
        a26Var.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(103757360);
        int i2 = i | (l46Var.e(micVar.ordinal()) ? 4 : 2) | (l46Var.h(z) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = (i2 & 14) == 4;
            Object objR = l46Var.R();
            if (z2 || objR == sf2.a) {
                micVar2 = micVar;
                objR = new dkc(micVar2, i3);
                l46Var.p0(objR);
            } else {
                micVar2 = micVar;
            }
            x16 x16Var3 = (x16) objR;
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            } else {
                jkc jkcVar = (jkc) z5c.G(job.a.b(jkc.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), x16Var3);
                xdc.a(b.c, af1.b0(1157923564, new fkc(i3, x16Var2), l46Var), null, af1.b0(-566684758, new wf8(19, jkcVar), l46Var), null, 0, 0L, 0L, m93.o(0, 14), af1.b0(1433788993, new cl(jkcVar, micVar2, z, x16Var, a26Var, 7), l46Var), l46Var, 805309494, 244);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l30(micVar, z, a26Var, x16Var, x16Var2, i);
        }
    }

    public static final void e(String str, String str2, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(1169122221);
        int i2 = i | (l46Var2.g(str) ? 4 : 2) | (l46Var2.g(str2) ? 32 : 16);
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            String strQ = afc.q(R.string.seasonal_draw_shuffle_title_prefix, l46Var2);
            g09 g09Var = g09.a;
            j09 j09VarB0 = ynb.b0(24.0f, 0.0f, b.c(g09Var, 1.0f), 2);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarB0);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, c92VarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            k00 k00VarL = l(strQ + " · " + str, str2, bx5.d(l46Var2));
            mue mueVar = pue.a;
            mue mueVarN = pue.n(l46Var2);
            pr4 pr4Var = l8b.a;
            nte.c(k00VarL, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, cr5.c, 0L, new jme(3), 0L, 0, false, 0, 0, null, null, mueVarN, l46Var, 0, 0, 260986);
            nte.b(ks0.h(8.0f, R.string.seasonal_draw_shuffle_hint, l46Var, l46Var, g09Var), null, ((e8b) l46Var.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 0, 0, 130042);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new uz5(str, i, str2, 5);
        }
    }

    public static final void f(jkc jkcVar, mic micVar, l46 l46Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-31847103);
        int i5 = i | (l46Var2.i(jkcVar) ? 4 : 2) | (l46Var2.e(micVar.ordinal()) ? 32 : 16);
        if (l46Var2.W(i5 & 1, (i5 & 19) != 18)) {
            g09 g09Var = g09.a;
            j09 j09VarB0 = ynb.b0(24.0f, 0.0f, b.c(g09Var, 1.0f), 2);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarB0);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, c92VarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            if (jkcVar.k()) {
                l46Var2.f0(1601293126);
                String strQ = afc.q(R.string.seasonal_spread_result_title, l46Var2);
                mue mueVar = pue.a;
                mue mueVarN = pue.n(l46Var2);
                pr4 pr4Var = l8b.a;
                nte.b(strQ, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, cr5.c, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarN, l46Var, 0, 0, 129914);
                o5c.f(l46Var, b.d(g09Var, 8.0f));
                nte.b(afc.r(R.string.seasonal_spread_result_subtitle, new Object[]{afc.q(rmc.a(micVar), l46Var)}, l46Var), null, ((e8b) l46Var.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 0, 0, 130042);
                l46Var2 = l46Var;
                l46Var2.r(false);
                z = true;
            } else {
                l46Var2.f0(1601954480);
                ArcanaGroup arcanaGroupQ = jkcVar.q();
                List list = rmc.a;
                arcanaGroupQ.getClass();
                int[] iArr = qmc.a;
                int i6 = iArr[arcanaGroupQ.ordinal()];
                if (i6 == 1) {
                    i2 = R.string.seasonal_draw_pattern_title_cups;
                } else if (i6 == 2) {
                    i2 = R.string.seasonal_draw_pattern_title_swords;
                } else if (i6 == 3) {
                    i2 = R.string.seasonal_draw_pattern_title_wands;
                } else if (i6 == 4) {
                    i2 = R.string.seasonal_draw_pattern_title_pentacles;
                } else {
                    if (i6 != 5) {
                        ap.c();
                        return;
                    }
                    i2 = R.string.seasonal_draw_pattern_title_major;
                }
                k00 k00VarL = l(afc.q(i2, l46Var2), afc.q(rmc.b(arcanaGroupQ), l46Var2), bx5.d(l46Var2));
                mue mueVar2 = pue.a;
                mue mueVarN2 = pue.n(l46Var2);
                pr4 pr4Var2 = l8b.a;
                nte.c(k00VarL, null, ((e8b) l46Var2.k(pr4Var2)).q, 0L, null, cr5.c, 0L, new jme(3), 0L, 0, false, 0, 0, null, null, mueVarN2, l46Var, 0, 0, 260986);
                o5c.f(l46Var, b.d(g09Var, 8.0f));
                int i7 = iArr[arcanaGroupQ.ordinal()];
                if (i7 == 1) {
                    i3 = 3;
                    i4 = R.string.seasonal_draw_pattern_caption_cups;
                } else if (i7 != 2) {
                    i3 = 3;
                    if (i7 == 3) {
                        i4 = R.string.seasonal_draw_pattern_caption_wands;
                    } else if (i7 == 4) {
                        i4 = R.string.seasonal_draw_pattern_caption_pentacles;
                    } else {
                        if (i7 != 5) {
                            ap.c();
                            return;
                        }
                        i4 = R.string.seasonal_draw_pattern_caption_major;
                    }
                } else {
                    i3 = 3;
                    i4 = R.string.seasonal_draw_pattern_caption_swords;
                }
                z = true;
                nte.b(afc.q(i4, l46Var), null, ((e8b) l46Var.k(pr4Var2)).r, 0L, null, null, 0L, null, new jme(i3), 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 0, 0, 130042);
                l46Var2 = l46Var;
                l46Var2.r(false);
            }
            l46Var2.r(z);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gkc(jkcVar, micVar, i);
        }
    }

    public static final void g(sdd sddVar, jkc jkcVar, mic micVar, egd egdVar, xw9 xw9Var, bx9 bx9Var, ft1 ft1Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-170821062);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(sddVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? l46Var.g(jkcVar) : l46Var.i(jkcVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.e(micVar.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.g(egdVar) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.g(xw9Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.g(bx9Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= l46Var.g(ft1Var) ? 1048576 : 524288;
        }
        if (l46Var.W(i2 & 1, (599187 & i2) != 599186)) {
            tn4 tn4VarG = jkcVar.g();
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new pdc(18);
                l46Var.p0(objR);
            }
            kn2.c(tn4VarG, null, (a26) objR, null, "seasonal_drawing_step", null, af1.b0(-449944623, new ojc(xw9Var, bx9Var, jkcVar, egdVar, sddVar, ft1Var, micVar), l46Var), l46Var, 1597824, 42);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o53(sddVar, jkcVar, micVar, egdVar, xw9Var, bx9Var, ft1Var, i);
        }
    }

    public static final void h(String str, String str2, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        str.getClass();
        str2.getClass();
        l46Var2.h0(437045775);
        int i2 = i | (l46Var2.g(str) ? 4 : 2) | (l46Var2.g(str2) ? 32 : 16);
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            y6c y6cVarB = a7c.b(12.0f);
            g09 g09Var = g09.a;
            j09 j09VarB0 = ynb.b0(24.0f, 0.0f, b.c(g09Var, 1.0f), 2);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarB0);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, c92VarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            o5c.f(l46Var2, b.d(g09Var, 149.0f));
            j09 j09VarH = rrb.h(b.m(g09Var, 120.0f, 210.0f), y6cVarB, new n4d(24.0f, bx5.b(l46Var2).d, 0.0f, 0L, 60));
            pr4 pr4Var = l8b.a;
            s21.a(db6.w(tm7.o(j09VarH, ((e8b) l46Var2.k(pr4Var)).g, y6cVarB), 0.5f, bx5.b(l46Var2).a, y6cVarB), l46Var2, 0);
            o5c.f(l46Var2, b.d(g09Var, 24.0f));
            k00 k00VarL = l(str, str2, bx5.d(l46Var2));
            mue mueVar = pue.a;
            nte.c(k00VarL, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, cr5.c, 0L, new jme(3), 0L, 0, false, 0, 0, null, null, pue.n(l46Var2), l46Var, 0, 0, 260986);
            nte.b(ks0.h(8.0f, R.string.seasonal_draw_wheel_hint, l46Var, l46Var, g09Var), null, ((e8b) l46Var.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 0, 0, 130042);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new uz5(str, i, str2, 6);
        }
    }

    public static final void i(j09 j09Var, x16 x16Var, l46 l46Var, int i, int i2) {
        x16 x16Var2;
        int i3;
        j09 j09Var2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(275763671);
        int i4 = i | 6;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i | 54;
            x16Var2 = x16Var;
        } else {
            x16Var2 = x16Var;
            i3 = i4 | (l46Var2.i(x16Var2) ? 32 : 16);
        }
        if (l46Var2.W(i3 & 1, (i3 & 19) != 18)) {
            x16 x16Var3 = i5 != 0 ? null : x16Var2;
            g09 g09Var = g09.a;
            j09 j09VarO = tm7.o(oa7.E(b.f(36.0f, 0.0f, b.u(g09Var, 3), 2), a7c.a()), y72.b(y72.b, 0.08f), g21.f);
            if (x16Var3 != null) {
                j09VarO = androidx.compose.foundation.b.c(j09VarO, false, null, null, x16Var3, 15);
            }
            x16 x16Var4 = x16Var3;
            j09 j09VarB0 = ynb.b0(16.0f, 0.0f, j09VarO, 2);
            t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarB0);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, t7cVarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            String strQ = afc.q(R.string.onboarding_quin_syllable, l46Var2);
            pr4 pr4Var = l8b.a;
            nte.b(strQ, null, ((e8b) l46Var2.k(pr4Var)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 0, 0, 262138);
            l46Var2 = l46Var;
            if (x16Var4 != null) {
                l46Var2.f0(1400380441);
                gu6.a(iec.k(), null, null, ((e8b) l46Var2.k(pr4Var)).r, l46Var2, 48, 4);
                l46Var2.r(false);
            } else {
                l46Var2.f0(1400524591);
                l46Var2.r(false);
            }
            l46Var2.r(true);
            x16Var2 = x16Var4;
            j09Var2 = g09Var;
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ca5(j09Var2, x16Var2, i, i2);
        }
    }

    public static final void j(int i, x16 x16Var, l46 l46Var, j09 j09Var) {
        x16Var.getClass();
        l46Var.h0(782478559);
        int i2 = (l46Var.g(j09Var) ? 4 : 2) | i | (l46Var.i(x16Var) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            c8b.i(b.f(56.0f, 0.0f, mh3.N(ynb.d0(0.0f, 0.0f, 0.0f, 24.0f, 7, ynb.b0(24.0f, 0.0f, b.c(g09.a, 1.0f), 2))), 2).D(j09Var), afc.q(R.string.button_continue, l46Var), null, null, 0L, 0.0f, false, null, null, false, null, null, x16Var, l46Var, 0, (i2 << 3) & 896, 4092);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fc5(j09Var, x16Var, i, 9);
        }
    }

    public static final void k(final float f, float f2, final x16 x16Var, l46 l46Var, final int i, final int i2) {
        float f3;
        int i3;
        final float f4;
        l46 l46Var2 = l46Var;
        x16Var.getClass();
        l46Var2.h0(-1301082383);
        int i4 = i | (l46Var2.d(f) ? 32 : 16);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 384;
            f3 = f2;
        } else {
            f3 = f2;
            i3 = i4 | (l46Var2.d(f3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        }
        int i6 = i3 | (l46Var2.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var2.W(i6 & 1, (i6 & 1171) != 1170)) {
            float f5 = i5 != 0 ? 1.0f : f3;
            fi8 fi8VarC = od4.C("lottie/onboarding-splash.json", l46Var2);
            j09 j09VarA = d31.a.a(b.c(g09.a, 1.0f), ndb.w);
            boolean z = ((i6 & 112) == 32) | ((i6 & 896) == 256);
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (z || objR == i8cVar) {
                objR = new qi2(f, f5, 5);
                l46Var2.p0(objR);
            }
            j09 j09VarX = bzd.x(j09VarA, (a26) objR);
            if (((Boolean) l46Var2.k(h57.a)).booleanValue()) {
                l46Var2.f0(1535132418);
                uh8 uh8Var = (uh8) fi8VarC.getValue();
                Object objR2 = l46Var2.R();
                if (objR2 == i8cVar) {
                    objR2 = new yqf(6);
                    l46Var2.p0(objR2);
                }
                mh3.e(uh8Var, (x16) objR2, j09VarX, false, false, false, false, null, false, null, null, false, false, null, null, false, l46Var, 48, 0, 131064);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                l46Var2.f0(1535290921);
                qn4.p((uh8) fi8VarC.getValue(), j09VarX, 0.8f, x16Var, l46Var2, (i6 & 7168) | 384);
                l46Var2.r(false);
            }
            f4 = f5;
        } else {
            l46Var2.Z();
            f4 = f3;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(f, f4, x16Var, i, i2) { // from class: z2g
                public final /* synthetic */ float a;
                public final /* synthetic */ float b;
                public final /* synthetic */ x16 c;
                public final /* synthetic */ int d;

                {
                    this.d = i2;
                }

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(7);
                    vtb.k(this.a, this.b, this.c, (l46) obj, iP, this.d);
                    return wef.a;
                }
            };
        }
    }

    public static final k00 l(String str, String str2, long j) {
        i00 i00Var = new i00();
        int iO = v4e.O(str, str2, 0, false, 6);
        if (iO < 0) {
            i00Var.f(str);
        } else {
            i00Var.f(v4e.m0(iO, str));
            int iK = i00Var.k(new xtd(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            try {
                i00Var.f(str2);
                i00Var.h(iK);
                i00Var.f(str.substring(str2.length() + iO));
            } catch (Throwable th) {
                i00Var.h(iK);
                throw th;
            }
        }
        return i00Var.l();
    }

    public static final float p(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    /* JADX WARN: Code duplicated, block: B:144:0x025e A[EDGE_INSN: B:144:0x025e->B:171:0x02ba BREAK  A[LOOP:5: B:154:0x027a->B:206:0x027a]] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a6  */
    public static final int q(qte qteVar, Layout layout, a82 a82Var, int i, RectF rectF, stc stcVar, i1 i1Var, boolean z) {
        ev7[] ev7VarArr;
        ev7[] ev7VarArr2;
        int i2;
        int iL;
        int i3;
        int i4;
        int iJ;
        Bidi bidiCreateLineBidi;
        float fA;
        float fA2;
        float fA3;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i5 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i5];
        Layout layout2 = qteVar.f;
        int lineStart2 = layout2.getLineStart(i);
        int iF = qteVar.f(i);
        if (i5 < (iF - lineStart2) * 2) {
            j37.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        pq6 pq6Var = new pq6(qteVar);
        boolean z2 = false;
        boolean z3 = layout2.getParagraphDirection(i) == 1;
        int i6 = 0;
        while (lineStart2 < iF) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z3 && !zIsRtlCharAt) {
                fA = pq6Var.a(lineStart2, z2, z2, true);
                fA3 = pq6Var.a(lineStart2 + 1, true, true, true);
            } else if (z3 && zIsRtlCharAt) {
                fA3 = pq6Var.a(lineStart2, false, false, false);
                fA = pq6Var.a(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fA2 = pq6Var.a(lineStart2, false, false, true);
                    fA = pq6Var.a(lineStart2 + 1, true, true, true);
                } else {
                    fA = pq6Var.a(lineStart2, false, false, false);
                    fA2 = pq6Var.a(lineStart2 + 1, true, true, false);
                }
                fA3 = fA2;
            }
            fArr[i6] = fA;
            fArr[i6 + 1] = fA3;
            i6 += 2;
            lineStart2++;
            z3 = z3;
            z2 = false;
        }
        Layout layout3 = (Layout) a82Var.c;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int iE = a82Var.E(lineStart3, false);
        int iF2 = a82Var.F(iE);
        int i7 = lineStart3 - iF2;
        int i8 = lineEnd2 - iF2;
        Bidi bidiR = a82Var.r(iE);
        if (bidiR == null || (bidiCreateLineBidi = bidiR.createLineBidi(i7, i8)) == null) {
            ev7VarArr = new ev7[]{new ev7(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            ev7VarArr = new ev7[runCount];
            int i9 = 0;
            while (i9 < runCount) {
                int i10 = runCount;
                ev7VarArr[i9] = new ev7(bidiCreateLineBidi.getRunStart(i9) + lineStart3, bidiCreateLineBidi.getRunLimit(i9) + lineStart3, bidiCreateLineBidi.getRunLevel(i9) % 2 == 1);
                i9++;
                runCount = i10;
            }
        }
        x67 z67Var = z ? new z67(0, ev7VarArr.length - 1, 1) : new x67(ev7VarArr.length - 1, 0, -1);
        int i11 = z67Var.a;
        int i12 = z67Var.b;
        int i13 = z67Var.c;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return -1;
        }
        while (true) {
            ev7 ev7Var = ev7VarArr[i11];
            boolean z4 = ev7Var.c;
            int iE2 = ev7Var.a;
            int iH = ev7Var.b;
            float f = z4 ? fArr[((iH - 1) - lineStart) * 2] : fArr[(iE2 - lineStart) * 2];
            float fP = z4 ? p(iE2, lineStart, fArr) : p(iH - 1, lineStart, fArr);
            float f2 = rectF.left;
            int i14 = i13;
            if (!z) {
                ev7VarArr2 = ev7VarArr;
                if (fP < f2) {
                    iH = -1;
                    break;
                }
                float f3 = rectF.right;
                if (f <= f3) {
                    if ((z4 || f3 < fP) && (!z4 || f2 > f)) {
                        int i15 = iH;
                        int i16 = iE2;
                        while (i15 - i16 > 1) {
                            int i17 = (i15 + i16) / 2;
                            float f4 = fArr[(i17 - lineStart) * 2];
                            int i18 = i15;
                            if ((z4 || f4 <= rectF.right) && (!z4 || f4 >= rectF.left)) {
                                i15 = i18;
                                i16 = i17;
                            } else {
                                i15 = i17;
                            }
                        }
                        i2 = z4 ? i15 : i16;
                    } else {
                        i2 = iH - 1;
                    }
                    int iJ2 = stcVar.j(i2 + 1);
                    if (iJ2 == -1 || (iL = stcVar.l(iJ2)) <= iE2) {
                        iH = -1;
                        break;
                    }
                    if (iJ2 < iE2) {
                        iJ2 = iE2;
                    }
                    if (iL <= iH) {
                        iH = iL;
                    }
                    RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iJ3 = iJ2;
                    while (true) {
                        rectF2.left = z4 ? fArr[((iH - 1) - lineStart) * 2] : fArr[(iJ3 - lineStart) * 2];
                        rectF2.right = z4 ? p(iJ3, lineStart, fArr) : p(iH - 1, lineStart, fArr);
                        if (((Boolean) i1Var.z(rectF2, rectF)).booleanValue()) {
                            break;
                        }
                        iH = stcVar.h(iH);
                        if (iH == -1 || iH <= iE2) {
                            iH = -1;
                            break;
                        }
                        iJ3 = stcVar.j(iH);
                        if (iJ3 < iE2) {
                            iJ3 = iE2;
                        }
                    }
                } else {
                    iH = -1;
                    break;
                }
                iE2 = iH;
            } else {
                if (fP < f2) {
                    ev7VarArr2 = ev7VarArr;
                    iE2 = -1;
                    break;
                }
                float f5 = rectF.right;
                if (f <= f5) {
                    if ((z4 || f2 > f) && (!z4 || f5 < fP)) {
                        int i19 = iH;
                        int i20 = iE2;
                        while (true) {
                            i3 = i19;
                            if (i19 - i20 <= 1) {
                                break;
                            }
                            int i21 = (i3 + i20) / 2;
                            float f6 = fArr[(i21 - lineStart) * 2];
                            if ((z4 || f6 <= rectF.left) && (!z4 || f6 >= rectF.right)) {
                                i19 = i3;
                                i20 = i21;
                            } else {
                                i19 = i21;
                            }
                        }
                        i4 = z4 ? i3 : i20;
                    } else {
                        i4 = iE2;
                    }
                    int iL2 = stcVar.l(i4);
                    if (iL2 != -1 && (iJ = stcVar.j(iL2)) < iH) {
                        if (iJ >= iE2) {
                            iE2 = iJ;
                        }
                        if (iL2 > iH) {
                            iL2 = iH;
                        }
                        ev7VarArr2 = ev7VarArr;
                        RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                        int iL3 = iL2;
                        while (true) {
                            rectF3.left = z4 ? fArr[((iL3 - 1) - lineStart) * 2] : fArr[(iE2 - lineStart) * 2];
                            rectF3.right = z4 ? p(iE2, lineStart, fArr) : p(iL3 - 1, lineStart, fArr);
                            if (((Boolean) i1Var.z(rectF3, rectF)).booleanValue()) {
                                break;
                            }
                            iE2 = stcVar.e(iE2);
                            if (iE2 != -1 && iE2 < iH) {
                                iL3 = stcVar.l(iE2);
                                if (iL3 > iH) {
                                    iL3 = iH;
                                }
                            }
                        }
                    } else {
                        ev7VarArr2 = ev7VarArr;
                    }
                    iE2 = -1;
                    break;
                } else {
                    ev7VarArr2 = ev7VarArr;
                    iE2 = -1;
                    break;
                }
            }
            if (iE2 >= 0) {
                return iE2;
            }
            if (i11 == i12) {
                return -1;
            }
            i11 += i14;
            i13 = i14;
            ev7VarArr = ev7VarArr2;
        }
    }

    public static u8e r(u8e u8eVar) {
        if ((u8eVar instanceof w8e) || (u8eVar instanceof v8e)) {
            return u8eVar;
        }
        return u8eVar instanceof Serializable ? new v8e(u8eVar) : new w8e(u8eVar);
    }

    public static final o8b s(l46 l46Var) {
        nfc nfcVarB = kr7.b(l46Var);
        boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
        Object objR = l46Var.R();
        Object obj = sf2.a;
        if (zG || objR == obj) {
            objR = nfcVarB.b(job.a.b(o8b.class), null, null);
            l46Var.p0(objR);
        }
        o8b o8bVar = (o8b) objR;
        if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
            l46Var.f0(1672870708);
            l46Var.r(false);
            return o8bVar;
        }
        l46Var.f0(1672733285);
        boolean zI = l46Var.i(o8bVar);
        Object objR2 = l46Var.R();
        if (zI || objR2 == obj) {
            objR2 = new trd(29, o8bVar);
            l46Var.p0(objR2);
        }
        af1.g(o8bVar, (a26) objR2, l46Var);
        l46Var.r(false);
        return o8bVar;
    }

    public static final d3g t(x2g x2gVar, l46 l46Var) {
        Object objA;
        float f;
        float f2;
        Object objA2;
        float f3;
        float f4;
        Object objA3;
        float f5;
        x2gVar.getClass();
        Object objR = l46Var.R();
        Object obj = sf2.a;
        if (objR == obj) {
            objR = q1c.f(x2gVar);
            l46Var.p0(objR);
        }
        e89 e89Var = (e89) objR;
        int i = 0;
        p3f p3fVarI0 = g21.i0((x2g) e89Var.getValue(), "Opening Animation", l46Var, 48, 0);
        s3f s3fVar = p3fVarI0.a;
        y6f y6fVar = xo1.i;
        if (p3fVarI0.h()) {
            l46Var.f0(1666827533);
            l46Var.r(false);
            objA = s3fVar.a();
        } else {
            l46Var.f0(1666573488);
            boolean zG = l46Var.g(p3fVarI0);
            objA = l46Var.R();
            if (zG || objA == obj) {
                ird irdVarJ = iqf.j();
                a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
                ird irdVarL = iqf.l(irdVarJ);
                try {
                    Object objA4 = s3fVar.a();
                    iqf.p(irdVarJ, irdVarL, a26VarE);
                    l46Var.p0(objA4);
                    objA = objA4;
                } catch (Throwable th) {
                    iqf.p(irdVarJ, irdVarL, a26VarE);
                    throw th;
                }
            }
            l46Var.r(false);
        }
        x2g x2gVar2 = (x2g) objA;
        l46Var.f0(-529315434);
        x2g x2gVar3 = x2g.a;
        if (x2gVar2 == x2gVar3) {
            iy9[] iy9VarArr = i3g.a;
            f = 40.0f;
        } else {
            f = 0.0f;
        }
        l46Var.r(false);
        yi4 yi4Var = new yi4(f);
        boolean zG2 = l46Var.g(p3fVarI0);
        Object objR2 = l46Var.R();
        if (zG2 || objR2 == obj) {
            objR2 = zrd.b(new b3g(p3fVarI0, i));
            l46Var.p0(objR2);
        }
        x2g x2gVar4 = (x2g) ((h0e) objR2).getValue();
        l46Var.f0(-529315434);
        if (x2gVar4 == x2gVar3) {
            iy9[] iy9VarArr2 = i3g.a;
            f2 = 40.0f;
        } else {
            f2 = 0.0f;
        }
        l46Var.r(false);
        yi4 yi4Var2 = new yi4(f2);
        boolean zG3 = l46Var.g(p3fVarI0);
        Object objR3 = l46Var.R();
        int i2 = 1;
        if (zG3 || objR3 == obj) {
            objR3 = zrd.b(new b3g(p3fVarI0, i2));
            l46Var.p0(objR3);
        }
        ((i3f) ((h0e) objR3).getValue()).getClass();
        l46Var.f0(1413096112);
        x6f x6fVarT = b21.T(750, 0, null, 6);
        l46Var.r(false);
        k3f k3fVarH = g21.H(p3fVarI0, yi4Var, yi4Var2, x6fVarT, y6fVar, l46Var, 196608);
        if (p3fVarI0.h()) {
            l46Var.f0(1666827533);
            l46Var.r(false);
            objA2 = s3fVar.a();
        } else {
            l46Var.f0(1666573488);
            boolean zG4 = l46Var.g(p3fVarI0);
            objA2 = l46Var.R();
            if (zG4 || objA2 == obj) {
                ird irdVarJ2 = iqf.j();
                a26 a26VarE2 = irdVarJ2 != null ? irdVarJ2.e() : null;
                ird irdVarL2 = iqf.l(irdVarJ2);
                try {
                    Object objA5 = s3fVar.a();
                    iqf.p(irdVarJ2, irdVarL2, a26VarE2);
                    l46Var.p0(objA5);
                    objA2 = objA5;
                } catch (Throwable th2) {
                    iqf.p(irdVarJ2, irdVarL2, a26VarE2);
                    throw th2;
                }
            }
            l46Var.r(false);
        }
        x2g x2gVar5 = (x2g) objA2;
        l46Var.f0(1629949734);
        if (x2gVar5 == x2gVar3) {
            f3 = 0.0f;
        } else {
            iy9[] iy9VarArr3 = i3g.a;
            f3 = 20.0f;
        }
        l46Var.r(false);
        yi4 yi4Var3 = new yi4(f3);
        boolean zG5 = l46Var.g(p3fVarI0);
        Object objR4 = l46Var.R();
        if (zG5 || objR4 == obj) {
            objR4 = zrd.b(new b3g(p3fVarI0, 2));
            l46Var.p0(objR4);
        }
        x2g x2gVar6 = (x2g) ((h0e) objR4).getValue();
        l46Var.f0(1629949734);
        if (x2gVar6 == x2gVar3) {
            f4 = 0.0f;
        } else {
            iy9[] iy9VarArr4 = i3g.a;
            f4 = 20.0f;
        }
        l46Var.r(false);
        yi4 yi4Var4 = new yi4(f4);
        boolean zG6 = l46Var.g(p3fVarI0);
        Object objR5 = l46Var.R();
        if (zG6 || objR5 == obj) {
            objR5 = zrd.b(new b3g(p3fVarI0, 3));
            l46Var.p0(objR5);
        }
        ((i3f) ((h0e) objR5).getValue()).getClass();
        l46Var.f0(1715165516);
        x6f x6fVarT2 = b21.T(750, 0, null, 6);
        l46Var.r(false);
        k3f k3fVarH2 = g21.H(p3fVarI0, yi4Var3, yi4Var4, x6fVarT2, y6fVar, l46Var, 196608);
        if (p3fVarI0.h()) {
            l46Var.f0(1666827533);
            l46Var.r(false);
            objA3 = s3fVar.a();
        } else {
            l46Var.f0(1666573488);
            boolean zG7 = l46Var.g(p3fVarI0);
            objA3 = l46Var.R();
            if (zG7 || objA3 == obj) {
                ird irdVarJ3 = iqf.j();
                a26 a26VarE3 = irdVarJ3 != null ? irdVarJ3.e() : null;
                ird irdVarL3 = iqf.l(irdVarJ3);
                try {
                    Object objA6 = s3fVar.a();
                    iqf.p(irdVarJ3, irdVarL3, a26VarE3);
                    l46Var.p0(objA6);
                    objA3 = objA6;
                } catch (Throwable th3) {
                    iqf.p(irdVarJ3, irdVarL3, a26VarE3);
                    throw th3;
                }
            }
            l46Var.r(false);
        }
        x2g x2gVar7 = (x2g) objA3;
        l46Var.f0(1821637832);
        float f6 = 60.0f;
        if (x2gVar7 == x2gVar3) {
            f5 = 0.0f;
        } else {
            iy9[] iy9VarArr5 = i3g.a;
            f5 = 60.0f;
        }
        l46Var.r(false);
        yi4 yi4Var5 = new yi4(f5);
        boolean zG8 = l46Var.g(p3fVarI0);
        Object objR6 = l46Var.R();
        if (zG8 || objR6 == obj) {
            objR6 = zrd.b(new b3g(p3fVarI0, 4));
            l46Var.p0(objR6);
        }
        x2g x2gVar8 = (x2g) ((h0e) objR6).getValue();
        l46Var.f0(1821637832);
        if (x2gVar8 == x2gVar3) {
            f6 = 0.0f;
        } else {
            iy9[] iy9VarArr6 = i3g.a;
        }
        l46Var.r(false);
        yi4 yi4Var6 = new yi4(f6);
        boolean zG9 = l46Var.g(p3fVarI0);
        Object objR7 = l46Var.R();
        if (zG9 || objR7 == obj) {
            objR7 = zrd.b(new b3g(p3fVarI0, 5));
            l46Var.p0(objR7);
        }
        ((i3f) ((h0e) objR7).getValue()).getClass();
        l46Var.f0(-1302292370);
        x6f x6fVarT3 = b21.T(750, 0, null, 6);
        l46Var.r(false);
        k3f k3fVarH3 = g21.H(p3fVarI0, yi4Var5, yi4Var6, x6fVarT3, y6fVar, l46Var, 196608);
        float f7 = ((yi4) k3fVarH.x.getValue()).a;
        float f8 = ((yi4) k3fVarH2.x.getValue()).a;
        float f9 = ((yi4) k3fVarH3.x.getValue()).a;
        boolean z = ((x2g) e89Var.getValue()) == x2g.b;
        Object objR8 = l46Var.R();
        if (objR8 == obj) {
            objR8 = new xfc(e89Var, 17);
            l46Var.p0(objR8);
        }
        return new d3g(f7, f8, f9, z, (x16) objR8);
    }

    public static c6f u(c6f c6fVar, String[] strArr, Map map) {
        int i = 0;
        if (c6fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (c6f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                c6f c6fVar2 = new c6f();
                int length = strArr.length;
                while (i < length) {
                    c6fVar2.a((c6f) map.get(strArr[i]));
                    i++;
                }
                return c6fVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c6fVar.a((c6f) map.get(strArr[0]));
                return c6fVar;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    c6fVar.a((c6f) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return c6fVar;
    }

    public static final void v(CaptureRequest.Builder builder, Object obj, Object obj2) {
        if (obj == null || !(obj instanceof CaptureRequest.Key)) {
            return;
        }
        try {
            builder.set((CaptureRequest.Key) obj, obj2);
        } catch (IllegalArgumentException e) {
            b1.n("CXCP", "Failed to set [" + ((CaptureRequest.Key) obj).getName() + ": " + obj2 + "] on CaptureRequest.Builder", e);
        }
    }

    public static final void w(CaptureRequest.Builder builder, Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            v(builder, entry.getKey(), entry.getValue());
        }
    }

    public static void x(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                r82.g(ub3.h(i2, "at index ", new StringBuilder(String.valueOf(i2).length() + 9)));
                return;
            }
        }
    }

    public static /* synthetic */ boolean y(int i, jgh jghVar, StringBuilder sb) {
        if (i - 1 != 0 || jghVar == jgh.a) {
            return false;
        }
        sb.append(jghVar.a());
        sb.append('.');
        sb.append(jghVar.b());
        sb.append(':');
        sb.append(jghVar.c());
        return true;
    }

    public abstract void m();

    public abstract String n(byte[] bArr, int i, int i2);

    public abstract int o(String str, byte[] bArr, int i, int i2);
}
