package ai.askquin.ui.explore.skin.navigation;

import ai.askquin.model.TarotSkinIdentify;
import defpackage.an1;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.mz4;
import defpackage.r65;
import defpackage.s65;
import defpackage.tyc;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"ai/askquin/ui/explore/skin/navigation/ExploreTarotRoute$GraphEntry", "", "Lai/askquin/model/TarotSkinIdentify;", "initialSkin", "<init>", "(Lai/askquin/model/TarotSkinIdentify;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILai/askquin/model/TarotSkinIdentify;Lxyc;)V", "Lai/askquin/ui/explore/skin/navigation/ExploreTarotRoute$GraphEntry;", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/explore/skin/navigation/ExploreTarotRoute$GraphEntry;Lag2;Lnyc;)V", "write$Self", "component1", "()Lai/askquin/model/TarotSkinIdentify;", "copy", "(Lai/askquin/model/TarotSkinIdentify;)Lai/askquin/ui/explore/skin/navigation/ExploreTarotRoute$GraphEntry;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lai/askquin/model/TarotSkinIdentify;", "getInitialSkin", "Companion", "r65", "s65", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class ExploreTarotRoute$GraphEntry {
    public static final int $stable = 0;
    private final TarotSkinIdentify initialSkin;
    public static final s65 Companion = new s65();
    private static final lw7[] $childSerializers = {eb3.N(z18.b, new mz4(9))};

    public /* synthetic */ ExploreTarotRoute$GraphEntry(int i, TarotSkinIdentify tarotSkinIdentify, xyc xycVar) {
        if (1 == (i & 1)) {
            this.initialSkin = tarotSkinIdentify;
        } else {
            an1.R(i, 1, r65.a.e());
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return TarotSkinIdentify.Companion.serializer();
    }

    public static /* synthetic */ ExploreTarotRoute$GraphEntry copy$default(ExploreTarotRoute$GraphEntry exploreTarotRoute$GraphEntry, TarotSkinIdentify tarotSkinIdentify, int i, Object obj) {
        if ((i & 1) != 0) {
            tarotSkinIdentify = exploreTarotRoute$GraphEntry.initialSkin;
        }
        return exploreTarotRoute$GraphEntry.copy(tarotSkinIdentify);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TarotSkinIdentify getInitialSkin() {
        return this.initialSkin;
    }

    public final ExploreTarotRoute$GraphEntry copy(TarotSkinIdentify initialSkin) {
        initialSkin.getClass();
        return new ExploreTarotRoute$GraphEntry(initialSkin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ExploreTarotRoute$GraphEntry) && this.initialSkin == ((ExploreTarotRoute$GraphEntry) other).initialSkin;
    }

    public final TarotSkinIdentify getInitialSkin() {
        return this.initialSkin;
    }

    public int hashCode() {
        return this.initialSkin.hashCode();
    }

    public String toString() {
        return "GraphEntry(initialSkin=" + this.initialSkin + ")";
    }

    public ExploreTarotRoute$GraphEntry(TarotSkinIdentify tarotSkinIdentify) {
        tarotSkinIdentify.getClass();
        this.initialSkin = tarotSkinIdentify;
    }
}
