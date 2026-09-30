package tech.chatmind.api.personality;

import defpackage.ag2;
import defpackage.an1;
import defpackage.nyc;
import defpackage.ohe;
import defpackage.pa7;
import defpackage.pu9;
import defpackage.qu9;
import defpackage.syc;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0019¨\u0006,"}, d2 = {"Ltech/chatmind/api/personality/Overview;", "", "Ltech/chatmind/api/personality/TarotCard;", "tarotCard", "", "tarotCardDesc", "<init>", "(Ltech/chatmind/api/personality/TarotCard;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILtech/chatmind/api/personality/TarotCard;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/personality/Overview;Lag2;Lnyc;)V", "write$Self", "component1", "()Ltech/chatmind/api/personality/TarotCard;", "component2", "()Ljava/lang/String;", "copy", "(Ltech/chatmind/api/personality/TarotCard;Ljava/lang/String;)Ltech/chatmind/api/personality/Overview;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltech/chatmind/api/personality/TarotCard;", "getTarotCard", "Ljava/lang/String;", "getTarotCardDesc", "getTarotCardDesc$annotations", "()V", "Companion", "pu9", "qu9", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class Overview {
    public static final int $stable = 0;
    public static final qu9 Companion = new qu9();
    private final TarotCard tarotCard;
    private final String tarotCardDesc;

    public /* synthetic */ Overview(int i, TarotCard tarotCard, String str, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, pu9.a.e());
            throw null;
        }
        this.tarotCard = tarotCard;
        this.tarotCardDesc = str;
    }

    public static /* synthetic */ Overview copy$default(Overview overview, TarotCard tarotCard, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            tarotCard = overview.tarotCard;
        }
        if ((i & 2) != 0) {
            str = overview.tarotCardDesc;
        }
        return overview.copy(tarotCard, str);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(Overview self, ag2 output, nyc serialDesc) {
        output.p(serialDesc, 0, ohe.a, self.tarotCard);
        output.w(serialDesc, 1, self.tarotCardDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TarotCard getTarotCard() {
        return this.tarotCard;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTarotCardDesc() {
        return this.tarotCardDesc;
    }

    public final Overview copy(TarotCard tarotCard, String tarotCardDesc) {
        tarotCard.getClass();
        tarotCardDesc.getClass();
        return new Overview(tarotCard, tarotCardDesc);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Overview)) {
            return false;
        }
        Overview overview = (Overview) other;
        return pa7.t(this.tarotCard, overview.tarotCard) && pa7.t(this.tarotCardDesc, overview.tarotCardDesc);
    }

    public final TarotCard getTarotCard() {
        return this.tarotCard;
    }

    public final String getTarotCardDesc() {
        return this.tarotCardDesc;
    }

    public int hashCode() {
        return this.tarotCardDesc.hashCode() + (this.tarotCard.hashCode() * 31);
    }

    public String toString() {
        return "Overview(tarotCard=" + this.tarotCard + ", tarotCardDesc=" + this.tarotCardDesc + ")";
    }

    @syc("tarotCardDesc")
    public static /* synthetic */ void getTarotCardDesc$annotations() {
    }

    public Overview(TarotCard tarotCard, String str) {
        tarotCard.getClass();
        str.getClass();
        this.tarotCard = tarotCard;
        this.tarotCardDesc = str;
    }
}
