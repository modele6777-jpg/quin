package ai.askquin.ui.draw.photo.homepage;

import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.hr1;
import defpackage.ir1;
import defpackage.jl0;
import defpackage.kv2;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.qc0;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xn7;
import defpackage.xs1;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000245B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ>\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001aJ\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010\u001fR\u0011\u00102\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b1\u0010\u001c¨\u00066"}, d2 = {"Lai/askquin/ui/draw/photo/homepage/CardLayoutConfig;", "", "", "cardCount", "", "containerWidth", "containerHeight", "", "Lai/askquin/ui/draw/photo/homepage/CardPositionConfig;", "positions", "<init>", "(IFFLjava/util/List;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(IIFFLjava/util/List;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/draw/photo/homepage/CardLayoutConfig;Lag2;Lnyc;)V", "write$Self", "component1", "()I", "component2", "()F", "component3", "component4", "()Ljava/util/List;", "copy", "(IFFLjava/util/List;)Lai/askquin/ui/draw/photo/homepage/CardLayoutConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCardCount", "F", "getContainerWidth", "getContainerHeight", "Ljava/util/List;", "getPositions", "getContainerAspectRatio", "containerAspectRatio", "Companion", "hr1", "ir1", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class CardLayoutConfig {
    public static final int $stable = 8;
    private final int cardCount;
    private final float containerHeight;
    private final float containerWidth;
    private final List<CardPositionConfig> positions;
    public static final ir1 Companion = new ir1();
    private static final lw7[] $childSerializers = {null, null, null, eb3.N(z18.b, new jl0(21))};

    public /* synthetic */ CardLayoutConfig(int i, int i2, float f, float f2, List list, xyc xycVar) {
        if (15 != (i & 15)) {
            an1.R(i, 15, hr1.a.e());
            throw null;
        }
        this.cardCount = i2;
        this.containerWidth = f;
        this.containerHeight = f2;
        this.positions = list;
        if (list.size() == i2) {
            return;
        }
        qc0.o(kv2.h(list.size(), i2, "positions.size (", ") must equal cardCount (", ")"));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(xs1.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardLayoutConfig copy$default(CardLayoutConfig cardLayoutConfig, int i, float f, float f2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = cardLayoutConfig.cardCount;
        }
        if ((i2 & 2) != 0) {
            f = cardLayoutConfig.containerWidth;
        }
        if ((i2 & 4) != 0) {
            f2 = cardLayoutConfig.containerHeight;
        }
        if ((i2 & 8) != 0) {
            list = cardLayoutConfig.positions;
        }
        return cardLayoutConfig.copy(i, f, f2, list);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(CardLayoutConfig self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.v(0, self.cardCount, serialDesc);
        output.E(serialDesc, 1, self.containerWidth);
        output.E(serialDesc, 2, self.containerHeight);
        output.p(serialDesc, 3, (xn7) lw7VarArr[3].getValue(), self.positions);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCardCount() {
        return this.cardCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getContainerWidth() {
        return this.containerWidth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getContainerHeight() {
        return this.containerHeight;
    }

    public final List<CardPositionConfig> component4() {
        return this.positions;
    }

    public final CardLayoutConfig copy(int cardCount, float containerWidth, float containerHeight, List<CardPositionConfig> positions) {
        positions.getClass();
        return new CardLayoutConfig(cardCount, containerWidth, containerHeight, positions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardLayoutConfig)) {
            return false;
        }
        CardLayoutConfig cardLayoutConfig = (CardLayoutConfig) other;
        return this.cardCount == cardLayoutConfig.cardCount && Float.compare(this.containerWidth, cardLayoutConfig.containerWidth) == 0 && Float.compare(this.containerHeight, cardLayoutConfig.containerHeight) == 0 && pa7.t(this.positions, cardLayoutConfig.positions);
    }

    public final int getCardCount() {
        return this.cardCount;
    }

    public final float getContainerAspectRatio() {
        return this.containerWidth / this.containerHeight;
    }

    public final float getContainerHeight() {
        return this.containerHeight;
    }

    public final float getContainerWidth() {
        return this.containerWidth;
    }

    public final List<CardPositionConfig> getPositions() {
        return this.positions;
    }

    public int hashCode() {
        return this.positions.hashCode() + ub3.a(this.containerHeight, ub3.a(this.containerWidth, Integer.hashCode(this.cardCount) * 31, 31), 31);
    }

    public String toString() {
        return "CardLayoutConfig(cardCount=" + this.cardCount + ", containerWidth=" + this.containerWidth + ", containerHeight=" + this.containerHeight + ", positions=" + this.positions + ")";
    }

    public CardLayoutConfig(int i, float f, float f2, List<CardPositionConfig> list) {
        list.getClass();
        this.cardCount = i;
        this.containerWidth = f;
        this.containerHeight = f2;
        this.positions = list;
        if (list.size() == i) {
            return;
        }
        qc0.o(kv2.h(list.size(), i, "positions.size (", ") must equal cardCount (", ")"));
        throw null;
    }
}
