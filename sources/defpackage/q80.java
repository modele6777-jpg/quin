package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q80 extends i80 implements or8, LayoutInflater.Factory2 {
    public static final wid u1 = new wid(0);
    public static final int[] v1 = {R.attr.windowBackground};
    public static final boolean w1 = !"robolectric".equals(Build.FINGERPRINT);
    public CharSequence E0;
    public ActionBarOverlayLayout F0;
    public ssg G0;
    public m6c H0;
    public cd I0;
    public ActionBarContextView J0;
    public PopupWindow K0;
    public j80 L0;
    public boolean N0;
    public ViewGroup O0;
    public TextView P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public boolean W0;
    public l80 X;
    public boolean X0;
    public c7g Y;
    public p80[] Y0;
    public c9e Z;
    public p80 Z0;
    public boolean a1;
    public boolean b1;
    public boolean c1;
    public boolean d1;
    public Configuration e1;
    public final int f1;
    public int g1;
    public int h1;
    public boolean i1;
    public m80 j1;
    public m80 k1;
    public boolean l1;
    public int m1;
    public boolean o1;
    public Rect p1;
    public Rect q1;
    public ea0 r1;
    public OnBackInvokedDispatcher s1;
    public r60 t1;
    public final Object x;
    public final Context y;
    public Window z;
    public swf M0 = null;
    public final j80 n1 = new j80(this, 0);

    public q80(Context context, Window window, d80 d80Var, Object obj) {
        y70 y70Var = null;
        this.f1 = -100;
        this.y = context;
        this.x = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof y70)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    y70Var = (y70) context;
                    break;
                }
            }
            if (y70Var != null) {
                this.f1 = ((q80) y70Var.s()).f1;
            }
        }
        if (this.f1 == -100) {
            String name = this.x.getClass().getName();
            wid widVar = u1;
            Integer num = (Integer) widVar.get(name);
            if (num != null) {
                this.f1 = num.intValue();
                widVar.remove(this.x.getClass().getName());
            }
        }
        if (window != null) {
            q(window);
        }
        s80.c();
    }

    public static td8 r(Context context) {
        td8 td8Var;
        td8 td8VarC;
        if (Build.VERSION.SDK_INT >= 33 || (td8Var = i80.c) == null) {
            return null;
        }
        ud8 ud8Var = td8Var.a;
        td8 td8VarA = td8.a(context.getApplicationContext().getResources().getConfiguration().getLocales().toLanguageTags());
        if (ud8Var.a.isEmpty()) {
            td8VarC = td8.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < td8VarA.a.a.size() + ud8Var.a.size()) {
                Locale localeB = i < ud8Var.a.size() ? td8Var.b(i) : td8VarA.b(i - ud8Var.a.size());
                if (localeB != null) {
                    linkedHashSet.add(localeB);
                }
                i++;
            }
            td8VarC = td8.c(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()])));
        }
        return td8VarC.a.a.isEmpty() ? td8VarA : td8VarC;
    }

    public static Configuration v(Context context, int i, td8 td8Var, Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (td8Var != null) {
            configuration2.setLocales(LocaleList.forLanguageTags(td8Var.a.a.toLanguageTags()));
        }
        return configuration2;
    }

    public final j6 A(Context context) {
        m80 m80Var = this.j1;
        if (m80Var == null) {
            psd psdVar = psd.e;
            if (psdVar == null) {
                Context applicationContext = context.getApplicationContext();
                psdVar = new psd(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
                psd.e = psdVar;
            }
            m80Var = new m80(this, psdVar);
            this.j1 = m80Var;
        }
        return m80Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.j() != false) goto L20;
     */
    @Override // defpackage.or8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(defpackage.qr8 r6) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q80.B(qr8):void");
    }

    public final p80 C(int i) {
        p80[] p80VarArr = this.Y0;
        if (p80VarArr == null || p80VarArr.length <= i) {
            p80[] p80VarArr2 = new p80[i + 1];
            if (p80VarArr != null) {
                System.arraycopy(p80VarArr, 0, p80VarArr2, 0, p80VarArr.length);
            }
            this.Y0 = p80VarArr2;
            p80VarArr = p80VarArr2;
        }
        p80 p80Var = p80VarArr[i];
        if (p80Var != null) {
            return p80Var;
        }
        p80 p80Var2 = new p80();
        p80Var2.a = i;
        p80Var2.n = false;
        p80VarArr[i] = p80Var2;
        return p80Var2;
    }

    public final void D() {
        c7g c7gVar;
        y();
        if (this.S0 && (c7gVar = this.Y) == null) {
            Object obj = this.x;
            if (obj instanceof Activity) {
                c7gVar = new c7g((Activity) obj, this.T0);
                this.Y = c7gVar;
            } else if (obj instanceof Dialog) {
                c7gVar = new c7g((Dialog) obj);
                this.Y = c7gVar;
            }
            if (c7gVar != null) {
                boolean z = this.o1;
                if (c7gVar.h) {
                    return;
                }
                int i = z ? 4 : 0;
                wze wzeVar = (wze) c7gVar.e;
                int i2 = wzeVar.b;
                c7gVar.h = true;
                wzeVar.a((i & 4) | (i2 & (-5)));
            }
        }
    }

    public final void E(int i) {
        this.m1 = (1 << i) | this.m1;
        if (this.l1) {
            return;
        }
        View decorView = this.z.getDecorView();
        WeakHashMap weakHashMap = nvf.a;
        decorView.postOnAnimation(this.n1);
        this.l1 = true;
    }

    public final int F(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            qc0.p("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        m80 m80Var = this.k1;
                        if (m80Var == null) {
                            m80Var = new m80(this, context);
                            this.k1 = m80Var;
                        }
                        return m80Var.i();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return A(context).i();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean G() {
        xm3 xm3Var;
        oze ozeVar;
        boolean z = this.a1;
        this.a1 = false;
        p80 p80VarC = C(0);
        if (!p80VarC.m) {
            cd cdVar = this.I0;
            if (cdVar != null) {
                cdVar.b();
                return true;
            }
            D();
            c7g c7gVar = this.Y;
            if (c7gVar == null || (xm3Var = c7gVar.e) == null || (ozeVar = ((wze) xm3Var).a.d1) == null || ozeVar.b == null) {
                return false;
            }
            oze ozeVar2 = ((wze) xm3Var).a.d1;
            vr8 vr8Var = ozeVar2 == null ? null : ozeVar2.b;
            if (vr8Var != null) {
                vr8Var.collapseActionView();
            }
        } else if (!z) {
            u(p80VarC, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0170, code lost:
    
        if (r6.getCount() > 0) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(defpackage.p80 r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q80.H(p80, android.view.KeyEvent):void");
    }

    public final boolean I(p80 p80Var, int i, KeyEvent keyEvent) {
        qr8 qr8Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((p80Var.k || J(p80Var, keyEvent)) && (qr8Var = p80Var.h) != null) {
            return qr8Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ce A[PHI: r6
  0x00ce: PHI (r6v2 qr8) = (r6v1 qr8), (r6v8 qr8) binds: [B:31:0x004c, B:57:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:79:0x010a  */
    public final boolean J(p80 p80Var, KeyEvent keyEvent) {
        qr8 qr8Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        ssg ssgVar;
        Resources.Theme themeNewTheme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.d1) {
            boolean z = p80Var.k;
            int i = p80Var.a;
            if (z) {
                return true;
            }
            p80 p80Var2 = this.Z0;
            if (p80Var2 != null && p80Var2 != p80Var) {
                u(p80Var2, false);
            }
            Window.Callback callback = this.z.getCallback();
            if (callback != null) {
                p80Var.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.F0) != null) {
                actionBarOverlayLayout4.j();
                ((wze) actionBarOverlayLayout4.e).l = true;
            }
            if (p80Var.g == null) {
                qr8 qr8Var2 = p80Var.h;
                if (qr8Var2 == null || p80Var.o) {
                    if (qr8Var2 == null) {
                        Context context = this.y;
                        if ((i == 0 || i == 108) && this.F0 != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(ai.askquin.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(ai.askquin.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(ai.askquin.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                rn2 rn2Var = new rn2(context, 0);
                                rn2Var.getTheme().setTo(themeNewTheme);
                                context = rn2Var;
                            }
                        }
                        qr8 qr8Var3 = new qr8(context);
                        qr8Var3.e = this;
                        qr8 qr8Var4 = p80Var.h;
                        if (qr8Var3 != qr8Var4) {
                            if (qr8Var4 != null) {
                                qr8Var4.r(p80Var.i);
                            }
                            p80Var.h = qr8Var3;
                            a88 a88Var = p80Var.i;
                            if (a88Var != null) {
                                qr8Var3.b(a88Var, qr8Var3.a);
                            }
                        }
                        qr8Var2 = p80Var.h;
                        if (qr8Var2 != null) {
                            if (z2 && (actionBarOverlayLayout2 = this.F0) != null) {
                                ssgVar = this.G0;
                                if (ssgVar == null) {
                                    ssgVar = new ssg(2, this);
                                    this.G0 = ssgVar;
                                }
                                actionBarOverlayLayout2.l(qr8Var2, ssgVar);
                            }
                            p80Var.h.w();
                            if (callback.onCreatePanelMenu(i, p80Var.h)) {
                                p80Var.o = false;
                            } else {
                                qr8Var = p80Var.h;
                                if (qr8Var != null) {
                                    if (qr8Var != null) {
                                        qr8Var.r(p80Var.i);
                                    }
                                    p80Var.h = null;
                                }
                                if (z2 && (actionBarOverlayLayout = this.F0) != null) {
                                    actionBarOverlayLayout.l(null, this.G0);
                                }
                            }
                        }
                    } else {
                        if (z2) {
                            ssgVar = this.G0;
                            if (ssgVar == null) {
                                ssgVar = new ssg(2, this);
                                this.G0 = ssgVar;
                            }
                            actionBarOverlayLayout2.l(qr8Var2, ssgVar);
                        }
                        p80Var.h.w();
                        if (callback.onCreatePanelMenu(i, p80Var.h)) {
                            qr8Var = p80Var.h;
                            if (qr8Var != null) {
                                if (qr8Var != null) {
                                    qr8Var.r(p80Var.i);
                                }
                                p80Var.h = null;
                            }
                            if (z2) {
                                actionBarOverlayLayout.l(null, this.G0);
                            }
                        } else {
                            p80Var.o = false;
                        }
                    }
                }
                p80Var.h.w();
                Bundle bundle = p80Var.p;
                if (bundle != null) {
                    p80Var.h.s(bundle);
                    p80Var.p = null;
                }
                if (!callback.onPreparePanel(0, p80Var.g, p80Var.h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.F0) != null) {
                        actionBarOverlayLayout3.l(null, this.G0);
                    }
                    p80Var.h.v();
                    return false;
                }
                p80Var.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                p80Var.h.v();
            }
            p80Var.k = true;
            p80Var.l = false;
            this.Z0 = p80Var;
            return true;
        }
        return false;
    }

    public final void K() {
        if (this.N0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void L() {
        r60 r60Var;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.s1 != null && (C(0).m || this.I0 != null)) {
                z = true;
            }
            if (z && this.t1 == null) {
                this.t1 = q6.G(this.s1, this);
            } else {
                if (z || (r60Var = this.t1) == null) {
                    return;
                }
                q6.R(this.s1, r60Var);
                this.t1 = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // defpackage.or8
    public final boolean c(qr8 qr8Var, MenuItem menuItem) {
        p80 p80Var;
        Window.Callback callback = this.z.getCallback();
        if (callback != null && !this.d1) {
            qr8 qr8VarK = qr8Var.k();
            p80[] p80VarArr = this.Y0;
            int length = p80VarArr != null ? p80VarArr.length : 0;
            for (int i = 0; i < length; i++) {
                p80Var = p80VarArr[i];
                if (p80Var != null && p80Var.h == qr8VarK) {
                    if (p80Var != null) {
                        return callback.onMenuItemSelected(p80Var.a, menuItem);
                    }
                }
            }
            p80Var = null;
            if (p80Var != null) {
                return callback.onMenuItemSelected(p80Var.a, menuItem);
            }
        }
        return false;
    }

    @Override // defpackage.i80
    public final void e() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.y);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof q80) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.i80
    public final void g() {
        String strN;
        this.b1 = true;
        p(false, true);
        z();
        Object obj = this.x;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strN = kn2.N(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strN = null;
            }
            if (strN != null) {
                c7g c7gVar = this.Y;
                if (c7gVar == null) {
                    this.o1 = true;
                } else if (!c7gVar.h) {
                    wze wzeVar = (wze) c7gVar.e;
                    int i = wzeVar.b;
                    c7gVar.h = true;
                    wzeVar.a((i & (-5)) | 4);
                }
            }
            synchronized (i80.v) {
                i80.i(this);
                i80.g.add(new WeakReference(this));
            }
        }
        this.e1 = new Configuration(this.y.getResources().getConfiguration());
        this.c1 = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // defpackage.i80
    public final void h() {
        if (this.x instanceof Activity) {
            synchronized (i80.v) {
                i80.i(this);
            }
        }
        if (this.l1) {
            this.z.getDecorView().removeCallbacks(this.n1);
        }
        this.d1 = true;
        if (this.f1 != -100) {
            Object obj = this.x;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                u1.put(this.x.getClass().getName(), Integer.valueOf(this.f1));
            } else {
                u1.remove(this.x.getClass().getName());
            }
        } else {
            u1.remove(this.x.getClass().getName());
        }
        m80 m80Var = this.j1;
        if (m80Var != null) {
            m80Var.e();
        }
        m80 m80Var2 = this.k1;
        if (m80Var2 != null) {
            m80Var2.e();
        }
    }

    @Override // defpackage.i80
    public final boolean j(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.W0 && i == 108) {
            return false;
        }
        if (this.S0 && i == 1) {
            this.S0 = false;
        }
        if (i == 1) {
            K();
            this.W0 = true;
            return true;
        }
        if (i == 2) {
            K();
            this.Q0 = true;
            return true;
        }
        if (i == 5) {
            K();
            this.R0 = true;
            return true;
        }
        if (i == 10) {
            K();
            this.U0 = true;
            return true;
        }
        if (i == 108) {
            K();
            this.S0 = true;
            return true;
        }
        if (i != 109) {
            return this.z.requestFeature(i);
        }
        K();
        this.T0 = true;
        return true;
    }

    @Override // defpackage.i80
    public final void k(int i) {
        y();
        ViewGroup viewGroup = (ViewGroup) this.O0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.y).inflate(i, viewGroup);
        this.X.a(this.z.getCallback());
    }

    @Override // defpackage.i80
    public final void l(View view) {
        y();
        ViewGroup viewGroup = (ViewGroup) this.O0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.X.a(this.z.getCallback());
    }

    @Override // defpackage.i80
    public final void m(View view, ViewGroup.LayoutParams layoutParams) {
        y();
        ViewGroup viewGroup = (ViewGroup) this.O0.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.X.a(this.z.getCallback());
    }

    @Override // defpackage.i80
    public final void n(CharSequence charSequence) {
        this.E0 = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.F0;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        c7g c7gVar = this.Y;
        if (c7gVar == null) {
            TextView textView = this.P0;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        wze wzeVar = (wze) c7gVar.e;
        if (wzeVar.g) {
            return;
        }
        Toolbar toolbar = wzeVar.a;
        wzeVar.h = charSequence;
        if ((wzeVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (wzeVar.g) {
                nvf.k(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c90Var;
        ea0 ea0Var = this.r1;
        View view2 = null;
        if (ea0Var == null) {
            int[] iArr = hbb.j;
            Context context2 = this.y;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                ea0Var = new ea0();
                this.r1 = ea0Var;
            } else {
                try {
                    ea0Var = (ea0) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                    this.r1 = ea0Var;
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    ea0Var = new ea0();
                    this.r1 = ea0Var;
                }
            }
        }
        ea0Var.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, hbb.x, 0, 0);
        byte b = 4;
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context rn2Var = (resourceId == 0 || ((context instanceof rn2) && ((rn2) context).a == resourceId)) ? context : new rn2(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                b = !str.equals("RatingBar") ? (byte) -1 : (byte) 0;
                break;
            case -1455429095:
                b = !str.equals("CheckedTextView") ? (byte) -1 : (byte) 1;
                break;
            case -1346021293:
                b = !str.equals("MultiAutoCompleteTextView") ? (byte) -1 : (byte) 2;
                break;
            case -938935918:
                b = !str.equals("TextView") ? (byte) -1 : (byte) 3;
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b = -1;
                }
                break;
            case -658531749:
                b = !str.equals("SeekBar") ? (byte) -1 : (byte) 5;
                break;
            case -339785223:
                b = !str.equals("Spinner") ? (byte) -1 : (byte) 6;
                break;
            case 776382189:
                b = !str.equals("RadioButton") ? (byte) -1 : (byte) 7;
                break;
            case 799298502:
                b = !str.equals("ToggleButton") ? (byte) -1 : (byte) 8;
                break;
            case 1125864064:
                b = !str.equals("ImageView") ? (byte) -1 : (byte) 9;
                break;
            case 1413872058:
                b = !str.equals("AutoCompleteTextView") ? (byte) -1 : (byte) 10;
                break;
            case 1601505219:
                b = !str.equals("CheckBox") ? (byte) -1 : (byte) 11;
                break;
            case 1666676343:
                b = !str.equals("EditText") ? (byte) -1 : (byte) 12;
                break;
            case 2001146706:
                b = !str.equals("Button") ? (byte) -1 : (byte) 13;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                c90Var = new c90(rn2Var, attributeSet);
                break;
            case 1:
                c90Var = new f80(rn2Var, attributeSet);
                break;
            case 2:
                c90Var = new y80(rn2Var, attributeSet);
                break;
            case 3:
                c90Var = new y90(rn2Var, attributeSet);
                break;
            case 4:
                c90Var = new w80(rn2Var, attributeSet, ai.askquin.R.attr.imageButtonStyle);
                break;
            case 5:
                c90Var = new d90(rn2Var, attributeSet);
                break;
            case 6:
                c90Var = new o90(rn2Var, attributeSet);
                break;
            case 7:
                c90Var = new b90(rn2Var, attributeSet);
                break;
            case 8:
                c90Var = new ca0(rn2Var, attributeSet);
                break;
            case 9:
                c90Var = new x80(rn2Var, attributeSet, 0);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                c90Var = new z70(rn2Var, attributeSet);
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                c90Var = new e80(rn2Var, attributeSet);
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                c90Var = new u80(rn2Var, attributeSet);
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                c90Var = new c80(rn2Var, attributeSet);
                break;
            default:
                c90Var = null;
                break;
        }
        if (c90Var == null && context != rn2Var) {
            Object[] objArr = ea0Var.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = rn2Var;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i = 0;
                    while (true) {
                        String[] strArr = ea0.g;
                        if (i < 3) {
                            View viewA = ea0Var.a(rn2Var, str, strArr[i]);
                            if (viewA != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewA;
                            } else {
                                i++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewA2 = ea0Var.a(rn2Var, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewA2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            c90Var = view2;
        }
        if (c90Var != null) {
            Context context3 = c90Var.getContext();
            if ((context3 instanceof ContextWrapper) && c90Var.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, ea0.c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c90Var.setOnClickListener(new da0(c90Var, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = rn2Var.obtainStyledAttributes(attributeSet, ea0.d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = nvf.a;
                    new bvf(ai.askquin.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).g(c90Var, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = rn2Var.obtainStyledAttributes(attributeSet, ea0.e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    nvf.k(c90Var, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = rn2Var.obtainStyledAttributes(attributeSet, ea0.f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = nvf.a;
                    new bvf(ai.askquin.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).g(c90Var, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return c90Var;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x010f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean p(boolean z, boolean z2) {
        int i;
        boolean z3;
        if (this.d1) {
            return false;
        }
        int i2 = this.f1;
        if (i2 == -100) {
            i2 = i80.b;
        }
        Context context = this.y;
        int iF = F(context, i2);
        int i3 = Build.VERSION.SDK_INT;
        td8 td8VarR = i3 < 33 ? r(context) : null;
        if (!z2 && td8VarR != null) {
            td8VarR = td8.a(context.getResources().getConfiguration().getLocales().toLanguageTags());
        }
        Configuration configurationV = v(context, iF, td8VarR, null, false);
        boolean z4 = this.i1;
        boolean z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        z5 = true;
        Object obj = this.x;
        if (z4 || !(obj instanceof Activity)) {
            this.i1 = true;
            i = this.h1;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i3 >= 29 ? 269221888 : 786432);
                    if (activityInfo != null) {
                        this.h1 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.h1 = 0;
                }
                this.i1 = true;
                i = this.h1;
            }
        }
        Configuration configuration = this.e1;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i4 = configuration.uiMode & 48;
        int i5 = configurationV.uiMode & 48;
        td8 td8VarA = td8.a(configuration.getLocales().toLanguageTags());
        td8 td8VarA2 = td8VarR == null ? null : td8.a(configurationV.getLocales().toLanguageTags());
        int i6 = i4 != i5 ? 512 : 0;
        if (td8VarA2 != null && !td8VarA.equals(td8VarA2)) {
            i6 |= 8196;
        }
        if (((~i) & i6) != 0 && z && this.b1 && ((w1 || this.c1) && (obj instanceof Activity))) {
            Activity activity = (Activity) obj;
            if (activity.isChild()) {
                z3 = false;
            } else {
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 31 && (i6 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationV.getLayoutDirection());
                }
                if (i7 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new j1(z5 ? 1 : 0, activity));
                }
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i6 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i6 & i) == i6;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i5;
            if (td8VarA2 != null) {
                configuration2.setLocales(LocaleList.forLanguageTags(td8VarA2.a.a.toLanguageTags()));
            }
            resources.updateConfiguration(configuration2, null);
            int i8 = this.g1;
            if (i8 != 0) {
                context.setTheme(i8);
                context.getTheme().applyStyle(this.g1, true);
            }
            if (z6 && (obj instanceof Activity)) {
                Activity activity2 = (Activity) obj;
                if (activity2 instanceof x48) {
                    if (((a58) ((x48) activity2).k()).i.compareTo(g48.c) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                        this.z.getDecorView().dispatchConfigurationChanged(configuration2);
                    }
                } else if (this.c1 && !this.d1) {
                    activity2.onConfigurationChanged(configuration2);
                    this.z.getDecorView().dispatchConfigurationChanged(configuration2);
                }
            }
        }
        if (td8VarA2 != null) {
            LocaleList.setDefault(LocaleList.forLanguageTags(td8.a(context.getResources().getConfiguration().getLocales().toLanguageTags()).a.a.toLanguageTags()));
        }
        if (i2 == 0) {
            A(context).w();
        } else {
            m80 m80Var = this.j1;
            if (m80Var != null) {
                m80Var.e();
            }
        }
        m80 m80Var2 = this.k1;
        if (i2 == 3) {
            if (m80Var2 == null) {
                m80Var2 = new m80(this, context);
                this.k1 = m80Var2;
            }
            m80Var2.w();
        } else if (m80Var2 != null) {
            m80Var2.e();
        }
        return z5;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    public final void q(Window window) {
        Drawable drawableE;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        r60 r60Var;
        int resourceId;
        if (this.z != null) {
            qc0.p("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof l80) {
            qc0.p("AppCompat has already installed itself into the Window");
            return;
        }
        l80 l80Var = new l80(this, callback);
        this.X = l80Var;
        window.setCallback(l80Var);
        Context context = this.y;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, v1);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableE = null;
        } else {
            s80 s80VarA = s80.a();
            synchronized (s80VarA) {
                drawableE = s80VarA.a.e(context, resourceId, true);
            }
        }
        if (drawableE != null) {
            window.setBackgroundDrawable(drawableE);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.z = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.s1) != null) {
            return;
        }
        Object obj = this.x;
        if (onBackInvokedDispatcher != null && (r60Var = this.t1) != null) {
            q6.R(onBackInvokedDispatcher, r60Var);
            this.t1 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.s1 = q6.p(activity);
            } else {
                this.s1 = null;
            }
        } else {
            this.s1 = null;
        }
        L();
    }

    public final void s(int i, p80 p80Var, qr8 qr8Var) {
        if (qr8Var == null) {
            if (p80Var == null && i >= 0) {
                p80[] p80VarArr = this.Y0;
                if (i < p80VarArr.length) {
                    p80Var = p80VarArr[i];
                }
            }
            if (p80Var != null) {
                qr8Var = p80Var.h;
            }
        }
        if ((p80Var == null || p80Var.m) && !this.d1) {
            l80 l80Var = this.X;
            Window.Callback callback = this.z.getCallback();
            l80Var.getClass();
            try {
                l80Var.d = true;
                callback.onPanelClosed(i, qr8Var);
            } finally {
                l80Var.d = false;
            }
        }
    }

    public final void t(qr8 qr8Var) {
        yc ycVar;
        if (this.X0) {
            return;
        }
        this.X0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.F0;
        actionBarOverlayLayout.j();
        ActionMenuView actionMenuView = ((wze) actionBarOverlayLayout.e).a.a;
        if (actionMenuView != null && (ycVar = actionMenuView.L0) != null) {
            ycVar.f();
            vc vcVar = ycVar.I0;
            if (vcVar != null && vcVar.b()) {
                vcVar.i.dismiss();
            }
        }
        Window.Callback callback = this.z.getCallback();
        if (callback != null && !this.d1) {
            callback.onPanelClosed(108, qr8Var);
        }
        this.X0 = false;
    }

    public final void u(p80 p80Var, boolean z) {
        o80 o80Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        yc ycVar;
        if (z && p80Var.a == 0 && (actionBarOverlayLayout = this.F0) != null) {
            actionBarOverlayLayout.j();
            ActionMenuView actionMenuView = ((wze) actionBarOverlayLayout.e).a.a;
            if (actionMenuView != null && (ycVar = actionMenuView.L0) != null && ycVar.j()) {
                t(p80Var.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.y.getSystemService("window");
        if (windowManager != null && p80Var.m && (o80Var = p80Var.e) != null) {
            windowManager.removeView(o80Var);
            if (z) {
                s(p80Var.a, p80Var, null);
            }
        }
        p80Var.k = false;
        p80Var.l = false;
        p80Var.m = false;
        p80Var.f = null;
        p80Var.n = true;
        if (this.Z0 == p80Var) {
            this.Z0 = null;
        }
        if (p80Var.a == 0) {
            L();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0146 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x011b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0125  */
    /* JADX WARN: Code duplicated, block: B:97:0x0133  */
    /* JADX WARN: Code duplicated, block: B:99:0x0137  */
    public final boolean w(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        p80 p80VarC;
        ActionBarOverlayLayout actionBarOverlayLayout;
        Context context;
        boolean z;
        boolean z2;
        boolean zJ;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        yc ycVar;
        yc ycVar2;
        yc ycVar3;
        p80 p80VarC2;
        Object obj = this.x;
        if ((!(obj instanceof no7) && !(obj instanceof ui)) || (decorView = this.z.getDecorView()) == null || !nvf.d(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                l80 l80Var = this.X;
                Window.Callback callback = this.z.getCallback();
                l80Var.getClass();
                try {
                    l80Var.c = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    l80Var.c = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.a1 = (keyEvent.getFlags() & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    p80VarC2 = C(0);
                                    if (!p80VarC2.m) {
                                        J(p80VarC2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.I0 == null) {
                                    p80VarC = C(0);
                                    actionBarOverlayLayout = this.F0;
                                    context = this.y;
                                    if (actionBarOverlayLayout != null) {
                                        actionBarOverlayLayout.j();
                                        toolbar = ((wze) actionBarOverlayLayout.e).a;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.a) == null || !actionMenuView.K0 || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            z = p80VarC.m;
                                            if (!z || p80VarC.l) {
                                                u(p80VarC, true);
                                                z2 = z;
                                            } else {
                                                if (p80VarC.k) {
                                                    if (p80VarC.o) {
                                                        p80VarC.k = false;
                                                        zJ = J(p80VarC, keyEvent);
                                                    } else {
                                                        zJ = true;
                                                    }
                                                    if (zJ) {
                                                        H(p80VarC, keyEvent);
                                                        z2 = true;
                                                    }
                                                }
                                                z2 = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = this.F0;
                                            actionBarOverlayLayout2.j();
                                            ActionMenuView actionMenuView2 = ((wze) actionBarOverlayLayout2.e).a.a;
                                            if (actionMenuView2 == null || (ycVar2 = actionMenuView2.L0) == null || !ycVar2.j()) {
                                                if (!this.d1 && J(p80VarC, keyEvent)) {
                                                    ActionBarOverlayLayout actionBarOverlayLayout3 = this.F0;
                                                    actionBarOverlayLayout3.j();
                                                    ActionMenuView actionMenuView3 = ((wze) actionBarOverlayLayout3.e).a.a;
                                                    if (actionMenuView3 != null && (ycVar = actionMenuView3.L0) != null && ycVar.l()) {
                                                        z2 = true;
                                                    }
                                                }
                                                z2 = false;
                                            } else {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = this.F0;
                                                actionBarOverlayLayout4.j();
                                                ActionMenuView actionMenuView4 = ((wze) actionBarOverlayLayout4.e).a.a;
                                                if (actionMenuView4 == null || (ycVar3 = actionMenuView4.L0) == null || !ycVar3.f()) {
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                }
                                            }
                                        }
                                    } else {
                                        z = p80VarC.m;
                                        if (z) {
                                        }
                                        u(p80VarC, true);
                                        z2 = z;
                                    }
                                    if (z2) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        b1.l("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (G()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    l80Var.c = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.a1 = (keyEvent.getFlags() & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            p80VarC2 = C(0);
                            if (!p80VarC2.m) {
                                J(p80VarC2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.I0 == null) {
                            p80VarC = C(0);
                            actionBarOverlayLayout = this.F0;
                            context = this.y;
                            if (actionBarOverlayLayout != null) {
                                actionBarOverlayLayout.j();
                                toolbar = ((wze) actionBarOverlayLayout.e).a;
                                if (toolbar.getVisibility() == 0) {
                                    z = p80VarC.m;
                                    if (z) {
                                    }
                                    u(p80VarC, true);
                                    z2 = z;
                                } else {
                                    z = p80VarC.m;
                                    if (z) {
                                    }
                                    u(p80VarC, true);
                                    z2 = z;
                                }
                            } else {
                                z = p80VarC.m;
                                if (z) {
                                }
                                u(p80VarC, true);
                                z2 = z;
                            }
                            if (z2) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                b1.l("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (G()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void x(int i) {
        p80 p80VarC = C(i);
        if (p80VarC.h != null) {
            Bundle bundle = new Bundle();
            p80VarC.h.t(bundle);
            if (bundle.size() > 0) {
                p80VarC.p = bundle;
            }
            p80VarC.h.w();
            p80VarC.h.clear();
        }
        p80VarC.o = true;
        p80VarC.n = true;
        if ((i == 108 || i == 0) && this.F0 != null) {
            p80 p80VarC2 = C(0);
            p80VarC2.k = false;
            J(p80VarC2, null);
        }
    }

    public final void y() {
        ViewGroup viewGroup;
        if (this.N0) {
            return;
        }
        Context context = this.y;
        int[] iArr = hbb.j;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            qc0.p("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            j(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            j(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            j(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            j(10);
        }
        this.V0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        z();
        this.z.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.W0) {
            viewGroup = this.U0 ? (ViewGroup) layoutInflaterFrom.inflate(ai.askquin.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(ai.askquin.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.V0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(ai.askquin.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.T0 = false;
            this.S0 = false;
        } else if (this.S0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(ai.askquin.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new rn2(context, typedValue.resourceId) : context).inflate(ai.askquin.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(ai.askquin.R.id.decor_content_parent);
            this.F0 = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.z.getCallback());
            if (this.T0) {
                this.F0.i(109);
            }
            if (this.Q0) {
                this.F0.i(2);
            }
            if (this.R0) {
                this.F0.i(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.S0);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.T0);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.V0);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.U0);
            sb.append(", windowNoTitle: ");
            qc0.j(ub3.m(sb, this.W0, " }"));
            return;
        }
        vd9 vd9Var = new vd9(4, this);
        WeakHashMap weakHashMap = nvf.a;
        fvf.c(viewGroup, vd9Var);
        if (this.F0 == null) {
            this.P0 = (TextView) viewGroup.findViewById(ai.askquin.R.id.title);
        }
        boolean z = zwf.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(ai.askquin.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.z.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.z.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new mjg(this));
        this.O0 = viewGroup;
        Object obj = this.x;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.E0;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.F0;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                c7g c7gVar = this.Y;
                if (c7gVar != null) {
                    wze wzeVar = (wze) c7gVar.e;
                    if (!wzeVar.g) {
                        Toolbar toolbar = wzeVar.a;
                        wzeVar.h = title;
                        if ((wzeVar.b & 8) != 0) {
                            toolbar.setTitle(title);
                            if (wzeVar.g) {
                                nvf.k(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.P0;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.O0.findViewById(R.id.content);
        View decorView = this.z.getDecorView();
        contentFrameLayout2.g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.N0 = true;
        p80 p80VarC = C(0);
        if (this.d1 || p80VarC.h != null) {
            return;
        }
        E(108);
    }

    public final void z() {
        if (this.z == null) {
            Object obj = this.x;
            if (obj instanceof Activity) {
                q(((Activity) obj).getWindow());
            }
        }
        if (this.z != null) {
            return;
        }
        qc0.p("We have not been given a Window");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
