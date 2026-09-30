package defpackage;

import ai.askquin.R;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.onboard.OnboardingActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import android.widget.Toast;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import tech.chatmind.api.credits.LevelAndKind;
import tech.chatmind.api.credits.QuinSubscription;
import tech.chatmind.api.credits.SubscriptionKind;
import tech.chatmind.api.personality.ShortCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hkg implements om3, zf2 {
    public static final dd2 a = new dd2(new ym0(15), false, 210148896);
    public static final dd2 b = new dd2(new md2(23), false, -1168164551);
    public static final dd2 c = new dd2(new md2(24), false, -100458480);
    public static final dd2 d = new dd2(new de2(9), false, 1048295319);
    public static final dd2 e = new dd2(new ce2(13), false, 755149670);
    public static final int[] f = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};
    public static final int[] g = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] h = {3, 6};
    public static final int[] i = {1, 2, 4, 5, 7, 8};
    public static final nyc[] j = new nyc[0];
    public static gx6 k;

    public static final em7 A0(yn7 yn7Var) {
        yn7Var.getClass();
        um7 um7VarB = yn7Var.B();
        if (um7VarB instanceof em7) {
            return (em7) um7VarB;
        }
        if (!(um7VarB instanceof ao7)) {
            yg5.l(um7VarB, "Only KClass supported as classifier, got ");
            return null;
        }
        throw new IllegalArgumentException("Captured type parameter " + um7VarB + " from generic non-reified function. Such functionality cannot be supported because " + um7VarB + " is erased, either specify serializer explicitly or make calling function inline with reified " + um7VarB + '.');
    }

    public static final float[] B0(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    public static final float[] C0(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    public static final String D0(em7 em7Var) {
        em7Var.getClass();
        String strR = em7Var.r();
        if (strR == null) {
            strR = "<local class name not available>";
        }
        return ib8.j("Serializer for class '", strR, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    public static final k47 E0(CharSequence charSequence, String str, int i2, a26 a26Var) {
        char cCharAt = charSequence.charAt(i2);
        if (((Boolean) a26Var.d(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return F0(charSequence, "Expected " + str + ", but got '" + cCharAt + "' at position " + i2);
    }

    public static final void F(en0 en0Var, String str, l46 l46Var, int i2) {
        int i3;
        String strI;
        LevelAndKind levelAndKind;
        l46Var.h0(-2074010432);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? l46Var.g(en0Var) : l46Var.i(en0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.g(str) ? 32 : 16;
        }
        int i4 = 3;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            QuinSubscription quinSubscription = en0Var.a;
            String strI2 = en0Var.h;
            SubscriptionKind kind = (quinSubscription == null || (levelAndKind = quinSubscription.getLevelAndKind()) == null) ? null : levelAndKind.getKind();
            int i5 = kind == null ? -1 : cn0.a[kind.ordinal()];
            String str2 = "--";
            if (i5 == 1) {
                strI = tec.i(l46Var, -259193583, R.string.paywall_member_type_year, l46Var, false);
            } else if (i5 == 2) {
                strI = tec.i(l46Var, -259191022, R.string.paywall_member_type_month, l46Var, false);
            } else if (i5 != 3) {
                l46Var.f0(555159740);
                l46Var.r(false);
                strI = "--";
            } else {
                strI = tec.i(l46Var, -259188364, R.string.paywall_member_type_quarter, l46Var, false);
            }
            int i6 = kind != null ? cn0.a[kind.ordinal()] : -1;
            if (i6 == 1) {
                l46Var.f0(-259183935);
                String strQ = afc.q(R.string.auto_renew_yearly, l46Var);
                if (strI2 == null) {
                    strI2 = tec.i(l46Var, -259181456, R.string.auto_renew_price_yearly, l46Var, false);
                } else {
                    l46Var.f0(-259182138);
                    l46Var.r(false);
                }
                str2 = strQ + "：" + strI2;
                l46Var.r(false);
            } else if (i6 == 2) {
                l46Var.f0(-259178813);
                String strQ2 = afc.q(R.string.auto_renew_monthly, l46Var);
                if (strI2 == null) {
                    strI2 = tec.i(l46Var, -259176303, R.string.auto_renew_price_monthly, l46Var, false);
                } else {
                    l46Var.f0(-259176985);
                    l46Var.r(false);
                }
                str2 = strQ2 + "：" + strI2;
                l46Var.r(false);
            } else if (i6 != 3) {
                l46Var.f0(555651772);
                l46Var.r(false);
            } else {
                l46Var.f0(-259173608);
                String strQ3 = afc.q(R.string.auto_renew_quarterly, l46Var);
                if (strI2 == null) {
                    strI2 = "--";
                }
                str2 = strQ3 + "：" + strI2;
                l46Var.r(false);
            }
            nae.a(b.c(g09.a, 1.0f), a7c.b(16.0f), ((m82) l46Var.k(o82.a)).p, 0L, 1.0f, 0.0f, null, af1.b0(-1301517797, new q8(strI, str2, str, en0Var, 4), l46Var), l46Var, 12607494, 104);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(en0Var, str, i2, i4);
        }
    }

    public static final k47 F0(CharSequence charSequence, String str) {
        StringBuilder sbQ = kv2.q(str, " when parsing an Instant from \"");
        sbQ.append(R0(charSequence, 64));
        sbQ.append('\"');
        return new k47(charSequence, sbQ.toString());
    }

    public static final void G(en0 en0Var, String str, x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        int i3;
        int i4;
        boolean z;
        char c2;
        u51 u51VarC;
        x16 x16Var3 = x16Var;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-2047647263);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? l46Var2.g(en0Var) : l46Var2.i(en0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var2.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var2.i(x16Var3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var2.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var2.W(i3 & 1, (i3 & 1171) != 1170)) {
            j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 24.0f, 7, ynb.b0(24.0f, 0.0f, b.c, 2));
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarD0);
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
            int i5 = i3 & 14;
            F(en0Var, str, l46Var2, en0.i | i5 | (i3 & 112));
            o5c.f(l46Var2, new jw7(1.0f, true));
            j09 j09VarB = b.b(0.0f, 56.0f, mh3.N(b.c(g09.a, 1.0f)), 1);
            y6c y6cVar = a7c.a;
            boolean z2 = !en0Var.f;
            if (en0Var.a()) {
                l46Var2.f0(438939601);
                bx9 bx9Var = v51.a;
                i4 = i5;
                z = false;
                c2 = 256;
                u51VarC = v51.a(((e8b) l46Var2.k(l8b.a)).m, ((m82) l46Var2.k(o82.a)).q, 0L, 0L, l46Var2, 12);
                l46Var2.r(false);
            } else {
                i4 = i5;
                z = false;
                c2 = 256;
                l46Var2.f0(-955666151);
                bx9 bx9Var2 = v51.a;
                u51VarC = v51.c((m82) l46Var2.k(o82.a));
                l46Var2.r(false);
            }
            u51 u51Var = u51VarC;
            boolean z3 = ((i3 & 896) == c2 ? true : z) | ((i4 == 4 || ((i3 & 8) != 0 && l46Var2.i(en0Var))) ? true : z) | ((i3 & 7168) == 2048 ? true : z);
            Object objR = l46Var2.R();
            if (z3 || objR == sf2.a) {
                x16Var3 = x16Var;
                objR = new j8(en0Var, x16Var3, x16Var2, 3);
                l46Var2.p0(objR);
            } else {
                x16Var3 = x16Var;
            }
            c8b.k(j09VarB, z2, y6cVar, u51Var, null, null, false, (x16) objR, af1.b0(26146273, new g20(2, en0Var), l46Var2), l46Var2, 100663296, 112);
            l46Var2 = l46Var2;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb(en0Var, str, x16Var3, x16Var2, i2, 3);
        }
    }

    public static final int G0(CharSequence charSequence, int i2) {
        return (charSequence.charAt(i2 + 1) - '0') + ((charSequence.charAt(i2) - '0') * 10);
    }

    public static final void H(en0 en0Var, boolean z, String str, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, x16 x16Var5, l46 l46Var, int i2) {
        int i3;
        x16 x16Var6;
        en0 en0Var2 = en0Var;
        l46 l46Var2 = l46Var;
        l46Var2.h0(827730812);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? l46Var2.g(en0Var2) : l46Var2.i(en0Var2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var2.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var2.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var2.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= l46Var2.i(x16Var2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i2) == 0) {
            x16Var6 = x16Var3;
            i3 |= l46Var2.i(x16Var6) ? 131072 : 65536;
        } else {
            x16Var6 = x16Var3;
        }
        if ((1572864 & i2) == 0) {
            i3 |= l46Var2.i(x16Var4) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= l46Var2.i(x16Var5) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (l46Var2.W(i4 & 1, (i4 & 4793491) != 4793490)) {
            nae.a(b.c, null, ((m82) l46Var2.k(o82.a)).n, 0L, 0.0f, 0.0f, null, af1.b0(-302512553, new cm(x16Var, en0Var2, str, x16Var2, x16Var6), l46Var2), l46Var, 12582918, 122);
            l46Var2 = l46Var;
            if (z && en0Var2.e && en0Var2.a != null && s72.o0(tn0.a, en0Var2.b)) {
                en0Var2 = en0Var2;
                l46Var2.f0(1522373770);
                int i5 = i4 << 6;
                kj0.F(afc.q(R.string.auto_renew_cancel, l46Var2), af1.b0(855300742, new o8(str, 6), l46Var2), afc.q(R.string.auto_renew_think_again, l46Var2), afc.q(R.string.auto_renew_confirm_cancel, l46Var2), false, false, null, null, x16Var4, x16Var5, l46Var2, (234881024 & i5) | 48 | (i5 & 1879048192), 240);
                l46Var2 = l46Var2;
                l46Var2.r(false);
            } else {
                en0Var2 = en0Var2;
                en0Var2 = en0Var2;
                en0Var2 = en0Var2;
                en0Var2 = en0Var2;
                l46Var2.f0(1522865926);
                l46Var2.r(false);
            }
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cc(en0Var2, z, str, x16Var, x16Var2, x16Var3, x16Var4, x16Var5, i2);
        }
    }

    public static void H0(float[] fArr, float f2) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f2, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static final void I(x16 x16Var, l46 l46Var, int i2) {
        Object jrVar;
        e89 e89Var;
        x16Var.getClass();
        l46Var.h0(2005936985);
        int i3 = (l46Var.i(x16Var) ? 4 : 2) | i2;
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            gy2 gy2VarR = b21.r(pwfVarA);
            nfc nfcVarB = kr7.b(l46Var);
            kob kobVar = job.a;
            sn0 sn0Var = (sn0) z5c.G(kobVar.b(sn0.class), pwfVarA.g(), null, gy2VarR, nfcVarB, null);
            e89 e89VarT = tm7.t(sn0Var.W0, l46Var);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = af1.E(l46Var);
                l46Var.p0(objR);
            }
            aw2 aw2Var = (aw2) objR;
            Context context = (Context) l46Var.k(uq.b);
            Object obj2 = (x48) l46Var.k(cb8.a);
            Object[] objArr = new Object[0];
            Object objR2 = l46Var.R();
            int i4 = 5;
            if (objR2 == obj) {
                objR2 = new jl0(i4);
                l46Var.p0(objR2);
            }
            e89 e89Var2 = (e89) vfh.I(objArr, (x16) objR2, l46Var, 48);
            Object objR3 = l46Var.R();
            if (objR3 == obj) {
                hr7 hr7Var = af8.Z;
                if (hr7Var == null) {
                    qc0.p("KoinApplication has not been started");
                    return;
                } else if (((nfc) hr7Var.c.e).d(kobVar.b(r2b.class), null) != null) {
                    r3.f();
                    return;
                } else {
                    l46Var.p0(null);
                    objR3 = null;
                }
            }
            if (objR3 != null) {
                r3.f();
                return;
            }
            Object objR4 = l46Var.R();
            if (objR4 == obj) {
                objR4 = q1c.f(null);
                l46Var.p0(objR4);
            }
            e89 e89Var3 = (e89) objR4;
            Object objR5 = l46Var.R();
            if (objR5 == obj) {
                objR5 = new pg(e89Var3, i4);
                l46Var.p0(objR5);
            }
            af1.g(null, (a26) objR5, l46Var);
            int i5 = sn0.Y0;
            sn0Var.L(8, l46Var);
            boolean zI = l46Var.i(sn0Var);
            Object objR6 = l46Var.R();
            if (zI || objR6 == obj) {
                objR6 = new zm0(sn0Var, null);
                l46Var.p0(objR6);
            }
            af1.o((l26) objR6, l46Var, wef.a);
            boolean zI2 = l46Var.i(aw2Var) | l46Var.i(sn0Var) | l46Var.i(obj2);
            Object objR7 = l46Var.R();
            int i6 = 9;
            if (zI2 || objR7 == obj) {
                objR7 = new w6(obj2, aw2Var, sn0Var, i6);
                l46Var.p0(objR7);
            }
            af1.g(obj2, (a26) objR7, l46Var);
            en0 en0Var = (en0) e89VarT.getValue();
            boolean zBooleanValue = ((Boolean) e89Var2.getValue()).booleanValue();
            boolean zG = l46Var.g(((en0) e89VarT.getValue()).a);
            Object objR8 = l46Var.R();
            if (zG || objR8 == obj) {
                QuinSubscription quinSubscription = ((en0) e89VarT.getValue()).a;
                LocalDateTime expiredTime = quinSubscription != null ? quinSubscription.getExpiredTime() : null;
                objR8 = expiredTime == null ? null : DateTimeFormatter.ofPattern("yyyy/MM/dd").format(expiredTime);
                l46Var.p0(objR8);
            }
            String str = (String) objR8;
            if (str == null) {
                str = "--";
            }
            String str2 = str;
            boolean zG2 = l46Var.g(e89Var2);
            Object objR9 = l46Var.R();
            if (zG2 || objR9 == obj) {
                objR9 = new i8(e89Var2, 11);
                l46Var.p0(objR9);
            }
            x16 x16Var2 = (x16) objR9;
            boolean zI3 = l46Var.i(null) | l46Var.g(e89VarT) | l46Var.i(context) | l46Var.i(aw2Var) | l46Var.i(sn0Var);
            Object objR10 = l46Var.R();
            if (zI3 || objR10 == obj) {
                objR10 = new j8(context, aw2Var, sn0Var, e89VarT, e89Var3);
                context = context;
                aw2Var = aw2Var;
                sn0Var = sn0Var;
                l46Var.p0(objR10);
            }
            x16 x16Var3 = (x16) objR10;
            boolean zI4 = l46Var.i(aw2Var) | l46Var.i(sn0Var) | l46Var.i(context) | l46Var.g(e89Var2);
            Object objR11 = l46Var.R();
            if (zI4 || objR11 == obj) {
                e89Var = e89Var2;
                jrVar = new jr(aw2Var, sn0Var, context, e89Var, 1);
                l46Var.p0(jrVar);
            } else {
                jrVar = objR11;
                e89Var = e89Var2;
            }
            x16 x16Var4 = (x16) jrVar;
            boolean zG3 = l46Var.g(e89Var);
            Object objR12 = l46Var.R();
            if (zG3 || objR12 == obj) {
                objR12 = new i8(e89Var, 12);
                l46Var.p0(objR12);
            }
            H(en0Var, zBooleanValue, str2, x16Var, x16Var2, x16Var3, x16Var4, (x16) objR12, l46Var, ((i3 << 9) & 7168) | en0.i);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m(i2, 7, x16Var);
        }
    }

    public static void I0(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }

    public static final void J(tr2 tr2Var, l46 l46Var, int i2) {
        int i3;
        tr2 tr2Var2;
        he2 he2Var;
        l46 l46Var2;
        he2 he2Var2;
        ov7 ov7Var;
        l46 l46Var3 = l46Var;
        l46Var3.h0(-431708555);
        int i4 = (l46Var3.i(tr2Var) ? 4 : 2) | i2;
        int i5 = 0;
        if (l46Var3.W(i4 & 1, (i4 & 3) != 2)) {
            r0 r0Var = tr2Var.c;
            Context context = (Context) l46Var3.k(uq.b);
            pwf pwfVarA = qd8.a(l46Var3);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            m25 m25Var = (m25) z5c.G(job.a.b(m25.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var3), null);
            xn5 xn5Var = (xn5) l46Var3.k(zg2.i);
            boolean zM0 = r0Var.m0();
            i8c i8cVar = sf2.a;
            if (zM0) {
                l46Var3.f0(-1897137151);
                Object objR = l46Var3.R();
                if (objR == i8cVar) {
                    objR = new dj4(2, null);
                    l46Var3.p0(objR);
                }
                af1.o((l26) objR, l46Var3, wef.a);
                l46Var3.r(false);
            } else {
                l46Var3.f0(-1897064115);
                l46Var3.r(false);
            }
            sw3 sw3Var = (sw3) l46Var3.k(zg2.h);
            WeakHashMap weakHashMap = m8g.w;
            fx fxVar = q7c.k(l46Var3).c;
            Object objR2 = l46Var3.R();
            if (objR2 == i8cVar) {
                objR2 = zrd.b(new jt3(10, fxVar, sw3Var));
                l46Var3.p0(objR2);
            }
            h0e h0eVar = (h0e) objR2;
            g09 g09Var = g09.a;
            j09 j09VarQ = b.q(0.0f, 480.0f, g09Var, 1);
            boolean zI = l46Var3.i(xn5Var);
            Object objR3 = l46Var3.R();
            if (zI || objR3 == i8cVar) {
                objR3 = new uo2(15, xn5Var);
                l46Var3.p0(objR3);
            }
            j09 j09VarB = g21.B(j09VarQ, true, (x16) objR3);
            uc0 uc0Var = new uc0(12.0f, true, new qc0(i5));
            jx0 jx0Var = ndb.Z;
            c92 c92VarA = a92.a(uc0Var, jx0Var, l46Var3, 54);
            int iHashCode = Long.hashCode(l46Var3.T);
            u8a u8aVarM = l46Var3.m();
            j09 j09VarJ = m93.J(l46Var3, j09VarB);
            lf2.q.getClass();
            l46Var3.j0();
            boolean z = l46Var3.S;
            ov7 ov7Var2 = LayoutNode.h1;
            if (z) {
                l46Var3.l(ov7Var2);
            } else {
                l46Var3.s0();
            }
            he2 he2Var3 = hj6.z;
            dec.l(he2Var3, l46Var3, c92VarA);
            he2 he2Var4 = hj6.y;
            dec.l(he2Var4, l46Var3, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var5 = hj6.X;
            dec.l(he2Var5, l46Var3, numValueOf);
            dec.k(l46Var3);
            he2 he2Var6 = hj6.x;
            dec.l(he2Var6, l46Var3, j09VarJ);
            if (tr2Var.d.g) {
                he2Var = he2Var4;
                l46Var2 = l46Var3;
                he2Var2 = he2Var6;
                ov7Var = ov7Var2;
                l46Var2.f0(216147063);
                l46Var2.r(false);
            } else {
                ib8.r(12.0f, 215823206, l46Var3, l46Var3, g09Var);
                jgb.q(0, 1, l46Var3, null, afc.q(r0Var.m0() ? R.string.onboarding_first_reading_question_title : R.string.divintation_your_question, l46Var3));
                he2Var = he2Var4;
                he2Var2 = he2Var6;
                ov7Var = ov7Var2;
                jgb.s(0, 0, 5, l46Var3, null, afc.q(R.string.chat_question_hint, l46Var3));
                l46Var2 = l46Var3;
                l46Var2.r(false);
            }
            j09 j09VarC = b.c(g09Var, 1.0f);
            e92 e92Var = e92.a;
            j09 j09VarA = d92.a(e92Var, j09VarC, 1.0f);
            c92 c92VarA2 = a92.a(xc0.c, jx0Var, l46Var2, 48);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarA);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var3, l46Var2, c92VarA2);
            dec.l(he2Var, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var5, l46Var2);
            dec.l(he2Var2, l46Var2, j09VarJ2);
            tr2Var2 = tr2Var;
            m93.b(e92Var, !((Boolean) h0eVar.getValue()).booleanValue(), null, null, null, null, af1.b0(529844281, new n50(tr2Var, xn5Var, r0Var, context, m25Var, 5), l46Var2), l46Var2, 1572870, 30);
            l46Var3 = l46Var2;
            i3 = 1;
            l46Var3.r(true);
            l46Var3.r(true);
        } else {
            i3 = 1;
            tr2Var2 = tr2Var;
            l46Var3.Z();
        }
        ojb ojbVarV = l46Var3.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ur2(tr2Var2, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object J0(String str, uo2 uo2Var, zn2 zn2Var) {
        zq2 zq2Var;
        x16 x16Var;
        if (zn2Var instanceof zq2) {
            zq2Var = (zq2) zn2Var;
            int i2 = zq2Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zq2Var.label = i2 - Integer.MIN_VALUE;
            } else {
                zq2Var = new zq2(zn2Var);
            }
        } else {
            zq2Var = new zq2(zn2Var);
        }
        Object objB = zq2Var.result;
        int i3 = zq2Var.label;
        if (i3 == 0) {
            jzb.q(objB);
            if (!v4e.Q(str)) {
                hs3 hs3Var = xqa.m0;
                zq2Var.L$0 = null;
                zq2Var.L$1 = uo2Var;
                zq2Var.label = 1;
                objB = bsa.b(hs3Var, str, zq2Var);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    x16Var = uo2Var;
                    return bw2Var;
                }
            }
            return Boolean.FALSE;
        }
        if (i3 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        x16 x16Var2 = (x16) zq2Var.L$1;
        jzb.q(objB);
        x16Var = x16Var2;
        x16Var = uo2Var;
        if (((Boolean) objB).booleanValue()) {
            x16Var.invoke();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static final void K(int i2, l46 l46Var) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1636160608);
        if (l46Var2.W(i2 & 1, i2 != 0)) {
            j09 j09VarZ = ynb.Z(b.c, 24.0f);
            c92 c92VarA = a92.a(xc0.e, ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarZ);
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
            bzd.e(0, l46Var2);
            o5c.f(l46Var2, b.d(g09.a, 16.0f));
            nte.b(afc.q(R.string.no_subscription, l46Var2), null, y72.b(((m82) l46Var2.k(o82.a)).q, 0.72f), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oue.a, l46Var, 0, 0, 131066);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ym0(i2, 0);
        }
    }

    public static final void K0(Object[] objArr, int i2, int i3) {
        objArr.getClass();
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    public static final void L(final j09 j09Var, final boolean z, final String str, float f2, float f3, float f4, l46 l46Var, final int i2) {
        int i3;
        final float f5;
        final float f6;
        final float f7;
        long jC;
        boolean z2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1436426284);
        if ((i2 & 6) == 0) {
            i3 = (l46Var2.g(j09Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var2.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var2.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i4 = i3 | 1797120;
        if (l46Var2.W(i4 & 1, (599187 & i4) != 599186)) {
            pr4 pr4Var = l8b.a;
            final long j2 = ((e8b) l46Var2.k(pr4Var)).s;
            final float f8 = 8.0f;
            j09 j09VarE = oa7.E(j09Var, a7c.b(8.0f));
            boolean zF = ((57344 & i4) == 16384) | ((458752 & i4) == 131072) | ((i4 & 7168) == 2048) | ((3670016 & i4) == 1048576) | l46Var2.f(j2);
            Object objR = l46Var2.R();
            final float f9 = 4.0f;
            final float f10 = 4.0f;
            if (zF || objR == sf2.a) {
                objR = new a26() { // from class: fw6
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        sn4 sn4Var = (sn4) obj;
                        sn4Var.getClass();
                        d5e d5eVar = new d5e(sn4Var.p0(0.0f), 0.0f, 0, 0, rxg.w(new float[]{sn4Var.p0(f9), sn4Var.p0(f10)}), 14);
                        float fP0 = sn4Var.p0(f8);
                        sn4.K0(sn4Var, j2, 0L, 0L, (((long) Float.floatToRawIntBits(fP0)) << 32) | (((long) Float.floatToRawIntBits(fP0)) & 4294967295L), d5eVar, 230);
                        return wef.a;
                    }
                };
                l46Var2.p0(objR);
            }
            j09 j09VarS = b21.s(j09VarE, (a26) objR);
            int iOrdinal = ((e8b) l46Var2.k(pr4Var)).C.ordinal();
            if (iOrdinal == 0) {
                l46Var2.f0(-1721127863);
                l46Var2.r(false);
                jC = abg.c(z ? 673129009 : 337584689);
            } else {
                if (iOrdinal != 1) {
                    throw tec.d(-1721130340, l46Var2, false);
                }
                l46Var2.f0(-1721124863);
                jC = ((e8b) l46Var2.k(pr4Var)).m;
                l46Var2.r(false);
            }
            j09 j09VarO = tm7.o(j09VarS, jC, g21.f);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarO);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, xn8VarC);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            if (z) {
                l46Var2.f0(-1327633017);
                gx6 gx6VarB = n16.I;
                if (gx6VarB == null) {
                    fx6 fx6Var = new fx6("Filled.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i5 = msf.a;
                    dtd dtdVar = new dtd(y72.b);
                    s71 s71Var = new s71(1);
                    s71Var.p(19.0f, 13.0f);
                    s71Var.m(-6.0f);
                    s71Var.t(6.0f);
                    s71Var.m(-2.0f);
                    s71Var.t(-6.0f);
                    s71Var.l(5.0f);
                    s71Var.t(-2.0f);
                    s71Var.m(6.0f);
                    s71Var.s(5.0f);
                    s71Var.m(2.0f);
                    s71Var.t(6.0f);
                    s71Var.m(6.0f);
                    s71Var.t(2.0f);
                    s71Var.h();
                    fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 1.0f, 2, 1.0f);
                    gx6VarB = fx6Var.b();
                    n16.I = gx6VarB;
                }
                gu6.a(gx6VarB, null, null, ((e8b) l46Var2.k(pr4Var)).s, l46Var2, 48, 4);
                l46Var2.r(false);
                z2 = true;
            } else if (str != null) {
                l46Var2.f0(-1327454426);
                z2 = true;
                nte.b(str, ynb.a0(g09.a, 8.0f, 12.0f), 0L, 0L, null, null, 0L, null, null, 0L, 2, false, 6, 0, null, mue.a((mue) l46Var2.k(nte.a), ((e8b) l46Var2.k(pr4Var)).s, w6c.l(12), null, null, 0L, null, 3, w6c.l(16), null, null, 16613372), l46Var, ((i4 >> 6) & 14) | 48, 24960, 110588);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                z2 = true;
                l46Var2.f0(-1327096748);
                l46Var2.r(false);
            }
            l46Var2.r(z2);
            f5 = 4.0f;
            f6 = 4.0f;
            f7 = 8.0f;
        } else {
            l46Var2.Z();
            f5 = f2;
            f6 = f3;
            f7 = f4;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: gw6
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    hkg.L(j09Var, z, str, f5, f6, f7, (l46) obj, k99.P(i2 | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final void L0(android.graphics.Matrix matrix, float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[12];
        float f12 = fArr[13];
        float f13 = fArr[15];
        fArr[0] = f2;
        fArr[1] = f6;
        fArr[2] = f11;
        fArr[3] = f3;
        fArr[4] = f7;
        fArr[5] = f12;
        fArr[6] = f5;
        fArr[7] = f9;
        fArr[8] = f13;
        matrix.setValues(fArr);
        fArr[0] = f2;
        fArr[1] = f3;
        fArr[2] = f4;
        fArr[3] = f5;
        fArr[4] = f6;
        fArr[5] = f7;
        fArr[6] = f8;
        fArr[7] = f9;
        fArr[8] = f10;
    }

    public static final void M(int i2, String str, String str2, j09 j09Var, l46 l46Var, int i3) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-841781276);
        int i4 = i3 | (l46Var2.e(i2) ? 4 : 2) | (l46Var2.g(str) ? 32 : 16) | (l46Var2.g(str2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var2.W(i4 & 1, (i4 & 1171) != 1170)) {
            xn8 xn8VarC = s21.c(ndb.c, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09Var);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            g09 g09Var = g09.a;
            j09 j09VarE = oa7.E(b.p(b.d(ynb.d0(0.0f, 24.0f, 0.0f, 0.0f, 13, g09Var), 88.0f), 96.0f), a7c.b(16.0f));
            pr4 pr4Var = l8b.a;
            j09 j09VarO = tm7.o(j09VarE, y72.b(((e8b) l46Var2.k(pr4Var)).a, g21.S(l46Var2) ? 1.0f : 0.12f), g21.f);
            c92 c92VarA = a92.a(new uc0(2.0f, false, new jv2(2, ndb.z)), ndb.Z, l46Var2, 54);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarO);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            mue mueVar = pue.a;
            nte.b(str, null, ((e8b) l46Var2.k(pr4Var)).s, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var2), l46Var, (i4 >> 3) & 14, 0, 131066);
            nte.b(str2, null, ((e8b) l46Var.k(pr4Var)).q, 0L, null, ((y8b) l46Var.k(x8b.a)).a, 0L, null, null, 0L, 0, false, 0, 0, null, pue.q(l46Var), l46Var, (i4 >> 6) & 14, 0, 130938);
            l46Var2 = l46Var;
            l46Var2.r(true);
            feg.j(od4.A(i2, i4 & 14, l46Var2), null, b.l(g09Var, 48.0f), null, null, 0.0f, null, l46Var2, 440, 120);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cz4(i2, str, str2, j09Var, i3);
        }
    }

    public static final void M0(android.graphics.Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        fArr[0] = f2;
        fArr[1] = f5;
        fArr[2] = 0.0f;
        fArr[3] = f8;
        fArr[4] = f3;
        fArr[5] = f6;
        fArr[6] = 0.0f;
        fArr[7] = f9;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f4;
        fArr[13] = f7;
        fArr[14] = 0.0f;
        fArr[15] = f10;
    }

    public static final void N(j09 j09Var, ShortCard shortCard, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(1018783343);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? l46Var.g(shortCard) : l46Var.i(shortCard) ? 32 : 16;
        }
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            t7c t7cVarA = s7c.a(xc0.a, ndb.y, l46Var, 0);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, t7cVarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            v7c v7cVar = v7c.a;
            g09 g09Var = g09.a;
            M(R.drawable.bookmark_personality, afc.q(R.string.personal_test_personality_label, l46Var), shortCard.getPersonality(), v7cVar.a(g09Var, 1.0f, true), l46Var, 0);
            M(R.drawable.bookmark_romance, afc.q(R.string.personal_test_romance_label, l46Var), shortCard.getRomance(), v7cVar.a(g09Var, 1.0f, true), l46Var, 0);
            M(R.drawable.bookmark_profession, afc.q(R.string.personal_test_profession_label, l46Var), shortCard.getProfession(), v7cVar.a(g09Var, 1.0f, true), l46Var, 0);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k38(j09Var, shortCard, i2, 5);
        }
    }

    public static final void N0(Context context, int i2) {
        Toast.makeText(context, context.getString(i2), 0).show();
    }

    public static final void O(String str, long j2, l46 l46Var, int i2) {
        l46Var.h0(989758254);
        int i3 = i2 | (l46Var.g(str) ? 4 : 2) | (l46Var.f(j2) ? 32 : 16);
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            j09 j09VarA0 = ynb.a0(tm7.o(oa7.E(g09.a, a7c.a), y72.b(j2, 0.16f), g21.f), 12.0f, 6.0f);
            mue mueVar = oue.a;
            nte.b(str, j09VarA0, j2, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, (i3 & 14) | ((i3 << 3) & 896), 0, 131064);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new sb(i2, 1, j2, str);
        }
    }

    public static final void O0(Context context) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) OnboardingActivity.class);
        intent.setFlags(268468224);
        context.startActivity(intent);
    }

    public static p82 P(p82 p82Var) {
        y3g y3gVar = cgg.k;
        m6c m6cVar = m6c.e;
        if (cgg.y(p82Var.b, 12884901888L)) {
            x3c x3cVar = (x3c) p82Var;
            y3g y3gVar2 = x3cVar.d;
            if (!f0(y3gVar2, y3gVar)) {
                return new x3c(x3cVar.a, x3cVar.h, y3gVar, B0(b0((float[]) m6cVar.b, y3gVar2.a(), y3gVar.a()), x3cVar.i), x3cVar.k, x3cVar.n, x3cVar.e, x3cVar.f, x3cVar.g, -1);
            }
        }
        return p82Var;
    }

    public static final String P0(Object[] objArr, int i2, int i3, n3 n3Var) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i4];
            if (obj == n3Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final Object Q(float f2, float f3, float f4, vz vzVar, l26 l26Var, xn2 xn2Var) {
        y6f y6fVar = xo1.g;
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        Float f7 = new Float(f4);
        a26 a26Var = y6fVar.a;
        b00 b00VarC = (b00) a26Var.d(f7);
        if (b00VarC == null) {
            b00VarC = ((b00) a26Var.d(f5)).c();
        }
        b00 b00Var = b00VarC;
        Object objR = R(new wz(y6fVar, f5, b00Var, 56), new jfe(vzVar, y6fVar, f5, f6, b00Var), Long.MIN_VALUE, new ik4(3, l26Var), xn2Var);
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (objR != bw2Var) {
            objR = wefVar;
        }
        return objR == bw2Var ? objR : wefVar;
    }

    public static byte[] Q0(n61 n61Var) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(UserMetadata.MAX_INTERNAL_KEY_SIZE, Math.max(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS, Integer.highestOneBit(0) * 2));
        int i2 = 0;
        while (i2 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i2);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < iMin2) {
                int i4 = n61Var.read(bArr, i3, iMin2 - i3);
                if (i4 == -1) {
                    return d0(arrayDeque, i2);
                }
                i3 += i4;
                i2 += i4;
            }
            long j2 = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            if (j2 > 2147483647L) {
                iMin = Integer.MAX_VALUE;
            } else {
                iMin = j2 < -2147483648L ? Integer.MIN_VALUE : (int) j2;
            }
        }
        if (n61Var.read() == -1) {
            return d0(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0165  */
    /* JADX WARN: Code duplicated, block: B:68:0x0172  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object R(wz wzVar, qz qzVar, long j2, final a26 a26Var, xn2 xn2Var) {
        dbe dbeVar;
        final mmb mmbVar;
        final wz wzVar2;
        wz wzVar3;
        mmb mmbVar2;
        Object objG0;
        a26 a26Var2;
        uz uzVar;
        uz uzVar2;
        Object objG1;
        final qz qzVar2 = qzVar;
        if (xn2Var instanceof dbe) {
            dbeVar = (dbe) xn2Var;
            int i2 = dbeVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dbeVar.label = i2 - Integer.MIN_VALUE;
            } else {
                dbeVar = new dbe(xn2Var);
            }
        } else {
            dbeVar = new dbe(xn2Var);
        }
        dbe dbeVar2 = dbeVar;
        Object obj = dbeVar2.result;
        int i3 = dbeVar2.label;
        int i4 = 19;
        int i5 = 0;
        bw2 bw2Var = bw2.a;
        if (i3 == 0) {
            jzb.q(obj);
            final Object objG = qzVar2.g(0L);
            final b00 b00VarE = qzVar2.e(0L);
            mmbVar = new mmb();
            if (j2 == Long.MIN_VALUE) {
                try {
                    final float fV0 = v0(dbeVar2.getContext());
                    wzVar2 = wzVar;
                    try {
                        a26 a26Var3 = new a26() { // from class: bbe
                            @Override // defpackage.a26
                            public final Object d(Object obj2) {
                                long jLongValue = ((Long) obj2).longValue();
                                qz qzVar3 = qzVar2;
                                y6f y6fVarD = qzVar3.d();
                                Object objH = qzVar3.h();
                                wz wzVar4 = wzVar2;
                                uz uzVar3 = new uz(objG, y6fVarD, b00VarE, jLongValue, objH, jLongValue, new cbe(1, wzVar4));
                                hkg.l0(uzVar3, jLongValue, fV0, qzVar3, wzVar4, a26Var);
                                mmbVar.element = uzVar3;
                                return wef.a;
                            }
                        };
                        mmbVar2 = mmbVar;
                        try {
                            dbeVar2.L$0 = wzVar2;
                            dbeVar2.L$1 = qzVar2;
                            dbeVar2.L$2 = a26Var;
                            dbeVar2.L$3 = mmbVar2;
                            dbeVar2.label = 1;
                            if (qzVar2.b()) {
                                objG0 = y41.W(a26Var3, dbeVar2);
                            } else {
                                objG0 = tm7.J(dbeVar2.getContext()).g0(dbeVar2, new hy0(a26Var3, i4));
                            }
                            if (objG0 != bw2Var) {
                                wzVar3 = wzVar2;
                                a26Var2 = a26Var;
                                mmbVar = mmbVar2;
                            }
                            return bw2Var;
                        } catch (CancellationException e2) {
                            e = e2;
                            wzVar3 = wzVar2;
                            mmbVar = mmbVar2;
                            uzVar = (uz) mmbVar.element;
                            if (uzVar != null) {
                                uzVar.i.setValue(Boolean.FALSE);
                            }
                            uzVar2 = (uz) mmbVar.element;
                            if (uzVar2 != null) {
                                wzVar3.f = false;
                            }
                            throw e;
                        }
                    } catch (CancellationException e3) {
                        e = e3;
                        wzVar3 = wzVar2;
                        uzVar = (uz) mmbVar.element;
                        if (uzVar != null) {
                            uzVar.i.setValue(Boolean.FALSE);
                        }
                        uzVar2 = (uz) mmbVar.element;
                        if (uzVar2 != null && uzVar2.g == wzVar3.d) {
                            wzVar3.f = false;
                        }
                        throw e;
                    }
                } catch (CancellationException e4) {
                    e = e4;
                    wzVar2 = wzVar;
                }
            } else {
                mmbVar2 = mmbVar;
                try {
                    uz uzVar3 = new uz(objG, qzVar2.d(), b00VarE, j2, qzVar2.h(), j2, new cbe(i5, wzVar));
                    l0(uzVar3, j2, v0(dbeVar2.getContext()), qzVar2, wzVar, a26Var);
                    mmbVar2.element = uzVar3;
                    wzVar3 = wzVar;
                    qzVar2 = qzVar;
                    a26Var2 = a26Var;
                    mmbVar = mmbVar2;
                } catch (CancellationException e5) {
                    e = e5;
                    wzVar3 = wzVar;
                    mmbVar = mmbVar2;
                    uzVar = (uz) mmbVar.element;
                    if (uzVar != null) {
                        uzVar.i.setValue(Boolean.FALSE);
                    }
                    uzVar2 = (uz) mmbVar.element;
                    if (uzVar2 != null) {
                        wzVar3.f = false;
                    }
                    throw e;
                }
            }
        } else {
            if (i3 != 1 && i3 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mmbVar = (mmb) dbeVar2.L$3;
            a26Var2 = (a26) dbeVar2.L$2;
            qzVar2 = (qz) dbeVar2.L$1;
            wzVar3 = (wz) dbeVar2.L$0;
            try {
                jzb.q(obj);
            } catch (CancellationException e6) {
                e = e6;
                uzVar = (uz) mmbVar.element;
                if (uzVar != null) {
                    uzVar.i.setValue(Boolean.FALSE);
                }
                uzVar2 = (uz) mmbVar.element;
                if (uzVar2 != null) {
                    wzVar3.f = false;
                }
                throw e;
            }
        }
        do {
            Object obj2 = mmbVar.element;
            obj2.getClass();
            if (!((Boolean) ((uz) obj2).i.getValue()).booleanValue()) {
                return wef.a;
            }
            mmb mmbVar3 = mmbVar;
            a26 a26Var4 = a26Var2;
            qz qzVar3 = qzVar2;
            wz wzVar4 = wzVar3;
            try {
                m11 m11Var = new m11(mmbVar3, v0(dbeVar2.getContext()), qzVar3, wzVar4, a26Var4);
                mmbVar = mmbVar3;
                qzVar2 = qzVar3;
                wzVar3 = wzVar4;
                a26Var2 = a26Var4;
                dbeVar2.L$0 = wzVar3;
                dbeVar2.L$1 = qzVar2;
                dbeVar2.L$2 = a26Var2;
                dbeVar2.L$3 = mmbVar;
                dbeVar2.label = 2;
                if (qzVar2.b()) {
                    objG1 = y41.W(m11Var, dbeVar2);
                } else {
                    objG1 = tm7.J(dbeVar2.getContext()).g0(dbeVar2, new hy0(m11Var, i4));
                }
            } catch (CancellationException e7) {
                e = e7;
                mmbVar = mmbVar3;
                wzVar3 = wzVar4;
                uzVar = (uz) mmbVar.element;
                if (uzVar != null) {
                    uzVar.i.setValue(Boolean.FALSE);
                }
                uzVar2 = (uz) mmbVar.element;
                if (uzVar2 != null) {
                    wzVar3.f = false;
                }
                throw e;
            }
        } while (objG1 != bw2Var);
        return bw2Var;
    }

    public static final String R0(CharSequence charSequence, int i2) {
        if (charSequence.length() <= i2) {
            return charSequence.toString();
        }
        return charSequence.subSequence(0, i2).toString() + "...";
    }

    public static /* synthetic */ Object S(float f2, float f3, vz vzVar, l26 l26Var, xn2 xn2Var, int i2) {
        if ((i2 & 8) != 0) {
            vzVar = b21.P(0.0f, 0.0f, 7, null);
        }
        return Q(f2, f3, 0.0f, vzVar, l26Var, xn2Var);
    }

    public static final void S0(uz uzVar, wz wzVar) {
        wzVar.b.setValue(uzVar.e.getValue());
        b00 b00Var = wzVar.c;
        b00 b00Var2 = uzVar.f;
        int iB = b00Var.b();
        for (int i2 = 0; i2 < iB; i2++) {
            b00Var.e(i2, b00Var2.a(i2));
        }
        wzVar.e = uzVar.h;
        wzVar.d = uzVar.g;
        wzVar.f = ((Boolean) uzVar.i.getValue()).booleanValue();
    }

    public static final Object T(wz wzVar, ph3 ph3Var, boolean z, a26 a26Var, zn2 zn2Var) {
        Object objR = R(wzVar, new oh3(ph3Var, wzVar.a, wzVar.b.getValue(), wzVar.c), z ? wzVar.d : Long.MIN_VALUE, a26Var, zn2Var);
        return objR == bw2.a ? objR : wef.a;
    }

    public static final Object U(wz wzVar, Float f2, vz vzVar, boolean z, a26 a26Var, zn2 zn2Var) {
        Object objR = R(wzVar, new jfe(vzVar, wzVar.a, wzVar.b.getValue(), f2, wzVar.c), z ? wzVar.d : Long.MIN_VALUE, a26Var, zn2Var);
        return objR == bw2.a ? objR : wef.a;
    }

    public static /* synthetic */ Object V(wz wzVar, Float f2, fxd fxdVar, boolean z, a26 a26Var, zn2 zn2Var, int i2) {
        if ((i2 & 2) != 0) {
            fxdVar = b21.P(0.0f, 0.0f, 7, null);
        }
        fxd fxdVar2 = fxdVar;
        if ((i2 & 8) != 0) {
            a26Var = new znd(19);
        }
        return U(wzVar, f2, fxdVar2, z, a26Var, zn2Var);
    }

    public static final void W(StringBuilder sb, Class cls) {
        while (cls.isArray()) {
            sb.append("[");
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (cls.equals(Void.TYPE)) {
            sb.append("V");
            return;
        }
        if (cls.equals(Integer.TYPE)) {
            sb.append("I");
            return;
        }
        if (cls.equals(Long.TYPE)) {
            sb.append("J");
            return;
        }
        if (cls.equals(Short.TYPE)) {
            sb.append("S");
            return;
        }
        if (cls.equals(Byte.TYPE)) {
            sb.append("B");
            return;
        }
        if (cls.equals(Boolean.TYPE)) {
            sb.append("Z");
            return;
        }
        if (cls.equals(Character.TYPE)) {
            sb.append("C");
            return;
        }
        if (cls.equals(Float.TYPE)) {
            sb.append("F");
            return;
        }
        if (cls.equals(Double.TYPE)) {
            sb.append("D");
            return;
        }
        sb.append("L");
        String strReplace = cls.getName().replace('.', '/');
        strReplace.getClass();
        sb.append((CharSequence) strReplace);
        sb.append(";");
    }

    public static void X(int i2, int i3) throws jb6 {
        GLES20.glBindTexture(i2, i3);
        Z();
        GLES20.glTexParameteri(i2, 10240, 9729);
        Z();
        GLES20.glTexParameteri(i2, 10241, 9729);
        Z();
        GLES20.glTexParameteri(i2, 10242, 33071);
        Z();
        GLES20.glTexParameteri(i2, 10243, 33071);
        Z();
    }

    public static final Set Y(nyc nycVar) {
        nycVar.getClass();
        if (nycVar instanceof x81) {
            return ((x81) nycVar).b();
        }
        HashSet hashSet = new HashSet(nycVar.e());
        int iE = nycVar.e();
        for (int i2 = 0; i2 < iE; i2++) {
            hashSet.add(nycVar.f(i2));
        }
        return hashSet;
    }

    public static void Z() throws jb6 {
        StringBuilder sb = new StringBuilder();
        ynb.D(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        boolean z = false;
        int i2 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            Integer numValueOf = Integer.valueOf(iGlGetError);
            int i3 = i2 + 1;
            int iF = yx6.f(objArrCopyOf.length, i3);
            if (iF > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
            }
            objArrCopyOf[i2] = numValueOf;
            z = true;
            i2 = i3;
        }
        if (z) {
            throw new jb6(sb.toString(), jy6.k(i2, objArrCopyOf));
        }
    }

    public static void a0(String str, boolean z) throws jb6 {
        if (z) {
            return;
        }
        ey6 ey6Var = jy6.b;
        throw new jb6(str, yob.e);
    }

    public static final float[] b0(float[] fArr, float[] fArr2, float[] fArr3) {
        C0(fArr, fArr2);
        C0(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrY0 = y0(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return B0(fArrY0, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static byte[] d0(ArrayDeque arrayDeque, int i2) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i2) {
            return bArr;
        }
        int length = i2 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i2 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static final nyc[] e0(List list) {
        nyc[] nycVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (nycVarArr = (nyc[]) list.toArray(new nyc[0])) == null) ? j : nycVarArr;
    }

    public static final boolean f0(y3g y3gVar, y3g y3gVar2) {
        if (y3gVar == y3gVar2) {
            return true;
        }
        return Math.abs(y3gVar.a - y3gVar2.a) < 0.001f && Math.abs(y3gVar.b - y3gVar2.b) < 0.001f;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00ee  */
    public static cob g0(Class cls) throws InvocationTargetException {
        zr7 zr7Var;
        is7 yeaVar;
        yr7 yr7Var;
        rdb rdbVar = new rdb();
        rdbVar.a = null;
        rdbVar.b = null;
        boolean z = false;
        rdbVar.c = 0;
        rdbVar.d = null;
        rdbVar.e = null;
        rdbVar.f = null;
        rdbVar.g = null;
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        declaredAnnotations.getClass();
        for (Annotation annotation : declaredAnnotations) {
            annotation.getClass();
            Class clsR = af1.R(af1.Q(annotation));
            j22 j22VarA = smb.a(clsR);
            if (j22VarA.a().equals(pj7.a)) {
                yeaVar = new kd9(25, rdbVar);
            } else if (rdb.v || rdbVar.g != null || (yr7Var = (yr7) rdb.w.get(j22VarA)) == null) {
                yeaVar = null;
            } else {
                rdbVar.g = yr7Var;
                yeaVar = new yea(rdbVar);
            }
            if (yeaVar != null) {
                t72.T(yeaVar, annotation, clsR);
            }
        }
        fv8 fv8Var = fv8.g;
        if (rdbVar.g == null || rdbVar.a == null) {
            zr7Var = null;
        } else {
            fv8 fv8Var2 = new fv8(rdbVar.a, (rdbVar.c & 8) != 0);
            fv8Var.getClass();
            fv8 fv8Var3 = fv8Var2.f ? fv8Var : fv8.h;
            int i2 = fv8Var3.b;
            int i3 = fv8Var.b;
            if (i2 > i3 || (i2 >= i3 && fv8Var3.c > fv8Var.c)) {
                fv8Var = fv8Var3;
            }
            int i4 = fv8Var2.c;
            int i5 = fv8Var2.b;
            if ((i5 != 1 || i4 != 0) && i5 != 0) {
                int i6 = fv8Var.b;
                if (i5 > i6 || (i5 >= i6 && i4 > fv8Var.c)) {
                    z = true;
                }
                z = !z;
            }
            if (z) {
                yr7 yr7Var2 = rdbVar.g;
                if ((yr7Var2 == yr7.CLASS || yr7Var2 == yr7.FILE_FACADE || yr7Var2 == yr7.MULTIFILE_CLASS_PART) && rdbVar.d == null) {
                    zr7Var = null;
                }
            } else {
                rdbVar.f = rdbVar.d;
                rdbVar.d = null;
            }
            zr7Var = new zr7(rdbVar.g, fv8Var2, rdbVar.d, rdbVar.f, rdbVar.e, rdbVar.b, rdbVar.c);
        }
        if (zr7Var == null) {
            return null;
        }
        return new cob(cls, zr7Var);
    }

    public static FloatBuffer h0(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static final tk2 i0(p82 p82Var, p82 p82Var2) {
        if (p82Var == p82Var2) {
            return new rk2(p82Var, p82Var, 1);
        }
        return (cgg.y(p82Var.b, 12884901888L) && cgg.y(p82Var2.b, 12884901888L)) ? new sk2((x3c) p82Var, (x3c) p82Var2) : new tk2(p82Var, p82Var2, 0);
    }

    public static final Map j0() {
        Object dzbVar;
        try {
            xh7 xh7Var = fzc.a;
            hs3 hs3Var = xqa.s0;
            String str = (String) z5c.I(nu4.a, new p55(hs3Var.a, hs3Var.b, null));
            xh7Var.getClass();
            p4e p4eVar = p4e.a;
            dzbVar = m0((Map) xh7Var.b(new qh6(p4eVar, p4eVar, 1), str));
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (dzbVar instanceof dzb) {
            dzbVar = qu4.a;
        }
        return (Map) dzbVar;
    }

    public static final void l0(uz uzVar, long j2, float f2, qz qzVar, wz wzVar, a26 a26Var) {
        long jC = f2 == 0.0f ? qzVar.c() : (long) ((j2 - uzVar.c) / f2);
        uzVar.g = j2;
        uzVar.e.setValue(qzVar.g(jC));
        uzVar.f = qzVar.e(jC);
        if (qzVar.f(jC)) {
            uzVar.h = uzVar.g;
            uzVar.i.setValue(Boolean.FALSE);
        }
        S0(uzVar, wzVar);
        a26Var.d(uzVar);
    }

    public static final LinkedHashMap m0(Map map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!v4e.Q(str) && !v4e.Q(str2)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(bm8.F(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(ub3.i("exp_", (String) entry2.getKey()), entry2.getValue());
        }
        return linkedHashMap2;
    }

    public static rp5 n0(w12 w12Var, String str, iy9 iy9Var) {
        mx mxVar = new mx(4);
        mxVar.b(iy9Var);
        shb shbVar = w12Var.a;
        shbVar.getClass();
        mxVar.c(new iy9[]{new iy9("pathway", "reading_general"), new iy9("divination_type", shbVar.a), new iy9("parent_session_id", shbVar.b)});
        mxVar.b(new iy9("card_label", w12Var.b));
        mxVar.b(new iy9("extra_n", Integer.valueOf(w12Var.c)));
        ArrayList arrayList = mxVar.a;
        iy9[] iy9VarArr = (iy9[]) arrayList.toArray(new iy9[arrayList.size()]);
        return new rp5(str, bm8.H((iy9[]) Arrays.copyOf(iy9VarArr, iy9VarArr.length)));
    }

    public static final Method o0(vm7 vm7Var, String str) {
        str.getClass();
        if (!(vm7Var instanceof y12)) {
            return null;
        }
        String strI0 = v4e.i0(str, '(');
        if (strI0.equals("<init>")) {
            throw new UnsupportedOperationException("Generic Java constructors are not supported: " + vm7Var + '/' + str);
        }
        Method[] declaredMethods = ((y12) vm7Var).d().getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (pa7.t(method.getName(), strI0)) {
                StringBuilder sb = new StringBuilder();
                sb.append(method.getName());
                sb.append("(");
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                for (Class<?> cls : parameterTypes) {
                    cls.getClass();
                    W(sb, cls);
                }
                sb.append(")");
                Class<?> returnType = method.getReturnType();
                returnType.getClass();
                W(sb, returnType);
                if (sb.toString().equals(str)) {
                    return method;
                }
            }
        }
        return null;
    }

    public static final int p0(int i2, List list) {
        int i3;
        byte b2;
        int i4 = ((oy9) s72.F0(list)).c;
        if (i2 > ((oy9) s72.F0(list)).c) {
            j37.a("Index " + i2 + " should be less or equal than last line's end " + i4);
        }
        int size = list.size() - 1;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i6 > size) {
                i3 = -(i6 + 1);
                break;
            }
            i3 = (i6 + size) >>> 1;
            oy9 oy9Var = (oy9) list.get(i3);
            if (oy9Var.b > i2) {
                b2 = 1;
            } else {
                b2 = oy9Var.c <= i2 ? (byte) -1 : (byte) 0;
            }
            if (b2 >= 0) {
                if (b2 <= 0) {
                    break;
                }
                size = i3 - 1;
            } else {
                i6 = i3 + 1;
            }
        }
        if (i3 >= 0 && i3 < list.size()) {
            return i3;
        }
        int size2 = list.size();
        String strA = k88.a(list, null, new d59(i5), 31);
        StringBuilder sbN = ib8.n(i3, size2, "Found paragraph index ", " should be in range [0, ", ").\nDebug info: index=");
        sbN.append(i2);
        sbN.append(", paragraphs=[");
        sbN.append(strA);
        sbN.append("]");
        j37.a(sbN.toString());
        return i3;
    }

    public static final int q0(int i2, List list) {
        byte b2;
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            oy9 oy9Var = (oy9) list.get(i4);
            if (oy9Var.d > i2) {
                b2 = 1;
            } else {
                b2 = oy9Var.e <= i2 ? (byte) -1 : (byte) 0;
            }
            if (b2 < 0) {
                i3 = i4 + 1;
            } else {
                if (b2 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int r0(ArrayList arrayList, float f2) {
        byte b2;
        if (f2 <= 0.0f) {
            return 0;
        }
        if (f2 >= ((oy9) s72.F0(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            oy9 oy9Var = (oy9) arrayList.get(i3);
            if (oy9Var.f > f2) {
                b2 = 1;
            } else {
                b2 = oy9Var.g <= f2 ? (byte) -1 : (byte) 0;
            }
            if (b2 < 0) {
                i2 = i3 + 1;
            } else {
                if (b2 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void s0(ArrayList arrayList, long j2, a26 a26Var) {
        int size = arrayList.size();
        for (int iP0 = p0(eue.g(j2), arrayList); iP0 < size; iP0++) {
            oy9 oy9Var = (oy9) arrayList.get(iP0);
            if (oy9Var.b >= eue.f(j2)) {
                return;
            }
            if (oy9Var.b != oy9Var.c) {
                a26Var.d(oy9Var);
            }
        }
    }

    public static final void t0(StringBuilder sb, StringBuilder sb2, int i2) {
        if (i2 < 10) {
            sb.append('0');
        }
        sb2.append(i2);
    }

    public static final gx6 u0() {
        gx6 gx6Var = k;
        if (gx6Var != null) {
            return gx6Var;
        }
        fx6 fx6Var = new fx6("Copy", 37.0f, 37.0f, 37.0f, 37.0f, 0L, 0, false, 224);
        dtd dtdVar = new dtd(abg.d(4294967295L));
        s71 s71Var = new s71(1);
        s71Var.p(11.0073f, 25.1187f);
        s71Var.s(14.9453f);
        s71Var.i(11.0073f, 13.4146f, 11.769f, 12.6455f, 13.2778f, 12.6455f);
        s71Var.l(14.5596f);
        s71Var.s(11.2905f);
        s71Var.i(14.5596f, 9.7671f, 15.3213f, 8.9907f, 16.8301f, 8.9907f);
        s71Var.l(19.6353f);
        s71Var.i(20.4189f, 8.9907f, 21.0342f, 9.1885f, 21.5542f, 9.7231f);
        s71Var.n(25.2529f, 13.4805f);
        s71Var.i(25.8022f, 14.0444f, 25.9854f, 14.6157f, 25.9854f, 15.5166f);
        s71Var.s(21.4639f);
        s71Var.i(25.9854f, 22.9873f, 25.2236f, 23.7637f, 23.7148f, 23.7637f);
        s71Var.l(22.4331f);
        s71Var.s(25.1187f);
        s71Var.i(22.4331f, 26.6421f, 21.6787f, 27.4185f, 20.1626f, 27.4185f);
        s71Var.l(13.2778f);
        s71Var.i(11.7617f, 27.4185f, 11.0073f, 26.6494f, 11.0073f, 25.1187f);
        s71Var.h();
        s71Var.p(21.7373f, 17.4502f);
        s71Var.i(22.3232f, 18.0508f, 22.4331f, 18.4609f, 22.4331f, 19.3984f);
        s71Var.s(22.5845f);
        s71Var.l(23.6489f);
        s71Var.i(24.4106f, 22.5845f, 24.8062f, 22.1743f, 24.8062f, 21.4419f);
        s71Var.s(15.1797f);
        s71Var.l(21.3784f);
        s71Var.i(20.5361f, 15.1797f, 20.126f, 14.7769f, 20.126f, 13.9272f);
        s71Var.s(10.1699f);
        s71Var.l(16.8887f);
        s71Var.i(16.127f, 10.1699f, 15.7388f, 10.5874f, 15.7388f, 11.3125f);
        s71Var.s(12.6455f);
        s71Var.l(15.8633f);
        s71Var.i(16.6836f, 12.6455f, 17.145f, 12.77f, 17.7017f, 13.3413f);
        s71Var.n(21.7373f, 17.4502f);
        s71Var.h();
        s71Var.p(21.188f, 13.7515f);
        s71Var.i(21.188f, 14.0078f, 21.2905f, 14.1177f, 21.5469f, 14.1177f);
        s71Var.l(24.4985f);
        s71Var.n(21.188f, 10.7485f);
        s71Var.s(13.7515f);
        s71Var.h();
        s71Var.p(12.1865f, 25.0967f);
        s71Var.i(12.1865f, 25.8291f, 12.5747f, 26.2393f, 13.3291f, 26.2393f);
        s71Var.l(20.104f);
        s71Var.i(20.8584f, 26.2393f, 21.2539f, 25.8291f, 21.2539f, 25.0967f);
        s71Var.s(19.457f);
        s71Var.l(17.1157f);
        s71Var.i(16.2075f, 19.457f, 15.7388f, 18.9956f, 15.7388f, 18.0728f);
        s71Var.s(13.8247f);
        s71Var.l(13.3364f);
        s71Var.i(12.5747f, 13.8247f, 12.1865f, 14.2422f, 12.1865f, 14.96f);
        s71Var.s(25.0967f);
        s71Var.h();
        s71Var.p(17.2549f, 18.3511f);
        s71Var.l(21.0269f);
        s71Var.n(16.8447f, 14.0957f);
        s71Var.s(17.9409f);
        s71Var.i(16.8447f, 18.2339f, 16.9619f, 18.3511f, 17.2549f, 18.3511f);
        s71Var.h();
        fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 0.0f, 0, 4.0f);
        gx6 gx6VarB = fx6Var.b();
        k = gx6VarB;
        return gx6VarB;
    }

    public static final float v0(pv2 pv2Var) {
        j39 j39Var = (j39) pv2Var.F0(qk6.K0);
        float fW = j39Var != null ? j39Var.W() : 1.0f;
        if (fW >= 0.0f) {
            return fW;
        }
        gpa.b("negative scale factor");
        return fW;
    }

    public static final Object w0(p79 p79Var, isa isaVar, Serializable serializable) {
        p79Var.getClass();
        isaVar.getClass();
        Object objC = p79Var.c(isaVar);
        return objC == null ? serializable : objC;
    }

    public static SharedPreferences x0(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final float[] y0(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = ((f4 * f9) - (f3 * f10)) / f14;
        fArr2[4] = ((f10 * f2) - (f4 * f8)) / f14;
        fArr2[5] = ((f8 * f3) - (f9 * f2)) / f14;
        fArr2[6] = ((f3 * f7) - (f4 * f6)) / f14;
        fArr2[7] = ((f4 * f5) - (f7 * f2)) / f14;
        fArr2[8] = ((f2 * f6) - (f3 * f5)) / f14;
        return fArr2;
    }

    public static boolean z0(String str) throws jb6 {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        a0("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        a0("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            String strEglQueryString = EGL14.eglQueryString(eGLDisplayEglGetDisplay, 12373);
            return strEglQueryString != null && strEglQueryString.contains(str);
        }
        throw new jb6("Error in getDefaultEglDisplay, error code: 0x" + Integer.toHexString(iEglGetError), jy6.s(Integer.valueOf(iEglGetError)));
    }

    @Override // defpackage.om3
    public byte A() {
        Object objK0 = k0();
        objK0.getClass();
        return ((Byte) objK0).byteValue();
    }

    @Override // defpackage.om3
    public short B() {
        Object objK0 = k0();
        objK0.getClass();
        return ((Short) objK0).shortValue();
    }

    @Override // defpackage.om3
    public float C() {
        Object objK0 = k0();
        objK0.getClass();
        return ((Float) objK0).floatValue();
    }

    @Override // defpackage.zf2
    public long D(nyc nycVar, int i2) {
        nycVar.getClass();
        return w();
    }

    @Override // defpackage.om3
    public double E() {
        Object objK0 = k0();
        objK0.getClass();
        return ((Double) objK0).doubleValue();
    }

    @Override // defpackage.zf2
    public void b(nyc nycVar) {
        nycVar.getClass();
    }

    @Override // defpackage.om3
    public zf2 c(nyc nycVar) {
        nycVar.getClass();
        return this;
    }

    public abstract List c0(String str, List list);

    @Override // defpackage.zf2
    public om3 e(dua duaVar, int i2) {
        return r(duaVar.i(i2));
    }

    @Override // defpackage.om3
    public boolean f() {
        Object objK0 = k0();
        objK0.getClass();
        return ((Boolean) objK0).booleanValue();
    }

    @Override // defpackage.om3
    public char g() {
        Object objK0 = k0();
        objK0.getClass();
        return ((Character) objK0).charValue();
    }

    @Override // defpackage.zf2
    public float i(nyc nycVar, int i2) {
        nycVar.getClass();
        return C();
    }

    @Override // defpackage.zf2
    public double k(dua duaVar, int i2) {
        return E();
    }

    public Object k0() {
        throw new yyc(job.a.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // defpackage.zf2
    public char l(dua duaVar, int i2) {
        return g();
    }

    @Override // defpackage.zf2
    public byte n(dua duaVar, int i2) {
        return A();
    }

    @Override // defpackage.zf2
    public String o(nyc nycVar, int i2) {
        nycVar.getClass();
        return u();
    }

    @Override // defpackage.om3
    public int p() {
        Object objK0 = k0();
        objK0.getClass();
        return ((Integer) objK0).intValue();
    }

    @Override // defpackage.zf2
    public short q(dua duaVar, int i2) {
        return B();
    }

    @Override // defpackage.om3
    public om3 r(nyc nycVar) {
        nycVar.getClass();
        return this;
    }

    @Override // defpackage.zf2
    public Object s(nyc nycVar, int i2, xn7 xn7Var, Object obj) {
        nycVar.getClass();
        xn7Var.getClass();
        return h(xn7Var);
    }

    @Override // defpackage.zf2
    public int t(nyc nycVar, int i2) {
        nycVar.getClass();
        return p();
    }

    @Override // defpackage.om3
    public String u() {
        Object objK0 = k0();
        objK0.getClass();
        return (String) objK0;
    }

    @Override // defpackage.om3
    public int v(nyc nycVar) {
        nycVar.getClass();
        Object objK0 = k0();
        objK0.getClass();
        return ((Integer) objK0).intValue();
    }

    @Override // defpackage.om3
    public long w() {
        Object objK0 = k0();
        objK0.getClass();
        return ((Long) objK0).longValue();
    }

    @Override // defpackage.om3
    public boolean x() {
        return true;
    }

    @Override // defpackage.zf2
    public Object y(nyc nycVar, int i2, xn7 xn7Var, Object obj) {
        nycVar.getClass();
        xn7Var.getClass();
        if (xn7Var.e().c() || x()) {
            return h(xn7Var);
        }
        return null;
    }

    @Override // defpackage.zf2
    public boolean z(nyc nycVar, int i2) {
        nycVar.getClass();
        return f();
    }
}
