package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.adjust.sdk.network.ErrorCodes;
import io.sentry.android.core.b1;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g88 implements efd {
    public static final Method O0;
    public static final Method P0;
    public AdapterView.OnItemClickListener E0;
    public final Handler J0;
    public Rect L0;
    public boolean M0;
    public final z80 N0;
    public d88 Y;
    public View Z;
    public final Context a;
    public ListAdapter b;
    public hq4 c;
    public int f;
    public int g;
    public boolean w;
    public boolean x;
    public boolean y;
    public final int d = -2;
    public int e = -2;
    public final int v = ErrorCodes.UNSUPPORTED_ENCODING_EXCEPTION;
    public int z = 0;
    public final int X = Integer.MAX_VALUE;
    public final c88 F0 = new c88(this, 1);
    public final f88 G0 = new f88(this);
    public final e88 H0 = new e88(this);
    public final c88 I0 = new c88(this, 0);
    public final Rect K0 = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                O0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                P0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public g88(Context context, AttributeSet attributeSet, int i) {
        int resourceId;
        this.a = context;
        this.J0 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hbb.o, i, 0);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.w = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        z80 z80Var = new z80(context, attributeSet, i, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, hbb.s, i, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            z80Var.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        z80Var.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : x57.T(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.N0 = z80Var;
        z80Var.setInputMethodMode(1);
    }

    @Override // defpackage.efd
    public final boolean a() {
        return this.N0.isShowing();
    }

    public final int b() {
        return this.f;
    }

    public final void d(int i) {
        this.f = i;
    }

    @Override // defpackage.efd
    public final void dismiss() {
        z80 z80Var = this.N0;
        z80Var.dismiss();
        z80Var.setContentView(null);
        this.c = null;
        this.J0.removeCallbacks(this.F0);
    }

    @Override // defpackage.efd
    public final void f() {
        int i;
        int iMakeMeasureSpec;
        int paddingBottom;
        hq4 hq4Var;
        hq4 hq4Var2 = this.c;
        Context context = this.a;
        z80 z80Var = this.N0;
        if (hq4Var2 == null) {
            hq4 hq4VarQ = q(context, !this.M0);
            this.c = hq4VarQ;
            hq4VarQ.setAdapter(this.b);
            this.c.setOnItemClickListener(this.E0);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new b88(this));
            this.c.setOnScrollListener(this.H0);
            z80Var.setContentView(this.c);
        }
        Drawable background = z80Var.getBackground();
        Rect rect = this.K0;
        if (background != null) {
            background.getPadding(rect);
            int i2 = rect.top;
            i = rect.bottom + i2;
            if (!this.w) {
                this.g = -i2;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int maxAvailableHeight = z80Var.getMaxAvailableHeight(this.Z, this.g, z80Var.getInputMethodMode() == 2);
        int i3 = this.d;
        if (i3 == -1) {
            paddingBottom = maxAvailableHeight + i;
        } else {
            int i4 = this.e;
            if (i4 != -2) {
                iMakeMeasureSpec = i4 != -1 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iA = this.c.a(iMakeMeasureSpec, maxAvailableHeight);
            paddingBottom = iA + (iA > 0 ? this.c.getPaddingBottom() + this.c.getPaddingTop() + i : 0);
        }
        boolean z = z80Var.getInputMethodMode() == 2;
        z80Var.setWindowLayoutType(this.v);
        if (z80Var.isShowing()) {
            if (this.Z.isAttachedToWindow()) {
                int width = this.e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.Z.getWidth();
                }
                if (i3 == -1) {
                    i3 = z ? paddingBottom : -1;
                    int i5 = this.e;
                    if (z) {
                        z80Var.setWidth(i5 == -1 ? -1 : 0);
                        z80Var.setHeight(0);
                    } else {
                        z80Var.setWidth(i5 == -1 ? -1 : 0);
                        z80Var.setHeight(-1);
                    }
                } else if (i3 == -2) {
                    i3 = paddingBottom;
                }
                z80Var.setOutsideTouchable(true);
                int i6 = width;
                View view = this.Z;
                int i7 = this.f;
                int i8 = this.g;
                int i9 = i6 < 0 ? -1 : i6;
                if (i3 < 0) {
                    i3 = -1;
                }
                z80Var.update(view, i7, i8, i9, i3);
                return;
            }
            return;
        }
        int width2 = this.e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.Z.getWidth();
        }
        if (i3 == -1) {
            i3 = -1;
        } else if (i3 == -2) {
            i3 = paddingBottom;
        }
        z80Var.setWidth(width2);
        z80Var.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = O0;
            if (method != null) {
                try {
                    method.invoke(z80Var, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            bp.Q(z80Var);
        }
        z80Var.setOutsideTouchable(true);
        z80Var.setTouchInterceptor(this.G0);
        if (this.y) {
            z80Var.setOverlapAnchor(this.x);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = P0;
            if (method2 != null) {
                try {
                    method2.invoke(z80Var, this.L0);
                } catch (Exception e) {
                    b1.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            bp.O(z80Var, this.L0);
        }
        z80Var.showAsDropDown(this.Z, this.f, this.g, this.z);
        this.c.setSelection(-1);
        if ((!this.M0 || this.c.isInTouchMode()) && (hq4Var = this.c) != null) {
            hq4Var.setListSelectionHidden(true);
            hq4Var.requestLayout();
        }
        if (this.M0) {
            return;
        }
        this.J0.post(this.I0);
    }

    public final Drawable g() {
        return this.N0.getBackground();
    }

    public final void i(Drawable drawable) {
        this.N0.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.efd
    public final hq4 j() {
        return this.c;
    }

    public final void l(int i) {
        this.g = i;
        this.w = true;
    }

    public final int o() {
        if (this.w) {
            return this.g;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        d88 d88Var = this.Y;
        if (d88Var == null) {
            this.Y = new d88(this);
        } else {
            ListAdapter listAdapter2 = this.b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(d88Var);
            }
        }
        this.b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.Y);
        }
        hq4 hq4Var = this.c;
        if (hq4Var != null) {
            hq4Var.setAdapter(this.b);
        }
    }

    public hq4 q(Context context, boolean z) {
        return new hq4(context, z);
    }

    public final void r(int i) {
        Drawable background = this.N0.getBackground();
        if (background == null) {
            this.e = i;
            return;
        }
        Rect rect = this.K0;
        background.getPadding(rect);
        this.e = rect.left + rect.right + i;
    }
}
