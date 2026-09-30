package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h49 extends Drawable implements Animatable {
    public long E0;
    public Picture G0;
    public boolean I0;
    public float X;
    public boolean Y;
    public long Z;
    public final Movie a;
    public final Bitmap.Config b;
    public final zdc c;
    public Canvas v;
    public Bitmap w;
    public float z;
    public final Paint d = new Paint(3);
    public final ArrayList e = new ArrayList();
    public final Rect f = new Rect();
    public final Rect g = new Rect();
    public float x = 1.0f;
    public float y = 1.0f;
    public int F0 = -1;
    public aea H0 = aea.a;

    public h49(Movie movie, Bitmap.Config config, zdc zdcVar) {
        this.a = movie;
        this.b = config;
        this.c = zdcVar;
        if (qk2.G(config)) {
            qc0.j("Bitmap config must not be hardware.");
            throw null;
        }
    }

    public final void a(Canvas canvas) {
        Paint paint = this.d;
        Canvas canvas2 = this.v;
        Bitmap bitmap = this.w;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int iSave = canvas2.save();
        try {
            float f = this.x;
            canvas2.scale(f, f);
            this.a.draw(canvas2, 0.0f, 0.0f, paint);
            Picture picture = this.G0;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(iSave);
            int iSave2 = canvas.save();
            try {
                canvas.translate(this.z, this.X);
                float f2 = this.y;
                canvas.scale(f2, f2);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            } finally {
                canvas.restoreToCount(iSave2);
            }
        } catch (Throwable th) {
            canvas2.restoreToCount(iSave);
            throw th;
        }
    }

    public final void b(Rect rect) {
        Rect rect2 = this.f;
        if (rect2.equals(rect)) {
            return;
        }
        rect2.set(rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        Movie movie = this.a;
        int iWidth2 = movie.width();
        int iHeight2 = movie.height();
        if (iWidth2 <= 0 || iHeight2 <= 0) {
            return;
        }
        ykd ykdVar = ykd.c;
        double dR = y7h.r(iWidth2, iHeight2, iWidth, iHeight, this.c, ykdVar);
        if (!this.I0 && dR > 1.0d) {
            dR = 1.0d;
        }
        float f = (float) dR;
        this.x = f;
        int i = (int) (iWidth2 * f);
        int i2 = (int) (f * iHeight2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, this.b);
        Bitmap bitmap = this.w;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.w = bitmapCreateBitmap;
        this.v = new Canvas(bitmapCreateBitmap);
        if (this.I0) {
            this.y = 1.0f;
            this.z = 0.0f;
            this.X = 0.0f;
        } else {
            float fR = (float) y7h.r(i, i2, iWidth, iHeight, this.c, ykdVar);
            this.y = fR;
            this.z = ((iWidth - (i * fR)) / 2.0f) + rect.left;
            this.X = ((iHeight - (fR * i2)) / 2.0f) + rect.top;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Movie movie = this.a;
        int iDuration = movie.duration();
        if (iDuration == 0) {
            iDuration = 0;
            z = false;
        } else {
            if (this.Y) {
                this.E0 = SystemClock.uptimeMillis();
            }
            int i = (int) (this.E0 - this.Z);
            int i2 = i / iDuration;
            int i3 = this.F0;
            z = i3 == -1 || i2 <= i3;
            if (z) {
                iDuration = i - (i2 * iDuration);
            }
        }
        movie.setTime(iDuration);
        if (this.I0) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Rect rect = this.g;
            rect.set(0, 0, width, height);
            b(rect);
            int iSave = canvas.save();
            try {
                float f = 1.0f / this.x;
                canvas.scale(f, f);
                a(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        } else {
            b(getBounds());
            a(canvas);
        }
        if (this.Y && z) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.a.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.a.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.d.getAlpha() != 255) {
            return -3;
        }
        aea aeaVar = this.H0;
        if (aeaVar != aea.b) {
            return (aeaVar == aea.a && this.a.isOpaque()) ? -1 : -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.Y;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i < 0 || i >= 256) {
            qc0.o(tec.e(i, "Invalid alpha: "));
        } else {
            this.d.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.Y) {
            return;
        }
        this.Y = true;
        this.Z = SystemClock.uptimeMillis();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            x16 x16Var = ((arf) arrayList.get(i)).a;
            if (x16Var != null) {
                x16Var.invoke();
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.Y) {
            this.Y = false;
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                x16 x16Var = ((arf) arrayList.get(i)).b;
                if (x16Var != null) {
                    x16Var.invoke();
                }
            }
        }
    }
}
