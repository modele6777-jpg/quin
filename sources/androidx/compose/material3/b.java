package androidx.compose.material3;

import defpackage.a5c;
import defpackage.d5c;
import defpackage.eb3;
import defpackage.em2;
import defpackage.k82;
import defpackage.y72;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements k82 {
    public final /* synthetic */ DelegatingThemeAwareRippleNode a;

    public b(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        this.a = delegatingThemeAwareRippleNode;
    }

    @Override // defpackage.k82
    public final long a() {
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.a;
        long jA = delegatingThemeAwareRippleNode.color.a();
        if (jA != 16) {
            return jA;
        }
        a5c a5cVar = (a5c) eb3.H(delegatingThemeAwareRippleNode, d5c.a);
        if (a5cVar != null) {
            long j = a5cVar.a;
            if (j != 16) {
                return j;
            }
        }
        return ((y72) eb3.H(delegatingThemeAwareRippleNode, em2.a)).a;
    }
}
