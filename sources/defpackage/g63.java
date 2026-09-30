package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g63 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ TarotSkinIdentify b;

    public /* synthetic */ g63(int i, TarotSkinIdentify tarotSkinIdentify) {
        this.a = i;
        this.b = tarotSkinIdentify;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        TarotSkinIdentify tarotSkinIdentify = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(((cod) obj2).a == tarotSkinIdentify).compareTo(Boolean.valueOf(((cod) obj).a == tarotSkinIdentify));
            case 1:
                return Boolean.valueOf(((ak3) obj2).a == tarotSkinIdentify).compareTo(Boolean.valueOf(((ak3) obj).a == tarotSkinIdentify));
            default:
                return Boolean.valueOf(((ak3) obj2).a == tarotSkinIdentify).compareTo(Boolean.valueOf(((ak3) obj).a == tarotSkinIdentify));
        }
    }
}
