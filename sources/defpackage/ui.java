package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ui extends zb2 implements DialogInterface, d80 {
    public q80 e;
    public final r80 f;
    public final si g;

    /* JADX WARN: Type inference failed for: r2v2, types: [r80] */
    public ui(ContextThemeWrapper contextThemeWrapper, int i) {
        int i2;
        int i3 = i(contextThemeWrapper, i);
        if (i3 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i3;
        }
        super(contextThemeWrapper, i2);
        this.f = new no7() { // from class: r80
            @Override // defpackage.no7
            public final boolean i(KeyEvent keyEvent) {
                return this.a.l(keyEvent);
            }
        };
        i80 i80VarF = f();
        if (i3 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i3 = typedValue2.resourceId;
        }
        ((q80) i80VarF).g1 = i3;
        i80VarF.g();
        this.g = new si(getContext(), this, getWindow());
    }

    public static int i(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.zb2, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        q80 q80Var = (q80) f();
        q80Var.y();
        ((ViewGroup) q80Var.O0.findViewById(android.R.id.content)).addView(view, layoutParams);
        q80Var.X.a(q80Var.z.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        f().h();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return tm7.v(this.f, getWindow().getDecorView(), this, keyEvent);
    }

    public final i80 f() {
        q80 q80Var = this.e;
        if (q80Var != null) {
            return q80Var;
        }
        h80 h80Var = i80.a;
        q80 q80Var2 = new q80(getContext(), getWindow(), this, this);
        this.e = q80Var2;
        return q80Var2;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        q80 q80Var = (q80) f();
        q80Var.y();
        return q80Var.z.findViewById(i);
    }

    public final void g(Bundle bundle) {
        f().e();
        super.onCreate(bundle);
        f().g();
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        q80 q80Var = (q80) f();
        if (q80Var.Y != null) {
            q80Var.D();
            q80Var.Y.getClass();
            q80Var.E(0);
        }
    }

    public final void j(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().n(charSequence);
    }

    public final boolean l(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.zb2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View viewFindViewById;
        g(bundle);
        si siVar = this.g;
        siVar.b.setContentView(siVar.y);
        Context context = siVar.a;
        Window window = siVar.c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = siVar.f;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !si.a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (siVar.g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (siVar.e != null) {
                ((LinearLayout.LayoutParams) ((c68) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupB = si.b(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupB2 = si.b(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupB3 = si.b(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        siVar.q = nestedScrollView;
        nestedScrollView.setFocusable(false);
        siVar.q.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupB2.findViewById(android.R.id.message);
        siVar.u = textView;
        if (textView != null) {
            textView.setVisibility(8);
            siVar.q.removeView(siVar.u);
            if (siVar.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) siVar.q.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(siVar.q);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(siVar.e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupB2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupB3.findViewById(android.R.id.button1);
        siVar.h = button;
        nc ncVar = siVar.E;
        button.setOnClickListener(ncVar);
        boolean zIsEmpty = TextUtils.isEmpty(siVar.i);
        Button button2 = siVar.h;
        if (zIsEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(siVar.i);
            siVar.h.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) viewGroupB3.findViewById(android.R.id.button2);
        siVar.k = button3;
        button3.setOnClickListener(ncVar);
        boolean zIsEmpty2 = TextUtils.isEmpty(siVar.l);
        Button button4 = siVar.k;
        if (zIsEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(siVar.l);
            siVar.k.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) viewGroupB3.findViewById(android.R.id.button3);
        siVar.n = button5;
        button5.setOnClickListener(ncVar);
        boolean zIsEmpty3 = TextUtils.isEmpty(siVar.o);
        Button button6 = siVar.n;
        if (zIsEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(siVar.o);
            siVar.n.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = siVar.h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = siVar.k;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = siVar.n;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            viewGroupB3.setVisibility(8);
        }
        if (siVar.v != null) {
            viewGroupB.addView(siVar.v, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            siVar.s = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(siVar.d) || !siVar.C) {
                window.findViewById(R.id.title_template).setVisibility(8);
                siVar.s.setVisibility(8);
                viewGroupB.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                siVar.t = textView2;
                textView2.setText(siVar.d);
                Drawable drawable = siVar.r;
                if (drawable != null) {
                    siVar.s.setImageDrawable(drawable);
                } else {
                    siVar.t.setPadding(siVar.s.getPaddingLeft(), siVar.s.getPaddingTop(), siVar.s.getPaddingRight(), siVar.s.getPaddingBottom());
                    siVar.s.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (viewGroupB == null || viewGroupB.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupB3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupB2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = siVar.q;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = siVar.e != null ? viewGroupB.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupB2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = siVar.e;
        if (alertController$RecycleListView != null && (!z3 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
        }
        if (!z2) {
            View view2 = siVar.e;
            if (view2 == null) {
                view2 = siVar.q;
            }
            if (view2 != null) {
                int i3 = z3 ? 2 : 0;
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = nvf.a;
                view2.setScrollIndicators(i2 | i3, 3);
                if (viewFindViewById11 != null) {
                    viewGroupB2.removeView(viewFindViewById11);
                }
                if (viewFindViewById12 != null) {
                    viewGroupB2.removeView(viewFindViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = siVar.e;
        if (alertController$RecycleListView2 == null || (listAdapter = siVar.w) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = siVar.x;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.g.q;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.g.q;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.zb2, android.app.Dialog
    public final void onStop() {
        super.onStop();
        q80 q80Var = (q80) f();
        q80Var.D();
        c7g c7gVar = q80Var.Y;
        if (c7gVar != null) {
            c7gVar.t = false;
            twf twfVar = c7gVar.s;
            if (twfVar != null) {
                twfVar.a();
            }
        }
    }

    @Override // defpackage.zb2, android.app.Dialog
    public final void setContentView(int i) {
        d();
        f().k(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        j(charSequence);
        si siVar = this.g;
        siVar.d = charSequence;
        TextView textView = siVar.t;
        if (textView != null) {
            textView.setText(charSequence);
        }
        siVar.c.setTitle(charSequence);
    }

    @Override // defpackage.zb2, android.app.Dialog
    public final void setContentView(View view) {
        d();
        f().l(view);
    }

    @Override // defpackage.zb2, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        f().m(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        f().n(getContext().getString(i));
    }
}
