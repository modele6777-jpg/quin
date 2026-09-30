package ai.askquin.datastore.model;

import defpackage.ag2;
import defpackage.bm8;
import defpackage.c77;
import defpackage.eb3;
import defpackage.hcb;
import defpackage.i7b;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.qh6;
import defpackage.qu4;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b¢\u0006\u0004\b\u000b\u0010\fBQ\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010#J\u001c\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\bHÆ\u0003¢\u0006\u0004\b&\u0010'JN\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b,\u0010#J\u001a\u0010.\u001a\u00020\u001a2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b4\u0010#R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b5\u0010#R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010'¨\u0006;"}, d2 = {"Lai/askquin/datastore/model/RatingConditionRecord;", "", "", "lastRatingTime", "", "totalShowRatingCount", "appLaunchCount", "drawCardTimes", "", "", "questionRecords", "<init>", "(JIIILjava/util/Map;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(IJIIILjava/util/Map;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_datastore_release", "(Lai/askquin/datastore/model/RatingConditionRecord;Lag2;Lnyc;)V", "write$Self", "", "over8Hours", "()Z", "chatId", "askQuestion", "(Ljava/lang/String;)Lai/askquin/datastore/model/RatingConditionRecord;", "component1", "()J", "component2", "()I", "component3", "component4", "component5", "()Ljava/util/Map;", "copy", "(JIIILjava/util/Map;)Lai/askquin/datastore/model/RatingConditionRecord;", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getLastRatingTime", "I", "getTotalShowRatingCount", "getAppLaunchCount", "getDrawCardTimes", "Ljava/util/Map;", "getQuestionRecords", "Companion", "gcb", "hcb", "Quin.core:datastore_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class RatingConditionRecord {
    private final int appLaunchCount;
    private final int drawCardTimes;
    private final long lastRatingTime;
    private final Map<String, Integer> questionRecords;
    private final int totalShowRatingCount;
    public static final hcb Companion = new hcb();
    private static final lw7[] $childSerializers = {null, null, null, null, eb3.N(z18.b, new i7b(15))};

    public /* synthetic */ RatingConditionRecord(int i, long j, int i2, int i3, int i4, Map map, xyc xycVar) {
        this.lastRatingTime = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.totalShowRatingCount = 0;
        } else {
            this.totalShowRatingCount = i2;
        }
        if ((i & 4) == 0) {
            this.appLaunchCount = 0;
        } else {
            this.appLaunchCount = i3;
        }
        if ((i & 8) == 0) {
            this.drawCardTimes = 0;
        } else {
            this.drawCardTimes = i4;
        }
        if ((i & 16) == 0) {
            this.questionRecords = qu4.a;
        } else {
            this.questionRecords = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new qh6(p4e.a, c77.a, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RatingConditionRecord copy$default(RatingConditionRecord ratingConditionRecord, long j, int i, int i2, int i3, Map map, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j = ratingConditionRecord.lastRatingTime;
        }
        long j2 = j;
        if ((i4 & 2) != 0) {
            i = ratingConditionRecord.totalShowRatingCount;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = ratingConditionRecord.appLaunchCount;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = ratingConditionRecord.drawCardTimes;
        }
        int i7 = i3;
        if ((i4 & 16) != 0) {
            map = ratingConditionRecord.questionRecords;
        }
        return ratingConditionRecord.copy(j2, i5, i6, i7, map);
    }

    public static final /* synthetic */ void write$Self$Quin_core_datastore_release(RatingConditionRecord self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || self.lastRatingTime != 0) {
            output.k(serialDesc, 0, self.lastRatingTime);
        }
        if (output.g(serialDesc) || self.totalShowRatingCount != 0) {
            output.v(1, self.totalShowRatingCount, serialDesc);
        }
        if (output.g(serialDesc) || self.appLaunchCount != 0) {
            output.v(2, self.appLaunchCount, serialDesc);
        }
        if (output.g(serialDesc) || self.drawCardTimes != 0) {
            output.v(3, self.drawCardTimes, serialDesc);
        }
        if (!output.g(serialDesc) && pa7.t(self.questionRecords, qu4.a)) {
            return;
        }
        output.p(serialDesc, 4, (xn7) lw7VarArr[4].getValue(), self.questionRecords);
    }

    public final RatingConditionRecord askQuestion(String chatId) {
        chatId.getClass();
        LinkedHashMap linkedHashMapY = bm8.Y(this.questionRecords);
        Integer num = (Integer) linkedHashMapY.get(chatId);
        linkedHashMapY.put(chatId, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        return copy$default(this, 0L, 0, 0, 0, linkedHashMapY, 15, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getLastRatingTime() {
        return this.lastRatingTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTotalShowRatingCount() {
        return this.totalShowRatingCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAppLaunchCount() {
        return this.appLaunchCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDrawCardTimes() {
        return this.drawCardTimes;
    }

    public final Map<String, Integer> component5() {
        return this.questionRecords;
    }

    public final RatingConditionRecord copy(long lastRatingTime, int totalShowRatingCount, int appLaunchCount, int drawCardTimes, Map<String, Integer> questionRecords) {
        questionRecords.getClass();
        return new RatingConditionRecord(lastRatingTime, totalShowRatingCount, appLaunchCount, drawCardTimes, questionRecords);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RatingConditionRecord)) {
            return false;
        }
        RatingConditionRecord ratingConditionRecord = (RatingConditionRecord) other;
        return this.lastRatingTime == ratingConditionRecord.lastRatingTime && this.totalShowRatingCount == ratingConditionRecord.totalShowRatingCount && this.appLaunchCount == ratingConditionRecord.appLaunchCount && this.drawCardTimes == ratingConditionRecord.drawCardTimes && pa7.t(this.questionRecords, ratingConditionRecord.questionRecords);
    }

    public final int getAppLaunchCount() {
        return this.appLaunchCount;
    }

    public final int getDrawCardTimes() {
        return this.drawCardTimes;
    }

    public final long getLastRatingTime() {
        return this.lastRatingTime;
    }

    public final Map<String, Integer> getQuestionRecords() {
        return this.questionRecords;
    }

    public final int getTotalShowRatingCount() {
        return this.totalShowRatingCount;
    }

    public int hashCode() {
        return this.questionRecords.hashCode() + ub3.b(this.drawCardTimes, ub3.b(this.appLaunchCount, ub3.b(this.totalShowRatingCount, Long.hashCode(this.lastRatingTime) * 31, 31), 31), 31);
    }

    public final boolean over8Hours() {
        return System.currentTimeMillis() - this.lastRatingTime > 28800000;
    }

    public String toString() {
        return "RatingConditionRecord(lastRatingTime=" + this.lastRatingTime + ", totalShowRatingCount=" + this.totalShowRatingCount + ", appLaunchCount=" + this.appLaunchCount + ", drawCardTimes=" + this.drawCardTimes + ", questionRecords=" + this.questionRecords + ")";
    }

    public RatingConditionRecord() {
        this(0L, 0, 0, 0, (Map) null, 31, (rp3) null);
    }

    public RatingConditionRecord(long j, int i, int i2, int i3, Map<String, Integer> map) {
        map.getClass();
        this.lastRatingTime = j;
        this.totalShowRatingCount = i;
        this.appLaunchCount = i2;
        this.drawCardTimes = i3;
        this.questionRecords = map;
    }

    public /* synthetic */ RatingConditionRecord(long j, int i, int i2, int i3, Map map, int i4, rp3 rp3Var) {
        this((i4 & 1) != 0 ? 0L : j, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3, (i4 & 16) != 0 ? qu4.a : map);
    }
}
