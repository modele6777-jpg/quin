package tech.chatmind.api;

import defpackage.ag2;
import defpackage.hw3;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0019¨\u0006)"}, d2 = {"Ltech/chatmind/api/DeleteReadingResponse;", "", "", "chatId", "", "deleted", "<init>", "(Ljava/lang/String;Z)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;ZLxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/DeleteReadingResponse;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Ltech/chatmind/api/DeleteReadingResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getChatId", "Z", "getDeleted", "Companion", "gw3", "hw3", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class DeleteReadingResponse {
    public static final int $stable = 0;
    public static final hw3 Companion = new hw3();
    private final String chatId;
    private final boolean deleted;

    public /* synthetic */ DeleteReadingResponse(int i, String str, boolean z, xyc xycVar) {
        this.chatId = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.deleted = false;
        } else {
            this.deleted = z;
        }
    }

    public static /* synthetic */ DeleteReadingResponse copy$default(DeleteReadingResponse deleteReadingResponse, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deleteReadingResponse.chatId;
        }
        if ((i & 2) != 0) {
            z = deleteReadingResponse.deleted;
        }
        return deleteReadingResponse.copy(str, z);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(DeleteReadingResponse self, ag2 output, nyc serialDesc) {
        if (output.g(serialDesc) || !pa7.t(self.chatId, "")) {
            output.w(serialDesc, 0, self.chatId);
        }
        if (output.g(serialDesc) || self.deleted) {
            output.o(serialDesc, 1, self.deleted);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDeleted() {
        return this.deleted;
    }

    public final DeleteReadingResponse copy(String chatId, boolean deleted) {
        chatId.getClass();
        return new DeleteReadingResponse(chatId, deleted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteReadingResponse)) {
            return false;
        }
        DeleteReadingResponse deleteReadingResponse = (DeleteReadingResponse) other;
        return pa7.t(this.chatId, deleteReadingResponse.chatId) && this.deleted == deleteReadingResponse.deleted;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final boolean getDeleted() {
        return this.deleted;
    }

    public int hashCode() {
        return Boolean.hashCode(this.deleted) + (this.chatId.hashCode() * 31);
    }

    public String toString() {
        return "DeleteReadingResponse(chatId=" + this.chatId + ", deleted=" + this.deleted + ")";
    }

    public DeleteReadingResponse() {
        this((String) null, false, 3, (rp3) (0 == true ? 1 : 0));
    }

    public DeleteReadingResponse(String str, boolean z) {
        str.getClass();
        this.chatId = str;
        this.deleted = z;
    }

    public /* synthetic */ DeleteReadingResponse(String str, boolean z, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }
}
