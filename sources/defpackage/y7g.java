package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class y7g extends x7g {
    public y7g(h8g h8gVar, WindowInsets windowInsets) {
        super(h8gVar, windowInsets);
    }

    @Override // defpackage.e8g
    public h8g a() {
        return h8g.c(this.c.consumeDisplayCutout(), null);
    }

    @Override // defpackage.w7g, defpackage.e8g
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7g)) {
            return false;
        }
        y7g y7gVar = (y7g) obj;
        return Objects.equals(this.c, y7gVar.c) && Objects.equals(this.g, y7gVar.g) && w7g.M(this.h, y7gVar.h);
    }

    @Override // defpackage.e8g
    public ha4 h() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new ha4(displayCutout);
    }

    @Override // defpackage.e8g
    public int hashCode() {
        return this.c.hashCode();
    }

    public y7g(h8g h8gVar, y7g y7gVar) {
        super(h8gVar, y7gVar);
    }
}
