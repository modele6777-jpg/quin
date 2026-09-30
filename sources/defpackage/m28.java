package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lm28;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lf84;", "", "", "localChatIds", "Ljava/util/List;", "b", "()Ljava/util/List;", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final class m28 extends Exception implements f84 {
    private final List<String> localChatIds;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m28(Exception exc, List list) {
        super(exc.getMessage(), exc);
        list.getClass();
        this.localChatIds = list;
    }

    @Override // defpackage.f84
    public final List a() {
        return t72.I(new iy9("legacy_import_batch_size", String.valueOf(this.localChatIds.size())), new iy9("legacy_import_chat_ids", v4e.m0(UserMetadata.MAX_ATTRIBUTE_SIZE, s72.D0(this.localChatIds, ",", null, null, null, 62))));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getLocalChatIds() {
        return this.localChatIds;
    }
}
