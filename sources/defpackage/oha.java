package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oha extends FrameLayout {
    public static final float[] W1;
    public final String A1;
    public final Drawable B1;
    public final Drawable C1;
    public final String D1;
    public final jha E0;
    public final String E1;
    public final gha F0;
    public zga F1;
    public final cha G0;
    public boolean G1;
    public final cha H0;
    public boolean H1;
    public final m6c I0;
    public boolean I1;
    public final PopupWindow J0;
    public boolean J1;
    public final int K0;
    public boolean K1;
    public final ImageView L0;
    public boolean L1;
    public final ImageView M0;
    public int M1;
    public final ImageView N0;
    public boolean N1;
    public final View O0;
    public int O1;
    public final View P0;
    public int P1;
    public final TextView Q0;
    public long[] Q1;
    public final TextView R0;
    public boolean[] R1;
    public final ImageView S0;
    public final long[] S1;
    public final ImageView T0;
    public final boolean[] T1;
    public final ImageView U0;
    public long U1;
    public final ImageView V0;
    public boolean V1;
    public final ImageView W0;
    public final ImageView X0;
    public final View Y0;
    public final View Z0;
    public final tha a;
    public final View a1;
    public final Resources b;
    public final TextView b1;
    public final Handler c;
    public final TextView c1;
    public final dha d;
    public final kxe d1;
    public final Class e;
    public final StringBuilder e1;
    public final Method f;
    public final Formatter f1;
    public final Method g;
    public final eye g1;
    public final fye h1;
    public final m45 i1;
    public final Drawable j1;
    public final Drawable k1;
    public final Drawable l1;
    public final Drawable m1;
    public final Drawable n1;
    public final String o1;
    public final String p1;
    public final String q1;
    public final Drawable r1;
    public final Drawable s1;
    public final float t1;
    public final float u1;
    public final Class v;
    public final String v1;
    public final Method w;
    public final String w1;
    public final Method x;
    public final Drawable x1;
    public final CopyOnWriteArrayList y;
    public final Drawable y1;
    public final RecyclerView z;
    public final String z1;

    static {
        pp8.a("media3.ui");
        W1 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:31:0x0273  */
    /* JADX WARN: Code duplicated, block: B:34:0x028b  */
    /* JADX WARN: Code duplicated, block: B:35:0x028e  */
    /* JADX WARN: Code duplicated, block: B:39:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:42:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:45:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:48:0x02da  */
    /* JADX WARN: Code duplicated, block: B:51:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:53:0x02f7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:55:0x031b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0322  */
    /* JADX WARN: Code duplicated, block: B:60:0x0349  */
    /* JADX WARN: Code duplicated, block: B:63:0x035b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0378  */
    /* JADX WARN: Code duplicated, block: B:69:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:70:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:72:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:76:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:79:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:80:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x0404  */
    /* JADX WARN: Code duplicated, block: B:89:0x0416  */
    /* JADX WARN: Code duplicated, block: B:92:0x0428  */
    /* JADX WARN: Code duplicated, block: B:95:0x0452  */
    /* JADX WARN: Code duplicated, block: B:99:0x060b  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public oha(Context context, AttributeSet attributeSet) throws NoSuchMethodException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z8;
        Method method;
        Method method2;
        Class<?> cls;
        Method method3;
        Method method4;
        ImageView imageView;
        ImageView imageView2;
        aha ahaVar;
        int i17;
        ImageView imageView3;
        aha ahaVar2;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        kxe kxeVar;
        View viewFindViewById4;
        fp8 fp8Var;
        Object obj;
        Resources resources;
        ImageView imageView4;
        ImageView imageView5;
        ImageView imageView6;
        Typeface typefaceA;
        ImageView imageView7;
        TextView textView;
        View view;
        ImageView imageView8;
        TextView textView2;
        View view2;
        ImageView imageView9;
        ImageView imageView10;
        ImageView imageView11;
        Object obj2;
        super(context, null, 0);
        Class cls2 = Boolean.TYPE;
        this.J1 = true;
        this.M1 = 5000;
        this.P1 = 0;
        this.O1 = 200;
        int resourceId = R.drawable.exo_styled_controls_previous;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ebb.c, 0, 0);
            try {
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(6, R.layout.exo_player_control_view);
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(12, R.drawable.exo_styled_controls_play);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(11, R.drawable.exo_styled_controls_pause);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(10, R.drawable.exo_styled_controls_next);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(7, R.drawable.exo_styled_controls_simple_fastforward);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(15, R.drawable.exo_styled_controls_previous);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(20, R.drawable.exo_styled_controls_simple_rewind);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(9, R.drawable.exo_styled_controls_fullscreen_exit);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(8, R.drawable.exo_styled_controls_fullscreen_enter);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(17, R.drawable.exo_styled_controls_repeat_off);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(18, R.drawable.exo_styled_controls_repeat_one);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(16, R.drawable.exo_styled_controls_repeat_all);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(35, R.drawable.exo_styled_controls_shuffle_on);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(34, R.drawable.exo_styled_controls_shuffle_off);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(37, R.drawable.exo_styled_controls_subtitle_on);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(36, R.drawable.exo_styled_controls_subtitle_off);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(42, R.drawable.exo_styled_controls_vr);
                this.M1 = typedArrayObtainStyledAttributes.getInt(32, this.M1);
                this.P1 = typedArrayObtainStyledAttributes.getInt(19, this.P1);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(29, true);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(26, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(28, true);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(27, true);
                boolean z13 = typedArrayObtainStyledAttributes.getBoolean(30, false);
                boolean z14 = typedArrayObtainStyledAttributes.getBoolean(31, false);
                boolean z15 = typedArrayObtainStyledAttributes.getBoolean(33, false);
                this.N1 = typedArrayObtainStyledAttributes.getBoolean(39, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(38, this.O1));
                boolean z16 = typedArrayObtainStyledAttributes.getBoolean(2, true);
                typedArrayObtainStyledAttributes.recycle();
                i3 = resourceId8;
                i7 = resourceId6;
                i13 = resourceId17;
                i11 = resourceId14;
                z6 = z11;
                i8 = resourceId10;
                i12 = resourceId15;
                z7 = z9;
                i9 = resourceId12;
                z4 = z13;
                i15 = resourceId2;
                i16 = resourceId16;
                z8 = z10;
                i2 = resourceId11;
                z3 = z14;
                i5 = resourceId4;
                i14 = resourceId3;
                i10 = resourceId13;
                z5 = z12;
                i4 = resourceId9;
                i6 = resourceId5;
                i = resourceId7;
                z2 = z15;
                z = z16;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i = R.drawable.exo_styled_controls_simple_rewind;
            i2 = R.drawable.exo_styled_controls_repeat_one;
            i3 = R.drawable.exo_styled_controls_fullscreen_exit;
            i4 = R.drawable.exo_styled_controls_fullscreen_enter;
            i5 = R.drawable.exo_styled_controls_pause;
            i6 = R.drawable.exo_styled_controls_next;
            i7 = R.drawable.exo_styled_controls_simple_fastforward;
            i8 = R.drawable.exo_styled_controls_repeat_off;
            i9 = R.drawable.exo_styled_controls_repeat_all;
            i10 = R.drawable.exo_styled_controls_shuffle_on;
            i11 = R.drawable.exo_styled_controls_shuffle_off;
            i12 = R.drawable.exo_styled_controls_subtitle_on;
            z = true;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = true;
            z6 = true;
            z7 = true;
            i13 = R.drawable.exo_styled_controls_vr;
            i14 = R.drawable.exo_styled_controls_play;
            i15 = R.layout.exo_player_control_view;
            i16 = R.drawable.exo_styled_controls_subtitle_off;
            z8 = true;
        }
        LayoutInflater.from(context).inflate(i15, this);
        setDescendantFocusability(262144);
        this.d = new dha(this);
        this.y = new CopyOnWriteArrayList();
        this.g1 = new eye();
        this.h1 = new fye();
        StringBuilder sb = new StringBuilder();
        this.e1 = sb;
        int i18 = i14;
        this.f1 = new Formatter(sb, Locale.getDefault());
        this.Q1 = new long[0];
        this.R1 = new boolean[0];
        this.S1 = new long[0];
        this.T1 = new boolean[0];
        this.i1 = new m45(14, this);
        try {
            method = ExoPlayer.class.getMethod("setScrubbingModeEnabled", cls2);
            try {
                method2 = ExoPlayer.class.getMethod("isScrubbingModeEnabled", null);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method2 = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            method = null;
        }
        this.e = ExoPlayer.class;
        this.f = method;
        this.g = method2;
        try {
            cls = Class.forName("androidx.media3.transformer.CompositionPlayer");
            try {
                method3 = cls.getMethod("setScrubbingModeEnabled", cls2);
                try {
                    method4 = cls.getMethod("isScrubbingModeEnabled", null);
                } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                    method4 = null;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                method3 = null;
                method4 = null;
                this.v = cls;
                this.w = method3;
                this.x = method4;
                this.b1 = (TextView) findViewById(R.id.exo_duration);
                this.c1 = (TextView) findViewById(R.id.exo_position);
                imageView = (ImageView) findViewById(R.id.exo_subtitle);
                this.V0 = imageView;
                if (imageView != null) {
                    imageView.setOnClickListener(this.d);
                }
                imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
                this.W0 = imageView2;
                int i19 = 0;
                ahaVar = new aha(i19, this);
                if (imageView2 == null) {
                    i17 = 8;
                } else {
                    i17 = 8;
                    imageView2.setVisibility(8);
                    imageView2.setOnClickListener(ahaVar);
                }
                imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
                this.X0 = imageView3;
                ahaVar2 = new aha(i19, this);
                if (imageView3 != null) {
                    imageView3.setVisibility(i17);
                    imageView3.setOnClickListener(ahaVar2);
                }
                viewFindViewById = findViewById(R.id.exo_settings);
                this.Y0 = viewFindViewById;
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(this.d);
                }
                viewFindViewById2 = findViewById(R.id.exo_playback_speed);
                this.Z0 = viewFindViewById2;
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setOnClickListener(this.d);
                }
                viewFindViewById3 = findViewById(R.id.exo_audio_track);
                this.a1 = viewFindViewById3;
                if (viewFindViewById3 != null) {
                    viewFindViewById3.setOnClickListener(this.d);
                }
                kxeVar = (kxe) findViewById(R.id.exo_progress);
                viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
                if (kxeVar != null) {
                    if (viewFindViewById4 != null) {
                        ot3 ot3Var = new ot3(context, attributeSet);
                        ot3Var.setId(R.id.exo_progress);
                        ot3Var.setLayoutParams(viewFindViewById4.getLayoutParams());
                        ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
                        int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
                        viewGroup.removeView(viewFindViewById4);
                        viewGroup.addView(ot3Var, iIndexOfChild);
                        this.d1 = ot3Var;
                        obj2 = ot3Var;
                    } else {
                        fp8Var = null;
                        this.d1 = null;
                        obj = null;
                    }
                    if (obj != null) {
                        dha dhaVar = this.d;
                        dhaVar.getClass();
                        ((ot3) obj).P0.add(dhaVar);
                    }
                    this.c = pqf.n(fp8Var);
                    resources = context.getResources();
                    this.b = resources;
                    imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
                    this.N0 = imageView4;
                    if (imageView4 != null) {
                        imageView4.setOnClickListener(this.d);
                    }
                    imageView5 = (ImageView) findViewById(R.id.exo_prev);
                    this.L0 = imageView5;
                    if (imageView5 != null) {
                        imageView5.setImageDrawable(resources.getDrawable(resourceId, context.getTheme()));
                        imageView5.setOnClickListener(this.d);
                    }
                    imageView6 = (ImageView) findViewById(R.id.exo_next);
                    this.M0 = imageView6;
                    if (imageView6 != null) {
                        imageView6.setImageDrawable(resources.getDrawable(i6, context.getTheme()));
                        imageView6.setOnClickListener(this.d);
                    }
                    typefaceA = hyb.a(context, R.font.roboto_medium_numbers);
                    imageView7 = (ImageView) findViewById(R.id.exo_rew);
                    textView = (TextView) findViewById(R.id.exo_rew_with_amount);
                    if (imageView7 != null) {
                        imageView7.setImageDrawable(resources.getDrawable(i, context.getTheme()));
                        this.P0 = imageView7;
                        this.R0 = null;
                    } else if (textView != null) {
                        textView.setTypeface(typefaceA);
                        this.R0 = textView;
                        this.P0 = textView;
                    } else {
                        this.R0 = null;
                        this.P0 = null;
                    }
                    view = this.P0;
                    if (view != null) {
                        view.setOnClickListener(this.d);
                    }
                    imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
                    textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
                    if (imageView8 != null) {
                        imageView8.setImageDrawable(resources.getDrawable(i7, context.getTheme()));
                        this.O0 = imageView8;
                        this.Q0 = null;
                    } else if (textView2 != null) {
                        textView2.setTypeface(typefaceA);
                        this.Q0 = textView2;
                        this.O0 = textView2;
                    } else {
                        this.Q0 = null;
                        this.O0 = null;
                    }
                    view2 = this.O0;
                    if (view2 != null) {
                        view2.setOnClickListener(this.d);
                    }
                    imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
                    this.S0 = imageView9;
                    if (imageView9 != null) {
                        imageView9.setOnClickListener(this.d);
                    }
                    imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
                    this.T0 = imageView10;
                    if (imageView10 != null) {
                        imageView10.setOnClickListener(this.d);
                    }
                    this.t1 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
                    this.u1 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
                    imageView11 = (ImageView) findViewById(R.id.exo_vr);
                    this.U0 = imageView11;
                    if (imageView11 != null) {
                        imageView11.setImageDrawable(resources.getDrawable(i13, context.getTheme()));
                        n(imageView11, false);
                    }
                    tha thaVar = new tha(this);
                    this.a = thaVar;
                    thaVar.D = z;
                    jha jhaVar = new jha(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
                    this.E0 = jhaVar;
                    this.K0 = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
                    RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
                    this.z = recyclerView;
                    recyclerView.setAdapter(jhaVar);
                    getContext();
                    recyclerView.setLayoutManager(new LinearLayoutManager());
                    PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
                    this.J0 = popupWindow;
                    popupWindow.setOnDismissListener(this.d);
                    this.V1 = true;
                    this.I0 = new m6c(getResources());
                    this.x1 = resources.getDrawable(i12, context.getTheme());
                    this.y1 = resources.getDrawable(i16, context.getTheme());
                    this.z1 = resources.getString(R.string.exo_controls_cc_enabled_description);
                    this.A1 = resources.getString(R.string.exo_controls_cc_disabled_description);
                    this.G0 = new cha(this, 1);
                    this.H0 = new cha(this, 0);
                    this.F0 = new gha(this, resources.getStringArray(R.array.exo_controls_playback_speeds), W1);
                    this.j1 = resources.getDrawable(i18, context.getTheme());
                    this.k1 = resources.getDrawable(i5, context.getTheme());
                    this.B1 = resources.getDrawable(i3, context.getTheme());
                    this.C1 = resources.getDrawable(i4, context.getTheme());
                    this.l1 = resources.getDrawable(i8, context.getTheme());
                    this.m1 = resources.getDrawable(i2, context.getTheme());
                    this.n1 = resources.getDrawable(i9, context.getTheme());
                    this.r1 = resources.getDrawable(i10, context.getTheme());
                    this.s1 = resources.getDrawable(i11, context.getTheme());
                    this.D1 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
                    this.E1 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
                    this.o1 = resources.getString(R.string.exo_controls_repeat_off_description);
                    this.p1 = resources.getString(R.string.exo_controls_repeat_one_description);
                    this.q1 = resources.getString(R.string.exo_controls_repeat_all_description);
                    this.v1 = resources.getString(R.string.exo_controls_shuffle_on_description);
                    this.w1 = resources.getString(R.string.exo_controls_shuffle_off_description);
                    thaVar.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
                    thaVar.h(this.O0, z8);
                    thaVar.h(this.P0, z7);
                    thaVar.h(imageView5, z6);
                    thaVar.h(imageView6, z5);
                    thaVar.h(imageView10, z4);
                    thaVar.h(this.V0, z3);
                    thaVar.h(imageView11, z2);
                    thaVar.h(imageView9, this.P1 != 0);
                    addOnLayoutChangeListener(new bha(0, this));
                }
                this.d1 = kxeVar;
                obj2 = kxeVar;
                obj = obj2;
                fp8Var = null;
                if (obj != null) {
                    dha dhaVar2 = this.d;
                    dhaVar2.getClass();
                    ((ot3) obj).P0.add(dhaVar2);
                }
                this.c = pqf.n(fp8Var);
                resources = context.getResources();
                this.b = resources;
                imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
                this.N0 = imageView4;
                if (imageView4 != null) {
                    imageView4.setOnClickListener(this.d);
                }
                imageView5 = (ImageView) findViewById(R.id.exo_prev);
                this.L0 = imageView5;
                if (imageView5 != null) {
                    imageView5.setImageDrawable(resources.getDrawable(resourceId, context.getTheme()));
                    imageView5.setOnClickListener(this.d);
                }
                imageView6 = (ImageView) findViewById(R.id.exo_next);
                this.M0 = imageView6;
                if (imageView6 != null) {
                    imageView6.setImageDrawable(resources.getDrawable(i6, context.getTheme()));
                    imageView6.setOnClickListener(this.d);
                }
                typefaceA = hyb.a(context, R.font.roboto_medium_numbers);
                imageView7 = (ImageView) findViewById(R.id.exo_rew);
                textView = (TextView) findViewById(R.id.exo_rew_with_amount);
                if (imageView7 != null) {
                    imageView7.setImageDrawable(resources.getDrawable(i, context.getTheme()));
                    this.P0 = imageView7;
                    this.R0 = null;
                } else if (textView != null) {
                    textView.setTypeface(typefaceA);
                    this.R0 = textView;
                    this.P0 = textView;
                } else {
                    this.R0 = null;
                    this.P0 = null;
                }
                view = this.P0;
                if (view != null) {
                    view.setOnClickListener(this.d);
                }
                imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
                textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
                if (imageView8 != null) {
                    imageView8.setImageDrawable(resources.getDrawable(i7, context.getTheme()));
                    this.O0 = imageView8;
                    this.Q0 = null;
                } else if (textView2 != null) {
                    textView2.setTypeface(typefaceA);
                    this.Q0 = textView2;
                    this.O0 = textView2;
                } else {
                    this.Q0 = null;
                    this.O0 = null;
                }
                view2 = this.O0;
                if (view2 != null) {
                    view2.setOnClickListener(this.d);
                }
                imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
                this.S0 = imageView9;
                if (imageView9 != null) {
                    imageView9.setOnClickListener(this.d);
                }
                imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
                this.T0 = imageView10;
                if (imageView10 != null) {
                    imageView10.setOnClickListener(this.d);
                }
                this.t1 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
                this.u1 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
                imageView11 = (ImageView) findViewById(R.id.exo_vr);
                this.U0 = imageView11;
                if (imageView11 != null) {
                    imageView11.setImageDrawable(resources.getDrawable(i13, context.getTheme()));
                    n(imageView11, false);
                }
                tha thaVar2 = new tha(this);
                this.a = thaVar2;
                thaVar2.D = z;
                jha jhaVar2 = new jha(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
                this.E0 = jhaVar2;
                this.K0 = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
                RecyclerView recyclerView2 = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
                this.z = recyclerView2;
                recyclerView2.setAdapter(jhaVar2);
                getContext();
                recyclerView2.setLayoutManager(new LinearLayoutManager());
                PopupWindow popupWindow2 = new PopupWindow((View) recyclerView2, -2, -2, true);
                this.J0 = popupWindow2;
                popupWindow2.setOnDismissListener(this.d);
                this.V1 = true;
                this.I0 = new m6c(getResources());
                this.x1 = resources.getDrawable(i12, context.getTheme());
                this.y1 = resources.getDrawable(i16, context.getTheme());
                this.z1 = resources.getString(R.string.exo_controls_cc_enabled_description);
                this.A1 = resources.getString(R.string.exo_controls_cc_disabled_description);
                this.G0 = new cha(this, 1);
                this.H0 = new cha(this, 0);
                this.F0 = new gha(this, resources.getStringArray(R.array.exo_controls_playback_speeds), W1);
                this.j1 = resources.getDrawable(i18, context.getTheme());
                this.k1 = resources.getDrawable(i5, context.getTheme());
                this.B1 = resources.getDrawable(i3, context.getTheme());
                this.C1 = resources.getDrawable(i4, context.getTheme());
                this.l1 = resources.getDrawable(i8, context.getTheme());
                this.m1 = resources.getDrawable(i2, context.getTheme());
                this.n1 = resources.getDrawable(i9, context.getTheme());
                this.r1 = resources.getDrawable(i10, context.getTheme());
                this.s1 = resources.getDrawable(i11, context.getTheme());
                this.D1 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
                this.E1 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
                this.o1 = resources.getString(R.string.exo_controls_repeat_off_description);
                this.p1 = resources.getString(R.string.exo_controls_repeat_one_description);
                this.q1 = resources.getString(R.string.exo_controls_repeat_all_description);
                this.v1 = resources.getString(R.string.exo_controls_shuffle_on_description);
                this.w1 = resources.getString(R.string.exo_controls_shuffle_off_description);
                thaVar2.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
                thaVar2.h(this.O0, z8);
                thaVar2.h(this.P0, z7);
                thaVar2.h(imageView5, z6);
                thaVar2.h(imageView6, z5);
                thaVar2.h(imageView10, z4);
                thaVar2.h(this.V0, z3);
                thaVar2.h(imageView11, z2);
                thaVar2.h(imageView9, this.P1 != 0);
                addOnLayoutChangeListener(new bha(0, this));
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused5) {
            cls = null;
        }
        this.v = cls;
        this.w = method3;
        this.x = method4;
        this.b1 = (TextView) findViewById(R.id.exo_duration);
        this.c1 = (TextView) findViewById(R.id.exo_position);
        imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.V0 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(this.d);
        }
        imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.W0 = imageView2;
        int i110 = 0;
        ahaVar = new aha(i110, this);
        if (imageView2 == null) {
            i17 = 8;
        } else {
            i17 = 8;
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(ahaVar);
        }
        imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.X0 = imageView3;
        ahaVar2 = new aha(i110, this);
        if (imageView3 != null) {
            imageView3.setVisibility(i17);
            imageView3.setOnClickListener(ahaVar2);
        }
        viewFindViewById = findViewById(R.id.exo_settings);
        this.Y0 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(this.d);
        }
        viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.Z0 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(this.d);
        }
        viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.a1 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(this.d);
        }
        kxeVar = (kxe) findViewById(R.id.exo_progress);
        viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (kxeVar != null) {
            if (viewFindViewById4 != null) {
                ot3 ot3Var2 = new ot3(context, attributeSet);
                ot3Var2.setId(R.id.exo_progress);
                ot3Var2.setLayoutParams(viewFindViewById4.getLayoutParams());
                ViewGroup viewGroup2 = (ViewGroup) viewFindViewById4.getParent();
                int iIndexOfChild2 = viewGroup2.indexOfChild(viewFindViewById4);
                viewGroup2.removeView(viewFindViewById4);
                viewGroup2.addView(ot3Var2, iIndexOfChild2);
                this.d1 = ot3Var2;
                obj2 = ot3Var2;
            } else {
                fp8Var = null;
                this.d1 = null;
                obj = null;
            }
            if (obj != null) {
                dha dhaVar3 = this.d;
                dhaVar3.getClass();
                ((ot3) obj).P0.add(dhaVar3);
            }
            this.c = pqf.n(fp8Var);
            resources = context.getResources();
            this.b = resources;
            imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
            this.N0 = imageView4;
            if (imageView4 != null) {
                imageView4.setOnClickListener(this.d);
            }
            imageView5 = (ImageView) findViewById(R.id.exo_prev);
            this.L0 = imageView5;
            if (imageView5 != null) {
                imageView5.setImageDrawable(resources.getDrawable(resourceId, context.getTheme()));
                imageView5.setOnClickListener(this.d);
            }
            imageView6 = (ImageView) findViewById(R.id.exo_next);
            this.M0 = imageView6;
            if (imageView6 != null) {
                imageView6.setImageDrawable(resources.getDrawable(i6, context.getTheme()));
                imageView6.setOnClickListener(this.d);
            }
            typefaceA = hyb.a(context, R.font.roboto_medium_numbers);
            imageView7 = (ImageView) findViewById(R.id.exo_rew);
            textView = (TextView) findViewById(R.id.exo_rew_with_amount);
            if (imageView7 != null) {
                imageView7.setImageDrawable(resources.getDrawable(i, context.getTheme()));
                this.P0 = imageView7;
                this.R0 = null;
            } else if (textView != null) {
                textView.setTypeface(typefaceA);
                this.R0 = textView;
                this.P0 = textView;
            } else {
                this.R0 = null;
                this.P0 = null;
            }
            view = this.P0;
            if (view != null) {
                view.setOnClickListener(this.d);
            }
            imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
            textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
            if (imageView8 != null) {
                imageView8.setImageDrawable(resources.getDrawable(i7, context.getTheme()));
                this.O0 = imageView8;
                this.Q0 = null;
            } else if (textView2 != null) {
                textView2.setTypeface(typefaceA);
                this.Q0 = textView2;
                this.O0 = textView2;
            } else {
                this.Q0 = null;
                this.O0 = null;
            }
            view2 = this.O0;
            if (view2 != null) {
                view2.setOnClickListener(this.d);
            }
            imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
            this.S0 = imageView9;
            if (imageView9 != null) {
                imageView9.setOnClickListener(this.d);
            }
            imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
            this.T0 = imageView10;
            if (imageView10 != null) {
                imageView10.setOnClickListener(this.d);
            }
            this.t1 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
            this.u1 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
            imageView11 = (ImageView) findViewById(R.id.exo_vr);
            this.U0 = imageView11;
            if (imageView11 != null) {
                imageView11.setImageDrawable(resources.getDrawable(i13, context.getTheme()));
                n(imageView11, false);
            }
            tha thaVar3 = new tha(this);
            this.a = thaVar3;
            thaVar3.D = z;
            jha jhaVar3 = new jha(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
            this.E0 = jhaVar3;
            this.K0 = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
            RecyclerView recyclerView3 = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
            this.z = recyclerView3;
            recyclerView3.setAdapter(jhaVar3);
            getContext();
            recyclerView3.setLayoutManager(new LinearLayoutManager());
            PopupWindow popupWindow3 = new PopupWindow((View) recyclerView3, -2, -2, true);
            this.J0 = popupWindow3;
            popupWindow3.setOnDismissListener(this.d);
            this.V1 = true;
            this.I0 = new m6c(getResources());
            this.x1 = resources.getDrawable(i12, context.getTheme());
            this.y1 = resources.getDrawable(i16, context.getTheme());
            this.z1 = resources.getString(R.string.exo_controls_cc_enabled_description);
            this.A1 = resources.getString(R.string.exo_controls_cc_disabled_description);
            this.G0 = new cha(this, 1);
            this.H0 = new cha(this, 0);
            this.F0 = new gha(this, resources.getStringArray(R.array.exo_controls_playback_speeds), W1);
            this.j1 = resources.getDrawable(i18, context.getTheme());
            this.k1 = resources.getDrawable(i5, context.getTheme());
            this.B1 = resources.getDrawable(i3, context.getTheme());
            this.C1 = resources.getDrawable(i4, context.getTheme());
            this.l1 = resources.getDrawable(i8, context.getTheme());
            this.m1 = resources.getDrawable(i2, context.getTheme());
            this.n1 = resources.getDrawable(i9, context.getTheme());
            this.r1 = resources.getDrawable(i10, context.getTheme());
            this.s1 = resources.getDrawable(i11, context.getTheme());
            this.D1 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
            this.E1 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
            this.o1 = resources.getString(R.string.exo_controls_repeat_off_description);
            this.p1 = resources.getString(R.string.exo_controls_repeat_one_description);
            this.q1 = resources.getString(R.string.exo_controls_repeat_all_description);
            this.v1 = resources.getString(R.string.exo_controls_shuffle_on_description);
            this.w1 = resources.getString(R.string.exo_controls_shuffle_off_description);
            thaVar3.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
            thaVar3.h(this.O0, z8);
            thaVar3.h(this.P0, z7);
            thaVar3.h(imageView5, z6);
            thaVar3.h(imageView6, z5);
            thaVar3.h(imageView10, z4);
            thaVar3.h(this.V0, z3);
            thaVar3.h(imageView11, z2);
            thaVar3.h(imageView9, this.P1 != 0);
            addOnLayoutChangeListener(new bha(0, this));
        }
        this.d1 = kxeVar;
        obj2 = kxeVar;
        obj = obj2;
        fp8Var = null;
        if (obj != null) {
            dha dhaVar4 = this.d;
            dhaVar4.getClass();
            ((ot3) obj).P0.add(dhaVar4);
        }
        this.c = pqf.n(fp8Var);
        resources = context.getResources();
        this.b = resources;
        imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
        this.N0 = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(this.d);
        }
        imageView5 = (ImageView) findViewById(R.id.exo_prev);
        this.L0 = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(resources.getDrawable(resourceId, context.getTheme()));
            imageView5.setOnClickListener(this.d);
        }
        imageView6 = (ImageView) findViewById(R.id.exo_next);
        this.M0 = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(i6, context.getTheme()));
            imageView6.setOnClickListener(this.d);
        }
        typefaceA = hyb.a(context, R.font.roboto_medium_numbers);
        imageView7 = (ImageView) findViewById(R.id.exo_rew);
        textView = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(i, context.getTheme()));
            this.P0 = imageView7;
            this.R0 = null;
        } else if (textView != null) {
            textView.setTypeface(typefaceA);
            this.R0 = textView;
            this.P0 = textView;
        } else {
            this.R0 = null;
            this.P0 = null;
        }
        view = this.P0;
        if (view != null) {
            view.setOnClickListener(this.d);
        }
        imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
        textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(i7, context.getTheme()));
            this.O0 = imageView8;
            this.Q0 = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceA);
            this.Q0 = textView2;
            this.O0 = textView2;
        } else {
            this.Q0 = null;
            this.O0 = null;
        }
        view2 = this.O0;
        if (view2 != null) {
            view2.setOnClickListener(this.d);
        }
        imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.S0 = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(this.d);
        }
        imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
        this.T0 = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(this.d);
        }
        this.t1 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.u1 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        imageView11 = (ImageView) findViewById(R.id.exo_vr);
        this.U0 = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(resources.getDrawable(i13, context.getTheme()));
            n(imageView11, false);
        }
        tha thaVar4 = new tha(this);
        this.a = thaVar4;
        thaVar4.D = z;
        jha jhaVar4 = new jha(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, context.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, context.getTheme())});
        this.E0 = jhaVar4;
        this.K0 = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView4 = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.z = recyclerView4;
        recyclerView4.setAdapter(jhaVar4);
        getContext();
        recyclerView4.setLayoutManager(new LinearLayoutManager());
        PopupWindow popupWindow4 = new PopupWindow((View) recyclerView4, -2, -2, true);
        this.J0 = popupWindow4;
        popupWindow4.setOnDismissListener(this.d);
        this.V1 = true;
        this.I0 = new m6c(getResources());
        this.x1 = resources.getDrawable(i12, context.getTheme());
        this.y1 = resources.getDrawable(i16, context.getTheme());
        this.z1 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.A1 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.G0 = new cha(this, 1);
        this.H0 = new cha(this, 0);
        this.F0 = new gha(this, resources.getStringArray(R.array.exo_controls_playback_speeds), W1);
        this.j1 = resources.getDrawable(i18, context.getTheme());
        this.k1 = resources.getDrawable(i5, context.getTheme());
        this.B1 = resources.getDrawable(i3, context.getTheme());
        this.C1 = resources.getDrawable(i4, context.getTheme());
        this.l1 = resources.getDrawable(i8, context.getTheme());
        this.m1 = resources.getDrawable(i2, context.getTheme());
        this.n1 = resources.getDrawable(i9, context.getTheme());
        this.r1 = resources.getDrawable(i10, context.getTheme());
        this.s1 = resources.getDrawable(i11, context.getTheme());
        this.D1 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.E1 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.o1 = resources.getString(R.string.exo_controls_repeat_off_description);
        this.p1 = resources.getString(R.string.exo_controls_repeat_one_description);
        this.q1 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.v1 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.w1 = resources.getString(R.string.exo_controls_shuffle_off_description);
        thaVar4.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        thaVar4.h(this.O0, z8);
        thaVar4.h(this.P0, z7);
        thaVar4.h(imageView5, z6);
        thaVar4.h(imageView6, z5);
        thaVar4.h(imageView10, z4);
        thaVar4.h(this.V0, z3);
        thaVar4.h(imageView11, z2);
        thaVar4.h(imageView9, this.P1 != 0);
        addOnLayoutChangeListener(new bha(0, this));
    }

    public static boolean b(zga zgaVar, fye fyeVar) {
        gye gyeVarM;
        int iO;
        y45 y45Var = (y45) zgaVar;
        if (!y45Var.v(17) || (iO = (gyeVarM = y45Var.m()).o()) <= 1 || iO > 100) {
            return false;
        }
        for (int i = 0; i < iO; i++) {
            if (gyeVarM.m(i, fyeVar, 0L).k == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        zga zgaVar = this.F1;
        if (zgaVar == null || !((y45) zgaVar).v(13)) {
            return;
        }
        y45 y45Var = (y45) this.F1;
        y45Var.Z();
        nga ngaVar = new nga(f, y45Var.n0.o.b);
        y45Var.Z();
        if (y45Var.n0.o.equals(ngaVar)) {
            return;
        }
        mga mgaVarG = y45Var.n0.g(ngaVar);
        y45Var.J++;
        y45Var.l.g.c(4, ngaVar).b();
        y45Var.X(mgaVarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00df  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00eb  */
    public final boolean c(KeyEvent keyEvent) {
        y45 y45Var;
        int keyCode = keyEvent.getKeyCode();
        zga zgaVar = this.F1;
        if (zgaVar == null || !(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                y45 y45Var2 = (y45) zgaVar;
                if (y45Var2.r() != 4 && y45Var2.v(12)) {
                    y45Var2.Z();
                    long jK = y45Var2.k() + y45Var2.k0;
                    long jP = y45Var2.p();
                    if (jP != -9223372036854775807L) {
                        jK = Math.min(jK, jP);
                    }
                    y45Var2.I(Math.max(jK, 0L));
                }
            } else if (keyCode == 89) {
                y45 y45Var3 = (y45) zgaVar;
                if (y45Var3.v(11)) {
                    y45Var3.Z();
                    long jK2 = y45Var3.k() + (-y45Var3.j0);
                    long jP2 = y45Var3.p();
                    if (jP2 != -9223372036854775807L) {
                        jK2 = Math.min(jK2, jP2);
                    }
                    y45Var3.I(Math.max(jK2, 0L));
                } else if (keyEvent.getRepeatCount() == 0) {
                    if (keyCode != 79 || keyCode == 85) {
                        if (pqf.P(zgaVar, this.J1)) {
                            pqf.A(zgaVar);
                        } else {
                            y45Var = (y45) zgaVar;
                            if (y45Var.v(1)) {
                                y45Var.P(false);
                            }
                        }
                    } else if (keyCode == 87) {
                        y45 y45Var4 = (y45) zgaVar;
                        if (y45Var4.v(9)) {
                            y45Var4.J();
                        }
                    } else if (keyCode == 88) {
                        y45 y45Var5 = (y45) zgaVar;
                        if (y45Var5.v(7)) {
                            y45Var5.K();
                        }
                    } else if (keyCode == 126) {
                        pqf.A(zgaVar);
                    } else if (keyCode == 127) {
                        String str = pqf.a;
                        y45 y45Var6 = (y45) zgaVar;
                        if (y45Var6.v(1)) {
                            y45Var6.P(false);
                        }
                    }
                }
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode != 79) {
                    if (pqf.P(zgaVar, this.J1)) {
                        pqf.A(zgaVar);
                    } else {
                        y45Var = (y45) zgaVar;
                        if (y45Var.v(1)) {
                            y45Var.P(false);
                        }
                    }
                } else if (pqf.P(zgaVar, this.J1)) {
                    pqf.A(zgaVar);
                } else {
                    y45Var = (y45) zgaVar;
                    if (y45Var.v(1)) {
                        y45Var.P(false);
                    }
                }
            }
        }
        return true;
    }

    public final void d(nkb nkbVar, View view) {
        this.z.setAdapter(nkbVar);
        u();
        this.V1 = false;
        PopupWindow popupWindow = this.J0;
        popupWindow.dismiss();
        this.V1 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i = this.K0;
        popupWindow.showAsDropDown(view, width - i, (-popupWindow.getHeight()) - i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return c(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00da  */
    public final yob e(f2f f2fVar, int i) {
        String strA;
        String string;
        String strC;
        int i2 = 4;
        ynb.D(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        jy6 jy6Var = f2fVar.a;
        int i3 = 0;
        int i4 = 0;
        while (i3 < jy6Var.size()) {
            e2f e2fVar = (e2f) jy6Var.get(i3);
            if (e2fVar.b.c == i) {
                int i5 = 0;
                while (i5 < e2fVar.a) {
                    if (e2fVar.d[i5] == i2) {
                        rr5 rr5Var = e2fVar.b.d[i5];
                        int i6 = rr5Var.e;
                        int i7 = rr5Var.k;
                        if ((i6 & 2) == 0) {
                            m6c m6cVar = this.I0;
                            Resources resources = (Resources) m6cVar.b;
                            Resources resources2 = (Resources) m6cVar.b;
                            String str = rr5Var.p;
                            int i8 = rr5Var.J;
                            int i9 = rr5Var.x;
                            int i10 = i4;
                            int i11 = rr5Var.w;
                            String str2 = rr5Var.l;
                            int iG = qv8.g(str);
                            if (iG == -1) {
                                String str3 = null;
                                if (str2 == null) {
                                    strC = null;
                                    break;
                                }
                                String[] strArrSplit = TextUtils.isEmpty(str2) ? new String[0] : str2.trim().split("(\\s*,\\s*)", -1);
                                int length = strArrSplit.length;
                                String[] strArr = strArrSplit;
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= length) {
                                        strC = null;
                                        break;
                                    }
                                    strC = qv8.c(strArr[i12]);
                                    if (strC != null && qv8.k(strC)) {
                                        break;
                                    }
                                    i12++;
                                }
                                if (strC == null) {
                                    if (str2 != null) {
                                        for (String str4 : TextUtils.isEmpty(str2) ? new String[0] : str2.trim().split("(\\s*,\\s*)", -1)) {
                                            String strC2 = qv8.c(str4);
                                            if (strC2 != null && qv8.h(strC2)) {
                                                str3 = strC2;
                                                break;
                                            }
                                        }
                                    }
                                    if (str3 != null) {
                                        iG = 1;
                                    } else if (i11 != -1 || i9 != -1) {
                                        iG = 2;
                                    } else if (i8 == -1 && rr5Var.L == -1) {
                                        iG = -1;
                                    } else {
                                        iG = 1;
                                    }
                                } else {
                                    iG = 2;
                                }
                            }
                            if (iG == 2) {
                                strA = m6cVar.G(m6cVar.h(rr5Var), (i11 == -1 || i9 == -1) ? "" : resources.getString(R.string.exo_track_resolution, Integer.valueOf(i11), Integer.valueOf(i9)), i7 != -1 ? resources2.getString(R.string.exo_track_bitrate, Float.valueOf(i7 / 1000000.0f)) : "");
                            } else if (iG == 1) {
                                String strA2 = m6cVar.a(rr5Var);
                                if (i8 == -1 || i8 < 1) {
                                    string = "";
                                } else if (i8 == 1) {
                                    string = resources.getString(R.string.exo_track_mono);
                                } else if (i8 == 2) {
                                    string = resources.getString(R.string.exo_track_stereo);
                                } else if (i8 == 6 || i8 == 7) {
                                    string = resources.getString(R.string.exo_track_surround_5_point_1);
                                } else {
                                    string = i8 != 8 ? resources.getString(R.string.exo_track_surround) : resources.getString(R.string.exo_track_surround_7_point_1);
                                }
                                strA = m6cVar.G(strA2, string, i7 != -1 ? resources2.getString(R.string.exo_track_bitrate, Float.valueOf(i7 / 1000000.0f)) : "");
                            } else {
                                strA = m6cVar.a(rr5Var);
                            }
                            if (strA.isEmpty()) {
                                String str5 = rr5Var.d;
                                strA = (str5 == null || str5.trim().isEmpty()) ? resources.getString(R.string.exo_track_unknown) : resources.getString(R.string.exo_track_unknown_name, str5);
                            }
                            lha lhaVar = new lha(f2fVar, i3, i5, strA);
                            i4 = i10 + 1;
                            int iF = yx6.f(objArrCopyOf.length, i4);
                            if (iF > objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iF);
                            }
                            objArrCopyOf[i10] = lhaVar;
                        }
                    }
                    i5++;
                    jy6Var = jy6Var;
                    e2fVar = e2fVar;
                    i2 = 4;
                }
            }
            i3++;
            jy6Var = jy6Var;
            i2 = 4;
        }
        return jy6.k(i4, objArrCopyOf);
    }

    public final void f() {
        tha thaVar = this.a;
        int i = thaVar.A;
        if (i == 3 || i == 2) {
            return;
        }
        thaVar.f();
        if (!thaVar.D) {
            thaVar.i(2);
        } else if (thaVar.A == 1) {
            thaVar.n.start();
        } else {
            thaVar.o.start();
        }
    }

    public final boolean g(zga zgaVar) {
        Class cls;
        return (zgaVar == null || (cls = this.v) == null || !cls.isAssignableFrom(zgaVar.getClass())) ? false : true;
    }

    public zga getPlayer() {
        return this.F1;
    }

    public int getRepeatToggleModes() {
        return this.P1;
    }

    public boolean getShowShuffleButton() {
        return this.a.b(this.T0);
    }

    public boolean getShowSubtitleButton() {
        return this.a.b(this.V0);
    }

    public int getShowTimeoutMs() {
        return this.M1;
    }

    public boolean getShowVrButton() {
        return this.a.b(this.U0);
    }

    public final boolean h(zga zgaVar) {
        Class cls;
        return (zgaVar == null || (cls = this.e) == null || !cls.isAssignableFrom(zgaVar.getClass())) ? false : true;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    public final boolean i() {
        tha thaVar = this.a;
        return thaVar.A == 0 && thaVar.a.k();
    }

    public final boolean j(zga zgaVar) {
        try {
            if (h(zgaVar)) {
                Method method = this.g;
                method.getClass();
                Object objInvoke = method.invoke(zgaVar, null);
                objInvoke.getClass();
                if (((Boolean) objInvoke).booleanValue()) {
                    return true;
                }
            }
            if (g(zgaVar)) {
                Method method2 = this.x;
                method2.getClass();
                Object objInvoke2 = method2.invoke(zgaVar, null);
                objInvoke2.getClass();
                if (((Boolean) objInvoke2).booleanValue()) {
                    return true;
                }
            }
            return false;
        } catch (IllegalAccessException e) {
            e = e;
            yg5.p(e);
            return false;
        } catch (InvocationTargetException e2) {
            e = e2;
            yg5.p(e);
            return false;
        }
    }

    public final boolean k() {
        return getVisibility() == 0;
    }

    public final void l(zga zgaVar, long j) {
        if (this.K1) {
            y45 y45Var = (y45) zgaVar;
            if (y45Var.v(17) && y45Var.v(10)) {
                gye gyeVarM = y45Var.m();
                int iO = gyeVarM.o();
                int i = 0;
                while (true) {
                    long jR = pqf.R(gyeVarM.m(i, this.h1, 0L).k);
                    if (j < jR) {
                        break;
                    }
                    if (i == iO - 1) {
                        j = jR;
                        break;
                    } else {
                        j -= jR;
                        i++;
                    }
                }
                y45Var.H(i, j, false);
            }
        } else {
            y45 y45Var2 = (y45) zgaVar;
            if (y45Var2.v(5)) {
                y45Var2.I(j);
            }
        }
        s();
    }

    public final void m() {
        q();
        p();
        t();
        v();
        x();
        r();
        w();
    }

    public final void n(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.t1 : this.u1);
    }

    public final void o(boolean z) {
        if (this.G1 == z) {
            return;
        }
        this.G1 = z;
        String str = this.E1;
        Drawable drawable = this.C1;
        String str2 = this.D1;
        Drawable drawable2 = this.B1;
        ImageView imageView = this.W0;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.X0;
        if (imageView2 == null) {
            return;
        }
        if (z) {
            imageView2.setImageDrawable(drawable2);
            imageView2.setContentDescription(str2);
        } else {
            imageView2.setImageDrawable(drawable);
            imageView2.setContentDescription(str);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        tha thaVar = this.a;
        thaVar.a.addOnLayoutChangeListener(thaVar.y);
        this.H1 = true;
        if (i()) {
            thaVar.g();
        }
        m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        tha thaVar = this.a;
        thaVar.a.removeOnLayoutChangeListener(thaVar.y);
        this.H1 = false;
        removeCallbacks(this.i1);
        thaVar.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.a.b;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public final void p() {
        boolean zV;
        boolean zV2;
        boolean zV3;
        boolean zV4;
        boolean zV5;
        long j;
        long j2;
        if (k() && this.H1) {
            zga zgaVar = this.F1;
            if (zgaVar != null) {
                zV = (this.I1 && b(zgaVar, this.h1)) ? ((y45) zgaVar).v(10) : ((y45) zgaVar).v(5);
                y45 y45Var = (y45) zgaVar;
                zV3 = y45Var.v(7);
                zV4 = y45Var.v(11);
                zV5 = y45Var.v(12);
                zV2 = y45Var.v(9);
            } else {
                zV = false;
                zV2 = false;
                zV3 = false;
                zV4 = false;
                zV5 = false;
            }
            Resources resources = this.b;
            View view = this.P0;
            if (zV4) {
                zga zgaVar2 = this.F1;
                if (zgaVar2 != null) {
                    y45 y45Var2 = (y45) zgaVar2;
                    y45Var2.Z();
                    j2 = y45Var2.j0;
                } else {
                    j2 = 5000;
                }
                int i = (int) (j2 / 1000);
                TextView textView = this.R0;
                if (textView != null) {
                    textView.setText(String.valueOf(i));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i, Integer.valueOf(i)));
                }
            }
            View view2 = this.O0;
            if (zV5) {
                zga zgaVar3 = this.F1;
                if (zgaVar3 != null) {
                    y45 y45Var3 = (y45) zgaVar3;
                    y45Var3.Z();
                    j = y45Var3.k0;
                } else {
                    j = 15000;
                }
                int i2 = (int) (j / 1000);
                TextView textView2 = this.Q0;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i2));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i2, Integer.valueOf(i2)));
                }
            }
            n(this.L0, zV3);
            n(view, zV4);
            n(view2, zV5);
            n(this.M0, zV2);
            kxe kxeVar = this.d1;
            if (kxeVar != null) {
                ((ot3) kxeVar).setEnabled(zV);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    public final void q() {
        ImageView imageView;
        boolean z;
        if (k() && this.H1 && (imageView = this.N0) != null) {
            boolean zP = pqf.P(this.F1, this.J1);
            Drawable drawable = zP ? this.j1 : this.k1;
            int i = zP ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.b.getString(i));
            zga zgaVar = this.F1;
            boolean z2 = false;
            if (zgaVar != null) {
                y45 y45Var = (y45) zgaVar;
                int iR = y45Var.r();
                if (y45Var.v(16)) {
                    gye gyeVarM = y45Var.m();
                    if ((gyeVarM.p() ? null : gyeVarM.m(y45Var.i(), y45Var.a, 0L).b) != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = true;
                }
                boolean zV = y45Var.v(1);
                boolean z3 = iR == 1 && y45Var.v(2);
                boolean z4 = iR == 4 && y45Var.v(4);
                if (z && (zV || z3 || z4)) {
                    z2 = true;
                }
            }
            n(imageView, z2);
        }
    }

    public final void r() {
        gha ghaVar;
        zga zgaVar = this.F1;
        if (zgaVar == null) {
            return;
        }
        y45 y45Var = (y45) zgaVar;
        y45Var.Z();
        float f = y45Var.n0.o.a;
        float f2 = Float.MAX_VALUE;
        int i = 0;
        int i2 = 0;
        while (true) {
            ghaVar = this.F0;
            float[] fArr = ghaVar.c;
            if (i >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs < f2) {
                i2 = i;
                f2 = fAbs;
            }
            i++;
        }
        ghaVar.d = i2;
        String str = ghaVar.b[i2];
        jha jhaVar = this.E0;
        jhaVar.c[0] = str;
        n(this.Y0, jhaVar.d(1) || jhaVar.d(0));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002f  */
    public final void s() {
        long jF;
        long jE;
        if (k() && this.H1) {
            zga zgaVar = this.F1;
            if (zgaVar != null) {
                y45 y45Var = (y45) zgaVar;
                if (y45Var.v(16)) {
                    long j = this.U1;
                    y45Var.Z();
                    jF = y45Var.f(y45Var.n0) + j;
                    jE = y45Var.e() + this.U1;
                } else {
                    jF = 0;
                    jE = 0;
                }
            } else {
                jF = 0;
                jE = 0;
            }
            TextView textView = this.c1;
            if (textView != null && !this.L1) {
                textView.setText(pqf.x(this.e1, this.f1, jF));
            }
            kxe kxeVar = this.d1;
            if (kxeVar != null) {
                ot3 ot3Var = (ot3) kxeVar;
                ot3Var.setPosition(jF);
                if (j(zgaVar)) {
                    jE = jF;
                }
                ot3Var.setBufferedPosition(jE);
            }
            m45 m45Var = this.i1;
            removeCallbacks(m45Var);
            int iR = zgaVar == null ? 1 : ((y45) zgaVar).r();
            if (zgaVar != null) {
                y45 y45Var2 = (y45) zgaVar;
                if (y45Var2.x()) {
                    long jMin = Math.min(kxeVar != null ? ((ot3) kxeVar).getPreferredUpdateDelay() : 1000L, 1000 - (jF % 1000));
                    y45Var2.Z();
                    float f = y45Var2.n0.o.a;
                    postDelayed(m45Var, pqf.i(f > 0.0f ? (long) (jMin / f) : 1000L, this.O1, 1000L));
                    return;
                }
            }
            if (iR == 4 || iR == 1) {
                return;
            }
            postDelayed(m45Var, 1000L);
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.a.D = z;
    }

    public void setMediaRouteButtonViewProvider(wwf wwfVar) {
        View viewFindViewById = findViewById(R.id.exo_media_route_button_placeholder);
        if (viewFindViewById == null) {
            qc0.p("The media route button placeholder is missing.");
            return;
        }
        if (wwfVar == null) {
            viewFindViewById.setVisibility(8);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
        if (viewGroup == null) {
            qc0.p("The media route button placeholder has no parent view.");
            return;
        }
        m88 m88VarA = wwfVar.a();
        gg7 gg7Var = new gg7(this, viewFindViewById, viewGroup);
        Handler handler = this.c;
        Objects.requireNonNull(handler);
        m88VarA.b(new v36(0, m88VarA, gg7Var), new xk0(handler, 1));
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(eha ehaVar) {
        boolean z = ehaVar != null;
        ImageView imageView = this.W0;
        if (imageView != null) {
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z2 = ehaVar != null;
        ImageView imageView2 = this.X0;
        if (imageView2 == null) {
            return;
        }
        if (z2) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(zga zgaVar) {
        pa7.J(Looper.myLooper() == Looper.getMainLooper());
        pa7.A(zgaVar == null || ((y45) zgaVar).t == Looper.getMainLooper());
        zga zgaVar2 = this.F1;
        if (zgaVar2 == zgaVar) {
            return;
        }
        dha dhaVar = this.d;
        if (zgaVar2 != null) {
            ((y45) zgaVar2).F(dhaVar);
        }
        this.F1 = zgaVar;
        if (zgaVar != null) {
            f98 f98Var = ((y45) zgaVar).m;
            dhaVar.getClass();
            f98Var.a(dhaVar);
        }
        m();
    }

    public void setRepeatToggleModes(int i) {
        this.P1 = i;
        zga zgaVar = this.F1;
        if (zgaVar != null && ((y45) zgaVar).v(15)) {
            y45 y45Var = (y45) this.F1;
            y45Var.Z();
            int i2 = y45Var.H;
            if (i == 0 && i2 != 0) {
                ((y45) this.F1).Q(0);
            } else if (i == 1 && i2 == 2) {
                ((y45) this.F1).Q(1);
            } else if (i == 2 && i2 == 1) {
                ((y45) this.F1).Q(2);
            }
        }
        this.a.h(this.S0, i != 0);
        t();
    }

    public void setShowFastForwardButton(boolean z) {
        this.a.h(this.O0, z);
        p();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.I1 = z;
        w();
    }

    public void setShowNextButton(boolean z) {
        this.a.h(this.M0, z);
        p();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.J1 = z;
        q();
    }

    public void setShowPreviousButton(boolean z) {
        this.a.h(this.L0, z);
        p();
    }

    public void setShowRewindButton(boolean z) {
        this.a.h(this.P0, z);
        p();
    }

    public void setShowShuffleButton(boolean z) {
        this.a.h(this.T0, z);
        v();
    }

    public void setShowSubtitleButton(boolean z) {
        this.a.h(this.V0, z);
    }

    public void setShowTimeoutMs(int i) {
        this.M1 = i;
        if (i()) {
            this.a.g();
        }
    }

    public void setShowVrButton(boolean z) {
        this.a.h(this.U0, z);
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.O1 = pqf.h(i, 16, 1000);
    }

    public void setTimeBarScrubbingEnabled(boolean z) {
        this.N1 = z;
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.U0;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            n(imageView, onClickListener != null);
        }
    }

    public final void t() {
        ImageView imageView;
        if (k() && this.H1 && (imageView = this.S0) != null) {
            if (this.P1 == 0) {
                n(imageView, false);
                return;
            }
            zga zgaVar = this.F1;
            String str = this.o1;
            Drawable drawable = this.l1;
            if (zgaVar != null) {
                y45 y45Var = (y45) zgaVar;
                if (y45Var.v(15)) {
                    n(imageView, true);
                    y45Var.Z();
                    int i = y45Var.H;
                    if (i == 0) {
                        imageView.setImageDrawable(drawable);
                        imageView.setContentDescription(str);
                        return;
                    } else if (i == 1) {
                        imageView.setImageDrawable(this.m1);
                        imageView.setContentDescription(this.p1);
                        return;
                    } else {
                        if (i != 2) {
                            return;
                        }
                        imageView.setImageDrawable(this.n1);
                        imageView.setContentDescription(this.q1);
                        return;
                    }
                }
            }
            n(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public final void u() {
        RecyclerView recyclerView = this.z;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i = this.K0;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i * 2));
        PopupWindow popupWindow = this.J0;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i * 2), recyclerView.getMeasuredHeight()));
    }

    public final void v() {
        ImageView imageView;
        if (k() && this.H1 && (imageView = this.T0) != null) {
            zga zgaVar = this.F1;
            if (!this.a.b(imageView)) {
                n(imageView, false);
                return;
            }
            String str = this.w1;
            Drawable drawable = this.s1;
            if (zgaVar != null) {
                y45 y45Var = (y45) zgaVar;
                if (y45Var.v(14)) {
                    n(imageView, true);
                    y45Var.Z();
                    if (y45Var.I) {
                        drawable = this.r1;
                    }
                    imageView.setImageDrawable(drawable);
                    y45Var.Z();
                    if (y45Var.I) {
                        str = this.v1;
                    }
                    imageView.setContentDescription(str);
                    return;
                }
            }
            n(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [eye, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r2v11, types: [gye] */
    /* JADX WARN: Type inference failed for: r2v13, types: [gye] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    /* JADX WARN: Type inference failed for: r5v16, types: [qf] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void w() {
        boolean z;
        long j;
        long jH;
        int i;
        long jR;
        ?? r4;
        ?? r2;
        ?? r24;
        boolean z2;
        ?? r3;
        boolean[] zArr;
        boolean z3;
        ?? r25;
        int length;
        zga zgaVar = this.F1;
        if (zgaVar == null) {
            return;
        }
        boolean z4 = this.I1;
        fye fyeVar = this.h1;
        boolean z5 = false;
        boolean z6 = true;
        this.K1 = z4 && b(zgaVar, fyeVar);
        long j2 = 0;
        this.U1 = 0L;
        y45 y45Var = (y45) zgaVar;
        gye gyeVarM = y45Var.v(17) ? y45Var.m() : gye.a;
        if (gyeVarM.p()) {
            z = true;
            if (y45Var.v(16)) {
                gye gyeVarM2 = y45Var.m();
                if (gyeVarM2.p()) {
                    jR = -9223372036854775807L;
                    j = 0;
                } else {
                    j = 0;
                    jR = pqf.R(gyeVarM2.m(y45Var.i(), y45Var.a, 0L).k);
                }
                if (jR != -9223372036854775807L) {
                    jH = pqf.H(jR);
                }
                i = 0;
            } else {
                j = 0;
            }
            jH = j;
            i = 0;
        } else {
            int i2 = y45Var.i();
            boolean z7 = this.K1;
            int i3 = z7 ? 0 : i2;
            int iO = z7 ? gyeVarM.o() - 1 : i2;
            i = 0;
            long j3 = 0;
            ?? r5 = gyeVarM;
            while (i3 <= iO) {
                long j4 = -9223372036854775807L;
                if (i3 == i2) {
                    this.U1 = pqf.R(j3);
                }
                r5.n(i3, fyeVar);
                if (fyeVar.k == -9223372036854775807L) {
                    pa7.J(this.K1 ^ z6);
                    break;
                }
                int i4 = fyeVar.l;
                ?? r6 = r5;
                boolean z8 = z5;
                while (i4 <= fyeVar.m) {
                    ?? r10 = this.g1;
                    r6.f(i4, r10, z8);
                    r10.getClass();
                    long j5 = j4;
                    int i5 = qf.c.a;
                    while (r4 < i5) {
                        r10.d(r4);
                        long j6 = j2;
                        long j7 = r10.e;
                        if (j7 >= j6) {
                            long[] jArr = this.Q1;
                            if (i == jArr.length) {
                                if (jArr.length == 0) {
                                    r2 = r6;
                                    r4 = z8;
                                    length = 1;
                                } else {
                                    r2 = r6;
                                    r4 = z8;
                                    length = jArr.length * 2;
                                }
                                this.Q1 = Arrays.copyOf(jArr, length);
                                this.R1 = Arrays.copyOf(this.R1, length);
                            }
                            r2 = r6;
                            r4 = z8;
                            this.Q1[i] = pqf.R(j7 + j3);
                            boolean[] zArr2 = this.R1;
                            of ofVarA = qf.c.a(r4);
                            int i6 = ofVarA.a;
                            if (i6 == -1) {
                                zArr = zArr2;
                                r25 = r2;
                                z2 = true;
                            } else {
                                int i7 = 0;
                                while (true) {
                                    if (i7 >= i6) {
                                        r3 = r2;
                                        zArr = zArr2;
                                        r24 = r3;
                                        z2 = true;
                                        z3 = false;
                                        break;
                                    }
                                    zArr = zArr2;
                                    int i8 = ofVarA.d[i7];
                                    r25 = r3;
                                    z2 = true;
                                    if (i8 == 0) {
                                        r3 = r2;
                                    } else if (i8 != 1) {
                                        i7++;
                                        zArr2 = zArr;
                                        r3 = r25;
                                    }
                                }
                                zArr[i] = z3 ^ z2;
                                i++;
                            }
                            z3 = z2;
                            r24 = r25;
                            zArr[i] = z3 ^ z2;
                            i++;
                        } else {
                            r2 = r6;
                            r4 = z8;
                            r24 = r2;
                            z2 = z6;
                        }
                        z6 = z2;
                        j2 = j6;
                        i2 = i2;
                        r2 = r24;
                        r4++;
                    }
                    r2 = r6;
                    r4 = z8;
                    i4++;
                    j4 = j5;
                    r6 = r2;
                    z8 = false;
                }
                j3 += fyeVar.k;
                i3++;
                z6 = z6;
                r5 = r6;
                z5 = false;
            }
            z = z6;
            jH = j3;
        }
        long jR2 = pqf.R(jH);
        TextView textView = this.b1;
        if (textView != null) {
            textView.setText(pqf.x(this.e1, this.f1, jR2));
        }
        kxe kxeVar = this.d1;
        if (kxeVar != null) {
            ot3 ot3Var = (ot3) kxeVar;
            ot3Var.setDuration(jR2);
            long[] jArr2 = this.S1;
            int length2 = jArr2.length;
            int i9 = i + length2;
            long[] jArr3 = this.Q1;
            if (i9 > jArr3.length) {
                this.Q1 = Arrays.copyOf(jArr3, i9);
                this.R1 = Arrays.copyOf(this.R1, i9);
            }
            System.arraycopy(jArr2, 0, this.Q1, i, length2);
            System.arraycopy(this.T1, 0, this.R1, i, length2);
            long[] jArr4 = this.Q1;
            boolean[] zArr3 = this.R1;
            if (i9 != 0 && (jArr4 == null || zArr3 == null)) {
                z = false;
            }
            pa7.A(z);
            ot3Var.e1 = i9;
            ot3Var.f1 = jArr4;
            ot3Var.g1 = zArr3;
            ot3Var.e();
        }
        s();
    }

    public final void x() {
        cha chaVar = this.G0;
        chaVar.getClass();
        List list = Collections.EMPTY_LIST;
        chaVar.b = list;
        cha chaVar2 = this.H0;
        chaVar2.getClass();
        chaVar2.b = list;
        zga zgaVar = this.F1;
        ImageView imageView = this.V0;
        if (zgaVar != null && ((y45) zgaVar).v(30) && ((y45) this.F1).v(29)) {
            f2f f2fVarN = ((y45) this.F1).n();
            yob yobVarE = e(f2fVarN, 1);
            chaVar2.b = yobVarE;
            oha ohaVar = chaVar2.e;
            zga zgaVar2 = ohaVar.F1;
            jha jhaVar = ohaVar.E0;
            zgaVar2.getClass();
            q1f q1fVarU = ((y45) zgaVar2).u();
            if (yobVarE.isEmpty()) {
                jhaVar.c[1] = ohaVar.getResources().getString(R.string.exo_track_selection_none);
            } else if (chaVar2.d(q1fVarU)) {
                for (int i = 0; i < yobVarE.d; i++) {
                    lha lhaVar = (lha) yobVarE.get(i);
                    if (lhaVar.a.e[lhaVar.b]) {
                        jhaVar.c[1] = lhaVar.c;
                        break;
                    }
                }
            } else {
                jhaVar.c[1] = ohaVar.getResources().getString(R.string.exo_track_selection_auto);
            }
            if (this.a.b(imageView)) {
                chaVar.e(e(f2fVarN, 3));
            } else {
                ey6 ey6Var = jy6.b;
                chaVar.e(yob.e);
            }
        }
        n(imageView, chaVar.a() > 0);
        jha jhaVar2 = this.E0;
        n(this.Y0, jhaVar2.d(1) || jhaVar2.d(0));
    }

    public void setProgressUpdateListener(hha hhaVar) {
    }
}
