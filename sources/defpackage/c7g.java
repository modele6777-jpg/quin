package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c7g implements pc {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();
    public static final DecelerateInterpolator z = new DecelerateInterpolator();
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public xm3 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public b7g i;
    public b7g j;
    public a90 k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public twf s;
    public boolean t;
    public boolean u;
    public final a7g v;
    public final a7g w;
    public final ysd x;

    public c7g(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new a7g(this, 0);
        this.w = new a7g(this, 1);
        this.x = new ysd(3, this);
        View decorView = activity.getWindow().getDecorView();
        c(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void a(boolean z2) {
        swf swfVarJ;
        swf swfVarJ2;
        boolean z3 = this.q;
        if (z2) {
            if (!z3) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                e(false);
            }
        } else if (z3) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            e(false);
        }
        boolean zIsLaidOut = this.d.isLaidOut();
        xm3 xm3Var = this.e;
        if (!zIsLaidOut) {
            if (z2) {
                ((wze) xm3Var).a.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                ((wze) xm3Var).a.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            wze wzeVar = (wze) xm3Var;
            swfVarJ = nvf.a(wzeVar.a);
            swfVarJ.a(0.0f);
            swfVarJ.c(100L);
            swfVarJ.d(new vze(wzeVar, 4));
            swfVarJ2 = this.f.j(0, 200L);
        } else {
            wze wzeVar2 = (wze) xm3Var;
            swf swfVarA = nvf.a(wzeVar2.a);
            swfVarA.a(1.0f);
            swfVarA.c(200L);
            swfVarA.d(new vze(wzeVar2, 0));
            swfVarJ = this.f.j(8, 100L);
            swfVarJ2 = swfVarA;
        }
        twf twfVar = new twf();
        ArrayList arrayList = twfVar.a;
        arrayList.add(swfVarJ);
        View view = (View) swfVarJ.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) swfVarJ2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(swfVarJ2);
        twfVar.b();
    }

    public final Context b() {
        Context context = this.b;
        if (context != null) {
            return context;
        }
        TypedValue typedValue = new TypedValue();
        this.a.getTheme().resolveAttribute(ai.askquin.R.attr.actionBarWidgetTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.a, i);
            this.b = contextThemeWrapper;
            return contextThemeWrapper;
        }
        Context context2 = this.a;
        this.b = context2;
        return context2;
    }

    public final void c(View view) {
        xm3 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(ai.askquin.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(ai.askquin.R.id.action_bar);
        if (callbackFindViewById instanceof xm3) {
            wrapper = (xm3) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(ai.askquin.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(ai.askquin.R.id.action_bar_container);
        this.d = actionBarContainer;
        xm3 xm3Var = this.e;
        if (xm3Var == null || this.f == null || actionBarContainer == null) {
            qc0.p(c7g.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((wze) xm3Var).a.getContext();
        this.a = context;
        if ((((wze) this.e).b & 4) != 0) {
            this.h = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        d(context.getResources().getBoolean(ai.askquin.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, hbb.a, ai.askquin.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.g) {
                qc0.p("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.u = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap weakHashMap = nvf.a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void d(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            ((wze) this.e).getClass();
        } else {
            ((wze) this.e).getClass();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        ((wze) this.e).a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void e(boolean z2) {
        boolean z3 = this.q || !this.p;
        boolean z4 = this.r;
        final ysd ysdVar = this.x;
        View view = this.g;
        if (!z3) {
            if (z4) {
                this.r = false;
                twf twfVar = this.s;
                if (twfVar != null) {
                    twfVar.a();
                }
                int i = this.n;
                a7g a7gVar = this.v;
                if (i != 0 || (!this.t && !z2)) {
                    a7gVar.c();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                twf twfVar2 = new twf();
                float f = -this.d.getHeight();
                if (z2) {
                    int[] iArr = {0, 0};
                    this.d.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                swf swfVarA = nvf.a(this.d);
                swfVarA.e(f);
                final View view2 = (View) swfVarA.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(ysdVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: qwf
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) ((c7g) ysdVar.b).d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z5 = twfVar2.e;
                ArrayList arrayList = twfVar2.a;
                if (!z5) {
                    arrayList.add(swfVarA);
                }
                if (this.o && view != null) {
                    swf swfVarA2 = nvf.a(view);
                    swfVarA2.e(f);
                    if (!twfVar2.e) {
                        arrayList.add(swfVarA2);
                    }
                }
                boolean z6 = twfVar2.e;
                if (!z6) {
                    twfVar2.c = y;
                }
                if (!z6) {
                    twfVar2.b = 250L;
                }
                if (!z6) {
                    twfVar2.d = a7gVar;
                }
                this.s = twfVar2;
                twfVar2.b();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.r = true;
        twf twfVar3 = this.s;
        if (twfVar3 != null) {
            twfVar3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        a7g a7gVar2 = this.w;
        if (i2 == 0 && (this.t || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                int[] iArr2 = {0, 0};
                this.d.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.d.setTranslationY(f2);
            twf twfVar4 = new twf();
            swf swfVarA3 = nvf.a(this.d);
            swfVarA3.e(0.0f);
            final View view3 = (View) swfVarA3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(ysdVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: qwf
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) ((c7g) ysdVar.b).d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z7 = twfVar4.e;
            ArrayList arrayList2 = twfVar4.a;
            if (!z7) {
                arrayList2.add(swfVarA3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                swf swfVarA4 = nvf.a(view);
                swfVarA4.e(0.0f);
                if (!twfVar4.e) {
                    arrayList2.add(swfVarA4);
                }
            }
            boolean z8 = twfVar4.e;
            if (!z8) {
                twfVar4.c = z;
            }
            if (!z8) {
                twfVar4.b = 250L;
            }
            if (!z8) {
                twfVar4.d = a7gVar2;
            }
            this.s = twfVar4;
            twfVar4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            a7gVar2.c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = nvf.a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public c7g(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new a7g(this, 0);
        this.w = new a7g(this, 1);
        this.x = new ysd(3, this);
        c(dialog.getWindow().getDecorView());
    }
}
