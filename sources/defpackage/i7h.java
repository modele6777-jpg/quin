package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.view.View;
import androidx.camera.core.ImageProcessingUtil;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import io.sentry.android.core.h2;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import tech.chatmind.api.personality.model.PersonalityAnalysisQuestion;
import tech.chatmind.api.personality.model.UserDecision;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i7h {
    public static final q9f A;
    public static final float B;
    public static final float C;
    public static final q9f D;
    public static final n82 E;
    public static final n82 F;
    public static final g5d G;
    public static final n82 H;
    public static final n82 I;
    public static final float J;
    public static UserManager a = null;
    public static volatile boolean b = false;
    public static final dd2 c = new dd2(new ym0(22), false, 460251996);
    public static final dd2 d;
    public static final dd2 e;
    public static final n82 f;
    public static final float g;
    public static final float h;
    public static final g5d i;
    public static final float j;
    public static final q9f k;
    public static final n82 l;
    public static final n82 m;
    public static final n82 n;
    public static final float o;
    public static final n82 p;
    public static final n82 q;
    public static final float r;
    public static final n82 s;
    public static final q9f t;
    public static final n82 u;
    public static final q9f v;
    public static final n82 w;
    public static final n82 x;
    public static final n82 y;
    public static final n82 z;

    static {
        new dd2(new a7(14), false, 1702042393);
        d = new dd2(new xd2(8), false, 2092527881);
        e = new dd2(new de2(13), false, 475910607);
        f = n82.F0;
        g = 360.0f;
        h = 40.0f;
        g5d g5dVar = g5d.d;
        i = g5dVar;
        j = 40.0f;
        q9f q9fVar = q9f.a;
        k = q9fVar;
        n82 n82Var = n82.z;
        l = n82Var;
        n82 n82Var2 = n82.e;
        m = n82Var2;
        n = n82Var;
        o = 1.0f;
        p = n82Var;
        n82 n82Var3 = n82.v;
        q = n82Var3;
        r = 120.0f;
        n82 n82Var4 = n82.w;
        s = n82Var4;
        t = q9f.d;
        u = n82Var4;
        v = q9f.e;
        w = n82.Y;
        x = n82.g;
        y = n82Var4;
        z = n82Var3;
        A = q9fVar;
        B = 36.0f;
        C = 72.0f;
        D = q9fVar;
        E = n82Var;
        F = n82Var2;
        G = g5dVar;
        H = n82Var4;
        I = n82Var4;
        J = 0.38f;
    }

    public static final hj6 A(i8c i8cVar, String str, Executor executor, x16 x16Var) {
        wef wefVar = wef.a;
        executor.getClass();
        v69 v69Var = new v69(hj6.T0);
        la1 la1Var = new la1();
        la1Var.c = new qxb();
        pa1 pa1Var = new pa1(la1Var);
        la1Var.b = pa1Var;
        la1Var.a = kv2.class;
        try {
            executor.execute(new de1(i8cVar, str, x16Var, v69Var, la1Var));
            la1Var.a = wefVar;
        } catch (Exception e2) {
            pa1Var.a(e2);
        }
        return new hj6(25);
    }

    public static final vea B(l26 l26Var, a26 a26Var) {
        sb0 sb0Var = new sb0(5, l26Var);
        z7f.t(1, a26Var);
        return new vea(7, sb0Var, a26Var);
    }

    public static float C(float f2, float[] fArr, float[] fArr2) {
        float f3;
        float f4;
        float f5;
        float f6;
        float fAbs = Math.abs(f2);
        float fSignum = Math.signum(f2);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i2 = -(iBinarySearch + 1);
        int i3 = i2 - 1;
        if (i3 >= fArr.length - 1) {
            float f7 = fArr[fArr.length - 1];
            float f8 = fArr2[fArr.length - 1];
            if (f7 == 0.0f) {
                return 0.0f;
            }
            return (f8 / f7) * f2;
        }
        if (i3 == -1) {
            float f9 = fArr[0];
            f5 = fArr2[0];
            f6 = f9;
            f4 = 0.0f;
            f3 = 0.0f;
        } else {
            float f10 = fArr[i3];
            float f11 = fArr[i2];
            f3 = fArr2[i3];
            f4 = f10;
            f5 = fArr2[i2];
            f6 = f11;
        }
        return (((f5 - f3) * Math.max(0.0f, Math.min(1.0f, f4 == f6 ? 0.0f : (fAbs - f4) / (f6 - f4)))) + f3) * fSignum;
    }

    public static Comparable D(yi4 yi4Var, Comparable comparable) {
        return yi4Var.compareTo(comparable) <= 0 ? yi4Var : comparable;
    }

    public static pv2 E(nv2 nv2Var, ov2 ov2Var) {
        ov2Var.getClass();
        return pa7.t(nv2Var.getKey(), ov2Var) ? nu4.a : nv2Var;
    }

    public static final zj3 F(hw8 hw8Var, Map map, sw8 sw8Var) {
        LinkedHashSet<TarotSkinIdentify> linkedHashSetA = hw8Var.b.a();
        boolean zIsEmpty = linkedHashSetA.isEmpty();
        gmd gmdVar = gmd.e;
        int i2 = 0;
        if (!zIsEmpty) {
            for (TarotSkinIdentify tarotSkinIdentify : linkedHashSetA) {
                if (tarotSkinIdentify.getRequiresDownload()) {
                    hmd hmdVar = (hmd) map.get(tarotSkinIdentify);
                    if ((hmdVar != null ? hmdVar.a : null) != gmdVar) {
                        continue;
                    }
                }
                i2++;
                if (i2 < 0) {
                    t72.Y();
                    throw null;
                }
            }
        }
        gmd gmdVar2 = sw8Var.a;
        gmd gmdVar3 = gmd.c;
        if (gmdVar2 == gmdVar3) {
            gmdVar = gmdVar3;
        } else if (i2 < 10 && gmdVar2 != (gmdVar = gmd.d)) {
            gmdVar = gmd.b;
        }
        return new zj3(sw8Var.b, gmdVar, !hw8Var.a.a());
    }

    public static final j09 G(j09 j09Var, a26 a26Var) {
        return j09Var.D(new po7(a26Var, null));
    }

    public static final j09 H(j09 j09Var, a26 a26Var) {
        return j09Var.D(new po7(null, a26Var));
    }

    public static pv2 I(nv2 nv2Var, pv2 pv2Var) {
        pv2Var.getClass();
        return pv2Var == nu4.a ? nv2Var : (pv2) pv2Var.V0(new he2(28), nv2Var);
    }

    public static final void J(kd0 kd0Var, a26 a26Var) {
        kd0 kd0Var2 = new kd0(999);
        int i2 = kd0Var.c;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            kd0Var2.put(kd0Var.f(i3), kd0Var.i(i3));
            i3++;
            i4++;
            if (i4 == 999) {
                a26Var.d(kd0Var2);
                kd0Var2.clear();
                i4 = 0;
            }
        }
        if (i4 > 0) {
            a26Var.d(kd0Var2);
        }
    }

    public static final int K(int i2, int i3) {
        if (i2 < 0) {
            qc0.j("currentCharacters must not be negative");
            return 0;
        }
        if (i3 > 0) {
            return i3 - i2;
        }
        qc0.j("maxCharacters must be positive");
        return 0;
    }

    public static final String L(byte b2) {
        if (b2 == 1) {
            return "quotation mark '\"'";
        }
        if (b2 == 2) {
            return "string escape sequence '\\'";
        }
        if (b2 == 4) {
            return "comma ','";
        }
        if (b2 == 5) {
            return "colon ':'";
        }
        if (b2 == 6) {
            return "start of the object '{'";
        }
        if (b2 == 7) {
            return "end of the object '}'";
        }
        if (b2 == 8) {
            return "start of the array '['";
        }
        if (b2 == 9) {
            return "end of the array ']'";
        }
        if (b2 == 10) {
            return "end of the input";
        }
        return b2 == 127 ? "invalid token" : "valid token";
    }

    public static byte[] M(iw6 iw6Var, Rect rect, int i2, int i3) {
        if (iw6Var.getFormat() != 35) {
            yg5.j(iw6Var.getFormat(), "Incorrect image format of the input image proxy: ");
            return null;
        }
        m6c m6cVar = iw6Var.v()[0];
        m6c m6cVar2 = iw6Var.v()[1];
        int i4 = 2;
        m6c m6cVar3 = iw6Var.v()[2];
        ByteBuffer byteBufferV = m6cVar.v();
        ByteBuffer byteBufferV2 = m6cVar2.v();
        ByteBuffer byteBufferV3 = m6cVar3.v();
        byteBufferV.rewind();
        byteBufferV2.rewind();
        byteBufferV3.rewind();
        int iRemaining = byteBufferV.remaining();
        byte[] bArr = new byte[((iw6Var.c() * iw6Var.d()) / 2) + iRemaining];
        int iD = 0;
        for (int i5 = 0; i5 < iw6Var.c(); i5++) {
            byteBufferV.get(bArr, iD, iw6Var.d());
            iD += iw6Var.d();
            byteBufferV.position(Math.min(iRemaining, m6cVar.F() + (byteBufferV.position() - iw6Var.d())));
        }
        int iC = iw6Var.c() / 2;
        int iD2 = iw6Var.d() / 2;
        int iF = m6cVar3.F();
        int iF2 = m6cVar2.F();
        int iE = m6cVar3.E();
        int iE2 = m6cVar2.E();
        byte[] bArr2 = new byte[iF];
        byte[] bArr3 = new byte[iF2];
        int i6 = 0;
        while (i6 < iC) {
            int i7 = i4;
            byteBufferV3.get(bArr2, 0, Math.min(iF, byteBufferV3.remaining()));
            byteBufferV2.get(bArr3, 0, Math.min(iF2, byteBufferV2.remaining()));
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < iD2; i10++) {
                int i11 = iD + 1;
                bArr[iD] = bArr2[i8];
                iD += 2;
                bArr[i11] = bArr3[i9];
                i8 += iE;
                i9 += iE2;
            }
            i6++;
            i4 = i7;
        }
        int i12 = i4;
        YuvImage yuvImage = new YuvImage(bArr, 17, iw6Var.d(), iw6Var.c(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        v35[] v35VarArr = k35.b;
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        i35 i35Var = new i35();
        String strValueOf = String.valueOf(1);
        ArrayList arrayList = i35Var.a;
        i35Var.c("Orientation", strValueOf, arrayList);
        i35Var.c("XResolution", "72/1", arrayList);
        i35Var.c("YResolution", "72/1", arrayList);
        i35Var.c("ResolutionUnit", String.valueOf(i12), arrayList);
        i35Var.c("YCbCrPositioning", String.valueOf(1), arrayList);
        i35Var.c("Make", Build.MANUFACTURER, arrayList);
        i35Var.c("Model", Build.MODEL, arrayList);
        if (iw6Var.u0() != null) {
            iw6Var.u0().b(i35Var);
        }
        i35Var.d(i3);
        i35Var.c("ImageWidth", String.valueOf(iw6Var.d()), arrayList);
        i35Var.c("ImageLength", String.valueOf(iw6Var.c()), arrayList);
        ArrayList list = Collections.list(new h35(i35Var));
        if (!((Map) list.get(1)).isEmpty()) {
            i35Var.b("ExposureProgram", String.valueOf(0), list);
            i35Var.b("ExifVersion", "0230", list);
            i35Var.b("ComponentsConfiguration", k35.e, list);
            i35Var.b("MeteringMode", String.valueOf(0), list);
            i35Var.b("LightSource", String.valueOf(0), list);
            i35Var.b("FlashpixVersion", "0100", list);
            i35Var.b("FocalPlaneResolutionUnit", String.valueOf(i12), list);
            i35Var.b("FileSource", String.valueOf(3), list);
            i35Var.b("SceneType", String.valueOf(1), list);
            i35Var.b("CustomRendered", String.valueOf(0), list);
            i35Var.b("SceneCaptureType", String.valueOf(0), list);
            i35Var.b("Contrast", String.valueOf(0), list);
            i35Var.b("Saturation", String.valueOf(0), list);
            i35Var.b("Sharpness", String.valueOf(0), list);
        }
        if (!((Map) list.get(i12)).isEmpty()) {
            i35Var.b("GPSVersionID", "2300", list);
            i35Var.b("GPSSpeedRef", "K", list);
            i35Var.b("GPSTrackRef", "T", list);
            i35Var.b("GPSImgDirectionRef", "T", list);
            i35Var.b("GPSDestBearingRef", "T", list);
            i35Var.b("GPSDestDistanceRef", "K", list);
        }
        if (yuvImage.compressToJpeg(rect, i2, new u35(byteArrayOutputStream, new k35(list)))) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new dx6();
    }

    public static f2 N(Context context, Callable callable, Executor executor) {
        yea yeaVar = new yea(callable);
        if (O(context)) {
            s5f s5fVar = new s5f();
            s5fVar.w = new q5f(s5fVar, yeaVar);
            executor.execute(s5fVar);
            return s5fVar;
        }
        o3d o3dVar = new o3d();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        h2 h2Var = new h2(atomicBoolean, context, o3dVar, yeaVar, executor);
        context.registerReceiver(h2Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!O(context) || !atomicBoolean.compareAndSet(false, true)) {
            o3dVar.b(new qu1(o3dVar, atomicBoolean, context, h2Var, false, 7), f94.a);
            return o3dVar;
        }
        try {
            context.unregisterReceiver(h2Var);
        } catch (IllegalArgumentException e2) {
            b1.n("DirectBootUtils", "Failed to unregister receiver", e2);
        }
        s5f s5fVar2 = new s5f();
        s5fVar2.w = new q5f(s5fVar2, yeaVar);
        executor.execute(s5fVar2);
        o3dVar.o(s5fVar2);
        return o3dVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004e A[Catch: all -> 0x000f, TryCatch #1 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:16:0x0017, B:18:0x001b, B:31:0x004e, B:32:0x0050, B:21:0x0029, B:23:0x002f, B:27:0x003c, B:29:0x004a), top: B:38:0x0009, inners: #0 }] */
    public static boolean O(Context context) {
        if (b) {
            return true;
        }
        synchronized (i7h.class) {
            try {
                if (b) {
                    return true;
                }
                int i2 = 1;
                while (true) {
                    boolean z2 = false;
                    if (i2 <= 2) {
                        UserManager userManager = a;
                        if (userManager == null) {
                            userManager = (UserManager) context.getSystemService(UserManager.class);
                            a = userManager;
                        }
                        if (userManager == null) {
                            z2 = true;
                        } else {
                            try {
                                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                    z2 = true;
                                }
                            } catch (NullPointerException e2) {
                                b1.n("DirectBootUtils", "Failed to check if user is unlocked.", e2);
                                a = null;
                                i2++;
                            }
                        }
                        if (z2) {
                            b = true;
                        }
                        return z2;
                    }
                    if (z2) {
                        a = null;
                    }
                    if (z2) {
                        b = true;
                    }
                    return z2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void a(boolean z2, x16 x16Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(-1339183247);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.h(z2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(x16Var) ? 32 : 16;
        }
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            rxg.a(z2, x16Var, l46Var, i3 & 126, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fs0(z2, x16Var, i2, i4);
        }
    }

    public static final void b(int i2, int i3, j09 j09Var, kx1 kx1Var, mue mueVar, l46 l46Var, int i4) {
        int i5;
        kx1 kx1Var2;
        mue mueVar2;
        int i6;
        kx1 kx1Var3;
        mue mueVarG;
        l46Var.h0(1793124982);
        if ((i4 & 6) == 0) {
            i5 = (l46Var.e(i2) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= l46Var.e(i3) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i4 & 3072) == 0) {
            i5 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i4 & 24576) == 0) {
            i5 |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var.W(i5 & 1, (i5 & 9363) != 9362)) {
            l46Var.b0();
            if ((i4 & 1) == 0 || l46Var.C()) {
                pr4 pr4Var = l8b.a;
                kx1 kx1Var4 = new kx1(((e8b) l46Var.k(pr4Var)).t, ((e8b) l46Var.k(pr4Var)).k);
                mue mueVar3 = pue.a;
                i6 = i5 & (-64513);
                kx1Var3 = kx1Var4;
                mueVarG = pue.g(l46Var);
            } else {
                l46Var.Z();
                mueVarG = mueVar;
                i6 = i5 & (-64513);
                kx1Var3 = kx1Var;
            }
            l46Var.s();
            int iK = K(i2, i3);
            nte.b(String.valueOf(iK), j09Var, iK < 0 ? kx1Var3.b : kx1Var3.a, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarG, l46Var, (i6 >> 3) & 112, 0, 131064);
            mueVar2 = mueVarG;
            kx1Var2 = kx1Var3;
        } else {
            l46Var.Z();
            kx1Var2 = kx1Var;
            mueVar2 = mueVar;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new lx1(i2, i3, j09Var, kx1Var2, mueVar2, i4);
        }
    }

    public static final void c(ul9 ul9Var, yi yiVar, dd2 dd2Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(-1090171650);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? l46Var.g(ul9Var) : l46Var.i(ul9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.g(yiVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(dd2Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        boolean z2 = true;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            boolean z3 = (i3 & 112) == 32;
            if ((i3 & 14) != 4 && ((i3 & 8) == 0 || !l46Var.g(ul9Var))) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            Object objR = l46Var.R();
            if (z4 || objR == sf2.a) {
                objR = new tg6(yiVar, ul9Var);
                l46Var.p0(objR);
            }
            pu.a((tg6) objR, null, new nma(false, usc.a, false, 0), dd2Var, l46Var, ((i3 << 3) & 7168) | 384, 2);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(i2, ul9Var, yiVar, dd2Var, 2);
        }
    }

    public static final void d(x16 x16Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(-1646555525);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.i(x16Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            j((View) l46Var.k(uq.f), (sw3) l46Var.k(zg2.h), x16Var, l46Var, (i3 << 6) & 896);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new lk3(i2, i4, x16Var);
        }
    }

    public static final void e(x16 x16Var, l46 l46Var, int i2) {
        x16 x16Var2;
        l46 l46Var2;
        Object next;
        pwf pwfVarH;
        x16Var.getClass();
        l46Var.h0(-1080768560);
        int i3 = (l46Var.i(x16Var) ? 4 : 2) | i2;
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
            i8c i8cVar = sf2.a;
            if (zBooleanValue) {
                pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK = l46Var.k(uq.b);
                Object objR = l46Var.R();
                if (objR == i8cVar) {
                    objR = d5a.e;
                    l46Var.p0(objR);
                }
                Iterator it = fyc.u((a26) objR, objK).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((Context) next) instanceof pwf));
                pwfVarH = (pwf) next;
                l46Var.r(false);
            }
            if (pwfVarH == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            }
            jca jcaVar = (jca) z5c.G(job.a.b(jca.class), pwfVarH.g(), null, b21.r(pwfVarH), nfcVarB, null);
            Context context = (Context) l46Var.k(uq.b);
            context.getClass();
            String string = context.getString(R.string.personality_share_title);
            string.getClass();
            String string2 = context.getString(R.string.personality_share_summary);
            string2.getClass();
            w6d w6dVar = new w6d("https://quin.love/quin-card-test-intro?os=android&entry=share_icon", string, string2, R.drawable.personality_preview, "https://quin.love/images/personality_share_thumbnail.png");
            boolean zI = l46Var.i(jcaVar);
            Object objR2 = l46Var.R();
            if (zI || objR2 == i8cVar) {
                objR2 = new zv6(26, jcaVar);
                l46Var.p0(objR2);
            }
            x16Var2 = x16Var;
            l46Var2 = l46Var;
            y8c.c(w6dVar, (x16) objR2, x16Var2, l46Var2, (i3 << 6) & 896, 0);
        } else {
            x16Var2 = x16Var;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fi4(i2, 27, x16Var2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    public static final void f(final u5b u5bVar, final a26 a26Var, l46 l46Var, int i2) {
        UserDecision userDecision;
        int rate;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-738119471);
        int i3 = i2 | (l46Var2.g(u5bVar) ? 4 : 2) | (l46Var2.i(a26Var) ? 32 : 16);
        if (l46Var2.W(i3 & 1, (i3 & 19) != 18)) {
            boolean z2 = (i3 & 14) == 4;
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (z2 || objR == i8cVar) {
                if (pa7.t(u5bVar, s5b.a)) {
                    rate = 0;
                } else {
                    if (!(u5bVar instanceof t5b)) {
                        ap.c();
                        return;
                    }
                    t5b t5bVar = (t5b) u5bVar;
                    PersonalityAnalysisQuestion personalityAnalysisQuestion = (PersonalityAnalysisQuestion) s72.y0(t5bVar.b, t5bVar.a);
                    if (personalityAnalysisQuestion == null || (userDecision = personalityAnalysisQuestion.getUserDecision()) == null) {
                        rate = 0;
                    } else {
                        rate = userDecision.getRate();
                    }
                }
                objR = Integer.valueOf(rate);
                l46Var2.p0(objR);
            }
            final int iIntValue = ((Number) objR).intValue();
            Object objR2 = l46Var2.R();
            if (objR2 == i8cVar) {
                objR2 = q1c.f(Boolean.FALSE);
                l46Var2.p0(objR2);
            }
            final e89 e89Var = (e89) objR2;
            FillElement fillElement = b.c;
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, fillElement);
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
            feg.j(od4.A(R.drawable.bg_personality_answer, 0, l46Var2), null, d31.a.b(g09.a), null, an2.g, 0.0f, null, l46Var2, 24632, 104);
            rh5 rh5VarO = m93.o(0, 14);
            long j2 = y72.j;
            dd2 dd2VarB0 = af1.b0(-1477531449, new rk6(23, a26Var, e89Var), l46Var2);
            dd2 dd2VarB1 = af1.b0(2143369062, new x4b(u5bVar, a26Var), l46Var2);
            dd2 dd2VarB2 = af1.b0(1643691228, new n26() { // from class: y4b
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v20 */
                /* JADX WARN: Type inference failed for: r1v21, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r1v23 */
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    Object obj4;
                    g09 g09Var;
                    ?? r1;
                    boolean z3;
                    UserDecision userDecision2;
                    l46 l46Var3;
                    xw9 xw9Var = (xw9) obj;
                    l46 l46Var4 = (l46) obj2;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    xw9Var.getClass();
                    if ((iIntValue2 & 6) == 0) {
                        iIntValue2 |= l46Var4.g(xw9Var) ? 4 : 2;
                    }
                    if (l46Var4.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                        j09 j09VarY = ynb.Y(b.c, xw9Var);
                        jx0 jx0Var = ndb.Y;
                        sc0 sc0Var = xc0.c;
                        c92 c92VarA = a92.a(sc0Var, jx0Var, l46Var4, 0);
                        int iHashCode2 = Long.hashCode(l46Var4.T);
                        u8a u8aVarM2 = l46Var4.m();
                        j09 j09VarJ2 = m93.J(l46Var4, j09VarY);
                        lf2.q.getClass();
                        l46Var4.j0();
                        boolean z4 = l46Var4.S;
                        ov7 ov7Var = LayoutNode.h1;
                        if (z4) {
                            l46Var4.l(ov7Var);
                        } else {
                            l46Var4.s0();
                        }
                        he2 he2Var = hj6.z;
                        dec.l(he2Var, l46Var4, c92VarA);
                        he2 he2Var2 = hj6.y;
                        dec.l(he2Var2, l46Var4, u8aVarM2);
                        Integer numValueOf = Integer.valueOf(iHashCode2);
                        he2 he2Var3 = hj6.X;
                        dec.l(he2Var3, l46Var4, numValueOf);
                        dec.k(l46Var4);
                        he2 he2Var4 = hj6.x;
                        dec.l(he2Var4, l46Var4, j09VarJ2);
                        if (1.0f <= 0.0d) {
                            g37.a("invalid weight; must be greater than zero");
                        }
                        jw7 jw7Var = new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        u5b u5bVar2 = u5bVar;
                        xn8 xn8VarC2 = s21.c(u5bVar2 instanceof s5b ? ndb.f : ndb.c, false);
                        int iHashCode3 = Long.hashCode(l46Var4.T);
                        u8a u8aVarM3 = l46Var4.m();
                        j09 j09VarJ3 = m93.J(l46Var4, jw7Var);
                        l46Var4.j0();
                        if (l46Var4.S) {
                            l46Var4.l(ov7Var);
                        } else {
                            l46Var4.s0();
                        }
                        dec.l(he2Var, l46Var4, xn8VarC2);
                        dec.l(he2Var2, l46Var4, u8aVarM3);
                        ib8.s(iHashCode3, l46Var4, he2Var3, l46Var4);
                        dec.l(he2Var4, l46Var4, j09VarJ3);
                        boolean zT = pa7.t(u5bVar2, s5b.a);
                        Object obj5 = sf2.a;
                        g09 g09Var2 = g09.a;
                        if (zT) {
                            l46Var4.f0(1083555245);
                            bzd.k(null, true, 0L, null, l46Var4, 24624, 13);
                            l46Var4.r(false);
                            obj4 = obj5;
                            r1 = 0;
                            g09Var = g09Var2;
                            z3 = true;
                            l46Var3 = l46Var4;
                        } else {
                            if (!(u5bVar2 instanceof t5b)) {
                                throw tec.d(-2043256562, l46Var4, false);
                            }
                            l46Var4.f0(1083739199);
                            boolean zI = l46Var4.i(u5bVar2);
                            Object objR3 = l46Var4.R();
                            if (zI || objR3 == obj5) {
                                objR3 = new hla(3, u5bVar2);
                                l46Var4.p0(objR3);
                            }
                            cs3 cs3VarB = ay9.b(0, 0, 3, (x16) objR3, l46Var4);
                            t5b t5bVar2 = (t5b) u5bVar2;
                            List list = t5bVar2.a;
                            int i4 = t5bVar2.b;
                            Integer numValueOf2 = Integer.valueOf(i4);
                            Boolean boolValueOf = Boolean.valueOf(cs3VarB.k().a.isEmpty());
                            boolean zG = l46Var4.g(cs3VarB) | l46Var4.i(u5bVar2);
                            Object objR4 = l46Var4.R();
                            Integer numValueOf3 = null;
                            if (zG || objR4 == obj5) {
                                objR4 = new b5b(cs3VarB, u5bVar2, null);
                                l46Var4.p0(objR4);
                            }
                            af1.p(numValueOf2, boolValueOf, (l26) objR4, l46Var4);
                            c92 c92VarA2 = a92.a(sc0Var, jx0Var, l46Var4, 0);
                            int iHashCode4 = Long.hashCode(l46Var4.T);
                            u8a u8aVarM4 = l46Var4.m();
                            j09 j09VarJ4 = m93.J(l46Var4, g09Var2);
                            l46Var4.j0();
                            if (l46Var4.S) {
                                l46Var4.l(ov7Var);
                            } else {
                                l46Var4.s0();
                            }
                            dec.l(he2Var, l46Var4, c92VarA2);
                            dec.l(he2Var2, l46Var4, u8aVarM4);
                            ib8.s(iHashCode4, l46Var4, he2Var3, l46Var4);
                            dec.l(he2Var4, l46Var4, j09VarJ4);
                            PersonalityAnalysisQuestion personalityAnalysisQuestion2 = (PersonalityAnalysisQuestion) s72.y0(i4, list);
                            if (personalityAnalysisQuestion2 != null && (userDecision2 = personalityAnalysisQuestion2.getUserDecision()) != null) {
                                numValueOf3 = Integer.valueOf(userDecision2.getRate());
                            }
                            vfh.m(((numValueOf3 != null ? 1 : 0) + i4) / list.size(), 0.0f, 48, l46Var4, ynb.b0(32.0f, 0.0f, g09Var2, 2));
                            obj4 = obj5;
                            g09Var = g09Var2;
                            r1 = 0;
                            z3 = true;
                            cn1.h(0.0f, 0, 100663296, 16126, null, af1.b0(752210800, new wt(11, u5bVar2), l46Var4), l46Var4, null, null, null, null, null, cs3VarB, null, null, false);
                            l46 l46Var5 = l46Var4;
                            l46Var5.r(true);
                            l46Var5.r(false);
                            l46Var3 = l46Var5;
                        }
                        l46Var3.r(z3);
                        j09 j09VarB0 = ynb.b0(16.0f, 0.0f, b.c(g09Var, 1.0f), 2);
                        a26 a26Var2 = a26Var;
                        boolean zG2 = l46Var3.g(a26Var2);
                        Object objR5 = l46Var3.R();
                        Object obj6 = obj4;
                        if (zG2 || objR5 == obj6) {
                            objR5 = new hy0(a26Var2, 14);
                            l46Var3.p0(objR5);
                        }
                        bm8.g(j09VarB0, 0L, iIntValue, (a26) objR5, l46Var3, 6);
                        if (1.0f <= 0.0d) {
                            g37.a("invalid weight; must be greater than zero");
                        }
                        s21.a(b.c(new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z3), 1.0f), l46Var3, r1);
                        l46Var3.r(z3);
                        e89 e89Var2 = e89Var;
                        if (((Boolean) e89Var2.getValue()).booleanValue()) {
                            l46Var3.f0(285797121);
                            dd2 dd2Var = t72.j;
                            String strQ = afc.q(R.string.personality_continue_test, l46Var3);
                            String strQ2 = afc.q(R.string.exit_confirm, l46Var3);
                            boolean zG3 = l46Var3.g(a26Var2);
                            Object objR6 = l46Var3.R();
                            if (zG3 || objR6 == obj6) {
                                objR6 = new rj2(a26Var2, e89Var2, 3);
                                l46Var3.p0(objR6);
                            }
                            x16 x16Var = (x16) objR6;
                            Object objR7 = l46Var3.R();
                            if (objR7 == obj6) {
                                objR7 = new x08(e89Var2, 27);
                                l46Var3.p0(objR7);
                            }
                            l46 l46Var6 = l46Var3;
                            kj0.F(null, dd2Var, strQ, strQ2, false, false, null, null, x16Var, (x16) objR7, l46Var6, 805306422, 240);
                            l46Var6.r(r1);
                        } else {
                            l46Var3.f0(287062758);
                            l46Var3.r(r1);
                        }
                    } else {
                        l46Var4.Z();
                    }
                    return wef.a;
                }
            }, l46Var2);
            l46Var2 = l46Var;
            xdc.a(null, dd2VarB0, dd2VarB1, null, null, 0, j2, 0L, rh5VarO, dd2VarB2, l46Var2, 806879664, ModuleDescriptor.MODULE_VERSION);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new x4b(u5bVar, a26Var, i2);
        }
    }

    public static final void g(String str, a26 a26Var, x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        str.getClass();
        a26Var.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(1955248436);
        int i3 = i2 | (l46Var.g(str) ? 4 : 2) | (l46Var.i(a26Var) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (z2 || objR == obj) {
                objR = new t8(str, 10);
                l46Var.p0(objR);
            }
            x16 x16Var3 = (x16) objR;
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            a6b a6bVar = (a6b) z5c.G(job.a.b(a6b.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), x16Var3);
            u5b u5bVar = (u5b) tm7.t(a6bVar.f, l46Var).getValue();
            boolean zI = (i4 == 4) | ((i3 & 112) == 32) | l46Var.i(a6bVar) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objR2 = l46Var.R();
            if (zI || objR2 == obj) {
                Object kfVar = new kf((Object) a26Var, str, (Object) a6bVar, (Object) x16Var, (Object) x16Var2, 21);
                l46Var.p0(kfVar);
                objR2 = kfVar;
            }
            f(u5bVar, (a26) objR2, l46Var, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r19(str, a26Var, x16Var, x16Var2, i2, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6  */
    public static final void h(final ul9 ul9Var, final boolean z2, final txb txbVar, final boolean z3, long j2, final float f2, final j09 j09Var, l46 l46Var, final int i2, final int i3) {
        int i4;
        long j3;
        long j4;
        final boolean z4;
        l46Var.h0(-466280168);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? l46Var.g(ul9Var) : l46Var.i(ul9Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.h(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= l46Var.e(txbVar.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i4 |= l46Var.h(z3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            j3 = j2;
            i4 |= ((i3 & 16) == 0 && l46Var.f(j3)) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        } else {
            j3 = j2;
        }
        if ((1572864 & i2) == 0) {
            i4 |= l46Var.g(j09Var) ? 1048576 : 524288;
        }
        if (l46Var.W(i4 & 1, (533651 & i4) != 533650)) {
            l46Var.b0();
            if ((i2 & 1) != 0 && !l46Var.C()) {
                l46Var.Z();
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                }
            } else if ((i3 & 16) != 0) {
                i4 &= -57345;
                j3 = 9205357640488583168L;
            }
            l46Var.s();
            txb txbVar2 = txb.b;
            txb txbVar3 = txb.a;
            if (z2) {
                gxc gxcVar = svc.a;
                if ((txbVar != txbVar3 || z3) && !(txbVar == txbVar2 && z3)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
            } else {
                gxc gxcVar2 = svc.a;
                if ((txbVar != txbVar3 || z3) && !(txbVar == txbVar2 && z3)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            ix0 ix0Var = z4 ? vd0.c : vd0.b;
            int i5 = i4 & 14;
            boolean zH = (i5 == 4 || ((i4 & 8) != 0 && l46Var.i(ul9Var))) | ((i4 & 112) == 32) | l46Var.h(z4);
            Object objR = l46Var.R();
            if (zH || objR == sf2.a) {
                objR = new a26() { // from class: wu
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        hxc hxcVar = (hxc) obj;
                        long jA = ul9Var.a();
                        hxcVar.c(svc.a, new rvc(z2 ? sg6.b : sg6.c, jA, z4 ? qvc.a : qvc.c, (9223372034707292159L & jA) != 9205357640488583168L));
                        return wef.a;
                    }
                };
                l46Var.p0(objR);
            }
            long j5 = j3;
            boolean z5 = z4;
            j4 = j5;
            c(ul9Var, ix0Var, af1.b0(1365123137, new yu((rvf) l46Var.k(zg2.t), j4, z5, vwc.b(j09Var, false, (a26) objR), ul9Var), l46Var), l46Var, i5 | 384);
        } else {
            l46Var.Z();
            j4 = j3;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final long j6 = j4;
            ojbVarV.d = new l26() { // from class: zu
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i7h.h(ul9Var, z2, txbVar, z3, j6, f2, j09Var, (l46) obj, k99.P(i2 | 1), i3);
                    return wef.a;
                }
            };
        }
    }

    public static final void i(int i2, x16 x16Var, l46 l46Var, j09 j09Var, boolean z2) {
        int i3;
        l46Var.h0(2111672474);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i5 = 0;
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            gxc gxcVar = svc.a;
            o5c.f(l46Var, m93.u(b.m(j09Var, 25.0f, 25.0f), new dv(x16Var, z2, i5)));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cv(j09Var, x16Var, z2, i2);
        }
    }

    public static final void j(View view, sw3 sw3Var, x16 x16Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(-1319522472);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.i(view) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.g(sw3Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            boolean zI = l46Var.i(view) | ((i3 & 896) == 256);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new ks2(29, view, x16Var);
                l46Var.p0(objR);
            }
            af1.h(view, sw3Var, (a26) objR, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(i2, view, sw3Var, x16Var, 19);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k(awa awaVar, x16 x16Var, zn2 zn2Var) {
        wva wvaVar;
        if (zn2Var instanceof wva) {
            wvaVar = (wva) zn2Var;
            int i2 = wvaVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wvaVar.label = i2 - Integer.MIN_VALUE;
            } else {
                wvaVar = new wva(zn2Var);
            }
        } else {
            wvaVar = new wva(zn2Var);
        }
        Object obj = wvaVar.result;
        int i3 = wvaVar.label;
        try {
            if (i3 == 0) {
                jzb.q(obj);
                if (wvaVar.getContext().F0(ndb.Y0) != awaVar) {
                    qc0.p("awaitClose() can only be invoked from the producer context");
                    return null;
                }
                wvaVar.L$0 = awaVar;
                wvaVar.L$1 = x16Var;
                wvaVar.I$0 = 0;
                wvaVar.label = 1;
                pl1 pl1Var = new pl1(1, k99.D(wvaVar));
                pl1Var.v();
                ((zva) awaVar).l0(new x(29, pl1Var));
                Object objT = pl1Var.t();
                bw2 bw2Var = bw2.a;
                if (objT == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i3 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x16Var = (x16) wvaVar.L$1;
                jzb.q(obj);
            }
            x16Var.invoke();
            return wef.a;
        } catch (Throwable th) {
            x16Var.invoke();
            throw th;
        }
    }

    public static final byte l(char c2) {
        if (c2 < '~') {
            return bx1.b[c2];
        }
        return (byte) 0;
    }

    public static int m(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final hb1 n(df7 df7Var, boolean z2) {
        Field fieldF = df7Var.y().F();
        int i2 = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        if (Modifier.isStatic(fieldF.getModifiers())) {
            int i3 = 2;
            return z2 ? new xa1(fieldF, b4 == true ? 1 : 0, i3) : new bb1(fieldF, b3 == true ? 1 : 0, b2 == true ? 1 : 0, i3);
        }
        boolean z3 = true;
        if (z2) {
            return ynb.Q(df7Var) ? new va1(fieldF, ynb.J(df7Var.y())) : new xa1(fieldF, z3, i2);
        }
        return ynb.Q(df7Var) ? new za1(fieldF, false, ynb.J(df7Var.y())) : new bb1(fieldF, b6 == true ? 1 : 0, z3, b5 == true ? 1 : 0);
    }

    public static final void o(gf7 gf7Var) {
        if (Modifier.isStatic(gf7Var.F().getModifiers())) {
            return;
        }
        ho7.y(gf7Var.F(), "Only static properties are supported for now: ");
    }

    public static Bitmap p(iw6 iw6Var) {
        int format = iw6Var.getFormat();
        if (format == 1) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iw6Var.d(), iw6Var.c(), Bitmap.Config.ARGB_8888);
            iw6Var.v()[0].v().rewind();
            ImageProcessingUtil.d(bitmapCreateBitmap, iw6Var.v()[0].v(), iw6Var.v()[0].F());
            return bitmapCreateBitmap;
        }
        if (format == 35) {
            return ImageProcessingUtil.b(iw6Var);
        }
        if (format != 256 && format != 4101) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + iw6Var.getFormat() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
        }
        if (!z(iw6Var.getFormat())) {
            yg5.j(iw6Var.getFormat(), "Incorrect image format of the input image proxy: ");
            return null;
        }
        ByteBuffer byteBufferV = iw6Var.v()[0].v();
        int iCapacity = byteBufferV.capacity();
        byte[] bArr = new byte[iCapacity];
        byteBufferV.rewind();
        byteBufferV.get(bArr);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iCapacity, null);
        if (bitmapDecodeByteArray != null) {
            return bitmapDecodeByteArray;
        }
        s8f.i("Decode jpeg byte array failed");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public static final cv6 q(h81 h81Var, float f2) {
        int iCeil = ((int) Math.ceil(f2)) * 2;
        ks ksVarE = vfh.z;
        lp lpVarA = vfh.A;
        xl1 xl1Var = vfh.B;
        if (ksVarE == null || lpVarA == null) {
            ksVarE = vpf.e(iCeil, iCeil, 1);
            vfh.z = ksVarE;
            lpVarA = mp.a(ksVarE);
            vfh.A = lpVarA;
        } else {
            Bitmap bitmap = ksVarE.a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                ksVarE = vpf.e(iCeil, iCeil, 1);
                vfh.z = ksVarE;
                lpVarA = mp.a(ksVarE);
                vfh.A = lpVarA;
            }
        }
        ks ksVar = ksVarE;
        lp lpVar = lpVarA;
        if (xl1Var == null) {
            xl1Var = new xl1();
            vfh.B = xl1Var;
        }
        xl1 xl1Var2 = xl1Var;
        wl1 wl1Var = xl1Var2.a;
        cv7 layoutDirection = h81Var.a.getLayoutDirection();
        Bitmap bitmap2 = ksVar.a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        sw3 sw3Var = wl1Var.a;
        cv7 cv7Var = wl1Var.b;
        vl1 vl1Var = wl1Var.c;
        long j2 = wl1Var.d;
        wl1Var.a = h81Var;
        wl1Var.b = layoutDirection;
        wl1Var.c = lpVar;
        wl1Var.d = jFloatToRawIntBits;
        lpVar.g();
        sn4.y0(xl1Var2, y72.b, 0L, xl1Var2.f(), 0.0f, null, 0, 58);
        sn4.y0(xl1Var2, abg.d(4278190080L), 0L, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), 0.0f, null, 0, 120);
        sn4.w0(xl1Var2, abg.d(4278190080L), f2, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), null, 120);
        lpVar.o();
        wl1Var.a = sw3Var;
        wl1Var.b = cv7Var;
        wl1Var.c = vl1Var;
        wl1Var.d = j2;
        return ksVar;
    }

    public static final void r(sn4 sn4Var, ke6 ke6Var) {
        boolean z2;
        Canvas canvas;
        float f2;
        vl1 vl1VarP = sn4Var.v0().p();
        ke6 ke6Var2 = (ke6) sn4Var.v0().d;
        me6 me6Var = ke6Var.a;
        if (ke6Var.s) {
            return;
        }
        long j2 = ke6Var.h;
        Canvas canvasB = mp.b(vl1VarP);
        boolean zIsHardwareAccelerated = canvasB.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j3 = ke6Var.t;
            float f3 = (int) (j3 >> 32);
            float f4 = f3 - ke6Var.v;
            float f5 = (int) (j3 & 4294967295L);
            float f6 = f5 - ke6Var.w;
            long j4 = ke6Var.u;
            float f7 = f3 + ((int) (j4 >> 32)) + ke6Var.x;
            float f8 = f5 + ((int) (j4 & 4294967295L)) + ke6Var.y;
            float fA = me6Var.a();
            c82 c82VarN = me6Var.n();
            int iP = me6Var.P();
            if (fA >= 1.0f && iP == 3 && c82VarN == null) {
                canvas = canvasB;
                if (me6Var.m() != 1) {
                    canvas.save();
                    f2 = f4;
                    canvasB = canvas;
                }
                canvasB.translate(f2, f6);
                Matrix matrixK = me6Var.K();
                matrixK.preTranslate(ke6Var.v, ke6Var.w);
                canvasB.concat(matrixK);
                ke6Var.h = hl9.f(ke6Var.h, (((long) Float.floatToRawIntBits(ke6Var.w)) & 4294967295L) | (((long) Float.floatToRawIntBits(ke6Var.v)) << 32));
            } else {
                canvas = canvasB;
            }
            rt rtVarH = ke6Var.p;
            if (rtVarH == null) {
                rtVarH = urg.h();
                ke6Var.p = rtVarH;
            }
            rtVarH.d(fA);
            rtVarH.e(iP);
            rtVarH.g(c82VarN);
            Paint paintE = urg.E(rtVarH);
            f2 = f4;
            canvasB = canvas;
            canvasB.saveLayer(f2, f6, f7, f8, paintE);
            canvasB.translate(f2, f6);
            Matrix matrixK2 = me6Var.K();
            matrixK2.preTranslate(ke6Var.v, ke6Var.w);
            canvasB.concat(matrixK2);
            ke6Var.h = hl9.f(ke6Var.h, (((long) Float.floatToRawIntBits(ke6Var.w)) & 4294967295L) | (((long) Float.floatToRawIntBits(ke6Var.v)) << 32));
        }
        ke6Var.a();
        if (!me6Var.r()) {
            try {
                ke6Var.a.D(ke6Var.b, ke6Var.c, ke6Var, ke6Var.e);
            } catch (Throwable unused) {
            }
        }
        boolean z3 = me6Var.M() > 0.0f;
        if (z3) {
            vl1VarP.t();
        }
        boolean z4 = !zIsHardwareAccelerated && ke6Var.A;
        if (z4) {
            vl1VarP.g();
            vs9 vs9VarD = ke6Var.d();
            if (vs9VarD instanceof ts9) {
                vl1.r(vl1VarP, ((ts9) vs9VarD).a);
            } else if (vs9VarD instanceof us9) {
                zt ztVarA = ke6Var.m;
                if (ztVarA != null) {
                    ztVarA.l();
                } else {
                    ztVarA = cu.a();
                    ke6Var.m = ztVarA;
                }
                zt.c(ztVarA, ((us9) vs9VarD).a);
                vl1VarP.f(ztVarA, 1);
            } else {
                if (!(vs9VarD instanceof ss9)) {
                    ap.c();
                    return;
                }
                vl1VarP.f(((ss9) vs9VarD).a, 1);
            }
        }
        if (ke6Var2 != null) {
            kv kvVar = ke6Var2.r;
            if (!kvVar.a) {
                h37.a("Only add dependencies during a tracking");
            }
            x79 x79Var = (x79) kvVar.d;
            if (x79Var != null) {
                x79Var.e(ke6Var);
            } else if (((ke6) kvVar.b) != null) {
                x79 x79Var2 = mec.a;
                x79 x79Var3 = new x79();
                ke6 ke6Var3 = (ke6) kvVar.b;
                ke6Var3.getClass();
                x79Var3.e(ke6Var3);
                x79Var3.e(ke6Var);
                kvVar.d = x79Var3;
                kvVar.b = null;
            } else {
                kvVar.b = ke6Var;
            }
            x79 x79Var4 = (x79) kvVar.e;
            if (x79Var4 != null) {
                z2 = !x79Var4.m(ke6Var);
            } else if (((ke6) kvVar.c) != ke6Var) {
                z2 = true;
            } else {
                kvVar.c = null;
                z2 = false;
            }
            if (z2) {
                ke6Var.q++;
            }
        }
        if (((lp) vl1VarP).a.isHardwareAccelerated()) {
            me6Var.l(vl1VarP);
        } else {
            xl1 xl1Var = ke6Var.o;
            if (xl1Var == null) {
                xl1Var = new xl1();
                ke6Var.o = xl1Var;
            }
            ta0 ta0Var = xl1Var.b;
            sw3 sw3Var = ke6Var.b;
            cv7 cv7Var = ke6Var.c;
            long jY0 = db6.Y0(ke6Var.u);
            sw3 sw3VarU = ta0Var.u();
            cv7 cv7VarW = ta0Var.w();
            vl1 vl1VarP2 = ta0Var.p();
            long jZ = ta0Var.z();
            ke6 ke6Var4 = (ke6) ta0Var.d;
            ta0Var.P(sw3Var);
            ta0Var.Q(cv7Var);
            ta0Var.O(vl1VarP);
            ta0Var.R(jY0);
            ta0Var.d = ke6Var;
            vl1VarP.g();
            try {
                ke6Var.c(xl1Var);
                vl1VarP.o();
                ta0Var.P(sw3VarU);
                ta0Var.Q(cv7VarW);
                ta0Var.O(vl1VarP2);
                ta0Var.R(jZ);
                ta0Var.d = ke6Var4;
            } catch (Throwable th) {
                vl1VarP.o();
                ta0Var.P(sw3VarU);
                ta0Var.Q(cv7VarW);
                ta0Var.O(vl1VarP2);
                ta0Var.R(jZ);
                ta0Var.d = ke6Var4;
                throw th;
            }
        }
        if (z4) {
            vl1VarP.o();
        }
        if (z3) {
            vl1VarP.i();
        }
        if (!zIsHardwareAccelerated) {
            canvasB.restore();
        }
        ke6Var.h = j2;
    }

    public static nv2 s(nv2 nv2Var, ov2 ov2Var) {
        ov2Var.getClass();
        if (pa7.t(nv2Var.getKey(), ov2Var)) {
            return nv2Var;
        }
        return null;
    }

    public static final ArrayList t(ga7 ga7Var) {
        ga7Var.getClass();
        LayoutNode layoutNodeA0 = ((lg8) ga7Var).A0();
        boolean zY = y(layoutNodeA0);
        g79 g79Var = (g79) layoutNodeA0.q();
        p89 p89Var = (p89) g79Var.b;
        ArrayList arrayList = new ArrayList(p89Var.c);
        int i2 = p89Var.c;
        for (int i3 = 0; i3 < i2; i3++) {
            LayoutNode layoutNode = (LayoutNode) g79Var.get(i3);
            arrayList.add(zY ? layoutNode.o() : layoutNode.p());
        }
        return arrayList;
    }

    public static final j22 u(u99 u99Var, int i2) {
        u99Var.getClass();
        return mh3.z(u99Var.a(i2), u99Var.b(i2));
    }

    public static final t99 v(u99 u99Var, int i2) {
        u99Var.getClass();
        return t99.d(u99Var.getString(i2));
    }

    public static boolean w(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static final boolean x(tt7 tt7Var) {
        tt7Var.getClass();
        jgf jgfVarK0 = tt7Var.k0();
        if (jgfVarK0 instanceof oy4) {
            return true;
        }
        return (jgfVarK0 instanceof bj5) && (((bj5) jgfVarK0).o0() instanceof oy4);
    }

    public static final boolean y(LayoutNode layoutNode) {
        int iOrdinal = layoutNode.u().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            ap.c();
                            return false;
                        }
                        LayoutNode layoutNodeF = layoutNode.F();
                        if (layoutNodeF != null) {
                            return y(layoutNodeF);
                        }
                        qc0.j("no parent for idle node");
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean z(int i2) {
        return i2 == 256 || i2 == 4101;
    }
}
