package defpackage;

import ai.askquin.R;
import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vb2 extends ub2 implements pwf, lh6, kdc, vm9, wb9, mf {
    public final CopyOnWriteArrayList E0;
    public boolean F0;
    public boolean G0;
    public final ace H0;
    public final ace I0;
    public final ace J0;
    public final CopyOnWriteArrayList X;
    public final CopyOnWriteArrayList Y;
    public final CopyOnWriteArrayList Z;
    public final gn2 b;
    public final gg7 c;
    public final lqb d;
    public owf e;
    public final sb2 f;
    public final ace g;
    public final AtomicInteger v;
    public final tb2 w;
    public final CopyOnWriteArrayList x;
    public final CopyOnWriteArrayList y;
    public final CopyOnWriteArrayList z;

    public vb2() {
        gn2 gn2Var = new gn2();
        gn2Var.a = new CopyOnWriteArraySet();
        this.b = gn2Var;
        final int i = 0;
        this.c = new gg7(new mb2(this, 0));
        lqb lqbVar = new lqb(new jdc(this, new hla(15, this)));
        this.d = lqbVar;
        this.f = new sb2(this);
        final int i2 = 1;
        this.g = new ace(new nb2(this, i2));
        this.v = new AtomicInteger();
        this.w = new tb2(this);
        this.x = new CopyOnWriteArrayList();
        this.y = new CopyOnWriteArrayList();
        this.z = new CopyOnWriteArrayList();
        this.X = new CopyOnWriteArrayList();
        this.Y = new CopyOnWriteArrayList();
        this.Z = new CopyOnWriteArrayList();
        this.E0 = new CopyOnWriteArrayList();
        this.H0 = new ace(new nb2(this, 2));
        a58 a58Var = this.a;
        if (a58Var == null) {
            qc0.p("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        a58Var.a(new u48(this) { // from class: ob2
            public final /* synthetic */ vb2 b;

            {
                this.b = this;
            }

            @Override // defpackage.u48
            public final void h(x48 x48Var, f48 f48Var) {
                Window window;
                View viewPeekDecorView;
                int i3 = i;
                vb2 vb2Var = this.b;
                switch (i3) {
                    case 0:
                        if (f48Var == f48.ON_STOP && (window = vb2Var.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (f48Var == f48.ON_DESTROY) {
                            vb2Var.b.b = null;
                            if (!vb2Var.isChangingConfigurations()) {
                                vb2Var.g().a();
                            }
                            sb2 sb2Var = vb2Var.f;
                            vb2 vb2Var2 = sb2Var.d;
                            vb2Var2.getWindow().getDecorView().removeCallbacks(sb2Var);
                            vb2Var2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(sb2Var);
                        }
                        break;
                }
            }
        });
        this.a.a(new u48(this) { // from class: ob2
            public final /* synthetic */ vb2 b;

            {
                this.b = this;
            }

            @Override // defpackage.u48
            public final void h(x48 x48Var, f48 f48Var) {
                Window window;
                View viewPeekDecorView;
                int i3 = i2;
                vb2 vb2Var = this.b;
                switch (i3) {
                    case 0:
                        if (f48Var == f48.ON_STOP && (window = vb2Var.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (f48Var == f48.ON_DESTROY) {
                            vb2Var.b.b = null;
                            if (!vb2Var.isChangingConfigurations()) {
                                vb2Var.g().a();
                            }
                            sb2 sb2Var = vb2Var.f;
                            vb2 vb2Var2 = sb2Var.d;
                            vb2Var2.getWindow().getDecorView().removeCallbacks(sb2Var);
                            vb2Var2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(sb2Var);
                        }
                        break;
                }
            }
        });
        this.a.a(new gkb(i2, this));
        lqbVar.o();
        cdc.b(this);
        ((vea) lqbVar.c).A("android:support:activity-result", new pb2(i, this));
        m(new qb2(this, i));
        this.I0 = new ace(new nb2(this, 3));
        this.J0 = new ace(new nb2(this, 4));
    }

    public static final void l(um9 um9Var, vb2 vb2Var, x48 x48Var, f48 f48Var) {
        if (f48Var == f48.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = vb2Var.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            um9Var.c(onBackInvokedDispatcher);
        }
    }

    public static final void o(vb2 vb2Var) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!pa7.t(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!pa7.t(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // defpackage.wb9
    public final szc a() {
        return b().b().c;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.vm9
    public final um9 b() {
        return (um9) this.J0.getValue();
    }

    @Override // defpackage.lh6
    public final jwf c() {
        return (jwf) this.I0.getValue();
    }

    @Override // defpackage.lh6
    public final m69 e() {
        m69 m69Var = new m69(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = m69Var.a;
        if (application != null) {
            linkedHashMap.put(iwf.d, getApplication());
        }
        linkedHashMap.put(cdc.a, this);
        linkedHashMap.put(cdc.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(cdc.c, extras);
        }
        return m69Var;
    }

    @Override // defpackage.mf
    public final tb2 f() {
        return this.w;
    }

    @Override // defpackage.pwf
    public final owf g() {
        if (getApplication() == null) {
            qc0.p("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        owf owfVar = this.e;
        if (owfVar == null) {
            rb2 rb2Var = (rb2) getLastNonConfigurationInstance();
            if (rb2Var != null) {
                this.e = rb2Var.a;
            }
            owfVar = this.e;
            if (owfVar == null) {
                owfVar = new owf();
                this.e = owfVar;
            }
        }
        owfVar.getClass();
        return owfVar;
    }

    @Override // defpackage.kdc
    public final vea h() {
        return (vea) this.d.c;
    }

    @Override // defpackage.x48
    public final h48 k() {
        return this.a;
    }

    public final void m(zm9 zm9Var) {
        gn2 gn2Var = this.b;
        gn2Var.getClass();
        vb2 vb2Var = (vb2) gn2Var.b;
        if (vb2Var != null) {
            zm9Var.a(vb2Var);
        }
        ((CopyOnWriteArraySet) gn2Var.a).add(zm9Var);
    }

    public final void n() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.w.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((h94) this.H0.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.x.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((yl2) it.next()).accept(configuration);
        }
    }

    @Override // defpackage.ub2, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.p(bundle);
        gn2 gn2Var = this.b;
        gn2Var.getClass();
        gn2Var.b = this;
        Iterator it = ((CopyOnWriteArraySet) gn2Var.a).iterator();
        while (it.hasNext()) {
            ((zm9) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = bsb.b;
        zrb.b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
        while (it.hasNext()) {
            ((sx5) it.next()).a.k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
            while (it.hasNext()) {
                if (((sx5) it.next()).a.p()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.F0 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.F0 = false;
            Iterator it = this.X.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((yl2) it.next()).accept(new y59(z));
            }
        } catch (Throwable th) {
            this.F0 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.z.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((yl2) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
        while (it.hasNext()) {
            ((sx5) it.next()).a.q();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.G0 = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.G0 = false;
            Iterator it = this.Y.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((yl2) it.next()).accept(new sda(z));
            }
        } catch (Throwable th) {
            this.G0 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        eu4 eu4VarB = v60.b(pictureInPictureUiState);
        Iterator it = this.Z.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((yl2) it.next()).accept(eu4VarB);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
        while (it.hasNext()) {
            ((sx5) it.next()).a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.w.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        rb2 rb2Var;
        owf owfVar = this.e;
        if (owfVar == null && (rb2Var = (rb2) getLastNonConfigurationInstance()) != null) {
            owfVar = rb2Var.a;
        }
        if (owfVar == null) {
            return null;
        }
        rb2 rb2Var2 = new rb2();
        rb2Var2.a = owfVar;
        return rb2Var2;
    }

    @Override // defpackage.ub2, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        a58 a58Var = this.a;
        if (a58Var != null) {
            a58Var.g(g48.c);
        }
        super.onSaveInstanceState(bundle);
        this.d.q(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.y.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((yl2) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.E0.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final jf p(ye yeVar, mh3 mh3Var) {
        tb2 tb2Var = this.w;
        tb2Var.getClass();
        String str = "activity_rq#" + this.v.getAndIncrement();
        LinkedHashMap linkedHashMap = tb2Var.c;
        a58 a58Var = this.a;
        if (a58Var.i.compareTo(g48.d) >= 0) {
            StringBuilder sb = new StringBuilder("LifecycleOwner ");
            sb.append(this);
            g48 g48Var = a58Var.i;
            sb.append(" is attempting to register while current state is ");
            sb.append(g48Var);
            sb.append(". LifecycleOwners must call register before they are STARTED.");
            throw new IllegalStateException(sb.toString().toString());
        }
        tb2Var.d(str);
        hf hfVar = (hf) linkedHashMap.get(str);
        if (hfVar == null) {
            hfVar = new hf(a58Var);
        }
        ff ffVar = new ff(tb2Var, str, yeVar, mh3Var, 0);
        hfVar.a.a(ffVar);
        hfVar.b.add(ffVar);
        linkedHashMap.put(str, hfVar);
        return new jf(tb2Var, str, mh3Var, 0);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (xdc.r()) {
                Trace.beginSection(xdc.v("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            w16 w16Var = (w16) this.g.getValue();
            synchronized (w16Var.b) {
                try {
                    w16Var.c = true;
                    Iterator it = w16Var.d.iterator();
                    while (it.hasNext()) {
                        ((x16) it.next()).invoke();
                    }
                    w16Var.d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        n();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        n();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.F0) {
            return;
        }
        Iterator it = this.X.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((yl2) it.next()).accept(new y59(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.G0) {
            return;
        }
        Iterator it = this.Y.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((yl2) it.next()).accept(new sda(z));
        }
    }
}
