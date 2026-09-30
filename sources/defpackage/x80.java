package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class x80 extends ImageView {
    public final a80 a;
    public final os b;
    public boolean c;

    public x80(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
        yve.a(this, getContext());
        a80 a80Var = new a80(this);
        this.a = a80Var;
        a80Var.s(attributeSet, i);
        os osVar = new os(this);
        this.b = osVar;
        osVar.l(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        a80 a80Var = this.a;
        if (a80Var != null) {
            a80Var.c();
        }
        os osVar = this.b;
        if (osVar != null) {
            osVar.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        a80 a80Var = this.a;
        if (a80Var != null) {
            return a80Var.q();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        a80 a80Var = this.a;
        if (a80Var != null) {
            return a80Var.r();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        gk2 gk2Var;
        os osVar = this.b;
        if (osVar == null || (gk2Var = (gk2) osVar.d) == null) {
            return null;
        }
        return (ColorStateList) gk2Var.c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        gk2 gk2Var;
        os osVar = this.b;
        if (osVar == null || (gk2Var = (gk2) osVar.d) == null) {
            return null;
        }
        return (PorterDuff.Mode) gk2Var.d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.b.c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a80 a80Var = this.a;
        if (a80Var != null) {
            a80Var.u();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        a80 a80Var = this.a;
        if (a80Var != null) {
            a80Var.v(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        os osVar = this.b;
        if (osVar != null) {
            osVar.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        os osVar = this.b;
        if (osVar != null && drawable != null && !this.c) {
            osVar.b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (osVar != null) {
            osVar.c();
            if (this.c) {
                return;
            }
            ImageView imageView = (ImageView) osVar.c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(osVar.b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        os osVar = this.b;
        if (osVar != null) {
            ImageView imageView = (ImageView) osVar.c;
            if (i != 0) {
                Drawable drawableT = x57.T(imageView.getContext(), i);
                if (drawableT != null) {
                    do4.a(drawableT);
                }
                imageView.setImageDrawable(drawableT);
            } else {
                imageView.setImageDrawable(null);
            }
            osVar.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        os osVar = this.b;
        if (osVar != null) {
            osVar.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        a80 a80Var = this.a;
        if (a80Var != null) {
            a80Var.E(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        a80 a80Var = this.a;
        if (a80Var != null) {
            a80Var.F(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        os osVar = this.b;
        if (osVar != null) {
            gk2 gk2Var = (gk2) osVar.d;
            if (gk2Var == null) {
                gk2Var = new gk2();
                osVar.d = gk2Var;
            }
            gk2Var.c = colorStateList;
            gk2Var.b = true;
            osVar.c();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        os osVar = this.b;
        if (osVar != null) {
            gk2 gk2Var = (gk2) osVar.d;
            if (gk2Var == null) {
                gk2Var = new gk2();
                osVar.d = gk2Var;
            }
            gk2Var.d = mode;
            gk2Var.a = true;
            osVar.c();
        }
    }
}
