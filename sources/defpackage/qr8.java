package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import io.sentry.android.core.b1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class qr8 implements Menu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public or8 e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public CharSequence m;
    public Drawable n;
    public View o;
    public vr8 v;
    public boolean x;
    public int l = 0;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public final ArrayList t = new ArrayList();
    public final CopyOnWriteArrayList u = new CopyOnWriteArrayList();
    public boolean w = false;

    public qr8(Context context) {
        boolean zC;
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                zC = cwf.c(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zC = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zC) {
                z = true;
            }
        }
        this.d = z;
    }

    public final vr8 a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            qc0.j("order does not contain a valid category.");
            return null;
        }
        int i6 = (y[i5] << 16) | (65535 & i3);
        vr8 vr8Var = new vr8(this, i, i2, i3, i6, charSequence, this.l);
        ArrayList arrayList = this.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((vr8) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                arrayList.add(i4, vr8Var);
                p(true);
                return vr8Var;
            }
        }
        i4 = 0;
        arrayList.add(i4, vr8Var);
        p(true);
        return vr8Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            vr8 vr8VarA = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            vr8VarA.setIcon(resolveInfo.loadIcon(packageManager));
            vr8VarA.g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = vr8VarA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        vr8 vr8VarA = a(i, i2, i3, charSequence);
        k6e k6eVar = new k6e(this.a, this, vr8VarA);
        vr8VarA.o = k6eVar;
        k6eVar.setHeaderTitle(vr8VarA.e);
        return k6eVar;
    }

    public final void b(ls8 ls8Var, Context context) {
        this.u.add(new WeakReference(ls8Var));
        ls8Var.k(context, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            ls8 ls8Var = (ls8) weakReference.get();
            if (ls8Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                ls8Var.d(this, z);
            }
        }
        this.s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        vr8 vr8Var = this.v;
        if (vr8Var != null) {
            d(vr8Var);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(vr8 vr8Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zE = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == vr8Var) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                ls8 ls8Var = (ls8) weakReference.get();
                if (ls8Var != null) {
                    zE = ls8Var.e(vr8Var);
                    if (zE) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zE) {
                this.v = null;
            }
        }
        return zE;
    }

    public boolean e(qr8 qr8Var, MenuItem menuItem) {
        or8 or8Var = this.e;
        return or8Var != null && or8Var.c(qr8Var, menuItem);
    }

    public boolean f(vr8 vr8Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zH = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            ls8 ls8Var = (ls8) weakReference.get();
            if (ls8Var != null) {
                zH = ls8Var.h(vr8Var);
                if (zH) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zH) {
            this.v = vr8Var;
        }
        return zH;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            vr8 vr8Var = (vr8) arrayList.get(i2);
            if (vr8Var.a == i) {
                return vr8Var;
            }
            if (vr8Var.hasSubMenu() && (menuItemFindItem = vr8Var.o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final vr8 g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (vr8) arrayList.get(0);
        }
        boolean zN = n();
        for (int i2 = 0; i2 < size; i2++) {
            vr8 vr8Var = (vr8) arrayList.get(i2);
            char c = zN ? vr8Var.j : vr8Var.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zN && c == '\b' && i == 67))) {
                return vr8Var;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    public final void h(ArrayList arrayList, int i, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList2 = this.f;
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                vr8 vr8Var = (vr8) arrayList2.get(i2);
                if (vr8Var.hasSubMenu()) {
                    vr8Var.o.h(arrayList, i, keyEvent);
                }
                char c = zN ? vr8Var.j : vr8Var.h;
                if ((modifiers & 69647) == ((zN ? vr8Var.k : vr8Var.i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zN && c == '\b' && i == 67)) && vr8Var.isEnabled()) {
                        arrayList.add(vr8Var);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((vr8) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
            boolean zC = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                ls8 ls8Var = (ls8) weakReference.get();
                if (ls8Var == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zC |= ls8Var.c();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (zC) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i = 0; i < size; i++) {
                    vr8 vr8Var = (vr8) arrayListL.get(i);
                    if ((vr8Var.x & 32) == 32) {
                        arrayList.add(vr8Var);
                    } else {
                        arrayList2.add(vr8Var);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList l() {
        boolean z = this.h;
        ArrayList arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            vr8 vr8Var = (vr8) arrayList2.get(i);
            if (vr8Var.isVisible()) {
                arrayList.add(vr8Var);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z) {
        if (this.p) {
            this.q = true;
            if (z) {
                this.r = true;
                return;
            }
            return;
        }
        if (z) {
            this.h = true;
            this.k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            ls8 ls8Var = (ls8) weakReference.get();
            if (ls8Var == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                ls8Var.i();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        vr8 vr8VarG = g(i, keyEvent);
        boolean zQ = vr8VarG != null ? q(vr8VarG, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ac A[SYNTHETIC] */
    public final boolean q(MenuItem menuItem, ls8 ls8Var, int i) {
        wr8 wr8Var;
        boolean zExpandActionView;
        wr8 wr8Var2;
        boolean z;
        k6e k6eVar;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        ls8 ls8Var2;
        vr8 vr8Var = (vr8) menuItem;
        boolean zB = false;
        if (vr8Var == null || !vr8Var.isEnabled()) {
            return false;
        }
        qr8 qr8Var = vr8Var.n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = vr8Var.p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(vr8Var)) && !qr8Var.e(qr8Var, vr8Var)) {
            Intent intent = vr8Var.g;
            if (intent != null) {
                try {
                    qr8Var.a.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    b1.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                    wr8Var = vr8Var.A;
                    if (wr8Var == null) {
                    }
                    zExpandActionView = false;
                    wr8Var2 = vr8Var.A;
                    if (wr8Var2 == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (vr8Var.e()) {
                        zExpandActionView |= vr8Var.expandActionView();
                        if (zExpandActionView) {
                            c(true);
                        }
                    } else if (vr8Var.hasSubMenu()) {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!vr8Var.hasSubMenu()) {
                            k6e k6eVar2 = new k6e(this.a, this, vr8Var);
                            vr8Var.o = k6eVar2;
                            k6eVar2.setHeaderTitle(vr8Var.e);
                        }
                        k6eVar = vr8Var.o;
                        if (z) {
                            wr8Var2.b.onPrepareSubMenu(k6eVar);
                        }
                        copyOnWriteArrayList = this.u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            if (ls8Var != null) {
                            }
                            for (WeakReference weakReference : copyOnWriteArrayList) {
                                ls8Var2 = (ls8) weakReference.get();
                                if (ls8Var2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zB) {
                                    zB = ls8Var2.b(k6eVar);
                                }
                            }
                        }
                        zExpandActionView |= zB;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    } else {
                        if ((i & 4) == 0) {
                            c(false);
                        }
                        if (!vr8Var.hasSubMenu()) {
                            k6e k6eVar3 = new k6e(this.a, this, vr8Var);
                            vr8Var.o = k6eVar3;
                            k6eVar3.setHeaderTitle(vr8Var.e);
                        }
                        k6eVar = vr8Var.o;
                        if (z) {
                            wr8Var2.b.onPrepareSubMenu(k6eVar);
                        }
                        copyOnWriteArrayList = this.u;
                        if (!copyOnWriteArrayList.isEmpty()) {
                            zB = ls8Var != null ? ls8Var.b(k6eVar) : false;
                            while (r8.hasNext()) {
                                ls8Var2 = (ls8) weakReference.get();
                                if (ls8Var2 == null) {
                                    copyOnWriteArrayList.remove(weakReference);
                                } else if (!zB) {
                                    zB = ls8Var2.b(k6eVar);
                                }
                            }
                        }
                        zExpandActionView |= zB;
                        if (!zExpandActionView) {
                            c(true);
                        }
                    }
                    return zExpandActionView;
                }
                zExpandActionView = true;
            } else {
                wr8Var = vr8Var.A;
                if (wr8Var == null && wr8Var.b.onPerformDefaultAction()) {
                    zExpandActionView = true;
                } else {
                    zExpandActionView = false;
                }
            }
        } else {
            zExpandActionView = true;
        }
        wr8Var2 = vr8Var.A;
        if (wr8Var2 == null && wr8Var2.b.hasSubMenu()) {
            z = true;
        } else {
            z = false;
        }
        if (vr8Var.e()) {
            zExpandActionView |= vr8Var.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (vr8Var.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                c(false);
            }
            if (!vr8Var.hasSubMenu()) {
                k6e k6eVar4 = new k6e(this.a, this, vr8Var);
                vr8Var.o = k6eVar4;
                k6eVar4.setHeaderTitle(vr8Var.e);
            }
            k6eVar = vr8Var.o;
            if (z) {
                wr8Var2.b.onPrepareSubMenu(k6eVar);
            }
            copyOnWriteArrayList = this.u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (ls8Var != null) {
                }
                while (r8.hasNext()) {
                    ls8Var2 = (ls8) weakReference.get();
                    if (ls8Var2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zB) {
                        zB = ls8Var2.b(k6eVar);
                    }
                }
            }
            zExpandActionView |= zB;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(ls8 ls8Var) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            ls8 ls8Var2 = (ls8) weakReference.get();
            if (ls8Var2 == null || ls8Var2 == ls8Var) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((vr8) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((vr8) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((vr8) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((k6e) item.getSubMenu()).s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            vr8 vr8Var = (vr8) arrayList.get(i2);
            if (vr8Var.b == i) {
                vr8Var.x = (vr8Var.x & (-5)) | (z2 ? 4 : 0);
                vr8Var.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            vr8 vr8Var = (vr8) arrayList.get(i2);
            if (vr8Var.b == i) {
                vr8Var.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            vr8 vr8Var = (vr8) arrayList.get(i2);
            if (vr8Var.b == i) {
                int i3 = vr8Var.x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                vr8Var.x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((k6e) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = this.b.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                this.n = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        p(false);
    }

    public final void v() {
        this.p = false;
        if (this.q) {
            this.q = false;
            p(this.r);
        }
    }

    public final void w() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }

    public qr8 k() {
        return this;
    }
}
