package androidx.media3.ui;

import ai.askquin.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.ui.PlayerView;
import defpackage.aia;
import defpackage.bia;
import defpackage.cia;
import defpackage.duf;
import defpackage.e2f;
import defpackage.ebb;
import defpackage.eha;
import defpackage.f98;
import defpackage.fuf;
import defpackage.g45;
import defpackage.gy4;
import defpackage.hgc;
import defpackage.ho7;
import defpackage.jy6;
import defpackage.kb6;
import defpackage.nha;
import defpackage.oha;
import defpackage.pa7;
import defpackage.t45;
import defpackage.tha;
import defpackage.uud;
import defpackage.uuf;
import defpackage.wha;
import defpackage.wwf;
import defpackage.xd0;
import defpackage.xo1;
import defpackage.y45;
import defpackage.yg5;
import defpackage.zga;
import defpackage.zha;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class PlayerView extends FrameLayout {
    public static final /* synthetic */ int Y0 = 0;
    public final FrameLayout E0;
    public final FrameLayout F0;
    public final Handler G0;
    public final Class H0;
    public final Method I0;
    public final Object J0;
    public zga K0;
    public boolean L0;
    public nha M0;
    public int N0;
    public int O0;
    public Drawable P0;
    public int Q0;
    public boolean R0;
    public CharSequence S0;
    public int T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public boolean X0;
    public final zha a;
    public final AspectRatioFrameLayout b;
    public final View c;
    public final View d;
    public final boolean e;
    public final cia f;
    public final ImageView g;
    public final ImageView v;
    public final SubtitleView w;
    public final View x;
    public final TextView y;
    public final oha z;

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z4;
        boolean z5;
        int i9;
        boolean z6;
        boolean z7;
        int i10;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        super(context, attributeSet, 0);
        zha zhaVar = new zha(this);
        this.a = zhaVar;
        this.G0 = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = false;
            this.f = null;
            this.g = null;
            this.v = null;
            this.w = null;
            this.x = null;
            this.y = null;
            this.z = null;
            this.E0 = null;
            this.F0 = null;
            this.H0 = null;
            this.I0 = null;
            this.J0 = null;
            ImageView imageView = new ImageView(context);
            Resources resources = getResources();
            imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, context.getTheme()));
            imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ebb.d, 0, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(42);
                int color = typedArrayObtainStyledAttributes.getColor(42, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(22, R.layout.exo_player_view);
                boolean z8 = typedArrayObtainStyledAttributes.getBoolean(50, true);
                int i11 = typedArrayObtainStyledAttributes.getInt(3, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(9, 0);
                int i12 = typedArrayObtainStyledAttributes.getInt(15, 0);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(51, true);
                int i13 = typedArrayObtainStyledAttributes.getInt(45, 1);
                int i14 = typedArrayObtainStyledAttributes.getInt(28, 0);
                z5 = z9;
                i = typedArrayObtainStyledAttributes.getInt(38, 5000);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(4, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(35, 0);
                this.R0 = typedArrayObtainStyledAttributes.getBoolean(16, this.R0);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(13, true);
                typedArrayObtainStyledAttributes.recycle();
                i2 = resourceId;
                z2 = z11;
                i5 = i12;
                z6 = zHasValue;
                i3 = integer;
                i8 = color;
                i7 = i13;
                i6 = i14;
                i4 = resourceId2;
                z3 = z12;
                z = z10;
                i9 = i11;
                z4 = z8;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i = 5000;
            i2 = R.layout.exo_player_view;
            z = true;
            z2 = true;
            z3 = true;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 1;
            i8 = 0;
            z4 = true;
            z5 = true;
            i9 = 1;
            z6 = false;
        }
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.b = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i6);
        }
        View viewFindViewById = findViewById(R.id.exo_shutter);
        this.c = viewFindViewById;
        if (viewFindViewById != null && z6) {
            viewFindViewById.setBackgroundColor(i8);
        }
        if (aspectRatioFrameLayout == null || i7 == 0) {
            this.d = null;
            z7 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i7 != 2) {
                if (i7 == 3) {
                    try {
                        int i15 = uud.z;
                        this.d = (View) uud.class.getConstructor(Context.class).newInstance(context);
                        z7 = true;
                    } catch (Exception e) {
                        ho7.r("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                        throw r6;
                    }
                } else if (i7 != 4) {
                    SurfaceView surfaceView = new SurfaceView(context);
                    if (Build.VERSION.SDK_INT >= 34) {
                        hgc.X(surfaceView);
                    }
                    this.d = surfaceView;
                } else {
                    try {
                        int i16 = duf.b;
                        this.d = (View) duf.class.getConstructor(Context.class).newInstance(context);
                    } catch (Exception e2) {
                        ho7.r("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                        throw r6;
                    }
                }
                this.d.setLayoutParams(layoutParams);
                this.d.setOnClickListener(zhaVar);
                this.d.setClickable(false);
                aspectRatioFrameLayout.addView(this.d, 0);
            } else {
                this.d = new TextureView(context);
            }
            z7 = false;
            this.d.setLayoutParams(layoutParams);
            this.d.setOnClickListener(zhaVar);
            this.d.setClickable(false);
            aspectRatioFrameLayout.addView(this.d, 0);
        }
        this.e = z7;
        this.f = Build.VERSION.SDK_INT == 34 ? new cia() : null;
        this.E0 = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.F0 = (FrameLayout) findViewById(R.id.exo_overlay);
        this.g = (ImageView) findViewById(R.id.exo_image);
        this.O0 = i5;
        try {
            cls = ExoPlayer.class;
            Class<?>[] clsArr = new Class[1];
            i10 = 0;
            try {
                clsArr[0] = ImageOutput.class;
                method = cls.getMethod("setImageOutput", clsArr);
                objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: yha
                    @Override // java.lang.reflect.InvocationHandler
                    public final Object invoke(Object obj, Method method2, Object[] objArr) {
                        int i17 = PlayerView.Y0;
                        if (!method2.getName().equals("onImageAvailable")) {
                            return null;
                        }
                        Bitmap bitmap = (Bitmap) objArr[1];
                        PlayerView playerView = this.a;
                        playerView.G0.post(new xu8(5, playerView, bitmap));
                        return null;
                    }
                });
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                cls = null;
                objNewProxyInstance = null;
                method = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            i10 = 0;
        }
        this.H0 = cls;
        this.I0 = method;
        this.J0 = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.v = imageView2;
        this.N0 = (!z4 || i9 == 0 || imageView2 == null) ? i10 : i9;
        if (i4 != 0) {
            this.P0 = getContext().getDrawable(i4);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.w = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View viewFindViewById2 = findViewById(R.id.exo_buffering);
        this.x = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.Q0 = i3;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.y = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        oha ohaVar = (oha) findViewById(R.id.exo_controller);
        View viewFindViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (ohaVar != null) {
            this.z = ohaVar;
        } else if (viewFindViewById3 != null) {
            ohaVar = new oha(context, attributeSet);
            this.z = ohaVar;
            ohaVar.setId(R.id.exo_controller);
            ohaVar.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(ohaVar, iIndexOfChild);
        } else {
            this.z = null;
            ohaVar = null;
        }
        this.T0 = ohaVar != null ? i : i10;
        this.W0 = z;
        this.U0 = z2;
        this.V0 = z3;
        this.L0 = (!z5 || ohaVar == null) ? i10 : 1;
        if (ohaVar != null) {
            tha thaVar = ohaVar.a;
            int i17 = thaVar.A;
            if (i17 != 3 && i17 != 2) {
                thaVar.f();
                thaVar.i(2);
            }
            zha zhaVar2 = this.a;
            zhaVar2.getClass();
            ohaVar.y.add(zhaVar2);
        }
        if (z5) {
            setClickable(true);
        }
        l();
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.g;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        o();
    }

    private void setImageOutput(zga zgaVar) {
        Class cls = this.H0;
        if (cls == null || !cls.isAssignableFrom(zgaVar.getClass())) {
            return;
        }
        try {
            Method method = this.I0;
            method.getClass();
            Object obj = this.J0;
            obj.getClass();
            method.invoke(zgaVar, obj);
        } catch (IllegalAccessException | InvocationTargetException e) {
            yg5.p(e);
        }
    }

    public final boolean a() {
        zga zgaVar = this.K0;
        if (zgaVar == null || this.J0 == null) {
            return false;
        }
        y45 y45Var = (y45) zgaVar;
        return y45Var.v(30) && y45Var.n().a(4);
    }

    public final void b() {
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    public final boolean c() {
        zga zgaVar = this.K0;
        return zgaVar != null && ((y45) zgaVar).v(16) && ((y45) this.K0).y() && ((y45) this.K0).q();
    }

    public final void d(Bitmap bitmap) {
        setImage(new BitmapDrawable(getResources(), bitmap));
        zga zgaVar = this.K0;
        if (zgaVar != null) {
            y45 y45Var = (y45) zgaVar;
            if (y45Var.v(30) && y45Var.n().a(2)) {
                return;
            }
        }
        ImageView imageView = this.g;
        if (imageView != null) {
            imageView.setVisibility(0);
            o();
        }
        View view = this.c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        cia ciaVar;
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT == 34 && (ciaVar = this.f) != null && this.X0) {
            ciaVar.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        zga zgaVar = this.K0;
        if (zgaVar != null && ((y45) zgaVar).v(16) && ((y45) this.K0).y()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        oha ohaVar = this.z;
        if (z && p() && !ohaVar.i()) {
            e(true);
            return true;
        }
        if ((p() && ohaVar.c(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            e(true);
            return true;
        }
        if (z && p()) {
            e(true);
        }
        return false;
    }

    public final void e(boolean z) {
        if (!(c() && this.V0) && p()) {
            oha ohaVar = this.z;
            boolean z2 = ohaVar.i() && ohaVar.getShowTimeoutMs() <= 0;
            boolean zG = g();
            if (z || z2 || zG) {
                h(zG);
            }
        }
    }

    public final boolean f(Drawable drawable) {
        ImageView imageView = this.v;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.N0 == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        zga zgaVar = this.K0;
        if (zgaVar == null) {
            return true;
        }
        int iR = ((y45) zgaVar).r();
        if (!this.U0) {
            return false;
        }
        if (((y45) this.K0).v(17) && ((y45) this.K0).m().p()) {
            return false;
        }
        if (iR != 1 && iR != 4) {
            zga zgaVar2 = this.K0;
            zgaVar2.getClass();
            if (((y45) zgaVar2).q()) {
                return false;
            }
        }
        return true;
    }

    public List<kb6> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        int i = 3;
        FrameLayout frameLayout = this.F0;
        if (frameLayout != null) {
            arrayList.add(new kb6(i, frameLayout));
        }
        oha ohaVar = this.z;
        if (ohaVar != null) {
            arrayList.add(new kb6(i, ohaVar));
        }
        return jy6.o(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.E0;
        pa7.F(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.N0;
    }

    public boolean getControllerAutoShow() {
        return this.U0;
    }

    public boolean getControllerHideOnTouch() {
        return this.W0;
    }

    public int getControllerShowTimeoutMs() {
        return this.T0;
    }

    public Drawable getDefaultArtwork() {
        return this.P0;
    }

    public int getImageDisplayMode() {
        return this.O0;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.F0;
    }

    public zga getPlayer() {
        return this.K0;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        aspectRatioFrameLayout.getClass();
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.w;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.N0 != 0;
    }

    public boolean getUseController() {
        return this.L0;
    }

    public View getVideoSurfaceView() {
        return this.d;
    }

    public final void h(boolean z) {
        if (p()) {
            int i = z ? 0 : this.T0;
            oha ohaVar = this.z;
            ohaVar.setShowTimeoutMs(i);
            tha thaVar = ohaVar.a;
            oha ohaVar2 = thaVar.a;
            if (!ohaVar2.k()) {
                ohaVar2.setVisibility(0);
                ohaVar2.m();
                ImageView imageView = ohaVar2.N0;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            thaVar.k();
        }
    }

    public final void i() {
        if (!p() || this.K0 == null) {
            return;
        }
        oha ohaVar = this.z;
        if (!ohaVar.i()) {
            e(true);
        } else if (this.W0) {
            ohaVar.f();
        }
    }

    public final void j() {
        uuf uufVar;
        zga zgaVar = this.K0;
        if (zgaVar != null) {
            y45 y45Var = (y45) zgaVar;
            y45Var.Z();
            uufVar = y45Var.i0;
        } else {
            uufVar = uuf.d;
        }
        int i = uufVar.a;
        int i2 = uufVar.b;
        float f = this.e ? 0.0f : (i2 == 0 || i == 0) ? 0.0f : (i * uufVar.c) / i2;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    public final void k() {
        boolean z;
        View view = this.x;
        if (view != null) {
            zga zgaVar = this.K0;
            if (zgaVar == null || ((y45) zgaVar).r() != 2) {
                z = false;
            } else {
                int i = this.Q0;
                z = true;
                if (i != 2 && (i != 1 || !((y45) this.K0).q())) {
                    z = false;
                }
            }
            view.setVisibility(z ? 0 : 8);
        }
    }

    public final void l() {
        oha ohaVar = this.z;
        if (ohaVar == null || !this.L0) {
            setContentDescription(null);
        } else if (ohaVar.i()) {
            setContentDescription(this.W0 ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void m() {
        TextView textView = this.y;
        if (textView != null) {
            CharSequence charSequence = this.S0;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            zga zgaVar = this.K0;
            if (zgaVar != null) {
                y45 y45Var = (y45) zgaVar;
                y45Var.Z();
                g45 g45Var = y45Var.n0.f;
            }
            textView.setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public final void n(boolean z) {
        boolean z2;
        boolean z3;
        Drawable drawable;
        zga zgaVar = this.K0;
        boolean zF = false;
        if (zgaVar != null) {
            y45 y45Var = (y45) zgaVar;
            if (!y45Var.v(30) || y45Var.n().a.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        boolean z4 = this.R0;
        ImageView imageView = this.v;
        View view = this.c;
        if (!z4 && (!z2 || z)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            b();
        }
        if (z2) {
            zga zgaVar2 = this.K0;
            if (zgaVar2 != null) {
                y45 y45Var2 = (y45) zgaVar2;
                if (y45Var2.v(30) && y45Var2.n().a(2)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            boolean zA = a();
            if (!z3 && !zA) {
                if (view != null) {
                    view.setVisibility(0);
                }
                b();
            }
            ImageView imageView2 = this.g;
            boolean z5 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zA && !z3 && z5) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    o();
                }
            } else if (z3 && !zA && z5) {
                b();
            }
            if (!z3 && !zA && this.N0 != 0) {
                imageView.getClass();
                if (zgaVar != null) {
                    y45 y45Var3 = (y45) zgaVar;
                    if (y45Var3.v(18)) {
                        y45Var3.Z();
                        byte[] bArr = y45Var3.R.f;
                        if (bArr != null) {
                            zF = f(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                        }
                    }
                }
                if (zF || f(this.P0)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    public final void o() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.g;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.O0 == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.b) != null) {
            aspectRatioFrameLayout.setAspectRatio(width);
        }
        imageView.setScaleType(scaleType);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!p() || this.K0 == null) {
            return false;
        }
        e(true);
        return true;
    }

    public final boolean p() {
        if (!this.L0) {
            return false;
        }
        this.z.getClass();
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        i();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i) {
        pa7.J(i == 0 || this.v != null);
        if (this.N0 != i) {
            this.N0 = i;
            n(false);
        }
    }

    public void setAspectRatioListener(xd0 xd0Var) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        aspectRatioFrameLayout.getClass();
        aspectRatioFrameLayout.setAspectRatioListener(xd0Var);
    }

    public void setControllerAnimationEnabled(boolean z) {
        oha ohaVar = this.z;
        ohaVar.getClass();
        ohaVar.setAnimationEnabled(z);
    }

    public void setControllerAutoShow(boolean z) {
        this.U0 = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.V0 = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        this.z.getClass();
        this.W0 = z;
        l();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(eha ehaVar) {
        oha ohaVar = this.z;
        ohaVar.getClass();
        ohaVar.setOnFullScreenModeChangedListener(ehaVar);
    }

    public void setControllerShowTimeoutMs(int i) {
        oha ohaVar = this.z;
        ohaVar.getClass();
        this.T0 = i;
        if (ohaVar.i()) {
            h(g());
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(nha nhaVar) {
        oha ohaVar = this.z;
        ohaVar.getClass();
        nha nhaVar2 = this.M0;
        if (nhaVar2 == nhaVar) {
            return;
        }
        if (nhaVar2 != null) {
            ohaVar.y.remove(nhaVar2);
        }
        this.M0 = nhaVar;
        if (nhaVar != null) {
            ohaVar.getClass();
            ohaVar.y.add(nhaVar);
            setControllerVisibilityListener((aia) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        pa7.J(this.y != null);
        this.S0 = charSequence;
        m();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.P0 != drawable) {
            this.P0 = drawable;
            n(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z) {
        this.X0 = z;
    }

    public void setErrorMessageProvider(gy4 gy4Var) {
        if (gy4Var != null) {
            m();
        }
    }

    public void setFullscreenButtonClickListener(bia biaVar) {
        oha ohaVar = this.z;
        ohaVar.getClass();
        ohaVar.setOnFullScreenModeChangedListener(this.a);
    }

    public void setFullscreenButtonState(boolean z) {
        oha ohaVar = this.z;
        ohaVar.getClass();
        ohaVar.o(z);
    }

    public void setImageDisplayMode(int i) {
        pa7.J(this.g != null);
        if (this.O0 != i) {
            this.O0 = i;
            o();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.R0 != z) {
            this.R0 = z;
            n(false);
        }
    }

    public void setMediaRouteButtonViewProvider(wwf wwfVar) {
        oha ohaVar = this.z;
        ohaVar.getClass();
        ohaVar.setMediaRouteButtonViewProvider(wwfVar);
    }

    /* JADX WARN: Code duplicated, block: B:96:0x01d7  */
    public void setPlayer(zga zgaVar) {
        boolean z = true;
        pa7.J(Looper.myLooper() == Looper.getMainLooper());
        pa7.A(zgaVar == null || ((y45) zgaVar).t == Looper.getMainLooper());
        zga zgaVar2 = this.K0;
        if (zgaVar2 == zgaVar) {
            return;
        }
        View view = this.d;
        zha zhaVar = this.a;
        if (zgaVar2 != null) {
            y45 y45Var = (y45) zgaVar2;
            y45Var.F(zhaVar);
            if (y45Var.v(27)) {
                if (view instanceof TextureView) {
                    TextureView textureView = (TextureView) view;
                    y45Var.Z();
                    if (textureView == y45Var.X) {
                        y45Var.b();
                    }
                } else if (view instanceof SurfaceView) {
                    y45Var.Z();
                    SurfaceHolder holder = ((SurfaceView) view).getHolder();
                    y45Var.Z();
                    if (holder != null && holder == y45Var.U) {
                        y45Var.b();
                    }
                }
            }
            Class cls = this.H0;
            if (cls != null && cls.isAssignableFrom(zgaVar2.getClass())) {
                try {
                    Method method = this.I0;
                    method.getClass();
                    method.invoke(zgaVar2, null);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    yg5.p(e);
                    return;
                }
            }
        }
        SubtitleView subtitleView = this.w;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.K0 = zgaVar;
        boolean zP = p();
        oha ohaVar = this.z;
        if (zP) {
            ohaVar.setPlayer(zgaVar);
        }
        k();
        m();
        n(true);
        if (zgaVar == null) {
            if (ohaVar != null) {
                ohaVar.f();
                return;
            }
            return;
        }
        y45 y45Var2 = (y45) zgaVar;
        t45 t45Var = y45Var2.w;
        if (y45Var2.v(27)) {
            if (view instanceof TextureView) {
                TextureView textureView2 = (TextureView) view;
                y45Var2.Z();
                y45Var2.G();
                y45Var2.X = textureView2;
                if (textureView2.getSurfaceTextureListener() != null) {
                    xo1.V("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
                }
                textureView2.setSurfaceTextureListener(t45Var);
                SurfaceTexture surfaceTexture = textureView2.isAvailable() ? textureView2.getSurfaceTexture() : null;
                if (surfaceTexture == null) {
                    y45Var2.S(null);
                    y45Var2.C(0, 0);
                } else {
                    Surface surface = new Surface(surfaceTexture);
                    y45Var2.S(surface);
                    y45Var2.T = surface;
                    y45Var2.C(textureView2.getWidth(), textureView2.getHeight());
                }
            } else if (view instanceof SurfaceView) {
                SurfaceView surfaceView = (SurfaceView) view;
                y45Var2.Z();
                if (surfaceView instanceof fuf) {
                    y45Var2.G();
                    y45Var2.S(surfaceView);
                    y45Var2.O(surfaceView.getHolder());
                } else if (surfaceView instanceof uud) {
                    y45Var2.G();
                    y45Var2.V = (uud) surfaceView;
                    wha whaVarC = y45Var2.c(y45Var2.x);
                    pa7.J(!whaVarC.f);
                    whaVarC.c = 10000;
                    uud uudVar = y45Var2.V;
                    pa7.J(!whaVarC.f);
                    whaVarC.d = uudVar;
                    whaVarC.b();
                    y45Var2.V.a.add(t45Var);
                    y45Var2.S(y45Var2.V.getVideoSurface());
                    y45Var2.O(surfaceView.getHolder());
                } else {
                    SurfaceHolder holder2 = surfaceView.getHolder();
                    y45Var2.Z();
                    if (holder2 == null) {
                        y45Var2.b();
                    } else {
                        y45Var2.G();
                        y45Var2.W = true;
                        y45Var2.U = holder2;
                        holder2.addCallback(t45Var);
                        Surface surface2 = holder2.getSurface();
                        if (surface2 == null || !surface2.isValid()) {
                            y45Var2.S(null);
                            y45Var2.C(0, 0);
                        } else {
                            y45Var2.S(surface2);
                            Rect surfaceFrame = holder2.getSurfaceFrame();
                            y45Var2.C(surfaceFrame.width(), surfaceFrame.height());
                        }
                    }
                }
            }
            if (y45Var2.v(30)) {
                jy6 jy6Var = y45Var2.n().a;
                int i = 0;
                loop0: while (true) {
                    if (i >= jy6Var.size()) {
                        z = false;
                        break;
                    }
                    if (((e2f) jy6Var.get(i)).b.c == 2) {
                        e2f e2fVar = (e2f) jy6Var.get(i);
                        int i2 = 0;
                        while (true) {
                            int[] iArr = e2fVar.d;
                            if (i2 >= iArr.length) {
                                break;
                            } else if (iArr[i2] == 4) {
                                break loop0;
                            } else {
                                i2++;
                            }
                        }
                    }
                    i++;
                }
                if (z) {
                    j();
                }
            } else {
                j();
            }
        }
        if (subtitleView != null && y45Var2.v(28)) {
            y45Var2.Z();
            subtitleView.setCues(y45Var2.d0.a);
        }
        f98 f98Var = y45Var2.m;
        zhaVar.getClass();
        f98Var.a(zhaVar);
        setImageOutput(zgaVar);
        e(false);
    }

    public void setRepeatToggleModes(int i) {
        oha ohaVar = this.z;
        ohaVar.getClass();
        ohaVar.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.b;
        aspectRatioFrameLayout.getClass();
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.Q0 != i) {
            this.Q0 = i;
            k();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        oha ohaVar = this.z;
        ohaVar.getClass();
        ohaVar.setShowFastForwardButton(z);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        oha ohaVar = this.z;
        ohaVar.getClass();
        ohaVar.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        oha ohaVar = this.z;
        ohaVar.getClass();
        ohaVar.setShowNextButton(z);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        oha ohaVar = this.z;
        ohaVar.getClass();
        ohaVar.setShowPlayButtonIfPlaybackIsSuppressed(z);
    }

    public void setShowPreviousButton(boolean z) {
        oha ohaVar = this.z;
        ohaVar.getClass();
        ohaVar.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        oha ohaVar = this.z;
        ohaVar.getClass();
        ohaVar.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        oha ohaVar = this.z;
        ohaVar.getClass();
        ohaVar.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        oha ohaVar = this.z;
        ohaVar.getClass();
        ohaVar.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        oha ohaVar = this.z;
        ohaVar.getClass();
        ohaVar.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.c;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        oha ohaVar = this.z;
        ohaVar.getClass();
        ohaVar.setTimeBarScrubbingEnabled(z);
    }

    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setUseController(boolean z) {
        boolean z2 = true;
        oha ohaVar = this.z;
        pa7.J((z && ohaVar == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z2 = false;
        }
        setClickable(z2);
        if (this.L0 == z) {
            return;
        }
        this.L0 = z;
        if (p()) {
            ohaVar.setPlayer(this.K0);
        } else if (ohaVar != null) {
            ohaVar.f();
            ohaVar.setPlayer(null);
        }
        l();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.d;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public void setControllerVisibilityListener(aia aiaVar) {
        if (aiaVar != null) {
            setControllerVisibilityListener((nha) null);
        }
    }

    public PlayerView(Context context) {
        this(context, null);
    }
}
