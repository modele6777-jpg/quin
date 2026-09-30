package tech.chatmind.api.message.model;

import defpackage.c07;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.lx4;
import defpackage.nk8;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.xn7;
import defpackage.yv6;
import defpackage.z18;
import defpackage.z7c;
import java.lang.annotation.Annotation;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Ltech/chatmind/api/message/model/InAppMessageType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "c07", "Renew", "Subscription", "PurchaseTimes", "IssueMembership", "IssueTimes", "Invitation", "InvitationToInviter", "InvitationToInvitee", "ManualText", "ManualAction", "ManualImage", "ManualFull", "Unknown", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public enum InAppMessageType {
    Renew,
    Subscription,
    PurchaseTimes,
    IssueMembership,
    IssueTimes,
    Invitation,
    InvitationToInviter,
    InvitationToInvitee,
    ManualText,
    ManualAction,
    ManualImage,
    ManualFull,
    Unknown;

    private static final /* synthetic */ lx4 $ENTRIES = pa7.Q(values());
    public static final c07 Companion = new c07();
    private static final lw7 $cachedSerializer$delegate = eb3.N(z18.b, new yv6(7));

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _init_$_anonymous_() {
        return nk8.p("tech.chatmind.api.message.model.InAppMessageType", values(), new String[]{"renew", "subscription", "purchase-times", "issue-membership", "issue-times", "invitation", "invitation-to-inviter", "invitation-to-invitee", "manual-text", "manual-action", "manual-image", "manual-full", "unknown"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null});
    }

    public static lx4 getEntries() {
        return $ENTRIES;
    }
}
