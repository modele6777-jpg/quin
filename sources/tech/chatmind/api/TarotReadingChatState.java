package tech.chatmind.api;

import defpackage.ag2;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.fje;
import defpackage.ks0;
import defpackage.ky1;
import defpackage.lw7;
import defpackage.mie;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B1\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ:\u0010\u001d\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001bJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b'\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b*\u0010\u001b¨\u0006."}, d2 = {"Ltech/chatmind/api/TarotReadingChatState;", "", "", "Ltech/chatmind/api/ChatTextMessage;", "messages", "", "createdTime", "updatedTime", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/TarotReadingChatState;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/TarotReadingChatState;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getMessages", "Ljava/lang/String;", "getCreatedTime", "getUpdatedTime", "Companion", "eje", "fje", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class TarotReadingChatState {
    public static final int $stable = 8;
    private final String createdTime;
    private final List<ChatTextMessage> messages;
    private final String updatedTime;
    public static final fje Companion = new fje();
    private static final lw7[] $childSerializers = {eb3.N(z18.b, new mie(3)), null, null};

    public /* synthetic */ TarotReadingChatState(int i, List list, String str, String str2, xyc xycVar) {
        if ((i & 1) == 0) {
            this.messages = null;
        } else {
            this.messages = list;
        }
        if ((i & 2) == 0) {
            this.createdTime = null;
        } else {
            this.createdTime = str;
        }
        if ((i & 4) == 0) {
            this.updatedTime = null;
        } else {
            this.updatedTime = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(ky1.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TarotReadingChatState copy$default(TarotReadingChatState tarotReadingChatState, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = tarotReadingChatState.messages;
        }
        if ((i & 2) != 0) {
            str = tarotReadingChatState.createdTime;
        }
        if ((i & 4) != 0) {
            str2 = tarotReadingChatState.updatedTime;
        }
        return tarotReadingChatState.copy(list, str, str2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(TarotReadingChatState self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || self.messages != null) {
            output.A(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.messages);
        }
        if (output.g(serialDesc) || self.createdTime != null) {
            output.A(serialDesc, 1, p4e.a, self.createdTime);
        }
        if (!output.g(serialDesc) && self.updatedTime == null) {
            return;
        }
        output.A(serialDesc, 2, p4e.a, self.updatedTime);
    }

    public final List<ChatTextMessage> component1() {
        return this.messages;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCreatedTime() {
        return this.createdTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUpdatedTime() {
        return this.updatedTime;
    }

    public final TarotReadingChatState copy(List<ChatTextMessage> messages, String createdTime, String updatedTime) {
        return new TarotReadingChatState(messages, createdTime, updatedTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TarotReadingChatState)) {
            return false;
        }
        TarotReadingChatState tarotReadingChatState = (TarotReadingChatState) other;
        return pa7.t(this.messages, tarotReadingChatState.messages) && pa7.t(this.createdTime, tarotReadingChatState.createdTime) && pa7.t(this.updatedTime, tarotReadingChatState.updatedTime);
    }

    public final String getCreatedTime() {
        return this.createdTime;
    }

    public final List<ChatTextMessage> getMessages() {
        return this.messages;
    }

    public final String getUpdatedTime() {
        return this.updatedTime;
    }

    public int hashCode() {
        List<ChatTextMessage> list = this.messages;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.createdTime;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.updatedTime;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        List<ChatTextMessage> list = this.messages;
        String str = this.createdTime;
        String str2 = this.updatedTime;
        StringBuilder sb = new StringBuilder("TarotReadingChatState(messages=");
        sb.append(list);
        sb.append(", createdTime=");
        sb.append(str);
        sb.append(", updatedTime=");
        return ks0.l(sb, str2, ")");
    }

    public TarotReadingChatState() {
        this((List) null, (String) null, (String) null, 7, (rp3) null);
    }

    public TarotReadingChatState(List<ChatTextMessage> list, String str, String str2) {
        this.messages = list;
        this.createdTime = str;
        this.updatedTime = str2;
    }

    public /* synthetic */ TarotReadingChatState(List list, String str, String str2, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
