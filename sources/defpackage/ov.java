package defpackage;

import android.R;
import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ov {
    public final pv a;
    public final mv b;
    public final mv c;
    public final View d;

    public ov(pv pvVar, mv mvVar, mv mvVar2, View view) {
        this.a = pvVar;
        this.b = mvVar;
        this.c = mvVar2;
        this.d = view;
    }

    public final boolean a(Menu menu) {
        int i;
        tme tmeVar = (tme) this.b.invoke();
        int i2 = 0;
        if (pa7.t(tmeVar, null)) {
            return false;
        }
        menu.clear();
        List list = tmeVar.a;
        int size = list.size();
        int i3 = 1;
        int i4 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            sme smeVar = (sme) list.get(i5);
            if (smeVar instanceof bne) {
                int i6 = i3 + 1;
                Object obj = smeVar.a;
                if (pa7.t(obj, vfh.s)) {
                    i = R.id.cut;
                } else if (pa7.t(obj, vfh.t)) {
                    i = R.id.copy;
                } else if (pa7.t(obj, vfh.u)) {
                    i = R.id.paste;
                } else if (pa7.t(obj, vfh.v)) {
                    i = R.id.selectAll;
                } else {
                    i = pa7.t(obj, vfh.w) ? R.id.autofill : i3;
                }
                bne bneVar = (bne) smeVar;
                MenuItem menuItemAdd = menu.add(i4, i, i3, bneVar.b);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new nv(i2, bneVar, this));
                i3 = i6;
            } else if (smeVar instanceof ine) {
                if (Build.VERSION.SDK_INT >= 28) {
                    ine ineVar = (ine) smeVar;
                    s.e(menu, i3, this.d.getContext(), ineVar.b, ineVar.c, ineVar.d);
                    i3++;
                }
            } else if (smeVar instanceof gne) {
                i4++;
            }
        }
        return true;
    }
}
