package defpackage;

import java.util.List;
import tech.chatmind.api.WhereDidYouHear;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ppf {
    public static final List a;
    public static final List b;

    static {
        WhereDidYouHear whereDidYouHear = WhereDidYouHear.Douyin;
        WhereDidYouHear whereDidYouHear2 = WhereDidYouHear.Kwai;
        WhereDidYouHear whereDidYouHear3 = WhereDidYouHear.Red;
        WhereDidYouHear whereDidYouHear4 = WhereDidYouHear.FriendsRecommendation;
        WhereDidYouHear whereDidYouHear5 = WhereDidYouHear.Channel;
        WhereDidYouHear whereDidYouHear6 = WhereDidYouHear.Moments;
        WhereDidYouHear whereDidYouHear7 = WhereDidYouHear.QZone;
        WhereDidYouHear whereDidYouHear8 = WhereDidYouHear.Others;
        a = t72.I(whereDidYouHear, whereDidYouHear2, whereDidYouHear3, whereDidYouHear4, whereDidYouHear5, whereDidYouHear6, whereDidYouHear7, whereDidYouHear8);
        b = t72.I(WhereDidYouHear.TikTok, WhereDidYouHear.Instagram, WhereDidYouHear.YouTube, WhereDidYouHear.Twitter, WhereDidYouHear.Threads, whereDidYouHear4, whereDidYouHear8);
    }

    public static final String a(WhereDidYouHear whereDidYouHear) {
        whereDidYouHear.getClass();
        switch (opf.a[whereDidYouHear.ordinal()]) {
            case 1:
                return "douyin";
            case 2:
                return "kuai";
            case 3:
                return "xiaohongshu";
            case 4:
                return "weixin-channels";
            case 5:
                return "friends-circle";
            case 6:
                return "qzone";
            case 7:
                return "friend-recommendation";
            case 8:
                return "TikTok";
            case 9:
                return "X/Twitter";
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return "Threads";
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return "YouTube";
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return "Instagram";
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return "others";
            default:
                ap.c();
                return null;
        }
    }
}
