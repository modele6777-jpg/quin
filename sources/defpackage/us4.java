package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class us4 extends ts4 {
    @Override // defpackage.ss4, defpackage.qs4
    public void b(dce dceVar, dce dceVar2, Window window, View view, boolean z, boolean z2) {
        o7c j8gVar;
        dceVar.getClass();
        dceVar2.getClass();
        window.getClass();
        view.getClass();
        q6c.l(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            int i = 0;
            while (true) {
                if (!(i < viewGroup.getChildCount())) {
                    break;
                }
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                Object tag = childAt.getTag();
                if (tag instanceof List) {
                    List list = (List) tag;
                    if (list.size() == 4 && (list.get(0) instanceof l82)) {
                        Iterator it = ((Iterable) tag).iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                        break;
                    }
                }
                i = i2;
            }
        }
        window.setNavigationBarContrastEnforced(true);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35) {
            j8gVar = new l8g(window);
        } else {
            j8gVar = i3 >= 30 ? new j8g(window) : new i8g(window);
        }
        j8gVar.B(!z);
        j8gVar.A(true ^ z2);
    }
}
