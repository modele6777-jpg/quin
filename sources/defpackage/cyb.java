package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cyb {
    public static cyb g;
    public WeakHashMap a;
    public final WeakHashMap b = new WeakHashMap(0);
    public TypedValue c;
    public boolean d;
    public hbc e;
    public static final PorterDuff.Mode f = PorterDuff.Mode.SRC_IN;
    public static final byb h = new byb(6);

    public static synchronized cyb c() {
        cyb cybVar;
        cybVar = g;
        if (cybVar == null) {
            cybVar = new cyb();
            g = cybVar;
        }
        return cybVar;
    }

    public static synchronized PorterDuffColorFilter f(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        byb bybVar = h;
        bybVar.getClass();
        int i2 = (31 + i) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) bybVar.c(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        }
        return porterDuffColorFilter;
    }

    public static void i(Drawable drawable, gk2 gk2Var, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z = gk2Var.b;
        if (!z && !gk2Var.a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterF = null;
        ColorStateList colorStateList = z ? (ColorStateList) gk2Var.c : null;
        PorterDuff.Mode mode = gk2Var.a ? (PorterDuff.Mode) gk2Var.d : f;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilterF = f(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilterF);
    }

    public final void a(Context context, int i, ColorStateList colorStateList) {
        WeakHashMap weakHashMap = this.a;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            this.a = weakHashMap;
        }
        fud fudVar = (fud) weakHashMap.get(context);
        if (fudVar == null) {
            fudVar = new fud(0);
            this.a.put(context, fudVar);
        }
        int i2 = fudVar.d;
        if (i2 != 0 && i <= fudVar.b[i2 - 1]) {
            fudVar.c(i, colorStateList);
            return;
        }
        if (fudVar.a && i2 >= fudVar.b.length) {
            abg.x(fudVar);
        }
        int i3 = fudVar.d;
        if (i3 >= fudVar.b.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            fudVar.b = Arrays.copyOf(fudVar.b, i7);
            fudVar.c = Arrays.copyOf(fudVar.c, i7);
        }
        fudVar.b[i3] = i;
        fudVar.c[i3] = colorStateList;
        fudVar.d = i3 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    public final Drawable b(Context context, int i) {
        Object obj;
        WeakReference weakReference;
        Drawable drawableNewDrawable;
        LayerDrawable layerDrawableA0;
        TypedValue typedValue = this.c;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.c = typedValue;
        }
        context.getResources().getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            gg8 gg8Var = (gg8) this.b.get(context);
            obj = null;
            if (gg8Var != null && (weakReference = (WeakReference) gg8Var.c(j)) != null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    gg8Var.f(j);
                }
            }
            drawableNewDrawable = null;
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        if (this.e == null) {
            layerDrawableA0 = null;
        } else if (i == R.drawable.abc_cab_background_top_material) {
            layerDrawableA0 = new LayerDrawable(new Drawable[]{d(context, R.drawable.abc_cab_background_internal_bg), d(context, 2131230742)});
        } else if (i == R.drawable.abc_ratingbar_material) {
            layerDrawableA0 = hbc.a0(this, context, R.dimen.abc_star_big);
        } else if (i == R.drawable.abc_ratingbar_indicator_material) {
            layerDrawableA0 = hbc.a0(this, context, R.dimen.abc_star_medium);
        } else if (i == R.drawable.abc_ratingbar_small_material) {
            layerDrawableA0 = hbc.a0(this, context, R.dimen.abc_star_small);
        } else {
            layerDrawableA0 = null;
        }
        if (layerDrawableA0 == null) {
            return layerDrawableA0;
        }
        layerDrawableA0.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                Drawable.ConstantState constantState2 = layerDrawableA0.getConstantState();
                if (constantState2 == null) {
                    return layerDrawableA0;
                }
                gg8 gg8Var2 = (gg8) this.b.get(context);
                if (gg8Var2 == null) {
                    gg8Var2 = new gg8(obj);
                    this.b.put(context, gg8Var2);
                }
                gg8Var2.e(j, new WeakReference(constantState2));
                return layerDrawableA0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Drawable d(Context context, int i) {
        return e(context, i, false);
    }

    public final synchronized Drawable e(Context context, int i, boolean z) {
        Drawable drawableB;
        try {
            if (!this.d) {
                this.d = true;
                Drawable drawableD = d(context, R.drawable.abc_vector_test);
                if (drawableD == null || !"android.graphics.drawable.VectorDrawable".equals(drawableD.getClass().getName())) {
                    this.d = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableB = b(context, i);
            if (drawableB == null) {
                drawableB = context.getDrawable(i);
            }
            if (drawableB != null) {
                drawableB = h(context, i, z, drawableB);
            }
            if (drawableB != null) {
                do4.a(drawableB);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableB;
    }

    public final synchronized ColorStateList g(Context context, int i) {
        ColorStateList colorStateList;
        fud fudVar;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListB0 = null;
        colorStateList = (weakHashMap == null || (fudVar = (fud) weakHashMap.get(context)) == null) ? null : (ColorStateList) abg.q(fudVar, i);
        if (colorStateList == null) {
            hbc hbcVar = this.e;
            if (hbcVar != null) {
                colorStateListB0 = hbcVar.b0(context, i);
            }
            if (colorStateListB0 != null) {
                a(context, i, colorStateListB0);
            }
            colorStateList = colorStateListB0;
        }
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00fb A[RETURN] */
    public final Drawable h(Context context, int i, boolean z, Drawable drawable) {
        int iRound;
        PorterDuffColorFilter porterDuffColorFilterF;
        ColorStateList colorStateListG = g(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListG != null) {
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setTintList(colorStateListG);
            if (this.e != null && i == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate.setTintMode(mode);
            }
            return drawableMutate;
        }
        hbc hbcVar = this.e;
        int i2 = R.attr.colorControlNormal;
        if (hbcVar != null) {
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = yve.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = s80.b;
                hbc.J0(drawableFindDrawableByLayerId, iC, mode2);
                hbc.J0(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), yve.c(context, R.attr.colorControlNormal), mode2);
                hbc.J0(layerDrawable.findDrawableByLayerId(android.R.id.progress), yve.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = yve.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = s80.b;
                hbc.J0(drawableFindDrawableByLayerId2, iB, mode3);
                hbc.J0(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), yve.c(context, R.attr.colorControlActivated), mode3);
                hbc.J0(layerDrawable2.findDrawableByLayerId(android.R.id.progress), yve.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        if (hbcVar != null) {
            PorterDuff.Mode mode4 = s80.b;
            boolean z2 = true;
            if (hbc.w((int[]) hbcVar.a, i)) {
                iRound = -1;
            } else {
                if (hbc.w((int[]) hbcVar.c, i)) {
                    i2 = R.attr.colorControlActivated;
                } else {
                    boolean zW = hbc.w((int[]) hbcVar.d, i);
                    i2 = android.R.attr.colorBackground;
                    if (zW) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (i == 2131230762) {
                        iRound = Math.round(40.8f);
                        i2 = android.R.attr.colorForeground;
                    } else if (i != R.drawable.abc_dialog_material_background) {
                        i2 = 0;
                        z2 = false;
                    }
                }
                iRound = -1;
            }
            if (z2) {
                Drawable drawableMutate2 = drawable.mutate();
                int iC2 = yve.c(context, i2);
                synchronized (s80.class) {
                    porterDuffColorFilterF = f(iC2, mode4);
                }
                drawableMutate2.setColorFilter(porterDuffColorFilterF);
                if (iRound != -1) {
                    drawableMutate2.setAlpha(iRound);
                    return drawable;
                }
            } else if (z) {
                return null;
            }
        } else if (z) {
            return null;
        }
        return drawable;
    }
}
