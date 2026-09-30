package tech.chatmind.api;

import defpackage.ag2;
import defpackage.hg;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%&B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Ltech/chatmind/api/AdditionalInfoAudio;", "", "", "assetId", "transcription", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/AdditionalInfoAudio;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/AdditionalInfoAudio;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAssetId", "getTranscription", "Companion", "gg", "hg", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class AdditionalInfoAudio {
    public static final int $stable = 0;
    public static final hg Companion = new hg();
    private final String assetId;
    private final String transcription;

    public /* synthetic */ AdditionalInfoAudio(int i, String str, String str2, xyc xycVar) {
        this.assetId = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.transcription = "";
        } else {
            this.transcription = str2;
        }
    }

    public static /* synthetic */ AdditionalInfoAudio copy$default(AdditionalInfoAudio additionalInfoAudio, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = additionalInfoAudio.assetId;
        }
        if ((i & 2) != 0) {
            str2 = additionalInfoAudio.transcription;
        }
        return additionalInfoAudio.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(AdditionalInfoAudio self, ag2 output, nyc serialDesc) {
        if (output.g(serialDesc) || self.assetId != null) {
            output.A(serialDesc, 0, p4e.a, self.assetId);
        }
        if (!output.g(serialDesc) && pa7.t(self.transcription, "")) {
            return;
        }
        output.w(serialDesc, 1, self.transcription);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAssetId() {
        return this.assetId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTranscription() {
        return this.transcription;
    }

    public final AdditionalInfoAudio copy(String assetId, String transcription) {
        transcription.getClass();
        return new AdditionalInfoAudio(assetId, transcription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalInfoAudio)) {
            return false;
        }
        AdditionalInfoAudio additionalInfoAudio = (AdditionalInfoAudio) other;
        return pa7.t(this.assetId, additionalInfoAudio.assetId) && pa7.t(this.transcription, additionalInfoAudio.transcription);
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final String getTranscription() {
        return this.transcription;
    }

    public int hashCode() {
        String str = this.assetId;
        return this.transcription.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return tec.m("AdditionalInfoAudio(assetId=", this.assetId, ", transcription=", this.transcription, ")");
    }

    public AdditionalInfoAudio() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (rp3) (0 == true ? 1 : 0));
    }

    public AdditionalInfoAudio(String str, String str2) {
        str2.getClass();
        this.assetId = str;
        this.transcription = str2;
    }

    public /* synthetic */ AdditionalInfoAudio(String str, String str2, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2);
    }
}
