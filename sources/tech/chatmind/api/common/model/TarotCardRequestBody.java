package tech.chatmind.api.common.model;

import defpackage.ag2;
import defpackage.an1;
import defpackage.bie;
import defpackage.cie;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0018J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0018¨\u0006("}, d2 = {"Ltech/chatmind/api/common/model/TarotCardRequestBody;", "", "", "key", "", "direction", "<init>", "(Ljava/lang/String;I)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;ILxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/common/model/TarotCardRequestBody;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Ltech/chatmind/api/common/model/TarotCardRequestBody;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getKey", "I", "getDirection", "Companion", "cie", "bie", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class TarotCardRequestBody {
    public static final int $stable = 0;
    public static final cie Companion = new cie();
    private final int direction;
    private final String key;

    public /* synthetic */ TarotCardRequestBody(int i, String str, int i2, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, bie.a.e());
            throw null;
        }
        this.key = str;
        this.direction = i2;
    }

    public static /* synthetic */ TarotCardRequestBody copy$default(TarotCardRequestBody tarotCardRequestBody, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tarotCardRequestBody.key;
        }
        if ((i2 & 2) != 0) {
            i = tarotCardRequestBody.direction;
        }
        return tarotCardRequestBody.copy(str, i);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(TarotCardRequestBody self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.key);
        output.v(1, self.direction, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDirection() {
        return this.direction;
    }

    public final TarotCardRequestBody copy(String key, int direction) {
        key.getClass();
        return new TarotCardRequestBody(key, direction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TarotCardRequestBody)) {
            return false;
        }
        TarotCardRequestBody tarotCardRequestBody = (TarotCardRequestBody) other;
        return pa7.t(this.key, tarotCardRequestBody.key) && this.direction == tarotCardRequestBody.direction;
    }

    public final int getDirection() {
        return this.direction;
    }

    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return Integer.hashCode(this.direction) + (this.key.hashCode() * 31);
    }

    public String toString() {
        return "TarotCardRequestBody(key=" + this.key + ", direction=" + this.direction + ")";
    }

    public TarotCardRequestBody(String str, int i) {
        str.getClass();
        this.key = str;
        this.direction = i;
    }
}
