package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jh8 extends gu7 implements a26 {
    final /* synthetic */ yi $alignment;
    final /* synthetic */ boolean $applyOpacityToLayers;
    final /* synthetic */ boolean $applyShadowToLayers;
    final /* synthetic */ jh0 $asyncUpdates;
    final /* synthetic */ Rect $bounds;
    final /* synthetic */ boolean $clipTextToBoundingBox;
    final /* synthetic */ boolean $clipToCompositionBounds;
    final /* synthetic */ uh8 $composition;
    final /* synthetic */ bn2 $contentScale;
    final /* synthetic */ Context $context;
    final /* synthetic */ oi8 $drawable;
    final /* synthetic */ pi8 $dynamicProperties;
    final /* synthetic */ boolean $enableMergePaths;
    final /* synthetic */ Map<String, Typeface> $fontMap;
    final /* synthetic */ boolean $maintainOriginalImageBounds;
    final /* synthetic */ Matrix $matrix;
    final /* synthetic */ boolean $outlineMasksAndMattes;
    final /* synthetic */ x16 $progress;
    final /* synthetic */ rqb $renderMode;
    final /* synthetic */ boolean $safeMode;
    final /* synthetic */ e89 $setDynamicProperties$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jh8(Rect rect, bn2 bn2Var, yi yiVar, Matrix matrix, oi8 oi8Var, boolean z, boolean z2, rqb rqbVar, jh0 jh0Var, uh8 uh8Var, Map map, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Context context, x16 x16Var, e89 e89Var) {
        super(1);
        this.$bounds = rect;
        this.$contentScale = bn2Var;
        this.$alignment = yiVar;
        this.$matrix = matrix;
        this.$drawable = oi8Var;
        this.$enableMergePaths = z;
        this.$safeMode = z2;
        this.$renderMode = rqbVar;
        this.$asyncUpdates = jh0Var;
        this.$composition = uh8Var;
        this.$fontMap = map;
        this.$outlineMasksAndMattes = z3;
        this.$applyOpacityToLayers = z4;
        this.$applyShadowToLayers = z5;
        this.$maintainOriginalImageBounds = z6;
        this.$clipToCompositionBounds = z7;
        this.$clipTextToBoundingBox = z8;
        this.$context = context;
        this.$progress = x16Var;
        this.$setDynamicProperties$delegate = e89Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        boolean zRemove;
        sn4 sn4Var = (sn4) obj;
        sn4Var.getClass();
        Rect rect = this.$bounds;
        bn2 bn2Var = this.$contentScale;
        yi yiVar = this.$alignment;
        Matrix matrix = this.$matrix;
        oi8 oi8Var = this.$drawable;
        boolean z = this.$enableMergePaths;
        boolean z2 = this.$safeMode;
        rqb rqbVar = this.$renderMode;
        jh0 jh0Var = this.$asyncUpdates;
        uh8 uh8Var = this.$composition;
        Map<String, Typeface> map = this.$fontMap;
        boolean z3 = this.$outlineMasksAndMattes;
        boolean z4 = this.$applyOpacityToLayers;
        boolean z5 = this.$applyShadowToLayers;
        boolean z6 = this.$maintainOriginalImageBounds;
        boolean z7 = this.$clipToCompositionBounds;
        boolean z8 = this.$clipTextToBoundingBox;
        Context context = this.$context;
        x16 x16Var = this.$progress;
        e89 e89Var = this.$setDynamicProperties$delegate;
        vl1 vl1VarP = sn4Var.v0().p();
        long jA = dec.a(rect.width(), rect.height());
        long j = db6.j(ym8.L(ald.d(sn4Var.f())), ym8.L(ald.b(sn4Var.f())));
        long jK = bn2Var.k(jA, sn4Var.f());
        float fD = ald.d(jA);
        int i = cec.a;
        int i2 = (int) (jK >> 32);
        int i3 = (int) (jK & 4294967295L);
        long jA2 = yiVar.a(db6.j((int) (Float.intBitsToFloat(i2) * fD), (int) (Float.intBitsToFloat(i3) * ald.b(jA))), j, sn4Var.getLayoutDirection());
        matrix.reset();
        matrix.preTranslate((int) (jA2 >> 32), (int) (jA2 & 4294967295L));
        matrix.preScale(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
        kd9 kd9Var = oi8Var.w;
        xi8 xi8Var = oi8Var.b;
        HashSet hashSet = (HashSet) kd9Var.b;
        qi8 qi8Var = qi8.MergePathsApi19;
        if (z) {
            int i4 = Build.VERSION.SDK_INT;
            int i5 = qi8Var.minRequiredSdkVersion;
            if (i4 < i5) {
                gf8.b(String.format("%s is not supported pre SDK %d", "MergePathsApi19", Integer.valueOf(i5)));
                zRemove = false;
            } else {
                zRemove = hashSet.add(qi8Var);
            }
        } else {
            zRemove = hashSet.remove(qi8Var);
        }
        if (oi8Var.a != null && zRemove) {
            oi8Var.b();
        }
        oi8Var.d = z2;
        oi8Var.G0 = rqbVar;
        oi8Var.c();
        oi8Var.W0 = jh0Var;
        ArrayList arrayList = oi8Var.e;
        if (oi8Var.a != uh8Var) {
            oi8Var.V0 = true;
            if (xi8Var.X) {
                xi8Var.cancel();
                if (!oi8Var.isVisible()) {
                    oi8Var.a1 = 1;
                }
            }
            oi8Var.a = null;
            oi8Var.z = null;
            oi8Var.f = null;
            oi8Var.Z0 = -3.4028235E38f;
            xi8Var.z = null;
            xi8Var.x = -2.1474836E9f;
            xi8Var.y = 2.1474836E9f;
            oi8Var.invalidateSelf();
            oi8Var.a = uh8Var;
            oi8Var.b();
            boolean z9 = xi8Var.z == null;
            xi8Var.z = uh8Var;
            if (z9) {
                xi8Var.i(Math.max(xi8Var.x, uh8Var.l), Math.min(xi8Var.y, uh8Var.m));
            } else {
                xi8Var.i((int) uh8Var.l, (int) uh8Var.m);
            }
            float f = xi8Var.v;
            xi8Var.v = 0.0f;
            xi8Var.g = 0.0f;
            xi8Var.h((int) f);
            xi8Var.f();
            oi8Var.m(xi8Var.getAnimatedFraction());
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                ni8 ni8Var = (ni8) it.next();
                if (ni8Var != null) {
                    ni8Var.run();
                }
                it.remove();
            }
            arrayList.clear();
            oi8Var.c();
            Drawable.Callback callback = oi8Var.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(oi8Var);
            }
        }
        if (map != oi8Var.v) {
            oi8Var.v = map;
            oi8Var.invalidateSelf();
        }
        if (e89Var.getValue() != null) {
            r3.f();
            return null;
        }
        if (oi8Var.Y != z3) {
            oi8Var.Y = z3;
            sg2 sg2Var = oi8Var.z;
            if (sg2Var != null) {
                sg2Var.m(z3);
            }
        }
        oi8Var.Z = z4;
        oi8Var.E0 = z5;
        oi8Var.x = z6;
        if (z7 != oi8Var.y) {
            oi8Var.y = z7;
            sg2 sg2Var2 = oi8Var.z;
            if (sg2Var2 != null) {
                sg2Var2.L = z7;
            }
            oi8Var.invalidateSelf();
        }
        if (z8 != oi8Var.F0) {
            oi8Var.F0 = z8;
            oi8Var.invalidateSelf();
        }
        km8 km8VarG = oi8Var.g();
        if (oi8Var.a(context) || km8VarG == null) {
            oi8Var.m(((Number) x16Var.invoke()).floatValue());
        } else {
            oi8Var.m(km8VarG.b);
        }
        oi8Var.setBounds(0, 0, rect.width(), rect.height());
        Canvas canvasB = mp.b(vl1VarP);
        m45 m45Var = oi8Var.Y0;
        ThreadPoolExecutor threadPoolExecutor = oi8.c1;
        Semaphore semaphore = oi8Var.X0;
        sg2 sg2Var3 = oi8Var.z;
        uh8 uh8Var2 = oi8Var.a;
        if (sg2Var3 != null && uh8Var2 != null) {
            jh0 jh0Var2 = oi8Var.W0;
            if (jh0Var2 == null) {
                jh0Var2 = jh0.a;
            }
            boolean z10 = jh0Var2 == jh0.b;
            if (z10) {
                try {
                    semaphore.acquire();
                    if (oi8Var.n()) {
                        oi8Var.m(xi8Var.a());
                    }
                } catch (InterruptedException unused) {
                    if (z10) {
                        semaphore.release();
                        if (sg2Var3.K != xi8Var.a()) {
                        }
                    }
                    return wef.a;
                } catch (Throwable th) {
                    if (z10) {
                        semaphore.release();
                        if (sg2Var3.K != xi8Var.a()) {
                            threadPoolExecutor.execute(m45Var);
                        }
                    }
                    throw th;
                }
            }
            boolean z11 = oi8Var.d;
            int i6 = oi8Var.X;
            boolean z12 = oi8Var.H0;
            if (z11) {
                try {
                    if (z12) {
                        canvasB.save();
                        canvasB.concat(matrix);
                        oi8Var.j(canvasB, sg2Var3);
                        canvasB.restore();
                    } else {
                        sg2Var3.f(canvasB, matrix, i6, null);
                    }
                } catch (Throwable unused2) {
                    gf8.a.getClass();
                }
            } else if (z12) {
                canvasB.save();
                canvasB.concat(matrix);
                oi8Var.j(canvasB, sg2Var3);
                canvasB.restore();
            } else {
                sg2Var3.f(canvasB, matrix, i6, null);
            }
            oi8Var.V0 = false;
            if (z10) {
                semaphore.release();
                if (sg2Var3.K != xi8Var.a()) {
                    threadPoolExecutor.execute(m45Var);
                }
            }
        }
        return wef.a;
    }
}
