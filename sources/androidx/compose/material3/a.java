package androidx.compose.material3;

import defpackage.a5c;
import defpackage.d5c;
import defpackage.e5c;
import defpackage.eb3;
import defpackage.m77;
import defpackage.vu;
import defpackage.wef;
import defpackage.x16;
import defpackage.x6f;
import defpackage.xo1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ DelegatingThemeAwareRippleNode b;

    public /* synthetic */ a(DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode, int i) {
        this.a = i;
        this.b = delegatingThemeAwareRippleNode;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode = this.b;
        switch (i) {
            case 0:
                a5c a5cVar = (a5c) eb3.H(delegatingThemeAwareRippleNode, d5c.a);
                vu vuVar = delegatingThemeAwareRippleNode.I0;
                if (a5cVar == null) {
                    if (vuVar != null) {
                        delegatingThemeAwareRippleNode.m1(vuVar);
                    }
                    delegatingThemeAwareRippleNode.I0 = null;
                } else if (vuVar == null) {
                    b bVar = new b(delegatingThemeAwareRippleNode);
                    a aVar = new a(delegatingThemeAwareRippleNode, 1);
                    m77 m77Var = delegatingThemeAwareRippleNode.F0;
                    boolean z = delegatingThemeAwareRippleNode.G0;
                    float f = delegatingThemeAwareRippleNode.H0;
                    x6f x6fVar = e5c.a;
                    vu vuVar2 = new vu(m77Var, z, f, bVar, aVar);
                    delegatingThemeAwareRippleNode.l1(vuVar2);
                    delegatingThemeAwareRippleNode.I0 = vuVar2;
                }
                return wef.a;
            default:
                return xo1.f;
        }
    }
}
