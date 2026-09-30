package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l80 implements Window.Callback {
    public final Window.Callback a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ q80 e;

    public l80(q80 q80Var, Window.Callback callback) {
        this.e = q80Var;
        if (callback != null) {
            this.a = callback;
        } else {
            qc0.j("Window callback may not be null");
            throw null;
        }
    }

    public final void a(Window.Callback callback) {
        try {
            this.b = true;
            callback.onContentChanged();
        } finally {
            this.b = false;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.a.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.a.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        this.a.onProvideKeyboardShortcuts(list, menu, i);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.c;
        Window.Callback callback = this.a;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        return this.e.w(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        p80 p80Var;
        boolean zI;
        qr8 qr8Var;
        boolean zPerformShortcut;
        if (!this.a.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            q80 q80Var = this.e;
            q80Var.D();
            c7g c7gVar = q80Var.Y;
            if (c7gVar == null) {
                p80Var = q80Var.Z0;
                if (p80Var != null || !q80Var.I(p80Var, keyEvent.getKeyCode(), keyEvent)) {
                    if (q80Var.Z0 == null) {
                        p80 p80VarC = q80Var.C(0);
                        q80Var.J(p80VarC, keyEvent);
                        zI = q80Var.I(p80VarC, keyEvent.getKeyCode(), keyEvent);
                        p80VarC.k = false;
                        if (zI) {
                        }
                    }
                    return false;
                }
                p80 p80Var2 = q80Var.Z0;
                if (p80Var2 != null) {
                    p80Var2.l = true;
                    return true;
                }
            } else {
                b7g b7gVar = c7gVar.i;
                if (b7gVar == null || (qr8Var = b7gVar.e) == null) {
                    zPerformShortcut = false;
                } else {
                    qr8Var.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    zPerformShortcut = qr8Var.performShortcut(keyCode, keyEvent, 0);
                }
                if (!zPerformShortcut) {
                    p80Var = q80Var.Z0;
                    if (p80Var != null) {
                        if (q80Var.Z0 == null) {
                            p80 p80VarC2 = q80Var.C(0);
                            q80Var.J(p80VarC2, keyEvent);
                            zI = q80Var.I(p80VarC2, keyEvent.getKeyCode(), keyEvent);
                            p80VarC2.k = false;
                            if (zI) {
                            }
                        }
                        return false;
                    }
                    if (q80Var.Z0 == null) {
                        p80 p80VarC3 = q80Var.C(0);
                        q80Var.J(p80VarC3, keyEvent);
                        zI = q80Var.I(p80VarC3, keyEvent.getKeyCode(), keyEvent);
                        p80VarC3.k = false;
                        if (zI) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.a.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.b) {
            this.a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof qr8)) {
            return this.a.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        return this.a.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.a.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        if (i == 108) {
            q80 q80Var = this.e;
            q80Var.D();
            c7g c7gVar = q80Var.Y;
            if (c7gVar != null) {
                ArrayList arrayList = c7gVar.m;
                if (true != c7gVar.l) {
                    c7gVar.l = true;
                    if (arrayList.size() > 0) {
                        arrayList.get(0).getClass();
                        r3.f();
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.d) {
            this.a.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        q80 q80Var = this.e;
        if (i != 108) {
            if (i == 0) {
                p80 p80VarC = q80Var.C(i);
                if (p80VarC.m) {
                    q80Var.u(p80VarC, false);
                    return;
                }
                return;
            }
            return;
        }
        q80Var.D();
        c7g c7gVar = q80Var.Y;
        if (c7gVar != null) {
            ArrayList arrayList = c7gVar.m;
            if (c7gVar.l) {
                c7gVar.l = false;
                if (arrayList.size() <= 0) {
                    return;
                }
                arrayList.get(0).getClass();
                r3.f();
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z) {
        this.a.onPointerCaptureChanged(z);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        qr8 qr8Var = menu instanceof qr8 ? (qr8) menu : null;
        if (i == 0 && qr8Var == null) {
            return false;
        }
        if (qr8Var != null) {
            qr8Var.x = true;
        }
        boolean zOnPreparePanel = this.a.onPreparePanel(i, view, menu);
        if (qr8Var != null) {
            qr8Var.x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        qr8 qr8Var = this.e.C(0).h;
        if (qr8Var != null) {
            d(list, qr8Var, i);
        } else {
            d(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.a.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.a.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        ViewGroup viewGroup;
        q80 q80Var = this.e;
        Context context = q80Var.y;
        if (i != 0) {
            return this.a.onWindowStartingActionMode(callback, i);
        }
        kxa kxaVar = new kxa();
        kxaVar.b = context;
        kxaVar.a = callback;
        kxaVar.c = new ArrayList();
        boolean z = false;
        kxaVar.d = new wid(0);
        cd cdVar = q80Var.I0;
        if (cdVar != null) {
            cdVar.b();
        }
        a90 a90Var = new a90(q80Var, kxaVar, z, 9);
        q80Var.D();
        c7g c7gVar = q80Var.Y;
        int i2 = 1;
        if (c7gVar != null) {
            b7g b7gVar = c7gVar.i;
            if (b7gVar != null) {
                b7gVar.b();
            }
            c7gVar.c.setHideOnContentScrollEnabled(false);
            c7gVar.f.e();
            b7g b7gVar2 = new b7g(c7gVar, c7gVar.f.getContext(), a90Var);
            qr8 qr8Var = b7gVar2.e;
            qr8Var.w();
            try {
                boolean zJ = ((kxa) b7gVar2.f.b).j(b7gVar2, qr8Var);
                qr8Var.v();
                if (zJ) {
                    c7gVar.i = b7gVar2;
                    b7gVar2.j();
                    c7gVar.f.c(b7gVar2);
                    c7gVar.a(true);
                } else {
                    b7gVar2 = null;
                }
                q80Var.I0 = b7gVar2;
            } catch (Throwable th) {
                qr8Var.v();
                throw th;
            }
        }
        if (q80Var.I0 == null) {
            swf swfVar = q80Var.M0;
            if (swfVar != null) {
                swfVar.b();
            }
            cd cdVar2 = q80Var.I0;
            if (cdVar2 != null) {
                cdVar2.b();
            }
            if (q80Var.J0 == null) {
                if (q80Var.V0) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = context.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        rn2 rn2Var = new rn2(context, 0);
                        rn2Var.getTheme().setTo(themeNewTheme);
                        context = rn2Var;
                    }
                    q80Var.J0 = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    q80Var.K0 = popupWindow;
                    popupWindow.setWindowLayoutType(2);
                    q80Var.K0.setContentView(q80Var.J0);
                    q80Var.K0.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    q80Var.J0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    q80Var.K0.setHeight(-2);
                    q80Var.L0 = new j80(q80Var, i2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) q80Var.O0.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        q80Var.D();
                        c7g c7gVar2 = q80Var.Y;
                        Context contextB = c7gVar2 != null ? c7gVar2.b() : null;
                        if (contextB != null) {
                            context = contextB;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                        q80Var.J0 = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (q80Var.J0 != null) {
                swf swfVar2 = q80Var.M0;
                if (swfVar2 != null) {
                    swfVar2.b();
                }
                q80Var.J0.e();
                Context context2 = q80Var.J0.getContext();
                ActionBarContextView actionBarContextView = q80Var.J0;
                kyd kydVar = new kyd();
                kydVar.d = context2;
                kydVar.e = actionBarContextView;
                kydVar.f = a90Var;
                qr8 qr8Var2 = new qr8(actionBarContextView.getContext());
                qr8Var2.l = 1;
                kydVar.w = qr8Var2;
                qr8Var2.e = kydVar;
                if (((kxa) a90Var.b).j(kydVar, qr8Var2)) {
                    kydVar.j();
                    q80Var.J0.c(kydVar);
                    q80Var.I0 = kydVar;
                    boolean z2 = q80Var.N0 && (viewGroup = q80Var.O0) != null && viewGroup.isLaidOut();
                    ActionBarContextView actionBarContextView2 = q80Var.J0;
                    if (z2) {
                        actionBarContextView2.setAlpha(0.0f);
                        swf swfVarA = nvf.a(q80Var.J0);
                        swfVarA.a(1.0f);
                        q80Var.M0 = swfVarA;
                        swfVarA.d(new k80(i2, q80Var));
                    } else {
                        actionBarContextView2.setAlpha(1.0f);
                        q80Var.J0.setVisibility(0);
                        if (q80Var.J0.getParent() instanceof View) {
                            View view = (View) q80Var.J0.getParent();
                            WeakHashMap weakHashMap = nvf.a;
                            view.requestApplyInsets();
                        }
                    }
                    if (q80Var.K0 != null) {
                        q80Var.z.getDecorView().post(q80Var.L0);
                    }
                } else {
                    q80Var.I0 = null;
                }
            }
            q80Var.L();
            q80Var.I0 = q80Var.I0;
        }
        q80Var.L();
        cd cdVar3 = q80Var.I0;
        if (cdVar3 != null) {
            return kxaVar.e(cdVar3);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
