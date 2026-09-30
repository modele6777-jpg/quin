package defpackage;

import java.util.ArrayList;
import java.util.List;
import tech.chatmind.api.seasonal.model.SeasonalCard;
import tech.chatmind.api.seasonal.model.SeasonalCareerStatus;
import tech.chatmind.api.seasonal.model.SeasonalElementGuides;
import tech.chatmind.api.seasonal.model.SeasonalFollowUp;
import tech.chatmind.api.seasonal.model.SeasonalGender;
import tech.chatmind.api.seasonal.model.SeasonalLoveStatus;
import tech.chatmind.api.seasonal.model.SeasonalPosition;
import tech.chatmind.api.seasonal.model.SeasonalReading;
import tech.chatmind.api.seasonal.model.SeasonalReadingCard;
import tech.chatmind.api.seasonal.model.SeasonalReadingResponse;
import tech.chatmind.api.seasonal.model.SeasonalStatus;
import tech.chatmind.api.seasonal.model.SeasonalUserInfo;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ync {
    public static final ync a = new ync();
    public static final SeasonalUserInfo b = new SeasonalUserInfo(SeasonalGender.FEMALE, SeasonalCareerStatus.WORKER, SeasonalLoveStatus.IN_RELATIONSHIP, "希望在秋天找到更稳定的节奏");
    public static final List c = t72.I(new SeasonalCard(SeasonalPosition.MAJOR_ARCANA, "the_star", 0), new SeasonalCard(SeasonalPosition.WANDS, "six_of_wands", 0), new SeasonalCard(SeasonalPosition.CUPS, "two_of_cups", 0), new SeasonalCard(SeasonalPosition.SWORDS, "queen_of_swords", 0), new SeasonalCard(SeasonalPosition.PENTACLES, "eight_of_pentacles", 0));
    public static final SeasonalFollowUp d = new SeasonalFollowUp("接下来三个月最值得优先投入什么？", "先稳定正在推进的核心目标，再为新机会留出固定的探索时间。", SeasonalStatus.READY, "2026-09-23T10:00:00Z");

    /* JADX WARN: Code duplicated, block: B:25:0x0033  */
    public static SeasonalReadingResponse a(ync yncVar, int i, SolarTerm solarTerm, SeasonalUserInfo seasonalUserInfo, List list, String str, int i2) {
        iy9 iy9Var;
        if ((i2 & 4) != 0) {
            seasonalUserInfo = null;
        }
        if ((i2 & 8) != 0) {
            list = null;
        }
        if ((i2 & 16) != 0) {
            str = null;
        }
        solarTerm.getClass();
        znc zncVarZ = v2c.z(i, solarTerm.getWireValue());
        if (zncVarZ == null || zncVarZ == znc.GENERATION_ERROR) {
            return null;
        }
        if (list == null) {
            list = c;
        } else {
            if (list.size() != 5) {
                list = null;
            }
            if (list == null) {
                list = c;
            }
        }
        List<SeasonalCard> list2 = list;
        c78 c78VarW = t72.w();
        c78VarW.add(d);
        if (str != null) {
            if (v4e.Q(str)) {
                str = null;
            }
            if (str != null) {
                c78VarW.add(new SeasonalFollowUp(str, "把问题拆成一个今天能完成的小行动，答案会在行动中逐渐清晰。", SeasonalStatus.READY, "2026-09-23T10:30:00Z"));
            }
        }
        c78 c78VarN = c78VarW.n();
        if (seasonalUserInfo == null) {
            seasonalUserInfo = b;
        }
        SeasonalUserInfo seasonalUserInfo2 = seasonalUserInfo;
        SeasonalStatus seasonalStatus = SeasonalStatus.READY;
        ArrayList arrayList = new ArrayList(t72.u(list2, 10));
        for (SeasonalCard seasonalCard : list2) {
            switch (xnc.a[seasonalCard.getPosition().ordinal()]) {
                case 1:
                    iy9Var = new iy9("星星", "星星带来安静而清晰的力量，提醒你在变化里保留希望，也相信长期积累。");
                    break;
                case 2:
                    iy9Var = new iy9("权杖六", "行动方向正在变得清晰，适合带着信心迈出下一步，并及时复盘调整。");
                    break;
                case 3:
                    iy9Var = new iy9("圣杯二", "关系中的理解来自坦诚回应，先说清感受，再一起寻找平衡点。");
                    break;
                case 4:
                    iy9Var = new iy9("宝剑皇后", "看清事实能减少反复消耗，重要决定需要清楚边界和直接表达。");
                    break;
                case 5:
                    iy9Var = new iy9("金币八", "稳定投入会带来可见进展，把注意力放回当下能够完成的事情。");
                    break;
                case 6:
                    iy9Var = new iy9("未知牌", "这张牌暂时没有可用解读。");
                    break;
                default:
                    ap.c();
                    return null;
            }
            arrayList.add(new SeasonalReadingCard(seasonalCard.getPosition(), (String) iy9Var.a(), seasonalCard.getDirection(), (String) iy9Var.b()));
        }
        return new SeasonalReadingResponse(seasonalStatus, seasonalUserInfo2, list2, new SeasonalReading(arrayList, "在平衡中做出清晰选择，接下来的三个月会逐步展开新的秩序。", new SeasonalElementGuides("先行动，再校准方向", "坦诚表达真实感受", "分清事实与担忧", "稳稳投入当下")), c78VarN, null);
    }
}
