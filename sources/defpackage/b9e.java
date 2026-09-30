package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import io.sentry.android.core.b1;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b9e {
    public CharSequence A;
    public CharSequence B;
    public final /* synthetic */ c9e E;
    public final Menu a;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public wr8 z;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public int b = 0;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public boolean f = true;
    public boolean g = true;

    public b9e(c9e c9eVar, Menu menu) {
        this.E = c9eVar;
        this.a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.E.c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            b1.n("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void b(MenuItem menuItem) {
        c9e c9eVar = this.E;
        Context context = c9eVar.c;
        boolean z = false;
        menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
        int i = this.v;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.y != null) {
            if (context.isRestricted()) {
                qc0.p("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            Object objA = c9eVar.d;
            if (objA == null) {
                objA = c9e.a(context);
                c9eVar.d = objA;
            }
            String str = this.y;
            a9e a9eVar = new a9e();
            a9eVar.b = objA;
            Class<?> cls = objA.getClass();
            try {
                a9eVar.c = cls.getMethod(str, a9e.d);
                menuItem.setOnMenuItemClickListener(a9eVar);
            } catch (Exception e) {
                StringBuilder sbP = tec.p("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbP.append(cls.getName());
                InflateException inflateException = new InflateException(sbP.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.r >= 2) {
            if (menuItem instanceof vr8) {
                vr8 vr8Var = (vr8) menuItem;
                vr8Var.x = (vr8Var.x & (-5)) | 4;
            } else if (menuItem instanceof zr8) {
                zr8 zr8Var = (zr8) menuItem;
                d9e d9eVar = zr8Var.c;
                try {
                    Method declaredMethod = zr8Var.d;
                    if (declaredMethod == null) {
                        declaredMethod = d9eVar.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        zr8Var.d = declaredMethod;
                    }
                    declaredMethod.invoke(d9eVar, Boolean.TRUE);
                } catch (Exception e2) {
                    b1.n("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.x;
        if (str2 != null) {
            menuItem.setActionView((View) a(str2, c9e.e, c9eVar.a));
            z = true;
        }
        int i2 = this.w;
        if (i2 > 0) {
            if (z) {
                b1.l("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        wr8 wr8Var = this.z;
        if (wr8Var != null) {
            if (menuItem instanceof d9e) {
                ((d9e) menuItem).a(wr8Var);
            } else {
                b1.l("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.A;
        boolean z2 = menuItem instanceof d9e;
        if (z2) {
            ((d9e) menuItem).setContentDescription(charSequence);
        } else {
            menuItem.setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.B;
        if (z2) {
            ((d9e) menuItem).setTooltipText(charSequence2);
        } else {
            menuItem.setTooltipText(charSequence2);
        }
        char c = this.n;
        int i3 = this.o;
        if (z2) {
            ((d9e) menuItem).setAlphabeticShortcut(c, i3);
        } else {
            menuItem.setAlphabeticShortcut(c, i3);
        }
        char c2 = this.p;
        int i4 = this.q;
        if (z2) {
            ((d9e) menuItem).setNumericShortcut(c2, i4);
        } else {
            menuItem.setNumericShortcut(c2, i4);
        }
        PorterDuff.Mode mode = this.D;
        if (mode != null) {
            if (z2) {
                ((d9e) menuItem).setIconTintMode(mode);
            } else {
                menuItem.setIconTintMode(mode);
            }
        }
        ColorStateList colorStateList = this.C;
        if (colorStateList != null) {
            if (z2) {
                ((d9e) menuItem).setIconTintList(colorStateList);
            } else {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }
}
