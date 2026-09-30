package defpackage;

import android.os.Build;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.Window;
import com.google.android.filament.Engine;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.VertexBuffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q6c {
    public static final Object a(Object obj, boolean z) {
        al7 al7Var;
        obj.getClass();
        if (z) {
            obj = (xl7) obj;
            if ((obj instanceof wl7) && (al7Var = ((wl7) obj).i) != null) {
                dx5 dx5VarG = al7Var.g();
                if (dx5VarG == null) {
                    gk7.a(4);
                    throw null;
                }
                String strReplace = dx5VarG.a.a.replace('.', '/');
                if (strReplace != null) {
                    return new vl7(strReplace);
                }
                gk7.a(7);
                throw null;
            }
        }
        return obj;
    }

    public static lqb b(Engine engine) {
        v21 v21Var = (v21) zfe.a.getValue();
        long jNCreateBuilder = VertexBuffer.nCreateBuilder();
        new d82(jNCreateBuilder, 10);
        VertexBuffer.nBuilderBufferCount(jNCreateBuilder, 1);
        float[] fArr = v21Var.a;
        short[] sArr = v21Var.b;
        VertexBuffer.nBuilderVertexCount(jNCreateBuilder, fArr.length / 9);
        VertexBuffer.nBuilderAttribute(jNCreateBuilder, kv2.B(1), 0, kv2.B(21), 0, 36);
        int i = 12;
        VertexBuffer.nBuilderAttribute(jNCreateBuilder, kv2.B(4), 0, kv2.B(20), 12, 36);
        VertexBuffer.nBuilderAttribute(jNCreateBuilder, kv2.B(2), 0, kv2.B(22), 20, 36);
        long jNBuilderBuild = VertexBuffer.nBuilderBuild(jNCreateBuilder, engine.getNativeObject());
        if (jNBuilderBuild == 0) {
            qc0.p("Couldn't create VertexBuffer");
            return null;
        }
        VertexBuffer vertexBuffer = new VertexBuffer();
        vertexBuffer.a = jNBuilderBuild;
        float[] fArr2 = v21Var.a;
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder());
        byteBufferOrder.asFloatBuffer().put(fArr2);
        vertexBuffer.h(engine, byteBufferOrder);
        long jNCreateBuilder2 = IndexBuffer.nCreateBuilder();
        new d82(jNCreateBuilder2, 3);
        IndexBuffer.nBuilderIndexCount(jNCreateBuilder2, sArr.length);
        IndexBuffer.nBuilderBufferType(jNCreateBuilder2, 0);
        long jNBuilderBuild2 = IndexBuffer.nBuilderBuild(jNCreateBuilder2, engine.getNativeObject());
        if (jNBuilderBuild2 == 0) {
            qc0.p("Couldn't create IndexBuffer");
            return null;
        }
        IndexBuffer indexBuffer = new IndexBuffer();
        indexBuffer.a = jNBuilderBuild2;
        ByteBuffer byteBufferOrder2 = ByteBuffer.allocateDirect(sArr.length * 2).order(ByteOrder.nativeOrder());
        byteBufferOrder2.asShortBuffer().put(sArr);
        indexBuffer.g(engine, byteBufferOrder2);
        return new lqb(i, vertexBuffer, indexBuffer);
    }

    public static final void c(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = sj6.a[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    public static final long d(byte[] bArr, int i) {
        return (((long) bArr[i + 7]) & 255) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
    }

    public static final boolean e(String str) {
        return pa7.t(str, "wechat") || pa7.t(str, "wechat_moments");
    }

    public static final void f(lqb lqbVar, vne vneVar, vne vneVar2, k47 k47Var, boolean z) {
        p89 p89Var = (p89) k47Var.b;
        int i = p89Var.c;
        if (i > 1) {
            lqbVar.s(new vue(0, vneVar.c.toString(), vneVar2.c.toString(), vneVar.d, vneVar2.d, 0L, false, 32));
            return;
        }
        if (i == 1) {
            wv1 wv1Var = (wv1) p89Var.a[0];
            long jB = u3c.b(wv1Var.c, wv1Var.d);
            wv1 wv1Var2 = (wv1) ((p89) k47Var.b).a[0];
            long jB2 = u3c.b(wv1Var2.a, wv1Var2.b);
            if (eue.d(jB) && eue.d(jB2)) {
                return;
            }
            lqbVar.s(new vue(eue.g(jB), u3c.i(jB, vneVar), u3c.i(jB2, vneVar2), vneVar.d, vneVar2.d, 0L, z, 32));
        }
    }

    public static final float g(long j, float f, sw3 sw3Var) {
        if (wue.a(j, wue.c)) {
            return f;
        }
        long jB = wue.b(j);
        if (xue.a(jB, 4294967296L)) {
            return sw3Var.Q0(j);
        }
        if (xue.a(jB, 8589934592L)) {
            return wue.c(j) * f;
        }
        return Float.NaN;
    }

    public static final float h(long j, float f, sw3 sw3Var) {
        float fC;
        long jB = wue.b(j);
        if (xue.a(jB, 4294967296L)) {
            if (sw3Var.h0() <= 1.05d) {
                return sw3Var.Q0(j);
            }
            fC = wue.c(j) / wue.c(sw3Var.S(f));
        } else {
            if (!xue.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = wue.c(j);
        }
        return fC * f;
    }

    public static final j09 i(j09 j09Var, float f) {
        return f == 0.0f ? j09Var : bzd.y(j09Var, 0.0f, 0.0f, 0.0f, 0.0f, f, 0L, null, false, 0L, 0L, 1048319);
    }

    public static final j09 j(j09 j09Var, ii6 ii6Var, l46 l46Var) {
        j09 j09VarO;
        j09Var.getClass();
        l46Var.f0(2123464659);
        y6c y6cVarB = a7c.b(20.0f);
        if (ii6Var == null) {
            l46Var.f0(-437503913);
            j09VarO = tm7.o(j09Var, bx5.e(l46Var), y6cVarB);
            l46Var.r(false);
        } else {
            l46Var.f0(-437450097);
            l46Var.r(false);
            j09 j09VarE = oa7.E(db6.w(j09Var, 0.5f, bx5.f(l46Var), y6cVarB), y6cVarB);
            long j = y72.j;
            j09VarO = tm7.o(z7f.J(j09VarE, ii6Var, new ji6(j, t72.H(new li6(j)), 8.0f, 0.0f, new li6(j)), null, 4), bx5.e(l46Var), g21.f);
        }
        l46Var.r(false);
        return j09VarO;
    }

    public static final void k(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(abg.Z(j)), i, i2, 33);
        }
    }

    public static void l(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            p6.p(window, z);
        } else {
            if (i >= 30) {
                p6.o(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static final void m(Spannable spannable, long j, sw3 sw3Var, int i, int i2) {
        long jB = wue.b(j);
        if (xue.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(ym8.L(sw3Var.Q0(j)), false), i, i2, 33);
        } else if (xue.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(wue.c(j)), i, i2, 33);
        }
    }

    public static final void n(Spannable spannable, sd8 sd8Var, int i, int i2) {
        if (sd8Var != null) {
            ArrayList arrayList = new ArrayList(t72.u(sd8Var, 10));
            Iterator it = sd8Var.a.iterator();
            while (it.hasNext()) {
                arrayList.add(((rd8) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final void o(int i, String str, String str2) {
        StringBuilder sbP = ks0.p("Expected ", str2, " at index ", i, ", but was '");
        sbP.append(str.charAt(i));
        sbP.append('\'');
        throw new IllegalArgumentException(sbP.toString());
    }

    public static int p(int i, int i2) {
        if (i2 < 0) {
            qc0.j("cannot store more than Integer.MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int iHighestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = iHighestOneBit + iHighestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }
}
