package tech.chatmind.api;

import defpackage.ag2;
import defpackage.an1;
import defpackage.ib8;
import defpackage.ks0;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.ui0;
import defpackage.vi0;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019JB\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u001dJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b-\u0010\u0019¨\u00061"}, d2 = {"Ltech/chatmind/api/AudioAssetCompleteResponse;", "", "", "assetId", "type", "mimeType", "", "size", "transcription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/AudioAssetCompleteResponse;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()I", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ltech/chatmind/api/AudioAssetCompleteResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAssetId", "getType", "getMimeType", "I", "getSize", "getTranscription", "Companion", "ui0", "vi0", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class AudioAssetCompleteResponse {
    public static final int $stable = 0;
    public static final vi0 Companion = new vi0();
    private final String assetId;
    private final String mimeType;
    private final int size;
    private final String transcription;
    private final String type;

    public /* synthetic */ AudioAssetCompleteResponse(int i, String str, String str2, String str3, int i2, String str4, xyc xycVar) {
        if (15 != (i & 15)) {
            an1.R(i, 15, ui0.a.e());
            throw null;
        }
        this.assetId = str;
        this.type = str2;
        this.mimeType = str3;
        this.size = i2;
        if ((i & 16) == 0) {
            this.transcription = "";
        } else {
            this.transcription = str4;
        }
    }

    public static /* synthetic */ AudioAssetCompleteResponse copy$default(AudioAssetCompleteResponse audioAssetCompleteResponse, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = audioAssetCompleteResponse.assetId;
        }
        if ((i2 & 2) != 0) {
            str2 = audioAssetCompleteResponse.type;
        }
        if ((i2 & 4) != 0) {
            str3 = audioAssetCompleteResponse.mimeType;
        }
        if ((i2 & 8) != 0) {
            i = audioAssetCompleteResponse.size;
        }
        if ((i2 & 16) != 0) {
            str4 = audioAssetCompleteResponse.transcription;
        }
        String str5 = str4;
        String str6 = str3;
        return audioAssetCompleteResponse.copy(str, str2, str6, i, str5);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(AudioAssetCompleteResponse self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.assetId);
        output.w(serialDesc, 1, self.type);
        output.w(serialDesc, 2, self.mimeType);
        output.v(3, self.size, serialDesc);
        if (!output.g(serialDesc) && pa7.t(self.transcription, "")) {
            return;
        }
        output.w(serialDesc, 4, self.transcription);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAssetId() {
        return this.assetId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTranscription() {
        return this.transcription;
    }

    public final AudioAssetCompleteResponse copy(String assetId, String type, String mimeType, int size, String transcription) {
        assetId.getClass();
        type.getClass();
        mimeType.getClass();
        transcription.getClass();
        return new AudioAssetCompleteResponse(assetId, type, mimeType, size, transcription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioAssetCompleteResponse)) {
            return false;
        }
        AudioAssetCompleteResponse audioAssetCompleteResponse = (AudioAssetCompleteResponse) other;
        return pa7.t(this.assetId, audioAssetCompleteResponse.assetId) && pa7.t(this.type, audioAssetCompleteResponse.type) && pa7.t(this.mimeType, audioAssetCompleteResponse.mimeType) && this.size == audioAssetCompleteResponse.size && pa7.t(this.transcription, audioAssetCompleteResponse.transcription);
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final int getSize() {
        return this.size;
    }

    public final String getTranscription() {
        return this.transcription;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.transcription.hashCode() + ub3.b(this.size, ub3.c(ub3.c(this.assetId.hashCode() * 31, 31, this.type), 31, this.mimeType), 31);
    }

    public String toString() {
        String str = this.assetId;
        String str2 = this.type;
        String str3 = this.mimeType;
        int i = this.size;
        String str4 = this.transcription;
        StringBuilder sbO = ib8.o("AudioAssetCompleteResponse(assetId=", str, ", type=", str2, ", mimeType=");
        sbO.append(str3);
        sbO.append(", size=");
        sbO.append(i);
        sbO.append(", transcription=");
        return ks0.l(sbO, str4, ")");
    }

    public AudioAssetCompleteResponse(String str, String str2, String str3, int i, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.assetId = str;
        this.type = str2;
        this.mimeType = str3;
        this.size = i;
        this.transcription = str4;
    }

    public /* synthetic */ AudioAssetCompleteResponse(String str, String str2, String str3, int i, String str4, int i2, rp3 rp3Var) {
        this(str, str2, str3, i, (i2 & 16) != 0 ? "" : str4);
    }
}
