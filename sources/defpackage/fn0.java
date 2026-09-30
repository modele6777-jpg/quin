package defpackage;

import tech.chatmind.api.credits.LevelAndKind;
import tech.chatmind.api.credits.QuinSubscription;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fn0 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q9b b;

    public /* synthetic */ fn0(q9b q9bVar, int i) {
        this.a = i;
        this.b = q9bVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        LevelAndKind levelAndKind;
        int i = this.a;
        wef wefVar = wef.a;
        q9b q9bVar = this.b;
        switch (i) {
            case 0:
                QuinSubscription quinSubscriptionB = drb.b(((eab) q9bVar).b());
                if (quinSubscriptionB == null || (levelAndKind = quinSubscriptionB.getLevelAndKind()) == null) {
                    return null;
                }
                return levelAndKind.getKind();
            case 1:
                return ((eab) q9bVar).b();
            case 2:
                q9bVar.getClass();
                ((eab) q9bVar).i(lif.Guest);
                return wefVar;
            default:
                q9bVar.getClass();
                ((eab) q9bVar).i(lif.PassAndCompensate);
                return wefVar;
        }
    }
}
