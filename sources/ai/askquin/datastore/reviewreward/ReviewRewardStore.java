package ai.askquin.datastore.reviewreward;

import ai.askquin.model.reviewreward.ReviewRewardState;
import defpackage.ag2;
import defpackage.c3c;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.qh6;
import defpackage.qu4;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.x2c;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import defpackage.zib;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0018\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0017¨\u0006'"}, d2 = {"Lai/askquin/datastore/reviewreward/ReviewRewardStore;", "", "", "", "Lai/askquin/model/reviewreward/ReviewRewardState;", "accountStates", "<init>", "(Ljava/util/Map;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/util/Map;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_datastore_release", "(Lai/askquin/datastore/reviewreward/ReviewRewardStore;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lai/askquin/datastore/reviewreward/ReviewRewardStore;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getAccountStates", "Companion", "b3c", "c3c", "Quin.core:datastore_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class ReviewRewardStore {
    private final Map<String, ReviewRewardState> accountStates;
    public static final c3c Companion = new c3c();
    private static final lw7[] $childSerializers = {eb3.N(z18.b, new zib(16))};

    public /* synthetic */ ReviewRewardStore(int i, Map map, xyc xycVar) {
        if ((i & 1) == 0) {
            this.accountStates = qu4.a;
        } else {
            this.accountStates = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new qh6(p4e.a, x2c.a, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReviewRewardStore copy$default(ReviewRewardStore reviewRewardStore, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = reviewRewardStore.accountStates;
        }
        return reviewRewardStore.copy(map);
    }

    public static final /* synthetic */ void write$Self$Quin_core_datastore_release(ReviewRewardStore self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (!output.g(serialDesc) && pa7.t(self.accountStates, qu4.a)) {
            return;
        }
        output.p(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.accountStates);
    }

    public final Map<String, ReviewRewardState> component1() {
        return this.accountStates;
    }

    public final ReviewRewardStore copy(Map<String, ReviewRewardState> accountStates) {
        accountStates.getClass();
        return new ReviewRewardStore(accountStates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ReviewRewardStore) && pa7.t(this.accountStates, ((ReviewRewardStore) other).accountStates);
    }

    public final Map<String, ReviewRewardState> getAccountStates() {
        return this.accountStates;
    }

    public int hashCode() {
        return this.accountStates.hashCode();
    }

    public String toString() {
        return "ReviewRewardStore(accountStates=" + this.accountStates + ")";
    }

    public ReviewRewardStore() {
        this((Map) null, 1, (rp3) (0 == true ? 1 : 0));
    }

    public ReviewRewardStore(Map<String, ReviewRewardState> map) {
        map.getClass();
        this.accountStates = map;
    }

    public /* synthetic */ ReviewRewardStore(Map map, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? qu4.a : map);
    }
}
