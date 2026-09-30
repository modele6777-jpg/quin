package com.canhub.cropper;

import ai.askquin.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import defpackage.ga4;
import defpackage.gbb;
import defpackage.hz2;
import defpackage.ib8;
import defpackage.jz0;
import defpackage.jz2;
import defpackage.kz0;
import defpackage.kz2;
import defpackage.lz2;
import defpackage.mz2;
import defpackage.nz2;
import defpackage.oz2;
import defpackage.pa7;
import defpackage.pz2;
import defpackage.qz2;
import defpackage.rz2;
import defpackage.sz0;
import defpackage.sz2;
import defpackage.tz2;
import defpackage.uz2;
import defpackage.vz0;
import defpackage.vz2;
import defpackage.xz2;
import defpackage.ynb;
import io.sentry.android.core.b1;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class CropImageView extends FrameLayout implements uz2 {
    public boolean E0;
    public int F0;
    public int G0;
    public int H0;
    public tz2 I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public String M0;
    public float N0;
    public int O0;
    public boolean P0;
    public boolean Q0;
    public int R0;
    public rz2 S0;
    public nz2 T0;
    public Uri U0;
    public int V0;
    public float W0;
    public float X0;
    public float Y0;
    public RectF Z0;
    public final ImageView a;
    public int a1;
    public final CropOverlayView b;
    public boolean b1;
    public final Matrix c;
    public WeakReference c1;
    public final Matrix d;
    public WeakReference d1;
    public final ProgressBar e;
    public Uri e1;
    public final float[] f;
    public final float[] g;
    public hz2 v;
    public Bitmap w;
    public int x;
    public int y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:17:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x0250  */
    /* JADX WARN: Code duplicated, block: B:34:0x0272  */
    public CropImageView(Context context, AttributeSet attributeSet) {
        jz2 jz2Var;
        TypedArray typedArrayObtainStyledAttributes;
        jz2 jz2Var2;
        boolean z;
        Intent intent;
        Bundle bundleExtra;
        super(context, attributeSet);
        context.getClass();
        this.c = new Matrix();
        this.d = new Matrix();
        this.f = new float[8];
        this.g = new float[8];
        this.K0 = true;
        this.M0 = "";
        this.N0 = 20.0f;
        this.O0 = -1;
        this.P0 = true;
        this.Q0 = true;
        this.V0 = 1;
        this.W0 = 1.0f;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (intent = activity.getIntent()) != null && (bundleExtra = intent.getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE")) != null) {
            Parcelable parcelable = bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
            jz2Var = (jz2) (parcelable instanceof jz2 ? parcelable : null);
            if (jz2Var == null) {
                if (attributeSet != null) {
                    typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gbb.a, 0, 0);
                    typedArrayObtainStyledAttributes.getClass();
                    jz2Var2 = new jz2(null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 0.0f, 0, null, -1, -1, 63);
                    this.J0 = typedArrayObtainStyledAttributes.getBoolean(29, this.J0);
                    tz2 tz2Var = (tz2) tz2.e.get(typedArrayObtainStyledAttributes.getInt(30, jz2Var2.w.ordinal()));
                    lz2 lz2Var = (lz2) lz2.c.get(typedArrayObtainStyledAttributes.getInt(31, jz2Var2.c.ordinal()));
                    kz2 kz2Var = (kz2) kz2.d.get(typedArrayObtainStyledAttributes.getInt(0, jz2Var2.d.ordinal()));
                    mz2 mz2Var = (mz2) mz2.d.get(typedArrayObtainStyledAttributes.getInt(17, jz2Var2.v.ordinal()));
                    int integer = typedArrayObtainStyledAttributes.getInteger(1, jz2Var2.J0);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(2, jz2Var2.K0);
                    boolean z2 = typedArrayObtainStyledAttributes.getBoolean(3, jz2Var2.Y);
                    boolean z3 = typedArrayObtainStyledAttributes.getBoolean(28, jz2Var2.Z);
                    boolean z4 = typedArrayObtainStyledAttributes.getBoolean(11, jz2Var2.E0);
                    float dimension = typedArrayObtainStyledAttributes.getDimension(13, jz2Var2.e);
                    float dimension2 = typedArrayObtainStyledAttributes.getDimension(35, jz2Var2.f);
                    float dimension3 = typedArrayObtainStyledAttributes.getDimension(36, jz2Var2.g);
                    float f = typedArrayObtainStyledAttributes.getFloat(20, jz2Var2.H0);
                    int integer3 = typedArrayObtainStyledAttributes.getInteger(12, jz2Var2.R0);
                    float dimension4 = typedArrayObtainStyledAttributes.getDimension(10, jz2Var2.L0);
                    int integer4 = typedArrayObtainStyledAttributes.getInteger(9, jz2Var2.M0);
                    float dimension5 = typedArrayObtainStyledAttributes.getDimension(8, jz2Var2.N0);
                    float dimension6 = typedArrayObtainStyledAttributes.getDimension(7, jz2Var2.O0);
                    float dimension7 = typedArrayObtainStyledAttributes.getDimension(6, jz2Var2.P0);
                    int integer5 = typedArrayObtainStyledAttributes.getInteger(5, jz2Var2.Q0);
                    float dimension8 = typedArrayObtainStyledAttributes.getDimension(19, jz2Var2.S0);
                    int integer6 = typedArrayObtainStyledAttributes.getInteger(18, jz2Var2.T0);
                    int integer7 = typedArrayObtainStyledAttributes.getInteger(4, jz2Var2.U0);
                    int dimension9 = (int) typedArrayObtainStyledAttributes.getDimension(27, jz2Var2.V0);
                    int dimension10 = (int) typedArrayObtainStyledAttributes.getDimension(26, jz2Var2.W0);
                    int i = (int) typedArrayObtainStyledAttributes.getFloat(25, jz2Var2.X0);
                    int i2 = (int) typedArrayObtainStyledAttributes.getFloat(24, jz2Var2.Y0);
                    int i3 = (int) typedArrayObtainStyledAttributes.getFloat(22, jz2Var2.Z0);
                    int i4 = (int) typedArrayObtainStyledAttributes.getFloat(21, jz2Var2.a1);
                    boolean z5 = typedArrayObtainStyledAttributes.getBoolean(15, jz2Var2.r1);
                    boolean z6 = typedArrayObtainStyledAttributes.getBoolean(15, jz2Var2.s1);
                    float dimension11 = typedArrayObtainStyledAttributes.getDimension(39, jz2Var2.z1);
                    int integer8 = typedArrayObtainStyledAttributes.getInteger(38, jz2Var2.A1);
                    boolean z7 = typedArrayObtainStyledAttributes.getBoolean(33, jz2Var2.y);
                    int integer9 = typedArrayObtainStyledAttributes.getInteger(23, jz2Var2.G0);
                    boolean z8 = typedArrayObtainStyledAttributes.getBoolean(32, jz2Var2.x);
                    boolean z9 = typedArrayObtainStyledAttributes.getBoolean(34, jz2Var2.z);
                    String string = typedArrayObtainStyledAttributes.getString(37);
                    if (typedArrayObtainStyledAttributes.getBoolean(14, jz2Var2.I0)) {
                        z = true;
                    } else {
                        z = true;
                    }
                    jz2 jz2Var3 = new jz2(lz2Var, kz2Var, dimension, dimension2, dimension3, mz2Var, tz2Var, z8, z7, z9, z2, z3, z4, integer9, f, z, integer, integer2, dimension4, integer4, dimension5, dimension6, dimension7, integer5, integer3, dimension8, integer6, integer7, dimension9, dimension10, i, i2, i3, i4, z5, z6, dimension11, integer8, string, 69635, 1061158848, 62);
                    typedArrayObtainStyledAttributes.recycle();
                    jz2Var = jz2Var3;
                } else {
                    jz2Var = new jz2(null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 0.0f, 0, null, -1, -1, 63);
                }
            }
        } else if (attributeSet != null) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gbb.a, 0, 0);
            typedArrayObtainStyledAttributes.getClass();
            jz2Var2 = new jz2(null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 0.0f, 0, null, -1, -1, 63);
            try {
                this.J0 = typedArrayObtainStyledAttributes.getBoolean(29, this.J0);
                tz2 tz2Var2 = (tz2) tz2.e.get(typedArrayObtainStyledAttributes.getInt(30, jz2Var2.w.ordinal()));
                lz2 lz2Var2 = (lz2) lz2.c.get(typedArrayObtainStyledAttributes.getInt(31, jz2Var2.c.ordinal()));
                kz2 kz2Var2 = (kz2) kz2.d.get(typedArrayObtainStyledAttributes.getInt(0, jz2Var2.d.ordinal()));
                mz2 mz2Var2 = (mz2) mz2.d.get(typedArrayObtainStyledAttributes.getInt(17, jz2Var2.v.ordinal()));
                int integer10 = typedArrayObtainStyledAttributes.getInteger(1, jz2Var2.J0);
                int integer11 = typedArrayObtainStyledAttributes.getInteger(2, jz2Var2.K0);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(3, jz2Var2.Y);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(28, jz2Var2.Z);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(11, jz2Var2.E0);
                float dimension12 = typedArrayObtainStyledAttributes.getDimension(13, jz2Var2.e);
                float dimension13 = typedArrayObtainStyledAttributes.getDimension(35, jz2Var2.f);
                float dimension14 = typedArrayObtainStyledAttributes.getDimension(36, jz2Var2.g);
                float f2 = typedArrayObtainStyledAttributes.getFloat(20, jz2Var2.H0);
                int integer12 = typedArrayObtainStyledAttributes.getInteger(12, jz2Var2.R0);
                float dimension15 = typedArrayObtainStyledAttributes.getDimension(10, jz2Var2.L0);
                int integer13 = typedArrayObtainStyledAttributes.getInteger(9, jz2Var2.M0);
                float dimension16 = typedArrayObtainStyledAttributes.getDimension(8, jz2Var2.N0);
                float dimension17 = typedArrayObtainStyledAttributes.getDimension(7, jz2Var2.O0);
                float dimension18 = typedArrayObtainStyledAttributes.getDimension(6, jz2Var2.P0);
                int integer14 = typedArrayObtainStyledAttributes.getInteger(5, jz2Var2.Q0);
                float dimension19 = typedArrayObtainStyledAttributes.getDimension(19, jz2Var2.S0);
                int integer15 = typedArrayObtainStyledAttributes.getInteger(18, jz2Var2.T0);
                int integer16 = typedArrayObtainStyledAttributes.getInteger(4, jz2Var2.U0);
                int dimension20 = (int) typedArrayObtainStyledAttributes.getDimension(27, jz2Var2.V0);
                int dimension110 = (int) typedArrayObtainStyledAttributes.getDimension(26, jz2Var2.W0);
                int i5 = (int) typedArrayObtainStyledAttributes.getFloat(25, jz2Var2.X0);
                int i6 = (int) typedArrayObtainStyledAttributes.getFloat(24, jz2Var2.Y0);
                int i7 = (int) typedArrayObtainStyledAttributes.getFloat(22, jz2Var2.Z0);
                int i8 = (int) typedArrayObtainStyledAttributes.getFloat(21, jz2Var2.a1);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(15, jz2Var2.r1);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(15, jz2Var2.s1);
                float dimension111 = typedArrayObtainStyledAttributes.getDimension(39, jz2Var2.z1);
                int integer17 = typedArrayObtainStyledAttributes.getInteger(38, jz2Var2.A1);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(33, jz2Var2.y);
                int integer18 = typedArrayObtainStyledAttributes.getInteger(23, jz2Var2.G0);
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(32, jz2Var2.x);
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(34, jz2Var2.z);
                String string2 = typedArrayObtainStyledAttributes.getString(37);
                if (typedArrayObtainStyledAttributes.getBoolean(14, jz2Var2.I0) || (typedArrayObtainStyledAttributes.hasValue(1) && typedArrayObtainStyledAttributes.hasValue(1))) {
                    z = true;
                } else {
                    z = false;
                }
                jz2 jz2Var4 = new jz2(lz2Var2, kz2Var2, dimension12, dimension13, dimension14, mz2Var2, tz2Var2, z16, z15, z17, z10, z11, z12, integer18, f2, z, integer10, integer11, dimension15, integer13, dimension16, dimension17, dimension18, integer14, integer12, dimension19, integer15, integer16, dimension20, dimension110, i5, i6, i7, i8, z13, z14, dimension111, integer17, string2, 69635, 1061158848, 62);
                typedArrayObtainStyledAttributes.recycle();
                jz2Var = jz2Var4;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            jz2Var = new jz2(null, null, 0.0f, 0.0f, 0.0f, null, null, false, false, false, false, false, false, 0, 0.0f, false, 0, 0, 0.0f, 0, 0.0f, 0.0f, 0.0f, 0, 0, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, false, 0.0f, 0, null, -1, -1, 63);
        }
        this.I0 = jz2Var.w;
        this.Q0 = jz2Var.Y;
        this.R0 = jz2Var.G0;
        this.N0 = jz2Var.z1;
        this.L0 = jz2Var.y;
        this.K0 = jz2Var.x;
        this.P0 = jz2Var.z;
        this.z = jz2Var.r1;
        this.E0 = jz2Var.s1;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.crop_image_view, (ViewGroup) this, true);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.ImageView_image);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        CropOverlayView cropOverlayView = (CropOverlayView) viewInflate.findViewById(R.id.CropOverlayView);
        this.b = cropOverlayView;
        cropOverlayView.setCropWindowChangeListener(this);
        cropOverlayView.setInitialAttributeValues(jz2Var);
        ProgressBar progressBar = (ProgressBar) viewInflate.findViewById(R.id.CropProgressBar);
        this.e = progressBar;
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(jz2Var.X));
        h();
    }

    public final void a(float f, float f2, boolean z, boolean z2) {
        Bitmap bitmap = this.w;
        if (bitmap != null) {
            float fMin = 0.0f;
            if (f <= 0.0f || f2 <= 0.0f) {
                return;
            }
            Matrix matrix = this.c;
            Matrix matrix2 = this.d;
            matrix.invert(matrix2);
            CropOverlayView cropOverlayView = this.b;
            cropOverlayView.getClass();
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            matrix2.mapRect(cropWindowRect);
            matrix.reset();
            matrix.postTranslate((f - bitmap.getWidth()) / 2.0f, (f2 - bitmap.getHeight()) / 2.0f);
            d();
            int i = this.y;
            float[] fArr = this.f;
            if (i > 0) {
                Rect rect = vz0.a;
                fArr.getClass();
                matrix.postRotate(i, (vz0.n(fArr) + vz0.o(fArr)) / 2.0f, (vz0.p(fArr) + vz0.l(fArr)) / 2.0f);
                d();
            }
            Rect rect2 = vz0.a;
            fArr.getClass();
            float fMin2 = Math.min(f / (vz0.o(fArr) - vz0.n(fArr)), f2 / (vz0.l(fArr) - vz0.p(fArr)));
            tz2 tz2Var = this.I0;
            tz2 tz2Var2 = tz2.a;
            tz2 tz2Var3 = tz2.b;
            if (tz2Var == tz2Var2 || ((tz2Var == tz2.c && fMin2 < 1.0f) || (fMin2 > 1.0f && this.Q0))) {
                matrix.postScale(fMin2, fMin2, (vz0.n(fArr) + vz0.o(fArr)) / 2.0f, (vz0.p(fArr) + vz0.l(fArr)) / 2.0f);
                d();
            } else if (tz2Var == tz2Var3) {
                this.W0 = Math.max(getWidth() / (vz0.o(fArr) - vz0.n(fArr)), getHeight() / (vz0.l(fArr) - vz0.p(fArr)));
            }
            boolean z3 = this.z;
            float f3 = this.W0;
            float f4 = z3 ? -f3 : f3;
            if (this.E0) {
                f3 = -f3;
            }
            matrix.postScale(f4, f3, (vz0.n(fArr) + vz0.o(fArr)) / 2.0f, (vz0.p(fArr) + vz0.l(fArr)) / 2.0f);
            d();
            matrix.mapRect(cropWindowRect);
            if (this.I0 == tz2Var3 && z && !z2) {
                this.X0 = 0.0f;
                this.Y0 = 0.0f;
            } else if (z) {
                this.X0 = f > vz0.o(fArr) - vz0.n(fArr) ? 0.0f : Math.max(Math.min((f / 2.0f) - cropWindowRect.centerX(), -vz0.n(fArr)), getWidth() - vz0.o(fArr)) / f4;
                fMin = f2 <= vz0.l(fArr) - vz0.p(fArr) ? Math.max(Math.min((f2 / 2.0f) - cropWindowRect.centerY(), -vz0.p(fArr)), getHeight() - vz0.l(fArr)) / f3 : 0.0f;
                this.Y0 = fMin;
            } else {
                this.X0 = Math.min(Math.max(this.X0 * f4, -cropWindowRect.left), (-cropWindowRect.right) + f) / f4;
                fMin = Math.min(Math.max(this.Y0 * f3, -cropWindowRect.top), (-cropWindowRect.bottom) + f2) / f3;
                this.Y0 = fMin;
            }
            matrix.postTranslate(this.X0 * f4, fMin * f3);
            cropWindowRect.offset(this.X0 * f4, this.Y0 * f3);
            cropOverlayView.setCropWindowRect(cropWindowRect);
            d();
            cropOverlayView.invalidate();
            ImageView imageView = this.a;
            if (z2) {
                hz2 hz2Var = this.v;
                hz2Var.getClass();
                System.arraycopy(fArr, 0, hz2Var.d, 0, 8);
                hz2Var.f.set(hz2Var.b.getCropWindowRect());
                matrix.getValues(hz2Var.v);
                imageView.startAnimation(this.v);
            } else {
                imageView.setImageMatrix(matrix);
            }
            i(false);
        }
    }

    public final void b() {
        Bitmap bitmap = this.w;
        if (bitmap != null && (this.H0 > 0 || this.U0 != null)) {
            bitmap.getClass();
            bitmap.recycle();
        }
        this.w = null;
        this.H0 = 0;
        this.U0 = null;
        this.V0 = 1;
        this.y = 0;
        this.W0 = 1.0f;
        this.X0 = 0.0f;
        this.Y0 = 0.0f;
        this.c.reset();
        this.Z0 = null;
        this.a1 = 0;
        this.a.setImageBitmap(null);
        g();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    public final void c(boolean z, boolean z2) {
        float fMax;
        int width = getWidth();
        int height = getHeight();
        if (this.w == null || width <= 0 || height <= 0) {
            return;
        }
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        RectF cropWindowRect = cropOverlayView.getCropWindowRect();
        if (z) {
            if (cropWindowRect.left < 0.0f || cropWindowRect.top < 0.0f || cropWindowRect.right > width || cropWindowRect.bottom > height) {
                a(width, height, false, false);
                return;
            }
            return;
        }
        if (this.Q0 || this.W0 > 1.0f) {
            if (this.W0 < this.R0) {
                float f = width;
                if (cropWindowRect.width() < f * 0.5f) {
                    float f2 = height;
                    if (cropWindowRect.height() < 0.5f * f2) {
                        fMax = Math.min(this.R0, Math.min(f / ((cropWindowRect.width() / this.W0) / 0.64f), f2 / ((cropWindowRect.height() / this.W0) / 0.64f)));
                    } else {
                        fMax = 0.0f;
                    }
                } else {
                    fMax = 0.0f;
                }
            } else {
                fMax = 0.0f;
            }
            if (this.W0 > 1.0f) {
                float f3 = width;
                if (cropWindowRect.width() > f3 * 0.65f || cropWindowRect.height() > height * 0.65f) {
                    fMax = Math.max(1.0f, Math.min(f3 / ((cropWindowRect.width() / this.W0) / 0.51f), height / ((cropWindowRect.height() / this.W0) / 0.51f)));
                }
            }
            float f4 = this.Q0 ? fMax : 1.0f;
            if (f4 <= 0.0f || f4 == this.W0) {
                return;
            }
            if (z2) {
                hz2 hz2Var = this.v;
                if (hz2Var == null) {
                    hz2Var = new hz2(this.a, cropOverlayView);
                    this.v = hz2Var;
                }
                float[] fArr = this.f;
                fArr.getClass();
                Matrix matrix = this.c;
                matrix.getClass();
                hz2Var.reset();
                System.arraycopy(fArr, 0, hz2Var.c, 0, 8);
                hz2Var.e.set(hz2Var.b.getCropWindowRect());
                matrix.getValues(hz2Var.g);
            }
            this.W0 = f4;
            a(width, height, true, z2);
        }
    }

    public final void d() {
        float[] fArr = this.f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Bitmap bitmap = this.w;
        bitmap.getClass();
        fArr[2] = bitmap.getWidth();
        fArr[3] = 0.0f;
        Bitmap bitmap2 = this.w;
        bitmap2.getClass();
        fArr[4] = bitmap2.getWidth();
        Bitmap bitmap3 = this.w;
        bitmap3.getClass();
        fArr[5] = bitmap3.getHeight();
        fArr[6] = 0.0f;
        Bitmap bitmap4 = this.w;
        bitmap4.getClass();
        fArr[7] = bitmap4.getHeight();
        Matrix matrix = this.c;
        matrix.mapPoints(fArr);
        float[] fArr2 = this.g;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 100.0f;
        fArr2[3] = 0.0f;
        fArr2[4] = 100.0f;
        fArr2[5] = 100.0f;
        fArr2[6] = 0.0f;
        fArr2[7] = 100.0f;
        matrix.mapPoints(fArr2);
    }

    public final void e(int i) {
        if (this.w != null) {
            int i2 = i < 0 ? (i % 360) + 360 : i % 360;
            CropOverlayView cropOverlayView = this.b;
            cropOverlayView.getClass();
            boolean z = !cropOverlayView.S0 && ((46 <= i2 && i2 < 135) || (216 <= i2 && i2 < 305));
            RectF rectF = vz0.c;
            rectF.set(cropOverlayView.getCropWindowRect());
            float fHeight = (z ? rectF.height() : rectF.width()) / 2.0f;
            float fWidth = (z ? rectF.width() : rectF.height()) / 2.0f;
            if (z) {
                boolean z2 = this.z;
                this.z = this.E0;
                this.E0 = z2;
            }
            Matrix matrix = this.c;
            Matrix matrix2 = this.d;
            matrix.invert(matrix2);
            float[] fArr = vz0.d;
            fArr[0] = rectF.centerX();
            fArr[1] = rectF.centerY();
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            matrix2.mapPoints(fArr);
            this.y = (this.y + i2) % 360;
            a(getWidth(), getHeight(), true, false);
            float[] fArr2 = vz0.e;
            matrix.mapPoints(fArr2, fArr);
            float fSqrt = this.W0 / ((float) Math.sqrt(Math.pow(fArr2[5] - fArr2[3], 2.0d) + Math.pow(fArr2[4] - fArr2[2], 2.0d)));
            this.W0 = fSqrt;
            this.W0 = Math.max(fSqrt, 1.0f);
            a(getWidth(), getHeight(), true, false);
            matrix.mapPoints(fArr2, fArr);
            float fSqrt2 = (float) Math.sqrt(Math.pow(fArr2[5] - fArr2[3], 2.0d) + Math.pow(fArr2[4] - fArr2[2], 2.0d));
            float f = fHeight * fSqrt2;
            float f2 = fWidth * fSqrt2;
            float f3 = fArr2[0];
            float f4 = fArr2[1];
            rectF.set(f3 - f, f4 - f2, f3 + f, f4 + f2);
            cropOverlayView.g();
            cropOverlayView.setCropWindowRect(rectF);
            a(getWidth(), getHeight(), true, false);
            c(false, false);
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            cropOverlayView.e(cropWindowRect);
            xz2 xz2Var = cropOverlayView.g;
            xz2Var.getClass();
            xz2Var.a.set(cropWindowRect);
        }
    }

    public final void f(Bitmap bitmap, int i, Uri uri, int i2, int i3) {
        Bitmap bitmap2 = this.w;
        if (bitmap2 == null || !pa7.t(bitmap2, bitmap)) {
            b();
            this.w = bitmap;
            this.a.setImageBitmap(bitmap);
            this.U0 = uri;
            this.H0 = i;
            this.V0 = i2;
            this.y = i3;
            a(getWidth(), getHeight(), true, false);
            CropOverlayView cropOverlayView = this.b;
            if (cropOverlayView != null) {
                cropOverlayView.g();
                g();
            }
        }
    }

    public final void g() {
        CropOverlayView cropOverlayView = this.b;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.K0 || this.w == null) ? 4 : 0);
        }
    }

    public final Pair<Integer, Integer> getAspectRatio() {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        return new Pair<>(Integer.valueOf(cropOverlayView.getAspectRatioX()), Integer.valueOf(cropOverlayView.getAspectRatioY()));
    }

    public final kz2 getCornerShape() {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        return cropOverlayView.getCornerShape();
    }

    public final String getCropLabelText() {
        return this.M0;
    }

    public final int getCropLabelTextColor() {
        return this.O0;
    }

    public final float getCropLabelTextSize() {
        return this.N0;
    }

    public final float[] getCropPoints() {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        RectF cropWindowRect = cropOverlayView.getCropWindowRect();
        float f = cropWindowRect.left;
        float f2 = cropWindowRect.top;
        float f3 = cropWindowRect.right;
        float f4 = cropWindowRect.bottom;
        float[] fArr = {f, f2, f3, f2, f3, f4, f, f4};
        Matrix matrix = this.c;
        Matrix matrix2 = this.d;
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr);
        float[] fArr2 = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr2[i] = fArr[i] * this.V0;
        }
        return fArr2;
    }

    public final Rect getCropRect() {
        int i = this.V0;
        Bitmap bitmap = this.w;
        if (bitmap == null) {
            return null;
        }
        float[] cropPoints = getCropPoints();
        int width = bitmap.getWidth() * i;
        int height = i * bitmap.getHeight();
        Rect rect = vz0.a;
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        return vz0.m(cropPoints, width, height, cropOverlayView.S0, cropOverlayView.getAspectRatioX(), cropOverlayView.getAspectRatioY());
    }

    public final lz2 getCropShape() {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        return cropOverlayView.getCropShape();
    }

    public final RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.b;
        if (cropOverlayView != null) {
            return cropOverlayView.getCropWindowRect();
        }
        return null;
    }

    public final Bitmap getCroppedImage() {
        sz0 sz0VarE;
        Rect rect = vz0.a;
        Bitmap bitmap = this.w;
        if (bitmap == null) {
            return null;
        }
        Uri uri = this.U0;
        CropOverlayView cropOverlayView = this.b;
        if (uri == null || this.V0 <= 1) {
            float[] cropPoints = getCropPoints();
            int i = this.y;
            cropOverlayView.getClass();
            sz0VarE = vz0.e(bitmap, cropPoints, i, cropOverlayView.S0, cropOverlayView.getAspectRatioX(), cropOverlayView.getAspectRatioY(), this.z, this.E0);
        } else {
            Context context = getContext();
            context.getClass();
            Uri uri2 = this.U0;
            float[] cropPoints2 = getCropPoints();
            int i2 = this.y;
            Bitmap bitmap2 = this.w;
            bitmap2.getClass();
            int width = bitmap2.getWidth() * this.V0;
            Bitmap bitmap3 = this.w;
            bitmap3.getClass();
            int height = bitmap3.getHeight() * this.V0;
            cropOverlayView.getClass();
            sz0VarE = vz0.c(context, uri2, cropPoints2, i2, width, height, cropOverlayView.S0, cropOverlayView.getAspectRatioX(), cropOverlayView.getAspectRatioY(), 0, 0, this.z, this.E0);
        }
        return vz0.q(sz0VarE.a, 0, 0, sz2.c);
    }

    public final Uri getCustomOutputUri() {
        return this.e1;
    }

    public final mz2 getGuidelines() {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        return cropOverlayView.getGuidelines();
    }

    public final int getImageResource() {
        return this.H0;
    }

    public final Uri getImageUri() {
        return this.U0;
    }

    public final int getMaxZoom() {
        return this.R0;
    }

    public final int getRotatedDegrees() {
        return this.y;
    }

    public final tz2 getScaleType() {
        return this.I0;
    }

    public final Rect getWholeImageRect() {
        int i = this.V0;
        Bitmap bitmap = this.w;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i, bitmap.getHeight() * i);
    }

    public final void h() {
        this.e.setVisibility(this.P0 && ((this.w == null && this.c1 != null) || this.d1 != null) ? 0 : 4);
    }

    public final void i(boolean z) {
        Bitmap bitmap = this.w;
        CropOverlayView cropOverlayView = this.b;
        if (bitmap != null && !z) {
            float f = this.V0 * 100.0f;
            Rect rect = vz0.a;
            float[] fArr = this.g;
            fArr.getClass();
            float fO = f / (vz0.o(fArr) - vz0.n(fArr));
            float fL = (this.V0 * 100.0f) / (vz0.l(fArr) - vz0.p(fArr));
            cropOverlayView.getClass();
            float width = getWidth();
            float height = getHeight();
            xz2 xz2Var = cropOverlayView.g;
            xz2Var.e = width;
            xz2Var.f = height;
            xz2Var.k = fO;
            xz2Var.l = fL;
        }
        cropOverlayView.getClass();
        cropOverlayView.h(getWidth(), getHeight(), z ? null : this.f);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.F0 <= 0 || this.G0 <= 0) {
            i(true);
            return;
        }
        if (this.w == null) {
            i(true);
            return;
        }
        float f = i3 - i;
        float f2 = i4 - i2;
        a(f, f2, true, false);
        RectF rectF = this.Z0;
        if (rectF == null) {
            if (this.b1) {
                this.b1 = false;
                c(false, false);
                return;
            }
            return;
        }
        int i5 = this.a1;
        if (i5 != this.x) {
            this.y = i5;
            a(f, f2, true, false);
            this.a1 = 0;
        }
        this.c.mapRect(this.Z0);
        CropOverlayView cropOverlayView = this.b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropWindowRect(rectF);
        }
        c(false, false);
        if (cropOverlayView != null) {
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            cropOverlayView.e(cropWindowRect);
            xz2 xz2Var = cropOverlayView.g;
            xz2Var.getClass();
            xz2Var.a.set(cropWindowRect);
        }
        this.Z0 = null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int width;
        int height;
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        Bitmap bitmap = this.w;
        if (bitmap == null) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (size2 == 0) {
            size2 = bitmap.getHeight();
        }
        double width2 = size < bitmap.getWidth() ? ((double) size) / ((double) bitmap.getWidth()) : Double.POSITIVE_INFINITY;
        double height2 = size2 < bitmap.getHeight() ? ((double) size2) / ((double) bitmap.getHeight()) : Double.POSITIVE_INFINITY;
        if (width2 == Double.POSITIVE_INFINITY && height2 == Double.POSITIVE_INFINITY) {
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        } else if (width2 <= height2) {
            height = (int) (((double) bitmap.getHeight()) * width2);
            width = size;
        } else {
            width = (int) (((double) bitmap.getWidth()) * height2);
            height = size2;
        }
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(width, size);
        } else if (mode != 1073741824) {
            size = width;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(height, size2);
        } else if (mode2 != 1073741824) {
            size2 = height;
        }
        this.F0 = size;
        this.G0 = size2;
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        CropImageView cropImageView;
        Bitmap bitmap;
        parcelable.getClass();
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        if (this.c1 == null && this.U0 == null && this.w == null && this.H0 == 0) {
            Bundle bundle = (Bundle) parcelable;
            Parcelable parcelable2 = bundle.getParcelable("LOADED_IMAGE_URI");
            if (!(parcelable2 instanceof Uri)) {
                parcelable2 = null;
            }
            Uri uri = (Uri) parcelable2;
            if (uri != null) {
                String string = bundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                if (string != null) {
                    Rect rect = vz0.a;
                    Pair pair = vz0.g;
                    if (pair != null) {
                        bitmap = pa7.t(pair.first, string) ? (Bitmap) ((WeakReference) pair.second).get() : null;
                    } else {
                        bitmap = null;
                    }
                    vz0.g = null;
                    if (bitmap == null || bitmap.isRecycled()) {
                        cropImageView = this;
                    } else {
                        cropImageView = this;
                        cropImageView.f(bitmap, 0, uri, bundle.getInt("LOADED_SAMPLE_SIZE"), 0);
                    }
                } else {
                    cropImageView = this;
                }
                if (cropImageView.U0 == null) {
                    cropImageView.setImageUriAsync(uri);
                }
            } else {
                cropImageView = this;
                int i = bundle.getInt("LOADED_IMAGE_RESOURCE");
                if (i > 0) {
                    cropImageView.setImageResource(i);
                } else {
                    Parcelable parcelable3 = bundle.getParcelable("LOADING_IMAGE_URI");
                    if (!(parcelable3 instanceof Uri)) {
                        parcelable3 = null;
                    }
                    Uri uri2 = (Uri) parcelable3;
                    if (uri2 != null) {
                        cropImageView.setImageUriAsync(uri2);
                    }
                }
            }
            int i2 = bundle.getInt("DEGREES_ROTATED");
            cropImageView.a1 = i2;
            cropImageView.y = i2;
            Parcelable parcelable4 = bundle.getParcelable("INITIAL_CROP_RECT");
            if (!(parcelable4 instanceof Rect)) {
                parcelable4 = null;
            }
            Rect rect2 = (Rect) parcelable4;
            CropOverlayView cropOverlayView = cropImageView.b;
            if (rect2 != null && (rect2.width() > 0 || rect2.height() > 0)) {
                cropOverlayView.getClass();
                cropOverlayView.setInitialCropWindowRect(rect2);
            }
            Parcelable parcelable5 = bundle.getParcelable("CROP_WINDOW_RECT");
            if (!(parcelable5 instanceof RectF)) {
                parcelable5 = null;
            }
            RectF rectF = (RectF) parcelable5;
            if (rectF != null && (rectF.width() > 0.0f || rectF.height() > 0.0f)) {
                cropImageView.Z0 = rectF;
            }
            cropOverlayView.getClass();
            String string2 = bundle.getString("CROP_SHAPE");
            string2.getClass();
            cropOverlayView.setCropShape(lz2.valueOf(string2));
            cropImageView.Q0 = bundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
            cropImageView.R0 = bundle.getInt("CROP_MAX_ZOOM");
            cropImageView.z = bundle.getBoolean("CROP_FLIP_HORIZONTALLY");
            cropImageView.E0 = bundle.getBoolean("CROP_FLIP_VERTICALLY");
            boolean z = bundle.getBoolean("SHOW_CROP_LABEL");
            cropImageView.L0 = z;
            cropOverlayView.setCropperTextLabelVisibility(z);
        } else {
            cropImageView = this;
        }
        Parcelable parcelable6 = ((Bundle) parcelable).getParcelable("instanceState");
        super.onRestoreInstanceState(parcelable6 != null ? parcelable6 : null);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Uri uriR;
        if (this.U0 == null && this.w == null && this.H0 < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        if (this.J0 && this.U0 == null && this.H0 < 1) {
            Rect rect = vz0.a;
            Context context = getContext();
            context.getClass();
            Bitmap bitmap = this.w;
            Uri uri = this.e1;
            try {
                bitmap.getClass();
                uriR = vz0.r(context, bitmap, Bitmap.CompressFormat.JPEG, 95, uri);
            } catch (Exception e) {
                b1.n("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", e);
                uriR = null;
            }
        } else {
            uriR = this.U0;
        }
        if (uriR != null && this.w != null) {
            String strI = ib8.i();
            Rect rect2 = vz0.a;
            vz0.g = new Pair(strI, new WeakReference(this.w));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", strI);
        }
        WeakReference weakReference = this.c1;
        kz0 kz0Var = weakReference != null ? (kz0) weakReference.get() : null;
        if (kz0Var != null) {
            bundle.putParcelable("LOADING_IMAGE_URI", kz0Var.b);
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uriR);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.H0);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.V0);
        bundle.putInt("DEGREES_ROTATED", this.y);
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        bundle.putParcelable("INITIAL_CROP_RECT", cropOverlayView.getInitialCropWindowRect());
        RectF rectF = vz0.c;
        rectF.set(cropOverlayView.getCropWindowRect());
        Matrix matrix = this.c;
        Matrix matrix2 = this.d;
        matrix.invert(matrix2);
        matrix2.mapRect(rectF);
        bundle.putParcelable("CROP_WINDOW_RECT", rectF);
        lz2 cropShape = cropOverlayView.getCropShape();
        cropShape.getClass();
        bundle.putString("CROP_SHAPE", cropShape.name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.Q0);
        bundle.putInt("CROP_MAX_ZOOM", this.R0);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.z);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.E0);
        bundle.putBoolean("SHOW_CROP_LABEL", this.L0);
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.b1 = i3 > 0 && i4 > 0;
    }

    public final void setAutoZoomEnabled(boolean z) {
        if (this.Q0 != z) {
            this.Q0 = z;
            c(false, false);
            CropOverlayView cropOverlayView = this.b;
            cropOverlayView.getClass();
            cropOverlayView.invalidate();
        }
    }

    public final void setCenterMoveEnabled(boolean z) {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        if (cropOverlayView.f != z) {
            cropOverlayView.f = z;
            c(false, false);
            cropOverlayView.invalidate();
        }
    }

    public final void setCornerShape(kz2 kz2Var) {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        kz2Var.getClass();
        cropOverlayView.setCropCornerShape(kz2Var);
    }

    public final void setCropLabelText(String str) {
        str.getClass();
        this.M0 = str;
        CropOverlayView cropOverlayView = this.b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelText(str);
        }
    }

    public final void setCropLabelTextColor(int i) {
        this.O0 = i;
        CropOverlayView cropOverlayView = this.b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextColor(i);
        }
    }

    public final void setCropLabelTextSize(float f) {
        this.N0 = getCropLabelTextSize();
        CropOverlayView cropOverlayView = this.b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextSize(f);
        }
    }

    public final void setCropRect(Rect rect) {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        cropOverlayView.setInitialCropWindowRect(rect);
    }

    public final void setCropShape(lz2 lz2Var) {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        lz2Var.getClass();
        cropOverlayView.setCropShape(lz2Var);
    }

    public final void setCustomOutputUri(Uri uri) {
        this.e1 = uri;
    }

    public final void setFixedAspectRatio(boolean z) {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        cropOverlayView.setFixedAspectRatio(z);
    }

    public final void setFlippedHorizontally(boolean z) {
        if (this.z != z) {
            this.z = z;
            a(getWidth(), getHeight(), true, false);
        }
    }

    public final void setFlippedVertically(boolean z) {
        if (this.E0 != z) {
            this.E0 = z;
            a(getWidth(), getHeight(), true, false);
        }
    }

    public final void setGuidelines(mz2 mz2Var) {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        mz2Var.getClass();
        cropOverlayView.setGuidelines(mz2Var);
    }

    public final void setImageBitmap(Bitmap bitmap) {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        cropOverlayView.setInitialCropWindowRect(null);
        f(bitmap, 0, null, 1, 0);
    }

    public final void setImageCropOptions(jz2 jz2Var) {
        jz2Var.getClass();
        boolean z = jz2Var.Y;
        boolean z2 = jz2Var.z;
        boolean z3 = jz2Var.x;
        setScaleType(jz2Var.w);
        this.e1 = jz2Var.e1;
        CropOverlayView cropOverlayView = this.b;
        if (cropOverlayView != null) {
            cropOverlayView.setInitialAttributeValues(jz2Var);
        }
        setMultiTouchEnabled(jz2Var.Z);
        setCenterMoveEnabled(jz2Var.E0);
        setShowCropOverlay(z3);
        setShowProgressBar(z2);
        setAutoZoomEnabled(z);
        setMaxZoom(jz2Var.G0);
        setFlippedHorizontally(jz2Var.r1);
        setFlippedVertically(jz2Var.s1);
        this.Q0 = z;
        this.K0 = z3;
        this.P0 = z2;
        this.e.setIndeterminateTintList(ColorStateList.valueOf(jz2Var.X));
    }

    public final void setImageResource(int i) {
        if (i != 0) {
            CropOverlayView cropOverlayView = this.b;
            cropOverlayView.getClass();
            cropOverlayView.setInitialCropWindowRect(null);
            f(BitmapFactory.decodeResource(getResources(), i), i, null, 1, 0);
        }
    }

    public final void setImageUriAsync(Uri uri) {
        kz0 kz0Var;
        if (uri != null) {
            WeakReference weakReference = this.c1;
            if (weakReference != null && (kz0Var = (kz0) weakReference.get()) != null) {
                kz0Var.f.h(null);
            }
            b();
            CropOverlayView cropOverlayView = this.b;
            cropOverlayView.getClass();
            cropOverlayView.setInitialCropWindowRect(null);
            Context context = getContext();
            context.getClass();
            WeakReference weakReference2 = new WeakReference(new kz0(context, this, uri));
            this.c1 = weakReference2;
            kz0 kz0Var2 = (kz0) weakReference2.get();
            if (kz0Var2 != null) {
                kz0Var2.f = ynb.V(kz0Var2, ga4.a, null, new jz0(kz0Var2, null), 2);
            }
            h();
        }
    }

    public final void setMaxZoom(int i) {
        if (this.R0 == i || i <= 0) {
            return;
        }
        this.R0 = i;
        c(false, false);
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        cropOverlayView.invalidate();
    }

    public final void setMultiTouchEnabled(boolean z) {
        CropOverlayView cropOverlayView = this.b;
        cropOverlayView.getClass();
        if (cropOverlayView.e != z) {
            cropOverlayView.e = z;
            if (z && cropOverlayView.d == null) {
                cropOverlayView.d = new ScaleGestureDetector(cropOverlayView.getContext(), new vz2(cropOverlayView));
            }
            c(false, false);
            cropOverlayView.invalidate();
        }
    }

    public final void setOnCropImageCompleteListener(nz2 nz2Var) {
        this.T0 = nz2Var;
    }

    public final void setOnSetImageUriCompleteListener(rz2 rz2Var) {
        this.S0 = rz2Var;
    }

    public final void setRotatedDegrees(int i) {
        int i2 = this.y;
        if (i2 != i) {
            e(i - i2);
        }
    }

    public final void setSaveBitmapToInstanceState(boolean z) {
        this.J0 = z;
    }

    public final void setScaleType(tz2 tz2Var) {
        tz2Var.getClass();
        if (tz2Var != this.I0) {
            this.I0 = tz2Var;
            this.W0 = 1.0f;
            this.Y0 = 0.0f;
            this.X0 = 0.0f;
            CropOverlayView cropOverlayView = this.b;
            if (cropOverlayView != null) {
                cropOverlayView.g();
            }
            requestLayout();
        }
    }

    public final void setShowCropLabel(boolean z) {
        if (this.L0 != z) {
            this.L0 = z;
            CropOverlayView cropOverlayView = this.b;
            if (cropOverlayView != null) {
                cropOverlayView.setCropperTextLabelVisibility(z);
            }
        }
    }

    public final void setShowCropOverlay(boolean z) {
        if (this.K0 != z) {
            this.K0 = z;
            g();
        }
    }

    public final void setShowProgressBar(boolean z) {
        if (this.P0 != z) {
            this.P0 = z;
            h();
        }
    }

    public final void setSnapRadius(float f) {
        if (f >= 0.0f) {
            CropOverlayView cropOverlayView = this.b;
            cropOverlayView.getClass();
            cropOverlayView.setSnapRadius(f);
        }
    }

    public final void setOnCropWindowChangedListener(qz2 qz2Var) {
    }

    public final void setOnSetCropOverlayMovedListener(oz2 oz2Var) {
    }

    public final void setOnSetCropOverlayReleasedListener(pz2 pz2Var) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CropImageView(Context context) {
        this(context, null);
        context.getClass();
    }
}
