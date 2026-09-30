package defpackage;

import ai.askquin.R;
import ai.askquin.ui.account.component.AuthOption;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class aic {
    public static final void a(int i, a26 a26Var, l46 l46Var, j09 j09Var, List list) {
        a26Var.getClass();
        l46Var.h0(755481249);
        int i2 = i | (l46Var.g(j09Var) ? 4 : 2) | (l46Var.g(list) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            uc0 uc0Var = new uc0(eze.a(l46Var).c.b, true, new qc0(i3));
            float f = eze.a(l46Var).c.a;
            bx9 bx9Var = new bx9(f, f, f, f);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objR = l46Var.R();
            if (z || objR == sf2.a) {
                objR = new bnd(list, a26Var);
                l46Var.p0(objR);
            }
            af1.s(j09Var, null, bx9Var, uc0Var, null, null, false, null, (a26) objR, l46Var, i2 & 14, 490);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new bz4(i, 3, a26Var, j09Var, list);
        }
    }

    public static final void b(boolean z, txb txbVar, cre creVar, l46 l46Var, int i) {
        int i2;
        tte tteVarD;
        l46Var.h0(-1344558920);
        if ((i & 6) == 0) {
            i2 = (l46Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.e(txbVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(creVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i3 = 1;
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            int i4 = i2 & 14;
            boolean zG = (i4 == 4) | l46Var.g(creVar);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = new wqe(creVar, z);
                l46Var.p0(objR);
            }
            qne qneVar = (qne) objR;
            boolean zI = l46Var.i(creVar) | (i4 == 4);
            Object objR2 = l46Var.R();
            if (zI || objR2 == obj) {
                objR2 = new dre(creVar, z);
                l46Var.p0(objR2);
            }
            ul9 ul9Var = (ul9) objR2;
            boolean zH = eue.h(creVar.l().b);
            zse zseVarL = creVar.l();
            int i5 = (int) (z ? zseVarL.b >> 32 : zseVarL.b & 4294967295L);
            r38 r38Var = creVar.d;
            float fG = (r38Var == null || (tteVarD = r38Var.d()) == null) ? 0.0f : mxb.g(tteVarD.a, i5);
            boolean zI2 = l46Var.i(qneVar);
            Object objR3 = l46Var.R();
            if (zI2 || objR3 == obj) {
                objR3 = new evc(qneVar, i3);
                l46Var.p0(objR3);
            }
            i7h.h(ul9Var, z, txbVar, zH, 0L, fG, ibe.a(g09.a, qneVar, (PointerInputEventHandler) objR3), l46Var, (i2 << 3) & 1008, 16);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new i30(z, txbVar, creVar, i, 11);
        }
    }

    public static final void c(qmf qmfVar, x16 x16Var, boolean z, a26 a26Var, l46 l46Var, int i) {
        x16Var.getClass();
        l46Var.h0(-1129757604);
        int i2 = i | (l46Var.i(qmfVar) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zBooleanValue = ((Boolean) qmfVar.w.getValue()).booleanValue();
            Context context = (Context) l46Var.k(uq.b);
            int i4 = i2 & 14;
            boolean z2 = i4 == 4 || l46Var.i(qmfVar);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            Object obj2 = objR;
            if (z2 || objR == obj) {
                Object ykfVar = new ykf(qmfVar, i3);
                l46Var.p0(ykfVar);
                obj2 = ykfVar;
            }
            int i5 = qmf.Z;
            af1.g(qmfVar, (a26) obj2, l46Var);
            vb2 vb2VarH = kn2.H(context);
            boolean zI = l46Var.i(vb2VarH) | (i4 == 4 || l46Var.i(qmfVar));
            Object objR2 = l46Var.R();
            Object obj3 = objR2;
            if (zI || objR2 == obj) {
                Object alfVar = new alf(vb2VarH, qmfVar, null);
                l46Var.p0(alfVar);
                obj3 = alfVar;
            }
            af1.o((l26) obj3, l46Var, vb2VarH);
            int i6 = (l46Var.i(context) ? 1 : 0) | ((i4 == 4 || l46Var.i(qmfVar)) ? 1 : 0);
            Object objR3 = l46Var.R();
            Object obj4 = objR3;
            if (i6 != 0 || objR3 == obj) {
                Object blfVar = new blf(qmfVar, context, null);
                l46Var.p0(blfVar);
                obj4 = blfVar;
            }
            af1.o((l26) obj4, l46Var, wef.a);
            bzd.l(b.c, zBooleanValue, 0L, null, null, af1.b0(-434069224, new pc2(qmfVar, vb2VarH, a26Var, context, x16Var, z), l46Var), l46Var, 1572870, 60);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o50((Object) qmfVar, x16Var, z, (Object) a26Var, i, 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0145  */
    /* JADX WARN: Code duplicated, block: B:105:0x014f  */
    /* JADX WARN: Code duplicated, block: B:114:0x016f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0174  */
    /* JADX WARN: Code duplicated, block: B:117:0x017c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0180  */
    /* JADX WARN: Code duplicated, block: B:123:0x0185  */
    /* JADX WARN: Code duplicated, block: B:125:0x0189  */
    /* JADX WARN: Code duplicated, block: B:127:0x0192  */
    /* JADX WARN: Code duplicated, block: B:129:0x01df  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    /* JADX WARN: Code duplicated, block: B:38:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00af  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:84:0x0105  */
    /* JADX WARN: Code duplicated, block: B:85:0x0108  */
    /* JADX WARN: Code duplicated, block: B:87:0x010d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0115  */
    /* JADX WARN: Code duplicated, block: B:91:0x011c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0126  */
    /* JADX WARN: Code duplicated, block: B:94:0x0129  */
    public static final void d(final AuthOption authOption, final a26 a26Var, use useVar, final x16 x16Var, final boolean z, final a26 a26Var2, final boolean z2, boolean z3, boolean z4, final a26 a26Var3, final l26 l26Var, x16 x16Var2, l46 l46Var, final int i, final int i2, final int i3) {
        int i4;
        use useVar2;
        int i5;
        int i6;
        boolean z5;
        a26 a26Var4;
        boolean z6;
        int i7;
        boolean z7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z8;
        final boolean z9;
        final x16 x16Var3;
        final use useVar3;
        final boolean z10;
        ojb ojbVarV;
        use useVarO;
        x16 x16Var4;
        boolean z11;
        boolean z12;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        authOption.getClass();
        a26Var.getClass();
        x16Var.getClass();
        a26Var2.getClass();
        a26Var3.getClass();
        l26Var.getClass();
        l46Var.h0(-1313503001);
        if ((i & 6) == 0) {
            i4 = (l46Var.e(authOption.ordinal()) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= l46Var.i(a26Var) ? 32 : 16;
        }
        if ((i3 & 4) == 0) {
            useVar2 = useVar;
            if (l46Var.g(useVar2)) {
                i5 = 256;
            }
            i6 = i4 | i5;
            if ((i & 3072) != 0) {
                if (l46Var.i(x16Var)) {
                    i22 = 2048;
                } else {
                    i22 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i6 |= i22;
            }
            if ((i & 24576) == 0) {
                z5 = z;
                if (l46Var.h(z5)) {
                    i21 = 16384;
                } else {
                    i21 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i6 |= i21;
            } else {
                z5 = z;
            }
            if ((196608 & i) == 0) {
                a26Var4 = a26Var2;
                if (l46Var.i(a26Var4)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i6 |= i20;
            } else {
                a26Var4 = a26Var2;
            }
            if ((1572864 & i) == 0) {
                z6 = z2;
                if (l46Var.h(z6)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i6 |= i19;
            } else {
                z6 = z2;
            }
            i7 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            if (i7 != 0) {
                i9 = i6 | 12582912;
                z7 = z3;
            } else {
                z7 = z3;
                if (l46Var.h(z7)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i9 = i6 | i8;
            }
            i10 = i3 & 256;
            if (i10 != 0) {
                i12 = i9 | 100663296;
            } else {
                if (l46Var.h(z4)) {
                    i11 = 67108864;
                } else {
                    i11 = 33554432;
                }
                i12 = i9 | i11;
            }
            if ((i & 805306368) == 0) {
                if (l46Var.i(a26Var3)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i12 |= i18;
            }
            if ((i2 & 6) == 0) {
                if (l46Var.i(l26Var)) {
                    i17 = 4;
                } else {
                    i17 = 2;
                }
                i13 = i2 | i17;
            } else {
                i13 = i2;
            }
            i14 = i3 & 2048;
            if (i14 != 0) {
                i16 = i13 | 48;
            } else {
                if (l46Var.i(x16Var2)) {
                    i15 = 32;
                } else {
                    i15 = 16;
                }
                i16 = i13 | i15;
            }
            if ((i12 & 306783379) == 306783378 || (i16 & 19) != 18) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (l46Var.W(i12 & 1, z8)) {
                l46Var.b0();
                if ((i & 1) != 0 || l46Var.C()) {
                    if ((i3 & 4) != 0) {
                        useVarO = n3d.o(null, l46Var, 3);
                        i12 &= -897;
                    } else {
                        useVarO = useVar2;
                    }
                    boolean z13 = i7 == 0 ? z7 : false;
                    boolean z14 = i10 == 0 ? z4 : true;
                    if (i14 != 0) {
                        x16Var4 = null;
                    } else {
                        x16Var4 = x16Var2;
                    }
                    z11 = z13;
                    z12 = z14;
                } else {
                    l46Var.Z();
                    if ((i3 & 4) != 0) {
                        i12 &= -897;
                    }
                    z12 = z4;
                    x16Var4 = x16Var2;
                    useVarO = useVar2;
                    z11 = z7;
                }
                l46Var.s();
                ym8.j(g09.a, afc.q(R.string.onboarding_login_title, l46Var), 0, z12, x16Var, af1.b0(-737502796, new hv9(z6, a26Var4, authOption, a26Var, z5, l26Var, x16Var4, useVarO, z11, a26Var3), l46Var), l46Var, ((i12 >> 9) & 458752) | 12585990 | ((i12 << 9) & 3670016), 20);
                z9 = z12;
                x16Var3 = x16Var4;
                useVar3 = useVarO;
                z10 = z11;
            } else {
                l46Var.Z();
                z9 = z4;
                x16Var3 = x16Var2;
                useVar3 = useVar2;
                z10 = z7;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new l26() { // from class: wkf
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = k99.P(i | 1);
                        int iP2 = k99.P(i2);
                        aic.d(authOption, a26Var, useVar3, x16Var, z, a26Var2, z2, z10, z9, a26Var3, l26Var, x16Var3, (l46) obj, iP, iP2, i3);
                        return wef.a;
                    }
                };
            }
        }
        useVar2 = useVar;
        i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        i6 = i4 | i5;
        if ((i & 3072) != 0) {
            if (l46Var.i(x16Var)) {
                i22 = 2048;
            } else {
                i22 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i6 |= i22;
        }
        if ((i & 24576) == 0) {
            z5 = z;
            if (l46Var.h(z5)) {
                i21 = 16384;
            } else {
                i21 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i6 |= i21;
        } else {
            z5 = z;
        }
        if ((196608 & i) == 0) {
            a26Var4 = a26Var2;
            if (l46Var.i(a26Var4)) {
                i20 = 131072;
            } else {
                i20 = 65536;
            }
            i6 |= i20;
        } else {
            a26Var4 = a26Var2;
        }
        if ((1572864 & i) == 0) {
            z6 = z2;
            if (l46Var.h(z6)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i6 |= i19;
        } else {
            z6 = z2;
        }
        i7 = i3 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i7 != 0) {
            i9 = i6 | 12582912;
            z7 = z3;
        } else {
            z7 = z3;
            if (l46Var.h(z7)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i9 = i6 | i8;
        }
        i10 = i3 & 256;
        if (i10 != 0) {
            i12 = i9 | 100663296;
        } else {
            if (l46Var.h(z4)) {
                i11 = 67108864;
            } else {
                i11 = 33554432;
            }
            i12 = i9 | i11;
        }
        if ((i & 805306368) == 0) {
            if (l46Var.i(a26Var3)) {
                i18 = 536870912;
            } else {
                i18 = 268435456;
            }
            i12 |= i18;
        }
        if ((i2 & 6) == 0) {
            if (l46Var.i(l26Var)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i13 = i2 | i17;
        } else {
            i13 = i2;
        }
        i14 = i3 & 2048;
        if (i14 != 0) {
            i16 = i13 | 48;
        } else {
            if (l46Var.i(x16Var2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i16 = i13 | i15;
        }
        if ((i12 & 306783379) == 306783378) {
            z8 = true;
        } else {
            z8 = true;
        }
        if (l46Var.W(i12 & 1, z8)) {
            l46Var.b0();
            if ((i & 1) != 0) {
                if ((i3 & 4) != 0) {
                    useVarO = n3d.o(null, l46Var, 3);
                    i12 &= -897;
                } else {
                    useVarO = useVar2;
                }
                if (i7 == 0) {
                }
                if (i10 == 0) {
                }
                if (i14 != 0) {
                    x16Var4 = null;
                } else {
                    x16Var4 = x16Var2;
                }
                z11 = z13;
                z12 = z14;
            } else {
                if ((i3 & 4) != 0) {
                    useVarO = n3d.o(null, l46Var, 3);
                    i12 &= -897;
                } else {
                    useVarO = useVar2;
                }
                if (i7 == 0) {
                }
                if (i10 == 0) {
                }
                if (i14 != 0) {
                    x16Var4 = null;
                } else {
                    x16Var4 = x16Var2;
                }
                z11 = z13;
                z12 = z14;
            }
            l46Var.s();
            ym8.j(g09.a, afc.q(R.string.onboarding_login_title, l46Var), 0, z12, x16Var, af1.b0(-737502796, new hv9(z6, a26Var4, authOption, a26Var, z5, l26Var, x16Var4, useVarO, z11, a26Var3), l46Var), l46Var, ((i12 >> 9) & 458752) | 12585990 | ((i12 << 9) & 3670016), 20);
            z9 = z12;
            x16Var3 = x16Var4;
            useVar3 = useVarO;
            z10 = z11;
        } else {
            l46Var.Z();
            z9 = z4;
            x16Var3 = x16Var2;
            useVar3 = useVar2;
            z10 = z7;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: wkf
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(i | 1);
                    int iP2 = k99.P(i2);
                    aic.d(authOption, a26Var, useVar3, x16Var, z, a26Var2, z2, z10, z9, a26Var3, l26Var, x16Var3, (l46) obj, iP, iP2, i3);
                    return wef.a;
                }
            };
        }
    }

    public static String e(List list) throws NoSuchAlgorithmException, IOException {
        int i;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FileInputStream fileInputStream = new FileInputStream((File) it.next());
            do {
                try {
                    i = fileInputStream.read(bArr);
                    if (i > 0) {
                        messageDigest.update(bArr, 0, i);
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } while (i != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(messageDigest.digest(), 11);
    }

    public static int f(blb blbVar, gt4 gt4Var, View view, View view2, tkb tkbVar, boolean z) {
        if (tkbVar.u() == 0 || blbVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(tkb.B(view) - tkb.B(view2)) + 1;
        }
        return Math.min(gt4Var.n(), gt4Var.d(view2) - gt4Var.g(view));
    }

    public static int g(blb blbVar, gt4 gt4Var, View view, View view2, tkb tkbVar, boolean z, boolean z2) {
        if (tkbVar.u() == 0 || blbVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (blbVar.b() - Math.max(tkb.B(view), tkb.B(view2))) - 1) : Math.max(0, Math.min(tkb.B(view), tkb.B(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(gt4Var.d(view2) - gt4Var.g(view)) / (Math.abs(tkb.B(view) - tkb.B(view2)) + 1))) + (gt4Var.m() - gt4Var.g(view)));
        }
        return iMax;
    }

    public static int h(blb blbVar, gt4 gt4Var, View view, View view2, tkb tkbVar, boolean z) {
        if (tkbVar.u() == 0 || blbVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return blbVar.b();
        }
        return (int) (((gt4Var.d(view2) - gt4Var.g(view)) / (Math.abs(tkb.B(view) - tkb.B(view2)) + 1)) * blbVar.b());
    }

    public static boolean i(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static InvocationHandler j() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = s.N();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                yg5.p(e);
                return null;
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static k3d k(Set set, npa npaVar) {
        if (set instanceof SortedSet) {
            Collection collection = (SortedSet) set;
            if (!(collection instanceof k3d)) {
                return new l3d(collection, npaVar);
            }
            k3d k3dVar = (k3d) collection;
            return new l3d((SortedSet) k3dVar.a, new opa(Arrays.asList(k3dVar.b, npaVar)));
        }
        if (set instanceof k3d) {
            k3d k3dVar2 = (k3d) set;
            return new k3d((Set) k3dVar2.a, new opa(Arrays.asList(k3dVar2.b, npaVar)));
        }
        set.getClass();
        return new k3d(set, npaVar);
    }

    public static int l(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static j3d m(Set set, ry6 ry6Var) {
        pa7.F(set, "set1");
        pa7.F(ry6Var, "set2");
        return new j3d(set, ry6Var);
    }

    public static final boolean n(cre creVar, boolean z) {
        bv7 bv7VarC;
        r38 r38Var = creVar.d;
        if (r38Var == null || (bv7VarC = r38Var.c()) == null) {
            return false;
        }
        return dj6.D(creVar.j(z), dj6.Z(bv7VarC));
    }

    public static long o(long j, f77 f77Var, rwc rwcVar) {
        long jB;
        int i = eue.c;
        long jA = f77Var.a((int) (j >> 32), true);
        long jA2 = eue.d(j) ? jA : f77Var.a((int) (j & 4294967295L), true);
        q2g q2gVar = null;
        q2g q2gVar2 = rwcVar != null ? rwcVar.a : null;
        if (eue.d(j)) {
            q2gVar = q2gVar2;
        } else if (rwcVar != null) {
            q2gVar = rwcVar.b;
        }
        if (q2gVar2 != null && !eue.d(jA)) {
            int iOrdinal = q2gVar2.ordinal();
            if (iOrdinal == 0) {
                int i2 = (int) (jA >> 32);
                jA = u3c.b(i2, i2);
            } else {
                if (iOrdinal != 1) {
                    ap.c();
                    return 0L;
                }
                int i3 = (int) (jA & 4294967295L);
                jA = u3c.b(i3, i3);
            }
        }
        if (q2gVar != null && !eue.d(jA2)) {
            int iOrdinal2 = q2gVar.ordinal();
            if (iOrdinal2 == 0) {
                int i4 = (int) (jA2 >> 32);
                jB = u3c.b(i4, i4);
            } else {
                if (iOrdinal2 != 1) {
                    ap.c();
                    return 0L;
                }
                int i5 = (int) (jA2 & 4294967295L);
                jB = u3c.b(i5, i5);
            }
            jA2 = jB;
        }
        int iMin = Math.min(eue.g(jA), eue.g(jA2));
        int iMax = Math.max(eue.f(jA), eue.f(jA2));
        return eue.h(j) ? u3c.b(iMax, iMin) : u3c.b(iMin, iMax);
    }

    public static HashSet p(int i) {
        int iCeil;
        if (i < 3) {
            ynb.D(i, "expectedSize");
            iCeil = i + 1;
        } else {
            iCeil = i < 1073741824 ? (int) Math.ceil(((double) i) / 0.75d) : Integer.MAX_VALUE;
        }
        return new HashSet(iCeil);
    }

    public static final j09 q(j09 j09Var, l89 l89Var, p5e p5eVar) {
        return p5eVar == o5e.a ? j09Var : j09Var.D(new u5e(l89Var, p5eVar)).D(v5e.a);
    }

    public static File r(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        qc0.p("getFilesDir returned null twice.");
        return null;
    }
}
