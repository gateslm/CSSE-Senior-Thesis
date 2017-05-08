package edu.rosehulman.gateslm.runner;

import java.util.ArrayList;
import java.util.List;

import edu.rosehulman.gateslm.Models.RegionModel;
import edu.rosehulman.gateslm.Models.SegmentModel;

public class ListGenerator {


	public static List<RegionModel> createRegionList() {
		List<RegionModel> regionList = new ArrayList<>();
		regionList.add(new RegionModel("South West Side", -87.747456, -87.68373,
				41.764066, 41.822792));
		regionList.add(new RegionModel("Bridgeport-McKinley-Lower West",
				-87.685372, -87.636322, 41.822792, 41.866129));
		regionList.add(new RegionModel("Ashburn", -87.747456, -87.67298,
				41.728472, 41.764066));
		regionList.add(new RegionModel("Chicago Loop", -87.647208, -87.62308,
				41.866129, 41.88886));
		regionList.add(new RegionModel("Austin", -87.775947, -87.747456,
				41.866129, 41.909269));
		regionList.add(new RegionModel("Far North West", -87.84621, -87.747456,
				41.960669, 42.0190998));
		regionList.add(new RegionModel("Irving Park-Avondale-North Ctr",
				-87.747456, -87.67459, 41.931841, 41.960669));
		regionList.add(new RegionModel("Hyde Park-Kenwood-Woodlawn", -87.606334,
				-87.56626, 41.764066, 41.822792));
		regionList.add(new RegionModel("New City-Englewood-W Englewood",
				-87.68373, -87.636322, 41.764066, 41.822792));
		regionList.add(new RegionModel("South Deering-East Side", -87.584845,
				-87.524436, 41.677477, 41.728472));
		regionList.add(new RegionModel("Near North", -87.647208, -87.62308,
				41.88886, 41.911401));
		regionList.add(new RegionModel("Near South-Douglas", -87.636322,
				-87.597952, 41.822792, 41.866129));
		regionList.add(new RegionModel("Humboldt-Garfield Prk E/W", -87.747456,
				-87.691617, 41.866129, 41.909269));
		regionList.add(new RegionModel("Hermosa-Logan Square", -87.747456,
				-87.67459, 41.909269, 41.931841));
		regionList.add(new RegionModel("Auburn Gresham-Chatham", -87.67298,
				-87.606334, 41.728472, 41.764066));
		regionList.add(new RegionModel("Edge Water-Uptown", -87.67459,
				-87.646438, 41.960669, 41.997946));
		regionList.add(new RegionModel("Downtown Lakefront", -87.62308,
				-87.595378, 41.866129, 41.911401));
		regionList.add(new RegionModel("Beverly-Mt Greenwood-Morgan Park",
				-87.747456, -87.662508, 41.677477, 41.728472));
		regionList.add(new RegionModel("Dunning-Portage-Belmont Cragn",
				-87.84621, -87.747456, 41.909269, 41.960669));
		regionList.add(new RegionModel("Midway-Garfield Rdg-Clearing",
				-87.802188, -87.747456, 41.764066, 41.822792));
		regionList.add(new RegionModel("Fuller-Grand Blvd-Washington Park",
				-87.636322, -87.606334, 41.764066, 41.822792));
		regionList.add(new RegionModel("West Town-Near West", -87.691617,
				-87.647208, 41.866129, 41.910561));
		regionList.add(new RegionModel("Lawndale N/S", -87.747456, -87.685372,
				41.822792, 41.866129));
		regionList.add(new RegionModel("North Park-Albany-Linconl Sq",
				-87.747456, -87.67459, 41.960669, 41.997946));
		regionList.add(new RegionModel("Rogers Park - West Ridge", -87.709645,
				-87.654561, 41.997946, 42.026444));
		regionList.add(new RegionModel("South Shore-S Chicago-Avlon",
				-87.606334, -87.526388, 41.728472, 41.764066));
		regionList.add(new RegionModel("Riverdale-Hegewisch", -87.662508,
				-87.524436, 41.644139, 41.677477));
		regionList.add(new RegionModel("Lincoln Park-Lake View", -87.67459,
				-87.619112, 41.910561, 41.960669));
		regionList.add(new RegionModel("Washington Hts-Roseland-Pullman",
				-87.662508, -87.584845, 41.677477, 41.728472));
		return regionList;
	}

	public static List<SegmentModel> createSegmentList() {
		List<SegmentModel> segmentList = new ArrayList<>();
		segmentList.add(new SegmentModel("1002", -87.6997466265, 42.0119763841,
				-87.6902422854, 42.0121628852));
		segmentList.add(new SegmentModel("1004", -87.6826977229, 42.0123768207,
				-87.6746953394, 42.0125192492));
		segmentList.add(new SegmentModel("1005", -87.6746953394, 42.0125192492,
				-87.6634484746, 42.0127106157));
		segmentList.add(new SegmentModel("1006", -87.885791874, 42.0097669164,
				-87.9048826492, 42.0090329667));
		segmentList.add(new SegmentModel("1007", -87.8684580013, 42.0102029578,
				-87.885791874, 42.0097669164));
		segmentList.add(new SegmentModel("1008", -87.855458352, 42.0106545068,
				-87.8684580013, 42.0102029578));
		segmentList.add(new SegmentModel("1009", -87.8295962893, 42.0113507195,
				-87.855458352, 42.0106545068));
		segmentList.add(new SegmentModel("1010", -87.8163255119, 42.0115963199,
				-87.8295962893, 42.0113507195));
		segmentList.add(new SegmentModel("1012", -87.8012933186, 42.012134096,
				-87.8065759801, 42.0118538545));
		segmentList.add(new SegmentModel("1013", -87.7888417616, 42.0120757075,
				-87.8012933186, 42.012134096));
		segmentList.add(new SegmentModel("1014", -87.7734061511, 42.012001451,
				-87.7888417616, 42.0120757075));
		segmentList.add(new SegmentModel("1015", -87.750526067, 42.0119863529,
				-87.7734061511, 42.012001451));
		segmentList.add(new SegmentModel("1016", -87.7285962904, 42.0118729137,
				-87.750526067, 42.0119863529));
		segmentList.add(new SegmentModel("1017", -87.7090540535, 42.0119940558,
				-87.7285962904, 42.0118729137));
		segmentList.add(new SegmentModel("1019", -87.6902395212, 42.0124372881,
				-87.6997439031, 42.0122507875));
		segmentList.add(new SegmentModel("1020", -87.6830644956, 42.012379769,
				-87.6902395212, 42.0124372881));
		segmentList.add(new SegmentModel("1021", -87.6746925084, 42.0127936512,
				-87.6826949263, 42.0126512232));
		segmentList.add(new SegmentModel("1022", -87.6634455952, 42.0129850171,
				-87.6746925084, 42.0127936512));
		segmentList.add(new SegmentModel("1023", -87.6358018547, 41.8757000617,
				-87.6366594269, 41.8768042277));
		segmentList.add(new SegmentModel("1032", -87.6370265926, 41.8768064545,
				-87.636169014, 41.8757022912));
		segmentList.add(new SegmentModel("1041", -87.7453577712, 41.8817351892,
				-87.7354603388, 41.8818154942));
		segmentList.add(new SegmentModel("1042", -87.7354603388, 41.8818154942,
				-87.7257302987, 41.8818520281));
		segmentList.add(new SegmentModel("1043", -87.7257302987, 41.8818520281,
				-87.715829066, 41.8814050014));
		segmentList.add(new SegmentModel("1044", -87.715829066, 41.8814050014,
				-87.7125300265, 41.8816234727));
		segmentList.add(new SegmentModel("1045", -87.7125300265, 41.8816234727,
				-87.7061493984, 41.8817444375));
		segmentList.add(new SegmentModel("1046", -87.7061493984, 41.8817444375,
				-87.6963109116, 41.8818559957));
		segmentList.add(new SegmentModel("1047", -87.6963109116, 41.8818559957,
				-87.6864587479, 41.8819481405));
		segmentList.add(new SegmentModel("1048", -87.6864587479, 41.8819481405,
				-87.6766645172, 41.8820947137));
		segmentList.add(new SegmentModel("1064", -87.6766889546, 41.8832841185,
				-87.686483181, 41.8831334079));
		segmentList.add(new SegmentModel("1069", -87.7410732843, 41.7347437377,
				-87.7606266356, 41.7343735804));
		segmentList.add(new SegmentModel("1070", -87.7985964302, 41.7191142354,
				-87.779908374, 41.7195224755));
		segmentList.add(new SegmentModel("1071", -87.779908374, 41.7195224755,
				-87.7683761219, 41.7196721811));
		segmentList.add(new SegmentModel("1072", -87.7683761219, 41.7196721811,
				-87.7603653352, 41.7196627048));
		segmentList.add(new SegmentModel("1073", -87.7603653352, 41.7196627048,
				-87.7408203843, 41.7200026803));
		segmentList.add(new SegmentModel("1074", -87.7408203843, 41.7200026803,
				-87.721311348, 41.720397153));
		segmentList.add(new SegmentModel("1075", -87.7799060195, 41.7197968969,
				-87.7985941552, 41.7193886577));
		segmentList.add(new SegmentModel("1076", -87.7683737183, 41.719946602,
				-87.7799060195, 41.7197968969));
		segmentList.add(new SegmentModel("1077", -87.7603628975, 41.7199371253,
				-87.7683737183, 41.719946602));
		segmentList.add(new SegmentModel("1078", -87.7408178634, 41.7202770999,
				-87.7603628975, 41.7199371253));
		segmentList.add(new SegmentModel("1079", -87.7213087442, 41.7206715715,
				-87.7408178634, 41.7202770999));
		segmentList.add(new SegmentModel("1080", -87.6625398368, 41.6628497334,
				-87.6413683477, 41.6631935046));
		segmentList.add(new SegmentModel("1084", -87.7191682775, 41.6622990645,
				-87.7362363989, 41.6619773476));
		segmentList.add(new SegmentModel("1085", -87.699794552, 41.6626028163,
				-87.7191682775, 41.6622990645));
		segmentList.add(new SegmentModel("1086", -87.680074197, 41.6627860697,
				-87.699794552, 41.6626028163));
		segmentList.add(new SegmentModel("1087", -87.6625369886, 41.6631241516,
				-87.680074197, 41.6627860697));
		segmentList.add(new SegmentModel("1088", -87.6413654096, 41.6634679215,
				-87.6625369886, 41.6631241516));
		segmentList.add(new SegmentModel("1092", -87.738416167, 41.662924475,
				-87.7395747648, 41.6909694478));
		segmentList.add(new SegmentModel("1093", -87.7395747648, 41.6909694478,
				-87.7400739323, 41.7055773806));
		segmentList.add(new SegmentModel("1094", -87.8041973344, 41.8648814237,
				-87.7839436323, 41.8652555922));
		segmentList.add(new SegmentModel("1095", -87.7839436323, 41.8652555922,
				-87.7741877636, 41.8654115846));
		segmentList.add(new SegmentModel("1096", -87.7839412829, 41.8655300069,
				-87.8041950717, 41.8651558393));
		segmentList.add(new SegmentModel("1097", -87.7741853725, 41.8656859988,
				-87.7839412829, 41.8655300069));
		segmentList.add(new SegmentModel("1107", -87.809893771, 41.7911742685,
				-87.8015893359, 41.7918962998));
		segmentList.add(new SegmentModel("1108", -87.8098915385, 41.7914486879,
				-87.8208263971, 41.7937812447));
		segmentList.add(new SegmentModel("1109", -87.8015870679, 41.7921707188,
				-87.8098915385, 41.7914486879));
		segmentList.add(new SegmentModel("1110", -87.7991410397, 41.7334064726,
				-87.7798668245, 41.7337543424));
		segmentList.add(new SegmentModel("1111", -87.7798668245, 41.7337543424,
				-87.7606290734, 41.7340991605));
		segmentList.add(new SegmentModel("1112", -87.7606290734, 41.7340991605,
				-87.7410758053, 41.7344693189));
		segmentList.add(new SegmentModel("1113", -87.7798644687, 41.7340287632,
				-87.7991387659, 41.7336808942));
		segmentList.add(new SegmentModel("1114", -87.7606266356, 41.7343735804,
				-87.7798644687, 41.7340287632));
		segmentList.add(new SegmentModel("1119", -87.736238934, 41.6617029255,
				-87.7191708852, 41.6620246432));
		segmentList.add(new SegmentModel("1120", -87.7191708852, 41.6620246432,
				-87.6997972419, 41.6623283961));
		segmentList.add(new SegmentModel("1121", -87.6997972419, 41.6623283961,
				-87.6800769707, 41.6625116506));
		segmentList.add(new SegmentModel("1122", -87.6800769707, 41.6625116506,
				-87.6625398368, 41.6628497334));
		segmentList.add(new SegmentModel("1123", -87.7400739323, 41.7055773806,
				-87.7406249198, 41.7201471215));
		segmentList.add(new SegmentModel("1128", -87.7399408793, 41.6909713387,
				-87.7387821225, 41.6629263687));
		segmentList.add(new SegmentModel("1129", -87.7404401297, 41.7055792705,
				-87.7399408793, 41.6909713387));
		segmentList.add(new SegmentModel("1130", -87.7409911999, 41.7201490102,
				-87.7404401297, 41.7055792705));
		segmentList.add(new SegmentModel("1131", -87.7412993615, 41.734462238,
				-87.7409911999, 41.7201490102));
		segmentList.add(new SegmentModel("1135", -87.7983351666, 41.7192584688,
				-87.7988981508, 41.7335370706));
		segmentList.add(new SegmentModel("1136", -87.7988981508, 41.7335370706,
				-87.7996073417, 41.7483295009));
		segmentList.add(new SegmentModel("1137", -87.7996073417, 41.7483295009,
				-87.8000739985, 41.7627887025));
		segmentList.add(new SegmentModel("1138", -87.8000739985, 41.7627887025,
				-87.8046535707, 41.7706448626));
		segmentList.add(new SegmentModel("1139", -87.8046535707, 41.7706448626,
				-87.8007155573, 41.7772906843));
		segmentList.add(new SegmentModel("1141", -87.8015092952, 41.7958120365,
				-87.801764719, 41.7995180128));
		segmentList.add(new SegmentModel("1142", -87.801764719, 41.7995180128,
				-87.8018035778, 41.8063542176));
		segmentList.add(new SegmentModel("1143", -87.8018035778, 41.8063542176,
				-87.802238778, 41.8176105439));
		segmentList.add(new SegmentModel("1144", -87.802238778, 41.8176105439,
				-87.8024252034, 41.8212448346));
		segmentList.add(new SegmentModel("1145", -87.8024252034, 41.8212448346,
				-87.802521906, 41.8237508093));
		segmentList.add(new SegmentModel("1146", -87.802521906, 41.8237508093,
				-87.8032500234, 41.8431150319));
		segmentList.add(new SegmentModel("1147", -87.8032500234, 41.8431150319,
				-87.8035237345, 41.8504187938));
		segmentList.add(new SegmentModel("1149", -87.8039753034, 41.8650944528,
				-87.8043379781, 41.873649976));
		segmentList.add(new SegmentModel("1150", -87.8043379781, 41.873649976,
				-87.8045488066, 41.8796992839));
		segmentList.add(new SegmentModel("434", -87.617414412, 41.8382790583,
				-87.6098439593, 41.8383933461));
		segmentList.add(new SegmentModel("1154", -87.7992981508, 41.7335370706,
				-87.7987351666, 41.7192584688));
		segmentList.add(new SegmentModel("1155", -87.8000073417, 41.7483295009,
				-87.7992981508, 41.7335370706));
		segmentList.add(new SegmentModel("1156", -87.8004739985, 41.7627887025,
				-87.8000073417, 41.7483295009));
		segmentList.add(new SegmentModel("1157", -87.8050535707, 41.7706448626,
				-87.8004739985, 41.7627887025));
		segmentList.add(new SegmentModel("1159", -87.801153305, 41.7772680624,
				-87.8050535707, 41.7706448626));
		segmentList.add(new SegmentModel("1160", -87.802164719, 41.7995180128,
				-87.8019092952, 41.7958120365));
		segmentList.add(new SegmentModel("1161", -87.8022035778, 41.8063542176,
				-87.802164719, 41.7995180128));
		segmentList.add(new SegmentModel("1162", -87.802638778, 41.8176105439,
				-87.8022035778, 41.8063542176));
		segmentList.add(new SegmentModel("1163", -87.8030252034, 41.8212448346,
				-87.802638778, 41.8176105439));
		segmentList.add(new SegmentModel("1164", -87.802921906, 41.8237508093,
				-87.8030252034, 41.8212448346));
		segmentList.add(new SegmentModel("1165", -87.8036500234, 41.8431150319,
				-87.802921906, 41.8237508093));
		segmentList.add(new SegmentModel("1166", -87.8039237345, 41.8504187938,
				-87.8036500234, 41.8431150319));
		segmentList.add(new SegmentModel("1167", -87.8044753034, 41.8650944528,
				-87.8039237345, 41.8504187938));
		segmentList.add(new SegmentModel("1169", -87.8049488066, 41.8796992839,
				-87.8047379781, 41.873649976));
		segmentList.add(new SegmentModel("1174", -87.6206786752, 41.8781945291,
				-87.6174322262, 41.8782387072));
		segmentList.add(new SegmentModel("1175", -87.6174291634, 41.8785131124,
				-87.6206756263, 41.8784689345));
		segmentList.add(new SegmentModel("1065", -87.74536029, 41.88212644,
				-87.73545778, 41.88208991));
		segmentList.add(new SegmentModel("1194", -87.60689442, 41.82387853,
				-87.60092442, 41.82512853));
		segmentList.add(new SegmentModel("1195", -87.60092442, 41.82532853,
				-87.60689442, 41.82407853));
		segmentList.add(new SegmentModel("983", -87.5594319697, 41.6737684303,
				-87.5590213942, 41.666172282));
		segmentList.add(new SegmentModel("613", -87.6174961157, 41.873257503,
				-87.6190382545, 41.8674673837));
		segmentList.add(new SegmentModel("865", -87.6420313638, 41.8672802053,
				-87.6422453799, 41.8743970981));
		segmentList.add(new SegmentModel("1168", -87.8047379781, 41.873649976,
				-87.8044753034, 41.8650944528));
		segmentList.add(new SegmentModel("1275", -87.647361, 41.881676,
				-87.644126, 41.88172));
		segmentList.add(new SegmentModel("1278", -87.620488, 41.875774,
				-87.620542, 41.884414));
		segmentList.add(new SegmentModel("1279", -87.620742, 41.884414,
				-87.620688, 41.875774));
		segmentList.add(new SegmentModel("128", -87.6688650541, 41.9542892901,
				-87.6690743088, 41.9615905019));
		segmentList.add(new SegmentModel("1284", -87.617048, 41.896936,
				-87.624241, 41.896835));
		segmentList.add(new SegmentModel("130", -87.6692552405, 41.9688759177,
				-87.6694299012, 41.9761710709));
		segmentList.add(new SegmentModel("657", -87.6242548163, 41.8755994887,
				-87.6205895177, 41.8756310392));
		segmentList.add(new SegmentModel("163", -87.6694419633, 41.9615926286,
				-87.6692326667, 41.9542914171));
		segmentList.add(new SegmentModel("164", -87.669622937, 41.9688780441,
				-87.6694419633, 41.9615926286));
		segmentList.add(new SegmentModel("165", -87.6697976396, 41.976173197,
				-87.669622937, 41.9688780441));
		segmentList.add(new SegmentModel("167", -87.66971, 41.987541,
				-87.6700000222, 41.9834769032));
		segmentList.add(new SegmentModel("1066", -87.7354629, 41.88212644,
				-87.7257277, 41.88212644));
		segmentList.add(new SegmentModel("213", -87.7741500381, 41.865338239,
				-87.764354818, 41.8654815414));
		segmentList.add(new SegmentModel("658", -87.6306761885, 41.8757235433,
				-87.6337240692, 41.8757421513));
		segmentList.add(new SegmentModel("1067", -87.7257329, 41.88212644,
				-87.71582642, 41.88167941));
		segmentList.add(new SegmentModel("659", -87.6276277176, 41.8757590907,
				-87.6306761885, 41.8757235433));
		segmentList.add(new SegmentModel("1068", -87.71583171, 41.88167941,
				-87.71252737, 41.88189788));
		segmentList.add(new SegmentModel("432", -87.6303936419, 41.8380723428,
				-87.6267684374, 41.8382156912));
		segmentList.add(new SegmentModel("433", -87.6267684374, 41.8382156912,
				-87.617414412, 41.8382790583));
		segmentList.add(new SegmentModel("436", -87.6267654189, 41.8384900961,
				-87.6303906644, 41.838346762));
		segmentList.add(new SegmentModel("437", -87.6174113534, 41.8385534682,
				-87.6267654189, 41.8384900961));
		segmentList.add(new SegmentModel("438", -87.6098408684, 41.83866775,
				-87.6174113534, 41.8385534682));
		segmentList.add(new SegmentModel("461", -87.5598741328, 41.7225670698,
				-87.5483228809, 41.7226205121));
		segmentList.add(new SegmentModel("462", -87.5483228809, 41.7226205121,
				-87.5365443832, 41.7228029936));
		segmentList.add(new SegmentModel("475", -87.5483195408, 41.7228949204,
				-87.5598708419, 41.7228414789));
		segmentList.add(new SegmentModel("476", -87.536540993, 41.7230774012,
				-87.5483195408, 41.7228949204));
		segmentList.add(new SegmentModel("523", -87.7888701225, 42.0119689477,
				-87.7826304243, 42.0048190081));
		segmentList.add(new SegmentModel("524", -87.7826304243, 42.0048190081,
				-87.7668773678, 41.997302901));
		segmentList.add(new SegmentModel("1106", -87.8208285832, 41.793506825,
				-87.809893771, 41.7911742685));
		segmentList.add(new SegmentModel("561", -87.740896845, 41.7345704712,
				-87.7408287557, 41.7419784502));
		segmentList.add(new SegmentModel("562", -87.7408287557, 41.7419784502,
				-87.7412632413, 41.7492014587));
		segmentList.add(new SegmentModel("630", -87.7411951673, 41.7419803335,
				-87.7412632143, 41.7345723733));
		segmentList.add(new SegmentModel("631", -87.7416296756, 41.7492033545,
				-87.7411951673, 41.7419803335));
		segmentList.add(new SegmentModel("1148", -87.8035237345, 41.8504187938,
				-87.8039753034, 41.8650944528));
		segmentList.add(new SegmentModel("654", -87.6337270619, 41.875467745,
				-87.6306791942, 41.8754491371));
		segmentList.add(new SegmentModel("655", -87.6306791942, 41.8754491371,
				-87.6276307364, 41.8754846848));
		segmentList.add(new SegmentModel("661", -87.6205864688, 41.8759054447,
				-87.624251783, 41.8758738945));
		segmentList.add(new SegmentModel("668", -87.8364764897, 41.9520487217,
				-87.8365240012, 41.9593746458));
		segmentList.add(new SegmentModel("669", -87.8365240012, 41.9593746458,
				-87.8365200597, 41.9666029184));
		segmentList.add(new SegmentModel("671", -87.8368916539, 41.9593762362,
				-87.8368441003, 41.952050312));
		segmentList.add(new SegmentModel("672", -87.836887754, 41.966604509,
				-87.8368916539, 41.9593762362));
		segmentList.add(new SegmentModel("675", -87.6309237336, 41.8455540437,
				-87.6307917559, 41.8528328188));
		segmentList.add(new SegmentModel("676", -87.6312907092, 41.8455562874,
				-87.6306185679, 41.8382743638));
		segmentList.add(new SegmentModel("677", -87.6311587767, 41.8528350633,
				-87.6312907092, 41.8455562874));
		segmentList.add(new SegmentModel("682", -87.6137714553, 41.7134413253,
				-87.6139718105, 41.7218553843));
		segmentList.add(new SegmentModel("701", -87.6143380874, 41.7218576767,
				-87.614137688, 41.713443618));
		segmentList.add(new SegmentModel("722", -87.66795526, 41.9186224793,
				-87.6777181976, 41.9253642343));
		segmentList.add(new SegmentModel("723", -87.6777181976, 41.9253642343,
				-87.6877028527, 41.932155723));
		segmentList.add(new SegmentModel("724", -87.6877028527, 41.932155723,
				-87.6975427838, 41.9389510144));
		segmentList.add(new SegmentModel("725", -87.6975427838, 41.9389510144,
				-87.7076034036, 41.9459110608));
		segmentList.add(new SegmentModel("726", -87.7076034036, 41.9459110608,
				-87.7175938572, 41.9527602453));
		segmentList.add(new SegmentModel("727", -87.7175938572, 41.9527602453,
				-87.7276593483, 41.9596637502));
		segmentList.add(new SegmentModel("728", -87.7276593483, 41.9596637502,
				-87.7377080225, 41.9666188341));
		segmentList.add(new SegmentModel("729", -87.7377080225, 41.9666188341,
				-87.7477808237, 41.9729443485));
		segmentList.add(new SegmentModel("730", -87.7477808237, 41.9729443485,
				-87.7576429367, 41.9789461906));
		segmentList.add(new SegmentModel("731", -87.7576429367, 41.9789461906,
				-87.7681529956, 41.985030803));
		segmentList.add(new SegmentModel("732", -87.7681529956, 41.985030803,
				-87.777705256, 41.9899033437));
		segmentList.add(new SegmentModel("733", -87.777705256, 41.9899033437,
				-87.7828565045, 41.9926628402));
		segmentList.add(new SegmentModel("735", -87.6683226494, 41.9186246076,
				-87.6623885394, 41.9107536809));
		segmentList.add(new SegmentModel("736", -87.6780856594, 41.9253663319,
				-87.6683226494, 41.9186246076));
		segmentList.add(new SegmentModel("740", -87.6880703543, 41.9321577889,
				-87.6780856594, 41.9253663319));
		segmentList.add(new SegmentModel("741", -87.697910325, 41.9389530491,
				-87.6880703543, 41.9321577889));
		segmentList.add(new SegmentModel("742", -87.7079709525, 41.9459130633,
				-87.697910325, 41.9389530491));
		segmentList.add(new SegmentModel("743", -87.7179614498, 41.9527622162,
				-87.7079709525, 41.9459130633));
		segmentList.add(new SegmentModel("744", -87.7280269886, 41.9596656891,
				-87.7179614498, 41.9527622162));
		segmentList.add(new SegmentModel("745", -87.7380757182, 41.9666207411,
				-87.7280269886, 41.9596656891));
		segmentList.add(new SegmentModel("746", -87.7481485344, 41.9729462234,
				-87.7380757182, 41.9666207411));
		segmentList.add(new SegmentModel("747", -87.7580106972, 41.9789480342,
				-87.7481485344, 41.9729462234));
		segmentList.add(new SegmentModel("748", -87.7685207735, 41.985032613,
				-87.7580106972, 41.9789480342));
		segmentList.add(new SegmentModel("749", -87.7780730735, 41.9899051234,
				-87.7685207735, 41.985032613));
		segmentList.add(new SegmentModel("750", -87.7832243493, 41.9926646035,
				-87.7780730735, 41.9899051234));
		segmentList.add(new SegmentModel("751", -87.524295994, 41.7027432269,
				-87.5350924196, 41.71281167));
		segmentList.add(new SegmentModel("754", -87.5354586494, 41.7128142135,
				-87.5246621584, 41.7027458042));
		segmentList.add(new SegmentModel("764", -87.801344619, 41.7919383373,
				-87.801422144, 41.795759475));
		segmentList.add(new SegmentModel("794", -87.6535171971, 41.9855339538,
				-87.6624036279, 41.985180094));
		segmentList.add(new SegmentModel("820", -87.5590659738, 41.6737659652,
				-87.5592792181, 41.6919396448));
		segmentList.add(new SegmentModel("818", -87.5591040537, 41.6591909569,
				-87.5586554414, 41.6661698159));
		segmentList.add(new SegmentModel("819", -87.5586554414, 41.6661698159,
				-87.5590659738, 41.6737659652));
		segmentList.add(new SegmentModel("836", -87.8017888692, 41.7957611724,
				-87.8017113077, 41.7919400348));
		segmentList.add(new SegmentModel("681", -87.6440417428, 41.874374782,
				-87.643849254, 41.8671810617));
		segmentList.add(new SegmentModel("897", -87.6537610863, 41.9855554936,
				-87.6506507735, 41.9765966882));
		segmentList.add(new SegmentModel("951", -87.7061691246, 41.8829315251,
				-87.7117472865, 41.8828184746));
		segmentList.add(new SegmentModel("952", -87.7117472865, 41.8828184746,
				-87.7125457303, 41.8818979823));
		segmentList.add(new SegmentModel("953", -87.6494332531, 41.8924286216,
				-87.637047557, 41.8923816602));
		segmentList.add(new SegmentModel("958", -87.6202722384, 41.8925990544,
				-87.6145369384, 41.8927234515));
		segmentList.add(new SegmentModel("959", -87.6149084728, 41.893458213,
				-87.6202858565, 41.8934286118));
		segmentList.add(new SegmentModel("963", -87.6326364483, 41.8932027711,
				-87.6370995163, 41.8931503343));
		segmentList.add(new SegmentModel("964", -87.6370995163, 41.8931503343,
				-87.6481798833, 41.8925171987));
		segmentList.add(new SegmentModel("965", -87.68972568, 41.82282024,
				-87.6849, 41.82307531));
		segmentList.add(new SegmentModel("973", -87.6849, 41.82327531,
				-87.68972568, 41.82302024));
		segmentList.add(new SegmentModel("981", -87.5595922635, 41.7154042389,
				-87.5596915555, 41.7224364766));
		segmentList.add(new SegmentModel("982", -87.5590213942, 41.666172282,
				-87.5594699634, 41.6591934211));
		segmentList.add(new SegmentModel("984", -87.559645328, 41.6919421101,
				-87.5594319697, 41.6737684303));
		segmentList.add(new SegmentModel("988", -87.5600578495, 41.7224389422,
				-87.5599585029, 41.7154067044));
		segmentList.add(new SegmentModel("989", -87.9048844906, 42.008758554,
				-87.8857937975, 42.0094925044));
		segmentList.add(new SegmentModel("990", -87.8857937975, 42.0094925044,
				-87.8684599993, 42.0099285465));
		segmentList.add(new SegmentModel("991", -87.8684599993, 42.0099285465,
				-87.855460406, 42.010380096));
		segmentList.add(new SegmentModel("992", -87.855460406, 42.010380096,
				-87.8295984545, 42.0110763099));
		segmentList.add(new SegmentModel("993", -87.8295984545, 42.0110763099,
				-87.8163277341, 42.0113219108));
		segmentList.add(new SegmentModel("995", -87.8065782442, 42.0115794459,
				-87.8012956054, 42.0118596876));
		segmentList.add(new SegmentModel("996", -87.8012956054, 42.0118596876,
				-87.788844102, 42.0118012997));
		segmentList.add(new SegmentModel("998", -87.7734085578, 42.0117270439,
				-87.7505285721, 42.0117119469));
		segmentList.add(new SegmentModel("999", -87.7505285721, 42.0117119469,
				-87.7285988897, 42.0115985088));
		segmentList.add(new SegmentModel("1255", -87.647109, 41.867152,
				-87.646897, 41.859912));
		segmentList.add(new SegmentModel("1254", -87.646897, 41.859912,
				-87.646685, 41.852646));
		segmentList.add(new SegmentModel("258", -87.6533416007, 41.7357981642,
				-87.6436285094, 41.736140859));
		segmentList.add(new SegmentModel("225", -87.6566826727, 41.8668594116,
				-87.6469198175, 41.8670168965));
		segmentList.add(new SegmentModel("1104", -87.7442663916, 41.8514803382,
				-87.763913, 41.851385));
		segmentList.add(new SegmentModel("81", -87.7257294016, 41.8752792694,
				-87.7254211571, 41.8661750444));
		segmentList.add(new SegmentModel("469", -87.6140911627, 41.7220217125,
				-87.6205312155, 41.7219106219));
		segmentList.add(new SegmentModel("390", -87.686221969, 41.8666135775,
				-87.685945, 41.857516));
		segmentList.add(new SegmentModel("210", -87.6621596195, 41.910843339,
				-87.6676901941, 41.9107674921));
		segmentList.add(new SegmentModel("90", -87.727229938, 41.9317932724,
				-87.7270197528, 41.9244868661));
		segmentList.add(new SegmentModel("141", -87.6647651619, 41.7940254304,
				-87.6645778209, 41.7867479054));
		segmentList.add(new SegmentModel("7", -87.6645832406, 41.7938871572,
				-87.6548756951, 41.7940346735));
		segmentList.add(new SegmentModel("528", -87.76650952, 41.99730108,
				-87.78226252, 42.00481724));
		segmentList.add(new SegmentModel("925", -87.624408, 41.90082865,
				-87.624359, 41.892571));
		segmentList.add(new SegmentModel("426", -87.6626346092, 41.7210579504,
				-87.6529452354, 41.7211522049));
		segmentList.add(new SegmentModel("30", -87.7225767893, 41.7786572624,
				-87.7228471654, 41.7859356046));
		segmentList.add(new SegmentModel("48", -87.7261470243, 41.9098857185,
				-87.7264442053, 41.9171651852));
		segmentList.add(new SegmentModel("301", -87.807259682, 41.9529000914,
				-87.8170647549, 41.9526813472));
		segmentList.add(new SegmentModel("331", -87.6818720444, 41.7209382823,
				-87.6821164908, 41.7282286362));
		segmentList.add(new SegmentModel("834", -87.801399484, 41.7846892828,
				-87.8010821479, 41.7772923833));
		segmentList.add(new SegmentModel("1018", -87.6997439031, 42.0122507875,
				-87.7090540535, 42.0119940558));
		segmentList.add(new SegmentModel("366", -87.6889668295, 41.97589051,
				-87.6892644434, 41.9831666552));
		segmentList.add(new SegmentModel("1090", -87.5888027055, 41.6600932265,
				-87.6184518931, 41.6592446397));
		segmentList.add(new SegmentModel("944", -87.7679223953, 41.9756560558,
				-87.7609588782, 41.9678453326));
		segmentList.add(new SegmentModel("228", -87.6304367047, 41.8672367835,
				-87.6189630924, 41.8673656534));
		segmentList.add(new SegmentModel("21", -87.7207247188, 41.7059018917,
				-87.7210108659, 41.7131708566));
		segmentList.add(new SegmentModel("1237", -87.643756, 41.736073,
				-87.643606, 41.728767));
		segmentList.add(new SegmentModel("497", -87.7429034455, 41.7985004459,
				-87.733172525, 41.8000225514));
		segmentList.add(new SegmentModel("312", -87.6982391845, 41.9541110923,
				-87.7080135337, 41.9540569195));
		segmentList.add(new SegmentModel("928", -87.6662786223, 41.9033408608,
				-87.6773156389, 41.9104755299));
		segmentList.add(new SegmentModel("206", -87.6970334998, 41.9103545465,
				-87.706959124, 41.9102525328));
		segmentList.add(new SegmentModel("320", -87.8057602459, 41.9087289094,
				-87.794804754, 41.9088985252));
		segmentList.add(new SegmentModel("231", -87.7447613932, 41.8660878547,
				-87.7545575569, 41.8658505637));
		segmentList.add(new SegmentModel("971", -87.62644842, 41.82381853,
				-87.61699842, 41.82387853));
		segmentList.add(new SegmentModel("881", -87.6333278653, 41.9111610262,
				-87.6330996716, 41.9038840385));
		segmentList.add(new SegmentModel("856", -87.7964577516, 41.9790058174,
				-87.8069553878, 41.9812711585));
		segmentList.add(new SegmentModel("273", -87.6436255734, 41.7364152726,
				-87.6533387061, 41.7360725783));
		segmentList.add(new SegmentModel("1264", -87.6492, 41.932719, -87.64895,
				41.925454));
		segmentList.add(new SegmentModel("565", -87.7418663731, 41.7711254297,
				-87.7421146239, 41.7784097411));
		segmentList.add(new SegmentModel("542", -87.6464628758, 41.8525453728,
				-87.6369279083, 41.8526856713));
		segmentList.add(new SegmentModel("83", -87.7260556696, 41.8854697391,
				-87.7259576089, 41.8819403523));
		segmentList.add(new SegmentModel("543", -87.6369278973, 41.8526856712,
				-87.6270547792, 41.8527242399));
		segmentList.add(new SegmentModel("82", -87.7259576089, 41.8819403523,
				-87.7257294016, 41.8752792694));
		segmentList.add(new SegmentModel("583", -87.6164188659, 41.8579604705,
				-87.6186711362, 41.8674650997));
		segmentList.add(new SegmentModel("190", -87.6970362251, 41.9100801383,
				-87.6872220807, 41.9101836642));
		segmentList.add(new SegmentModel("483", -87.6098570614, 41.6926264754,
				-87.5988126481, 41.6923749771));
		segmentList.add(new SegmentModel("267", -87.7020951833, 41.7353577848,
				-87.711992685, 41.7351586508));
		segmentList.add(new SegmentModel("396", -87.6874043778, 41.9103219014,
				-87.6872104227, 41.9030171606));
		segmentList.add(new SegmentModel("310", -87.7178119849, 41.9539236607,
				-87.7276158638, 41.9537849922));
		segmentList.add(new SegmentModel("716", -87.6173371439, 41.831103063,
				-87.6171719977, 41.823826979));
		segmentList.add(new SegmentModel("295", -87.6690502851, 41.9541531514,
				-87.6622513991, 41.9542409021));
		segmentList.add(new SegmentModel("684", -87.6141896483, 41.7291900977,
				-87.6143079092, 41.7364992381));
		segmentList.add(new SegmentModel("415", -87.7316040523, 41.7494782498,
				-87.7413265301, 41.7492847508));
		segmentList.add(new SegmentModel("1151", -87.8045488066, 41.8796992839,
				-87.8051007941, 41.8942683013));
		segmentList.add(new SegmentModel("260", -87.6254454451, 41.7361336678,
				-87.6145294906, 41.7363658213));
		segmentList.add(new SegmentModel("582", -87.6124560681, 41.848976339,
				-87.6164188659, 41.8579604705));
		segmentList.add(new SegmentModel("86", -87.7266587113, 41.9061589395,
				-87.7265539158, 41.9026743655));
		segmentList.add(new SegmentModel("575", -87.7453403489, 41.8879205051,
				-87.7456284502, 41.8949856048));
		segmentList.add(new SegmentModel("933", -87.6555656519, 41.8962355211,
				-87.6445003767, 41.8890222586));
		segmentList.add(new SegmentModel("470", -87.6045012673, 41.7222259181,
				-87.6140911627, 41.7220217125));
		segmentList.add(new SegmentModel("175", -87.6742991606, 41.7940535229,
				-87.684040386, 41.7940137889));
		segmentList.add(new SegmentModel("611", -87.6167859369, 41.8579627613,
				-87.6128230691, 41.8489786419));
		segmentList.add(new SegmentModel("1036", -87.6324828907, 41.8870664305,
				-87.6354417258, 41.8869924633));
		segmentList.add(new SegmentModel("429", -87.628638933, 41.7215727836,
				-87.6205342482, 41.721636209));
		segmentList.add(new SegmentModel("294", -87.6787557154, 41.9540197354,
				-87.6690502851, 41.9541531514));
		segmentList.add(new SegmentModel("961", -87.6242206362, 41.8933239978,
				-87.6281107904, 41.8932683712));
		segmentList.add(new SegmentModel("945", -87.7745470464, 41.9829168191,
				-87.7679223953, 41.9756560558));
		segmentList.add(new SegmentModel("207", -87.6872193134, 41.9104580718,
				-87.6970334998, 41.9103545465));
		segmentList.add(new SegmentModel("263", -87.5856381753, 41.7367762597,
				-87.568873148, 41.7370163155));
		segmentList.add(new SegmentModel("615", -87.61767166, 41.88091881,
				-87.61749612, 41.8732575));
		segmentList.add(new SegmentModel("457", -87.6045043683, 41.7219515062,
				-87.5947345466, 41.722002538));
		segmentList.add(new SegmentModel("290", -87.7178146252, 41.9536492536,
				-87.708016216, 41.9537825128));
		segmentList.add(new SegmentModel("265", -87.7214553595, 41.734992492,
				-87.7311593177, 41.7348268186));
		segmentList.add(new SegmentModel("284", -87.7767759969, 41.9529189391,
				-87.7670009299, 41.9530473793));
		segmentList.add(new SegmentModel("104", -87.6638378447, 41.7721909488,
				-87.6640374592, 41.7794635041));
		segmentList.add(new SegmentModel("1101", -87.7442689094, 41.8512059248,
				-87.7394933319, 41.8512417062));
		segmentList.add(new SegmentModel("907", -87.624123, 41.875777,
				-87.62426376, 41.88447407));
		segmentList.add(new SegmentModel("1029", -87.6279765117, 41.8866764518,
				-87.6245792239, 41.888028878));
		segmentList.add(new SegmentModel("550", -87.7052158636, 41.852019272,
				-87.7108753815, 41.8517829108));
		segmentList.add(new SegmentModel("172", -87.7035527348, 41.793651115,
				-87.7136045062, 41.7934149656));
		segmentList.add(new SegmentModel("158", -87.668329537, 41.9251526443,
				-87.6682766764, 41.9185478323));
		segmentList.add(new SegmentModel("459", -87.5851090249, 41.722204896,
				-87.5753681177, 41.7223678834));
		segmentList.add(new SegmentModel("386", -87.6850859812, 41.8259389558,
				-87.685060202, 41.8229970652));
		segmentList.add(new SegmentModel("224", -87.6663849776, 41.8667242852,
				-87.6566826727, 41.8668594116));
		segmentList.add(new SegmentModel("148", -87.6662077421, 41.8523321221,
				-87.6659250887, 41.8376849226));
		segmentList.add(new SegmentModel("568", -87.7417947979, 41.793035195,
				-87.7428033166, 41.8003400449));
		segmentList.add(new SegmentModel("1282", -87.620124, 41.891002,
				-87.620269, 41.896785));
		segmentList.add(new SegmentModel("306", -87.7571464847, 41.9534369276,
				-87.7669985006, 41.953321789));
		segmentList.add(new SegmentModel("812", -87.5861128958, 41.7587855819,
				-87.5859432626, 41.7515208628));
		segmentList.add(new SegmentModel("936", -87.6887320123, 41.9175705769,
				-87.6776829823, 41.9104776279));
		segmentList.add(new SegmentModel("889", -87.6313938932, 41.9260849848,
				-87.6261484121, 41.9113324426));
		segmentList.add(new SegmentModel("628", -87.7468692152, 41.9461190053,
				-87.7471183356, 41.9534197462));
		segmentList.add(new SegmentModel("538", -87.6856474961, 41.8519327365,
				-87.6758619504, 41.8520254222));
		segmentList.add(new SegmentModel("255", -87.682515421, 41.7353900769,
				-87.6727864295, 41.7355171745));
		segmentList.add(new SegmentModel("240", -87.656679779, 41.8671338197,
				-87.6663821254, 41.8669986938));
		segmentList.add(new SegmentModel("976", -87.64595204, 41.82359009,
				-87.66551, 41.82327531));
		segmentList.add(new SegmentModel("760", -87.6142179735, 41.89189994,
				-87.6202037576, 41.891798492));
		segmentList.add(new SegmentModel("626", -87.7464081568, 41.9315315648,
				-87.7466944859, 41.9388186376));
		segmentList.add(new SegmentModel("137", -87.6639792472, 41.7649100967,
				-87.663620583, 41.7503581457));
		segmentList.add(new SegmentModel("292", -87.6982419087, 41.9538366862,
				-87.6884676201, 41.9538755379));
		segmentList.add(new SegmentModel("698", -87.6169702483, 41.8311007753,
				-87.6171031194, 41.8384212078));
		segmentList.add(new SegmentModel("161", -87.6690419162, 41.9469911788,
				-87.6688454399, 41.9396975636));
		segmentList.add(new SegmentModel("468", -87.6205312155, 41.7219106219,
				-87.6286359347, 41.721847197));
		segmentList.add(new SegmentModel("1253", -87.646685, 41.852646,
				-87.646677, 41.847196));
		segmentList.add(new SegmentModel("496", -87.7526573727, 41.7970886104,
				-87.7429034455, 41.7985004459));
		segmentList.add(new SegmentModel("635", -87.7415926253, 41.784318968,
				-87.7424812354, 41.7784116409));
		segmentList.add(new SegmentModel("1293", -87.627718, 41.875639,
				-87.627518, 41.867413));
		segmentList.add(new SegmentModel("510", -87.75265489, 41.79736303,
				-87.76240058, 41.79584859));
		segmentList.add(new SegmentModel("454", -87.6439701738, 41.7507752434,
				-87.6536930095, 41.7505891635));
		segmentList.add(new SegmentModel("890", -87.6322220647, 41.9334278712,
				-87.6313938932, 41.9260849848));
		segmentList.add(new SegmentModel("519", -87.66577839, 41.83783649,
				-87.67537005, 41.8319637));
		segmentList.add(new SegmentModel("315", -87.6690474356, 41.954427556,
				-87.6787529076, 41.9542941404));
		segmentList.add(new SegmentModel("623", -87.7459028831, 41.9096276932,
				-87.7459288182, 41.9169301148));
		segmentList.add(new SegmentModel("624", -87.7459288182, 41.9169301148,
				-87.7460848509, 41.9242304183));
		segmentList.add(new SegmentModel("1034", -87.637155382, 41.8857258051,
				-87.6370736078, 41.8819163019));
		segmentList.add(new SegmentModel("371", -87.6822383249, 41.7209403583,
				-87.6820264847, 41.7136748244));
		segmentList.add(new SegmentModel("95", -87.7284849951, 41.9755349148,
				-87.728279105, 41.96824521));
		segmentList.add(new SegmentModel("900", -87.62360876, 41.85285485,
				-87.62377822, 41.860205));
		segmentList.add(new SegmentModel("154", -87.6674751541, 41.8960747044,
				-87.6673262617, 41.8909784616));
		segmentList.add(new SegmentModel("788", -87.6993974307, 41.9905751568,
				-87.7111087839, 41.9905195564));
		segmentList.add(new SegmentModel("471", -87.594731404, 41.7222769494,
				-87.6045012673, 41.7222259181));
		segmentList.add(new SegmentModel("1197", -87.642417, 41.69964,
				-87.642643, 41.706916));
		segmentList.add(new SegmentModel("254", -87.6922007563, 41.7352455091,
				-87.682515421, 41.7353900769));
		segmentList.add(new SegmentModel("797", -87.5849507392, 41.722346361,
				-87.5850694771, 41.7296111731));
		segmentList.add(new SegmentModel("886", -87.580117873, 41.7924166257,
				-87.5790082777, 41.7952180444));
		segmentList.add(new SegmentModel("832", -87.8065204549, 42.0044647335,
				-87.8064419209, 42.0117135819));
		segmentList.add(new SegmentModel("1201", -87.643226, 41.728767,
				-87.643376, 41.736073));
		segmentList.add(new SegmentModel("949", -87.686483181, 41.8831334079,
				-87.696333691, 41.8830349349));
		segmentList.add(new SegmentModel("627", -87.7466944859, 41.9388186376,
				-87.7468692152, 41.9461190053));
		segmentList.add(new SegmentModel("972", -87.61699842, 41.82387853,
				-87.60689442, 41.82387853));
		segmentList.add(new SegmentModel("1204", -87.643853, 41.750643,
				-87.643993, 41.756089));
		segmentList.add(new SegmentModel("460", -87.5753681177, 41.7223678834,
				-87.5598741328, 41.7225670698));
		segmentList.add(new SegmentModel("316", -87.6622485204, 41.9545153063,
				-87.6690474356, 41.954427556));
		segmentList.add(new SegmentModel("1220", -87.646729, 41.867152,
				-87.646935, 41.874338));
		segmentList.add(new SegmentModel("1000", -87.7285988897, 42.0115985088,
				-87.7090567368, 42.0117196518));
		segmentList.add(new SegmentModel("439", -87.7413290513, 41.7490103326,
				-87.7316066149, 41.7492038321));
		segmentList.add(new SegmentModel("1091", -87.5592845305, 41.6593265417,
				-87.5888027055, 41.6600932265));
		segmentList.add(new SegmentModel("336", -87.6829192318, 41.7592310843,
				-87.6830594183, 41.764701176));
		segmentList.add(new SegmentModel("609", -87.6085348206, 41.8385740621,
				-87.6005593398, 41.8252995274));
		segmentList.add(new SegmentModel("1299", -87.632584, 41.886928,
				-87.632357, 41.878134));
		segmentList.add(new SegmentModel("978", -87.62644842, 41.82401853,
				-87.63050842, 41.82391453));
		segmentList.add(new SegmentModel("112", -87.6653847992, 41.8305002878,
				-87.6655581444, 41.8376827898));
		segmentList.add(new SegmentModel("785", -87.7286540964, 41.9903055715,
				-87.738383984, 41.99014783));
		segmentList.add(new SegmentModel("49", -87.7263752552, 41.9171651852,
				-87.7266541696, 41.9244829851));
		segmentList.add(new SegmentModel("325", -87.7557968589, 41.9093640671,
				-87.7461157058, 41.9094885759));
		segmentList.add(new SegmentModel("151", -87.6667825068, 41.8742014988,
				-87.6665671071, 41.8668625554));
		segmentList.add(new SegmentModel("595", -87.6310264345, 41.9260827378,
				-87.6318545747, 41.9334256266));
		segmentList.add(new SegmentModel("9", -87.6451618298, 41.7941646462,
				-87.6311283131, 41.7943974487));
		segmentList.add(new SegmentModel("994", -87.8163277341, 42.0113219108,
				-87.8065782442, 42.0115794459));
		segmentList.add(new SegmentModel("395", -87.6872104227, 41.9030171606,
				-87.6870262366, 41.8957442792));
		segmentList.add(new SegmentModel("427", -87.6529452354, 41.7211522049,
				-87.6432247623, 41.7213210669));
		segmentList.add(new SegmentModel("17", -87.7419834738, 41.7931681777,
				-87.7525061843, 41.7930250391));
		segmentList.add(new SegmentModel("1102", -87.7834783427, 41.8510024115,
				-87.803611051, 41.8505125016));
		segmentList.add(new SegmentModel("474", -87.5598708419, 41.7228414789,
				-87.5753648927, 41.7226422935));
		segmentList.add(new SegmentModel("935", -87.6776829823, 41.9104776279,
				-87.666645935, 41.903342994));
		segmentList.add(new SegmentModel("66", -87.7221640524, 41.7495734287,
				-87.7219287929, 41.7421819618));
		segmentList.add(new SegmentModel("683", -87.6139718105, 41.7218553843,
				-87.6141896483, 41.7291900977));
		segmentList.add(new SegmentModel("308", -87.7380626662, 41.9536666068,
				-87.7473036159, 41.9535555813));
		segmentList.add(new SegmentModel("1239", -87.644233, 41.750643,
				-87.644021, 41.743359));
		segmentList.add(new SegmentModel("589", -87.61386137, 41.88438769,
				-87.61390637, 41.8918983));
		segmentList.add(new SegmentModel("795", -87.6624036279, 41.985180094,
				-87.6721450666, 41.9909172373));
		segmentList.add(new SegmentModel("509", -87.76240058, 41.79584859,
				-87.77208033, 41.79434225));
		segmentList.add(new SegmentModel("279", -87.8269783644, 41.9521088985,
				-87.8170669694, 41.9524069352));
		segmentList.add(new SegmentModel("214", -87.764354818, 41.8654815414,
				-87.7545600319, 41.8655761505));
		segmentList.add(new SegmentModel("511", -87.74290093, 41.79877485,
				-87.75265489, 41.79736303));
		segmentList.add(new SegmentModel("89", -87.7270197528, 41.9244868661,
				-87.7268100624, 41.917169067));
		segmentList.add(new SegmentModel("1289", -87.647745, 41.896297,
				-87.632709, 41.896514));
		segmentList.add(new SegmentModel("715", -87.6171719977, 41.823826979,
				-87.6169661907, 41.816636783));
		segmentList.add(new SegmentModel("1227", -87.648318, 41.91818,
				-87.64857, 41.925454));
		segmentList.add(new SegmentModel("3", -87.7035554211, 41.7933767009,
				-87.693799302, 41.7935536023));
		segmentList.add(new SegmentModel("408", -87.6898564646, 41.9905010348,
				-87.6896322236, 41.983168718));
		segmentList.add(new SegmentModel("196", -87.7948024476, 41.9091729382,
				-87.8057579864, 41.9090033229));
		segmentList.add(new SegmentModel("799", -87.5852385693, 41.7369134537,
				-87.5854076784, 41.7442162163));
		segmentList.add(new SegmentModel("379", -87.6838226552, 41.7792170504,
				-87.6836275216, 41.7719786518));
		segmentList.add(new SegmentModel("193", -87.6676930451, 41.9104930855,
				-87.6621624942, 41.9105689327));
		segmentList.add(new SegmentModel("212", -87.6331493782, 41.9112994848,
				-87.6482701057, 41.9110568232));
		segmentList.add(new SegmentModel("106", -87.6642111674, 41.7867457704,
				-87.6643984668, 41.7940232957));
		segmentList.add(new SegmentModel("545", -87.6270547792, 41.8527242399,
				-87.623799, 41.852665046));
		segmentList.add(new SegmentModel("1265", -87.649457, 41.939979,
				-87.6492, 41.932719));
		segmentList.add(new SegmentModel("1125", -87.7434054086, 41.82213967,
				-87.7435648614, 41.8367455138));
		segmentList.add(new SegmentModel("584", -87.6186711362, 41.8674650997,
				-87.6171289792, 41.8732552139));
		segmentList.add(new SegmentModel("194", -87.6621624942, 41.9105689327,
				-87.6482730398, 41.9107824177));
		segmentList.add(new SegmentModel("123", -87.6679092691, 41.9185457037,
				-87.6679620918, 41.9251505156));
		segmentList.add(new SegmentModel("388", -87.6858237771, 41.852032941,
				-87.6854062799, 41.8390750509));
		segmentList.add(new SegmentModel("934", -87.666645935, 41.903342994,
				-87.6555656519, 41.8962355211));
		segmentList.add(new SegmentModel("187", -87.7263320051, 41.9097494848,
				-87.7167020015, 41.9098569484));
		segmentList.add(new SegmentModel("14", -87.772065026, 41.7926796968,
				-87.77935, 41.7924861906));
		segmentList.add(new SegmentModel("1240", -87.644373, 41.756089,
				-87.644233, 41.750643));
		segmentList.add(new SegmentModel("917", -87.62442868, 41.86745208,
				-87.62423822, 41.860205));
		segmentList.add(new SegmentModel("69", -87.7230100127, 41.7786611581,
				-87.7228259157, 41.7713768755));
		segmentList.add(new SegmentModel("1082", -87.618454928, 41.6589702239,
				-87.5888058664, 41.6598188126));
		segmentList.add(new SegmentModel("277", -87.5856349924, 41.7370506698,
				-87.6048212832, 41.7367866148));
		segmentList.add(new SegmentModel("389", -87.685945, 41.857516,
				-87.6858237771, 41.852032941));
		segmentList.add(new SegmentModel("73", -87.7238367819, 41.8078865428,
				-87.7236744304, 41.8023203612));
		segmentList.add(new SegmentModel("160", -87.6688454399, 41.9396975636,
				-87.6685777528, 41.9324046052));
		segmentList.add(new SegmentModel("1170", -87.8055007941, 41.8942683013,
				-87.8049488066, 41.8796992839));
		segmentList.add(new SegmentModel("505", -87.6657812595, 41.8375620822,
				-87.6465225077, 41.8470464552));
		segmentList.add(new SegmentModel("1274", -87.666802, 41.881354,
				-87.657142, 41.881515));
		segmentList.add(new SegmentModel("533", -87.7248565497, 41.8514551447,
				-87.715005471, 41.8515013918));
		segmentList.add(new SegmentModel("932", -87.7877063878, 41.9973513029,
				-87.8009390602, 42.0119685688));
		segmentList.add(new SegmentModel("91", -87.7274979656, 41.9411707218,
				-87.727229938, 41.9317932724));
		segmentList.add(new SegmentModel("942", -87.7546730264, 41.960634303,
				-87.7474711222, 41.9534196096));
		segmentList.add(new SegmentModel("879", -87.6329021476, 41.8966141219,
				-87.6327415777, 41.891601818));
		segmentList.add(new SegmentModel("1212", -87.645349, 41.808864,
				-87.645535, 41.816184));
		segmentList.add(new SegmentModel("245", -87.8015504112, 41.7918096469,
				-87.7915770975, 41.7920189692));
		segmentList.add(new SegmentModel("8", -87.6548756951, 41.7940346735,
				-87.6451618298, 41.7941646462));
		segmentList.add(new SegmentModel("875", -87.632960514, 41.9111587862,
				-87.632772, 41.913031));
		segmentList.add(new SegmentModel("442", -87.7118904749, 41.7495462277,
				-87.7024160884, 41.7495759263));
		segmentList.add(new SegmentModel("968", -87.66551, 41.82307531,
				-87.64595204, 41.82339009));
		segmentList.add(new SegmentModel("829", -87.8067554164, 41.9827767713,
				-87.8066960672, 41.9899782632));
		segmentList.add(new SegmentModel("1271", -87.647361, 41.881876,
				-87.657142, 41.881715));
		segmentList.add(new SegmentModel("1116", -87.7008290506, 41.6914305788,
				-87.6811565356, 41.6916419497));
		segmentList.add(new SegmentModel("143", -87.6651559056, 41.8086055077,
				-87.6649598466, 41.8013192816));
		segmentList.add(new SegmentModel("1202", -87.643376, 41.736073,
				-87.643641, 41.743359));
		segmentList.add(new SegmentModel("124", -87.6679620918, 41.9251505156,
				-87.668210266, 41.932402477));
		segmentList.add(new SegmentModel("719", -87.6185005579, 41.8493409786,
				-87.6176590907, 41.8456997096));
		segmentList.add(new SegmentModel("150", -87.6665671071, 41.8668625554,
				-87.6663216627, 41.8577948131));
		segmentList.add(new SegmentModel("241", -87.6469168821, 41.867291304,
				-87.656679779, 41.8671338197));
		segmentList.add(new SegmentModel("60", -87.7211571147, 41.7059057937,
				-87.7208769338, 41.6985650226));
		segmentList.add(new SegmentModel("717", -87.6174700788, 41.8384234955,
				-87.6173371439, 41.831103063));
		segmentList.add(new SegmentModel("219", -87.7154221093, 41.8661526026,
				-87.7056705433, 41.8662681014));
		segmentList.add(new SegmentModel("767", -87.8060612029, 41.9239918867,
				-87.8062855111, 41.930812181));
		segmentList.add(new SegmentModel("846", -87.8069809576, 41.9977761215,
				-87.8070638759, 41.98997995));
		segmentList.add(new SegmentModel("1003", -87.6902422854, 42.0121628852,
				-87.6830672906, 42.0121053665));
		segmentList.add(new SegmentModel("898", -87.62305669, 41.83834404,
				-87.62343743, 41.84564219));
		segmentList.add(new SegmentModel("721", -87.6620211809, 41.9107515338,
				-87.66795526, 41.9186224793));
		segmentList.add(new SegmentModel("975", -87.66551, 41.82327531,
				-87.67507424, 41.82324972));
		segmentList.add(new SegmentModel("620", -87.61989328, 41.90098105,
				-87.61427361, 41.8919006));
		segmentList.add(new SegmentModel("204", -87.7166993605, 41.9101313576,
				-87.7263294053, 41.9100238945));
		segmentList.add(new SegmentModel("503", -87.6848960158, 41.8258789119,
				-87.675372871, 41.831689289));
		segmentList.add(new SegmentModel("1060", -87.6567189866, 41.8842675466,
				-87.6633319571, 41.8842641098));
		segmentList.add(new SegmentModel("406", -87.6893345677, 41.9758925735,
				-87.689090429, 41.9686159566));
		segmentList.add(new SegmentModel("358", -87.68745819, 41.9248996489,
				-87.6875661231, 41.9279807743));
		segmentList.add(new SegmentModel("1117", -87.7008263623, 41.6917049977,
				-87.7202965545, 41.6914994271));
		segmentList.add(new SegmentModel("618", -87.61427361, 41.8919006,
				-87.61422856, 41.88438999));
		segmentList.add(new SegmentModel("34", -87.7234032253, 41.8078826502,
				-87.7237477951, 41.8151945196));
		segmentList.add(new SegmentModel("1296", -87.627876, 41.886813,
				-87.628098, 41.896677));
		segmentList.add(new SegmentModel("809", -87.5856049147, 41.7369158383,
				-87.5854357956, 41.729613558));
		segmentList.add(new SegmentModel("177", -87.6548728011, 41.7943090849,
				-87.6645803881, 41.7941615692));
		segmentList.add(new SegmentModel("107", -87.6643984668, 41.7940232957,
				-87.6645931099, 41.8013171472));
		segmentList.add(new SegmentModel("605", -87.5817584885, 41.8027405099,
				-87.5793749691, 41.7952204517));
		segmentList.add(new SegmentModel("418", -87.7024134014, 41.7498503425,
				-87.7118878282, 41.7498206443));
		segmentList.add(new SegmentModel("251", -87.7419859962, 41.7928937616,
				-87.7329648143, 41.792978773));
		segmentList.add(new SegmentModel("515", -87.7042579, 41.81426355,
				-87.71403459, 41.80803564));
		segmentList.add(new SegmentModel("1171", -87.8059536529, 41.9088560337,
				-87.8055007941, 41.8942683013));
		segmentList.add(new SegmentModel("693", -87.615791142, 41.7946755473,
				-87.6159748727, 41.8021096226));
		segmentList.add(new SegmentModel("940", -87.7358107254, 41.9462450778,
				-87.7241340948, 41.9391425051));
		segmentList.add(new SegmentModel("495", -87.7624030192, 41.7955741737,
				-87.7526573727, 41.7970886104));
		segmentList.add(new SegmentModel("215", -87.7545600319, 41.8655761505,
				-87.7447639101, 41.8658134419));
		segmentList.add(new SegmentModel("239", -87.6663821254, 41.8669986938,
				-87.6762482895, 41.8668917757));
		segmentList.add(new SegmentModel("1290", -87.647745, 41.896497,
				-87.655452, 41.896367));
		segmentList.add(new SegmentModel("351", -87.6860859175, 41.8760825857,
				-87.6863009624, 41.8829951691));
		segmentList.add(new SegmentModel("387", -87.6854062799, 41.8390750509,
				-87.6850859812, 41.8259389558));
		segmentList.add(new SegmentModel("253", -87.7020978703, 41.735083368,
				-87.6922007563, 41.7352455091));
		segmentList.add(new SegmentModel("98", -87.6625002738, 41.7212141057,
				-87.6626684166, 41.7284810983));
		segmentList.add(new SegmentModel("586", -87.61712898, 41.87325521,
				-87.61730448, 41.88091652));
		segmentList.add(new SegmentModel("443", -87.7024160884, 41.7495759263,
				-87.6926391909, 41.7497658287));
		segmentList.add(new SegmentModel("927", -87.6551983919, 41.8962333529,
				-87.6662786223, 41.9033408608));
		segmentList.add(new SegmentModel("602", -87.6502830414, 41.9765945008,
				-87.6533932841, 41.9855533157));
		segmentList.add(new SegmentModel("1200", -87.643022, 41.721458,
				-87.643226, 41.728767));
		segmentList.add(new SegmentModel("41", -87.7249869344, 41.8661711575,
				-87.7253813295, 41.8752753838));
		segmentList.add(new SegmentModel("79", -87.7252056371, 41.858871241,
				-87.7250091595, 41.8515494772));
		segmentList.add(new SegmentModel("182", -87.7410588664, 41.734386902,
				-87.731161881, 41.7345524002));
		segmentList.add(new SegmentModel("400", -87.6880664353, 41.9321801597,
				-87.6879335859, 41.9279828403));
		segmentList.add(new SegmentModel("20", -87.7204446212, 41.6985611194,
				-87.7207943736, 41.7059018917));
		segmentList.add(new SegmentModel("326", -87.7461157058, 41.9094885759,
				-87.7362643899, 41.9096183569));
		segmentList.add(new SegmentModel("941", -87.7474711222, 41.9534196096,
				-87.7358107254, 41.9462450778));
		segmentList.add(new SegmentModel("1256", -87.647315, 41.874338,
				-87.647109, 41.867152));
		segmentList.add(new SegmentModel("202", -87.7362618327, 41.9098927671,
				-87.7461131909, 41.9097629867));
		segmentList.add(new SegmentModel("42", -87.7252950746, 41.8752753838,
				-87.7255863086, 41.8819364677));
		segmentList.add(new SegmentModel("117", -87.6664153537, 41.8741993673,
				-87.6666877975, 41.8832979102));
		segmentList.add(new SegmentModel("201", -87.7461131909, 41.9097629867,
				-87.7557943854, 41.9096384783));
		segmentList.add(new SegmentModel("1252", -87.646677, 41.847196,
				-87.646466, 41.838046));
		segmentList.add(new SegmentModel("1236", -87.643606, 41.728767,
				-87.643402, 41.721458));
		segmentList.add(new SegmentModel("1057", -87.6244501884, 41.8846086464,
				-87.637068542, 41.8845986991));
		segmentList.add(new SegmentModel("287", -87.7473061296, 41.9532811726,
				-87.7380652196, 41.9533921986));
		segmentList.add(new SegmentModel("269", -87.6825126506, 41.7356644927,
				-87.6921980271, 41.7355199254));
		segmentList.add(new SegmentModel("1103", -87.763913, 41.851385,
				-87.7834783427, 41.8510024115));
		segmentList.add(new SegmentModel("762", -87.8007155573, 41.7772906843,
				-87.8010328293, 41.7846875845));
		segmentList.add(new SegmentModel("356", -87.6870370163, 41.9103198343,
				-87.6872050148, 41.9168043897));
		segmentList.add(new SegmentModel("321", -87.794804754, 41.9088985252,
				-87.7849651041, 41.9089744604));
		segmentList.add(new SegmentModel("252", -87.7329648143, 41.792978773,
				-87.7231602513, 41.7930671862));
		segmentList.add(new SegmentModel("956", -87.6280709409, 41.8924469959,
				-87.6241579489, 41.8925430126));
		segmentList.add(new SegmentModel("232", -87.7349634658, 41.866170101,
				-87.7447613932, 41.8660878547));
		segmentList.add(new SegmentModel("65", -87.7219287929, 41.7421819618,
				-87.7216776788, 41.7348605537));
		segmentList.add(new SegmentModel("368", -87.681570794, 41.699079999,
				-87.6813382085, 41.691780196));
		segmentList.add(new SegmentModel("70", -87.7232114423, 41.7859394995,
				-87.7230100127, 41.7786611581));
		segmentList.add(new SegmentModel("891", -87.6385898812, 41.9403863706,
				-87.6322220647, 41.9334278712));
		segmentList.add(new SegmentModel("825", -87.7605911887, 41.9678434988,
				-87.7675546457, 41.975654244));
		segmentList.add(new SegmentModel("170", -87.7231576487, 41.7933416014,
				-87.7329622535, 41.7932531887));
		segmentList.add(new SegmentModel("116", -87.6661999959, 41.8668604234,
				-87.6664153537, 41.8741993673));
		segmentList.add(new SegmentModel("508", -87.77208033, 41.79434225,
				-87.78178721, 41.79250221));
		segmentList.add(new SegmentModel("455", -87.6341938681, 41.7508788394,
				-87.6439701738, 41.7507752434));
		segmentList.add(new SegmentModel("242", -87.6421863761, 41.8673568658,
				-87.6469168821, 41.867291304));
		segmentList.add(new SegmentModel("1243", -87.644977, 41.779751,
				-87.644787, 41.772472));
		segmentList.add(new SegmentModel("343", -87.6842419673, 41.8084247143,
				-87.6844449706, 41.8156948926));
		segmentList.add(new SegmentModel("44", -87.7256212259, 41.8854658549,
				-87.725990629, 41.8953666789));
		segmentList.add(new SegmentModel("111", -87.6651248281, 41.8231508628,
				-87.6653847992, 41.8305002878));
		segmentList.add(new SegmentModel("303", -87.7865583352, 41.9530537114,
				-87.7962712058, 41.9528801018));
		segmentList.add(new SegmentModel("335", -87.6826639338, 41.7501017847,
				-87.6829192318, 41.7592310843));
		segmentList.add(new SegmentModel("223", -87.6762510995, 41.8666173666,
				-87.6663849776, 41.8667242852));
		segmentList.add(new SegmentModel("467", -87.6286359347, 41.721847197,
				-87.6432218261, 41.7215954811));
		segmentList.add(new SegmentModel("85", -87.7265539158, 41.9026743655,
				-87.7263314096, 41.8953705621));
		segmentList.add(new SegmentModel("298", -87.6497013008, 41.9544240318,
				-87.6445645207, 41.9545203153));
		segmentList.add(new SegmentModel("556", -87.646459951, 41.852819781,
				-87.6561800466, 41.8526797855));
		segmentList.add(new SegmentModel("541", -87.656182952, 41.8524053768,
				-87.6464628869, 41.8525453729));
		segmentList.add(new SegmentModel("1024", -87.6366594269, 41.8768042277,
				-87.6367064128, 41.8819140751));
		segmentList.add(new SegmentModel("226", -87.6469198175, 41.8670168965,
				-87.6421893317, 41.8670824586));
		segmentList.add(new SegmentModel("338", -87.6832609507, 41.7719765782,
				-87.6834560431, 41.7792149771));
		segmentList.add(new SegmentModel("784", -87.738383984, 41.99014783,
				-87.7483246455, 41.9900367205));
		segmentList.add(new SegmentModel("318", -87.6496983683, 41.9546984352,
				-87.654543283, 41.954625578));
		segmentList.add(new SegmentModel("26", -87.7214959848, 41.742178062,
				-87.721801291, 41.7495695299));
		segmentList.add(new SegmentModel("709", -87.6158195303, 41.7801838678,
				-87.6156002918, 41.7729490745));
		segmentList.add(new SegmentModel("179", -87.6311253178, 41.7946718587,
				-87.6451588943, 41.7944390571));
		segmentList.add(new SegmentModel("997", -87.788844102, 42.0118012997,
				-87.7734085578, 42.0117270439));
		segmentList.add(new SegmentModel("529", -87.764172, 41.996247,
				-87.76650952, 41.99730108));
		segmentList.add(new SegmentModel("250", -87.7525086618, 41.7927506225,
				-87.7419859962, 41.7928937616));
		segmentList.add(new SegmentModel("947", -87.7880742452, 41.9973530508,
				-87.7812184608, 41.9901963992));
		segmentList.add(new SegmentModel("68", -87.7228259157, 41.7713768755,
				-87.7226046555, 41.7641031795));
		segmentList.add(new SegmentModel("127", -87.6686743455, 41.9469890515,
				-87.6688650541, 41.9542892901));
		segmentList.add(new SegmentModel("421", -87.6051881522, 41.7513900229,
				-87.6149102436, 41.7512885566));
		segmentList.add(new SegmentModel("914", -87.62423822, 41.860205,
				-87.62410876, 41.85285485));
		segmentList.add(new SegmentModel("763", -87.8010328293, 41.7846875845,
				-87.801344619, 41.7919383373));
		segmentList.add(new SegmentModel("1263", -87.64895, 41.925454,
				-87.648698, 41.91818));
		segmentList.add(new SegmentModel("894", -87.64644589, 41.96200822,
				-87.644948865, 41.9546587304));
		segmentList.add(new SegmentModel("270", -87.6727836177, 41.7357915897,
				-87.6825126506, 41.7356644927));
		segmentList.add(new SegmentModel("147", -87.6659250887, 41.8376849226,
				-87.6657517025, 41.8305024208));
		segmentList.add(new SegmentModel("424", -87.6820597144, 41.7208280858,
				-87.6727283985, 41.7208895929));
		segmentList.add(new SegmentModel("768", -87.8062855111, 41.930812181,
				-87.8065443404, 41.9379872726));
		segmentList.add(new SegmentModel("801", -87.5855768194, 41.7515184785,
				-87.585746426, 41.7587831979));
		segmentList.add(new SegmentModel("638", -87.7433257794, 41.8076284928,
				-87.7431700421, 41.8003419432));
		segmentList.add(new SegmentModel("1297", -87.628298, 41.896677,
				-87.628076, 41.886813));
		segmentList.add(new SegmentModel("633", -87.7422329321, 41.7711273217,
				-87.7419654588, 41.7619000085));
		segmentList.add(new SegmentModel("174", -87.684040386, 41.7940137889,
				-87.6937965741, 41.7938280159));
		segmentList.add(new SegmentModel("831", -87.8066130746, 41.9977744341,
				-87.8065204549, 42.0044647335));
		segmentList.add(new SegmentModel("126", -87.6684779112, 41.939695436,
				-87.6686743455, 41.9469890515));
		segmentList.add(new SegmentModel("275", -87.6145264307, 41.7366402331,
				-87.624761, 41.736485));
		segmentList.add(new SegmentModel("146", -87.6657517025, 41.8305024208,
				-87.6654916893, 41.8231529963));
		segmentList.add(new SegmentModel("352", -87.6863009624, 41.8829951691,
				-87.6865108851, 41.8906470248));
		segmentList.add(new SegmentModel("446", -87.6730852477, 41.7501431365,
				-87.6634715402, 41.7502908262));
		segmentList.add(new SegmentModel("329", -87.6814372666, 41.7063752847,
				-87.6816602454, 41.713672748));
		segmentList.add(new SegmentModel("616", -87.6142285649, 41.8843899871,
				-87.6176716636, 41.8809188072));
		segmentList.add(new SegmentModel("448", -87.6536959041, 41.7503147501,
				-87.6439731098, 41.7505008306));
		segmentList.add(new SegmentModel("413", -87.6051912535, 41.7511156124,
				-87.5954153468, 41.7511752428));
		segmentList.add(new SegmentModel("1127", -87.7440666919, 41.8512433072,
				-87.7446180929, 41.865960857));
		segmentList.add(new SegmentModel("134", -87.6632483146, 41.7357908525,
				-87.6630347385, 41.7284832358));
		segmentList.add(new SegmentModel("414", -87.5954153468, 41.7511752428,
				-87.5858011703, 41.7513164293));
		segmentList.add(new SegmentModel("76", -87.7246009792, 41.8368851841,
				-87.7243007082, 41.8229936666));
		segmentList.add(new SegmentModel("185", -87.7119953299, 41.7348842334,
				-87.7020978703, 41.735083368));
		segmentList.add(new SegmentModel("463", -87.6727255878, 41.7211640089,
				-87.6820569435, 41.7211025023));
		segmentList.add(new SegmentModel("1262", -87.648698, 41.91818,
				-87.648463, 41.91092));
		segmentList.add(new SegmentModel("775", -87.7483271581, 41.9897623135,
				-87.7383865392, 41.9898734235));
		segmentList.add(new SegmentModel("551", -87.695431287, 41.852014774,
				-87.7052158636, 41.852019272));
		segmentList.add(new SegmentModel("766", -87.8058078034, 41.9161689398,
				-87.8060612029, 41.9239918867));
		segmentList.add(new SegmentModel("399", -87.6879335859, 41.9279828403,
				-87.6878256352, 41.9249017152));
		segmentList.add(new SegmentModel("1208", -87.644597, 41.779751,
				-87.64478, 41.787025));
		segmentList.add(new SegmentModel("896", -87.6506507735, 41.9765966882,
				-87.6481529198, 41.9694059924));
		segmentList.add(new SegmentModel("871", -87.6323022864, 41.8869326249,
				-87.6323743203, 41.8915995768));
		segmentList.add(new SegmentModel("554", -87.6659402856, 41.8524897709,
				-87.6758591402, 41.852299832));
		segmentList.add(new SegmentModel("499", -87.7234847773, 41.8021841928,
				-87.7140372137, 41.8077612143));
		segmentList.add(new SegmentModel("1219", -87.646517, 41.859912,
				-87.646729, 41.867152));
		segmentList.add(new SegmentModel("567", -87.7412259766, 41.7843170707,
				-87.7417947979, 41.793035195));
		segmentList.add(new SegmentModel("359", -87.6875661231, 41.9279807743,
				-87.6876989484, 41.9321780939));
		segmentList.add(new SegmentModel("152", -87.6670550027, 41.8833000413,
				-87.6667825068, 41.8742014988));
		segmentList.add(new SegmentModel("756", -87.5367257051, 41.7229428303,
				-87.5354182726, 41.7213286555));
		segmentList.add(new SegmentModel("1126", -87.7435648614, 41.8367455138,
				-87.7440666919, 41.8512433072));
		segmentList.add(new SegmentModel("837", -87.8061752063, 41.9161706271,
				-87.805936449, 41.9088392194));
		segmentList.add(new SegmentModel("810", -87.585774091, 41.7442186009,
				-87.5856049147, 41.7369158383));
		segmentList.add(new SegmentModel("35", -87.7236784823, 41.8151945196,
				-87.723940876, 41.8229897759));
		segmentList.add(new SegmentModel("341", -87.6838584229, 41.793875546,
				-87.684040664, 41.8011451454));
		segmentList.add(new SegmentModel("520", -87.64651959, 41.84732087,
				-87.66577839, 41.83783649));
		segmentList.add(new SegmentModel("131", -87.6694299012, 41.9761710709,
				-87.6696322417, 41.9834747775));
		segmentList.add(new SegmentModel("1033", -87.6370736078, 41.8819163019,
				-87.6370265926, 41.8768064545));
		segmentList.add(new SegmentModel("1099", -87.7834806928, 41.8507279962,
				-87.7634806928, 41.8507279962));
		segmentList.add(new SegmentModel("962", -87.6281107904, 41.8932683712,
				-87.6326364483, 41.8932027711));
		segmentList.add(new SegmentModel("555", -87.6561800466, 41.8526797855,
				-87.6659402856, 41.8524897709));
		segmentList.add(new SegmentModel("737", -87.7002228515, 41.9247896604,
				-87.7120661817, 41.9319511814));
		segmentList.add(new SegmentModel("1186", -87.6611036606, 42.0055411356,
				-87.6605728465, 41.9982097226));
		segmentList.add(new SegmentModel("373", -87.6826972175, 41.7355283222,
				-87.6824828127, 41.7282307117));
		segmentList.add(new SegmentModel("872", -87.6323743203, 41.8915995768,
				-87.6325348871, 41.8966118812));
		segmentList.add(new SegmentModel("374", -87.6828624247, 41.7428167477,
				-87.6826972175, 41.7355283222));
		segmentList.add(new SegmentModel("874", -87.6327323363, 41.9038817979,
				-87.632960514, 41.9111587862));
		segmentList.add(new SegmentModel("950", -87.696333691, 41.8830349349,
				-87.7061691246, 41.8829315251));
		segmentList.add(new SegmentModel("527", -87.78226252, 42.00481724,
				-87.78850216, 42.0119672));
		segmentList.add(new SegmentModel("1309", -87.639487, 41.874538,
				-87.647125, 41.874438));
		segmentList.add(new SegmentModel("465", -87.6529423406, 41.7214266197,
				-87.6626317556, 41.7213323658));
		segmentList.add(new SegmentModel("159", -87.6685777528, 41.9324046052,
				-87.668329537, 41.9251526443));
		segmentList.add(new SegmentModel("502", -87.6944855458, 41.8198633558,
				-87.6848960158, 41.8258789119));
		segmentList.add(new SegmentModel("1207", -87.644407, 41.772472,
				-87.644597, 41.779751));
		segmentList.add(new SegmentModel("1304", -87.647125, 41.874238,
				-87.639487, 41.874238));
		segmentList.add(new SegmentModel("1050", -87.6668391286, 41.8822417003,
				-87.664672601, 41.8826899771));
		segmentList.add(new SegmentModel("246", -87.7915770975, 41.7920189692,
				-87.7818067839, 41.7922117726));
		segmentList.add(new SegmentModel("222", -87.6860397975, 41.8664753382,
				-87.6762510995, 41.8666173666));
		segmentList.add(new SegmentModel("1283", -87.620469, 41.896785,
				-87.620324, 41.891002));
		segmentList.add(new SegmentModel("553", -87.6758591402, 41.852299832,
				-87.6856447314, 41.8522071469));
		segmentList.add(new SegmentModel("282", -87.7962735095, 41.9526056908,
				-87.7865606805, 41.9527793008));
		segmentList.add(new SegmentModel("132", -87.6696322417, 41.9834747775,
				-87.6695265292, 41.9867518859));
		segmentList.add(new SegmentModel("893", -87.644948865, 41.9546587304,
				-87.6435427315, 41.9486508165));
		segmentList.add(new SegmentModel("713", -87.6167610807, 41.809387166,
				-87.6163416247, 41.8021119123));
		segmentList.add(new SegmentModel("1054", -87.6370264614, 41.883144306,
				-87.6244239148, 41.8831986058));
		segmentList.add(new SegmentModel("1001", -87.7090567368, 42.0117196518,
				-87.6997466265, 42.0119763841));
		segmentList.add(new SegmentModel("792", -87.6721479065, 41.9906428343,
				-87.662406509, 41.9849056913));
		segmentList.add(new SegmentModel("188", -87.7167020015, 41.9098569484,
				-87.7069618067, 41.909978124));
		segmentList.add(new SegmentModel("372", -87.6824828127, 41.7282307117,
				-87.6822383249, 41.7209403583));
		segmentList.add(new SegmentModel("1223", -87.647427, 41.891185,
				-87.647555, 41.896397));
		segmentList.add(new SegmentModel("401", -87.6883485854, 41.9394618483,
				-87.6880664353, 41.9321801597));
		segmentList.add(new SegmentModel("311", -87.7080135337, 41.9540569195,
				-87.7178119849, 41.9539236607));
		segmentList.add(new SegmentModel("334", -87.6824960199, 41.7428146728,
				-87.6826639338, 41.7501017847));
		segmentList.add(new SegmentModel("977", -87.63050842, 41.82391453,
				-87.64595204, 41.82359009));
		segmentList.add(new SegmentModel("183", -87.731161881, 41.7345524002,
				-87.7214579641, 41.7347180742));
		segmentList.add(new SegmentModel("1241", -87.644601, 41.765201,
				-87.644373, 41.756089));
		segmentList.add(new SegmentModel("679", -87.6445439049, 41.8890317788,
				-87.6442914709, 41.8818287714));
		segmentList.add(new SegmentModel("361", -87.6879810565, 41.9394597831,
				-87.6880739349, 41.9467297764));
		segmentList.add(new SegmentModel("385", -87.685060202, 41.8229970652,
				-87.6848117907, 41.8156969641));
		segmentList.add(new SegmentModel("593", -87.6242873281, 41.9039960653,
				-87.6257810568, 41.9113301795));
		segmentList.add(new SegmentModel("1285", -87.624241, 41.896635,
				-87.617048, 41.896736));
		segmentList.add(new SegmentModel("264", -87.7311593177, 41.7348268186,
				-87.7410563453, 41.7346613209));
		segmentList.add(new SegmentModel("409", -87.6439731098, 41.7505008306,
				-87.6341968458, 41.7506044271));
		segmentList.add(new SegmentModel("814", -87.5864010353, 41.7733522321,
				-87.5862821566, 41.7660878258));
		segmentList.add(new SegmentModel("859", -87.7675609235, 41.9704709429,
				-87.7782350055, 41.9733282922));
		segmentList.add(new SegmentModel("866", -87.6422453799, 41.8743970981,
				-87.6424565074, 41.8817855514));
		segmentList.add(new SegmentModel("218", -87.7251717904, 41.8660349238,
				-87.7154221093, 41.8661526026));
		segmentList.add(new SegmentModel("2", -87.7136071496, 41.793140551,
				-87.7035554211, 41.7933767009));
		segmentList.add(new SegmentModel("286", -87.7571489562, 41.9531625184,
				-87.7473061296, 41.9532811726));
		segmentList.add(new SegmentModel("649", -87.7467756515, 41.9315334345,
				-87.7464522852, 41.9242323024));
		segmentList.add(new SegmentModel("808", -87.5854357956, 41.729613558,
				-87.5853170018, 41.7223487458));
		segmentList.add(new SegmentModel("1267", -87.649889, 41.954562,
				-87.649676, 41.947316));
		segmentList.add(new SegmentModel("876", -87.6329312928, 41.9129095435,
				-87.6315440404, 41.9132509892));
		segmentList.add(new SegmentModel("380", -87.6840139301, 41.7865297579,
				-87.6838226552, 41.7792170504));
		segmentList.add(new SegmentModel("339", -87.6834560431, 41.7792149771,
				-87.6836472764, 41.786527685));
		segmentList.add(new SegmentModel("233", -87.7251691897, 41.8663093356,
				-87.7349634658, 41.866170101));
		segmentList.add(new SegmentModel("47", -87.7262240305, 41.9061550576,
				-87.7261823777, 41.9098857185));
		segmentList.add(new SegmentModel("305", -87.7669985006, 41.953321789,
				-87.7767736096, 41.9531933493));
		segmentList.add(new SegmentModel("539", -87.6758619651, 41.8520254223,
				-87.6659431382, 41.8522153616));
		segmentList.add(new SegmentModel("376", -87.6832857301, 41.7592331585,
				-87.6830303802, 41.7501038593));
		segmentList.add(new SegmentModel("887", -87.5790082777, 41.7952180444,
				-87.5813917503, 41.8027381099));
		segmentList.add(new SegmentModel("346", -87.6847191026, 41.8259368847,
				-87.6850393262, 41.8390729803));
		segmentList.add(new SegmentModel("96", -87.728684246, 41.9828344352,
				-87.7284849951, 41.9755349148));
		segmentList.add(new SegmentModel("1199", -87.642814, 41.714215,
				-87.643022, 41.721458));
		segmentList.add(new SegmentModel("918", -87.624605, 41.875777,
				-87.62442868, 41.86745208));
		segmentList.add(new SegmentModel("410", -87.6341968458, 41.7506044271,
				-87.6245276216, 41.7508298555));
		segmentList.add(new SegmentModel("1258", -87.647807, 41.891185,
				-87.647551, 41.881776));
		segmentList.add(new SegmentModel("707", -87.6154810444, 41.7657148473,
				-87.6152627045, 41.7584052178));
		segmentList.add(new SegmentModel("472", -87.5851058414, 41.7224793067,
				-87.594731404, 41.7222769494));
		segmentList.add(new SegmentModel("32", -87.7229756027, 41.7932034198,
				-87.7233273471, 41.802316468));
		segmentList.add(new SegmentModel("712", -87.6163416247, 41.8021119123,
				-87.6161578443, 41.7946778372));
		segmentList.add(new SegmentModel("56", -87.7280495172, 41.9755310394,
				-87.7283177717, 41.9828305605));
		segmentList.add(new SegmentModel("685", -87.6143079092, 41.7364992381,
				-87.6145593931, 41.743809104));
		segmentList.add(new SegmentModel("419", -87.6245246027, 41.7511042672,
				-87.6341938681, 41.7508788394));
		segmentList.add(new SegmentModel("39", -87.7245751041, 41.8515455888,
				-87.7248408908, 41.8588673534));
		segmentList.add(new SegmentModel("392", -87.6866681673, 41.8829972374,
				-87.6864530829, 41.8760846544));
		segmentList.add(new SegmentModel("535", -87.7108780567, 41.8515084992,
				-87.7052185483, 41.8517448606));
		segmentList.add(new SegmentModel("643", -87.7457075823, 41.8879223958,
				-87.7454413862, 41.8804965805));
		segmentList.add(new SegmentModel("979", -87.61699842, 41.82407853,
				-87.62644842, 41.82401853));
		segmentList.add(new SegmentModel("11", -87.625702556, 41.7945059819,
				-87.6159826042, 41.7946636061));
		segmentList.add(new SegmentModel("354", -87.6866589587, 41.8957422115,
				-87.686843103, 41.9030150932));
		segmentList.add(new SegmentModel("249", -87.76223503, 41.79240528,
				-87.75250866, 41.79275062));
		segmentList.add(new SegmentModel("407", -87.6896322236, 41.983168718,
				-87.6893345677, 41.9758925735));
		segmentList.add(new SegmentModel("946", -87.7812184608, 41.9901963992,
				-87.7745470464, 41.9829168191));
		segmentList.add(new SegmentModel("563", -87.7412632413, 41.7492014587,
				-87.741598945, 41.7618981214));
		segmentList.add(new SegmentModel("570", -87.7429589865, 41.8076266165,
				-87.7431516294, 41.8149300238));
		segmentList.add(new SegmentModel("381", -87.6842251186, 41.7938776185,
				-87.6840139301, 41.7865297579));
		segmentList.add(new SegmentModel("332", -87.6821164908, 41.7282286362,
				-87.6823308541, 41.7355262471));
		segmentList.add(new SegmentModel("1011", -87.8065759801, 42.0118538545,
				-87.8163255119, 42.0115963199));
		segmentList.add(new SegmentModel("261", -87.6145294906, 41.7363658213,
				-87.6048243845, 41.7365122036));
		segmentList.add(new SegmentModel("772", -87.7354431617, 41.9462431643,
				-87.7471035018, 41.9534177331));
		segmentList.add(new SegmentModel("850", -87.8069576478, 41.9809967484,
				-87.7964600566, 41.9787314076));
		segmentList.add(new SegmentModel("710", -87.6160043658, 41.7875182,
				-87.6158195303, 41.7801838678));
		segmentList.add(new SegmentModel("558", -87.6270517604, 41.8529986469,
				-87.6369249316, 41.8529600788));
		segmentList.add(new SegmentModel("651", -87.7472367862, 41.9461208905,
				-87.7470620151, 41.9388205094));
		segmentList.add(new SegmentModel("342", -87.684040664, 41.8011451454,
				-87.6842419673, 41.8084247143));
		segmentList.add(new SegmentModel("779", -87.7111114564, 41.9902451513,
				-87.6994001534, 41.9903007523));
		segmentList.add(new SegmentModel("144", -87.6653316028, 41.8158718637,
				-87.6651559056, 41.8086055077));
		segmentList.add(new SegmentModel("92", -87.7278685825, 41.9536506962,
				-87.7274979656, 41.9411707218));
		segmentList.add(new SegmentModel("518", -87.67537005, 41.8319637,
				-87.68489325, 41.82615333));
		segmentList.add(new SegmentModel("6", -87.6743019717, 41.7937791103,
				-87.6645832406, 41.7938871572));
		segmentList.add(new SegmentModel("769", -87.8065443404, 41.9379872726,
				-87.8068210943, 41.9452629688));
		segmentList.add(new SegmentModel("848", -87.8068098621, 42.0117152702,
				-87.8068883617, 42.0044664214));
		segmentList.add(new SegmentModel("13", -87.7818044315, 41.7924861906,
				-87.7915747868, 41.7922933877));
		segmentList.add(new SegmentModel("281", -87.8072619385, 41.9526256799,
				-87.7962735095, 41.9526056908));
		segmentList.add(new SegmentModel("121", -87.6673294583, 41.9040161282,
				-87.6675079387, 41.9106292239));
		segmentList.add(new SegmentModel("19", -87.7201006039, 41.6912676378,
				-87.7205138378, 41.6985611194));
		segmentList.add(new SegmentModel("423", -87.5857979864, 41.7515908387,
				-87.595412204, 41.7514496528));
		segmentList.add(new SegmentModel("1187", -87.6636373596, 42.0128310075,
				-87.6611036606, 42.0055411356));
		segmentList.add(new SegmentModel("606", -87.5892857918, 41.8107941007,
				-87.5817584885, 41.8027405099));
		segmentList.add(new SegmentModel("404", -87.6888668215, 41.9613138803,
				-87.6886500432, 41.954013773));
		segmentList.add(new SegmentModel("285", -87.7670009299, 41.9530473793,
				-87.7571489562, 41.9531625184));
		segmentList.add(new SegmentModel("1303", -87.617312, 41.873356,
				-87.627565, 41.873192));
		segmentList.add(new SegmentModel("93", -87.7280405527, 41.9596167084,
				-87.7278685825, 41.9536506962));
		segmentList.add(new SegmentModel("84", -87.7263314096, 41.8953705621,
				-87.7260556696, 41.8854697391));
		segmentList.add(new SegmentModel("54", -87.7276052579, 41.9596128313,
				-87.7279253868, 41.9682413338));
		segmentList.add(new SegmentModel("546", -87.7345076889, 41.8515825772,
				-87.7394667587, 41.8515094693));
		segmentList.add(new SegmentModel("816", -87.5868421143, 41.7878819901,
				-87.5866211188, 41.7806547878));
		segmentList.add(new SegmentModel("1152", -87.8051007941, 41.8942683013,
				-87.8055536529, 41.9088560337));
		segmentList.add(new SegmentModel("299", -87.8269761925, 41.9523833109,
				-87.8367104228, 41.9521889207));
		segmentList.add(new SegmentModel("882", -87.632854, 41.913172,
				-87.6333278653, 41.9111610262));
		segmentList.add(new SegmentModel("244", -87.6189600374, 41.8676400592,
				-87.6304336988, 41.86751119));
		segmentList.add(new SegmentModel("807", -87.5853170018, 41.7223487458,
				-87.5860949813, 41.7077704152));
		segmentList.add(new SegmentModel("929", -87.6773156389, 41.9104755299,
				-87.6883646017, 41.9175685137));
		segmentList.add(new SegmentModel("377", -87.6834259477, 41.76470325,
				-87.6832857301, 41.7592331585));
		segmentList.add(new SegmentModel("621", -87.6246546523, 41.9039983328,
				-87.6198932807, 41.9009810502));
		segmentList.add(new SegmentModel("703", -87.6146742766, 41.7365015302,
				-87.6145559778, 41.7291923898));
		segmentList.add(new SegmentModel("77", -87.7248037311, 41.8442580766,
				-87.7246009792, 41.8368851841));
		segmentList.add(new SegmentModel("220", -87.7056705433, 41.8662681014,
				-87.6959088534, 41.8663734623));
		segmentList.add(new SegmentModel("574", -87.7450741768, 41.8804946946,
				-87.7453403489, 41.8879205051));
		segmentList.add(new SegmentModel("180", -87.6256995376, 41.7947803916,
				-87.6311253178, 41.7946718587));
		segmentList.add(new SegmentModel("168", -87.8367125529, 41.9519145079,
				-87.8269783644, 41.9521088985));
		segmentList.add(new SegmentModel("830", -87.8066960672, 41.9899782632,
				-87.8066130746, 41.9977744341));
		segmentList.add(new SegmentModel("1277", -87.620688, 41.875774,
				-87.620501, 41.867512));
		segmentList.add(new SegmentModel("259", -87.6436285094, 41.736140859,
				-87.6254454451, 41.7361336678));
		segmentList.add(new SegmentModel("229", -87.7643523849, 41.8657559551,
				-87.7741476468, 41.8656126532));
		segmentList.add(new SegmentModel("348", -87.6854567493, 41.8520308712,
				-87.685797, 41.857496));
		segmentList.add(new SegmentModel("639", -87.7435184383, 41.8149319078,
				-87.7433257794, 41.8076284928));
		segmentList.add(new SegmentModel("695", -87.6163943054, 41.8093848774,
				-87.6165993704, 41.8166344948));
		segmentList.add(new SegmentModel("1132", -87.7439318058, 41.8367473974,
				-87.7437722696, 41.8221415535));
		segmentList.add(new SegmentModel("445", -87.6827540461, 41.7499136183,
				-87.6730852477, 41.7501431365));
		segmentList.add(new SegmentModel("686", -87.6145593931, 41.743809104,
				-87.6148109218, 41.7511190099));
		segmentList.add(new SegmentModel("488", -87.6210363283, 41.6927563144,
				-87.6329215921, 41.6925984414));
		segmentList.add(new SegmentModel("50", -87.7265848616, 41.9244829851,
				-87.726864157, 41.9317893922));
		segmentList.add(new SegmentModel("921", -87.62465, 41.88447407,
				-87.624605, 41.875777));
		segmentList.add(new SegmentModel("549", -87.7111548786, 41.8521395327,
				-87.7150028281, 41.8517758038));
		segmentList.add(new SegmentModel("1153", -87.8071497455, 41.9538138239,
				-87.8069823878, 41.9683436725));
		segmentList.add(new SegmentModel("22", -87.720941896, 41.7131708566,
				-87.7212281119, 41.7205351178999));
		segmentList.add(new SegmentModel("94", -87.728279105, 41.96824521,
				-87.7280405527, 41.9596167084));
		segmentList.add(new SegmentModel("135", -87.6634347632, 41.7430778317,
				-87.6632483146, 41.7357908525));
		segmentList.add(new SegmentModel("479", -87.6521384352, 41.692109631,
				-87.6423663045, 41.6922327334));
		segmentList.add(new SegmentModel("531", -87.7394692786, 41.851235056,
				-87.7345102484, 41.8513081643));
		segmentList.add(new SegmentModel("417", -87.7118878282, 41.7498206443,
				-87.7218815259, 41.7496709256));
		segmentList.add(new SegmentModel("1228", -87.64857, 41.925454,
				-87.64882, 41.932719));
		segmentList.add(new SegmentModel("694", -87.6159748727, 41.8021096226,
				-87.6163943054, 41.8093848774));
		segmentList.add(new SegmentModel("884", -87.6265992962, 41.9129419995,
				-87.6319113969, 41.9133832339));
		segmentList.add(new SegmentModel("899", -87.62343743, 41.84564219,
				-87.62360876, 41.85285485));
		segmentList.add(new SegmentModel("314", -87.6787529076, 41.9542941404,
				-87.6884648539, 41.9541499435));
		segmentList.add(new SegmentModel("133", -87.6630347385, 41.7284832358,
				-87.6628665545, 41.7212162434));
		segmentList.add(new SegmentModel("1231", -87.649296, 41.947316,
				-87.649509, 41.954562));
		segmentList.add(new SegmentModel("1215", -87.645915, 41.83075,
				-87.646086, 41.838046));
		segmentList.add(new SegmentModel("690", -87.615233728, 41.7729467839,
				-87.6154529143, 41.7801815775));
		segmentList.add(new SegmentModel("922", -87.624359, 41.892571,
				-87.62465, 41.88447407));
		segmentList.add(new SegmentModel("774", -87.7506684369, 41.990023298,
				-87.7483271581, 41.9897623135));
		segmentList.add(new SegmentModel("494", -87.772082715, 41.7940678353,
				-87.7624030192, 41.7955741737));
		segmentList.add(new SegmentModel("1307", -87.630774, 41.874521,
				-87.630536, 41.867374));
		segmentList.add(new SegmentModel("1294", -87.627518, 41.875639,
				-87.627876, 41.886813));
		segmentList.add(new SegmentModel("1214", -87.645736, 41.823458,
				-87.645915, 41.83075));
		segmentList.add(new SegmentModel("514", -87.71403459, 41.80803564,
				-87.72348218, 41.80245859));
		segmentList.add(new SegmentModel("770", -87.8068210943, 41.9452629688,
				-87.8071055817, 41.9538790793));
		segmentList.add(new SegmentModel("525", -87.7668773678, 41.997302901,
				-87.7643967598, 41.9961393528));
		segmentList.add(new SegmentModel("300", -87.8170647549, 41.9526813472,
				-87.8269761925, 41.9523833109));
		segmentList.add(new SegmentModel("195", -87.6482730398, 41.9107824177,
				-87.6331523771, 41.9110250802));
		segmentList.add(new SegmentModel("634", -87.7424812354, 41.7784116409,
				-87.7422329321, 41.7711273217));
		segmentList.add(new SegmentModel("1213", -87.645535, 41.816184,
				-87.645736, 41.823458));
		segmentList.add(new SegmentModel("1027", -87.6354447124, 41.8867180602,
				-87.6324858898, 41.8867920358));
		segmentList.add(new SegmentModel("363", -87.6882824308, 41.9540117081,
				-87.6884991671, 41.9613118159));
		segmentList.add(new SegmentModel("840", -87.8069118722, 41.9379889583,
				-87.8066529833, 41.9308138672));
		segmentList.add(new SegmentModel("534", -87.715005482, 41.8515013919,
				-87.711157538, 41.8518651209));
		segmentList.add(new SegmentModel("184", -87.7214579641, 41.7347180742,
				-87.7119953299, 41.7348842334));
		segmentList.add(new SegmentModel("780", -87.6994001534, 41.9903007523,
				-87.6896938259, 41.9903835167));
		segmentList.add(new SegmentModel("53", -87.7274333564, 41.9536468185,
				-87.7276617396, 41.9596128313));
		segmentList.add(new SegmentModel("57", -87.7283177717, 41.9828305605,
				-87.7283177717, 41.988652019));
		segmentList.add(new SegmentModel("985", -87.5597578004, 41.700977697,
				-87.559645328, 41.6919421101));
		segmentList.add(new SegmentModel("1038", -87.6245761907, 41.8883032777,
				-87.627973493, 41.8869508682));
		segmentList.add(new SegmentModel("547", -87.7248539636, 41.8517295572,
				-87.7345076889, 41.8515825772));
		segmentList.add(new SegmentModel("652", -87.7474859561, 41.9534216145,
				-87.7472367862, 41.9461208905));
		segmentList.add(new SegmentModel("1291", -87.655452, 41.896167,
				-87.647745, 41.896297));
		segmentList.add(new SegmentModel("171", -87.7136045062, 41.7934149656,
				-87.7231576487, 41.7933416014));
		segmentList.add(new SegmentModel("59", -87.7208769338, 41.6985650226,
				-87.7205328337, 41.6912715426));
		segmentList.add(new SegmentModel("402", -87.6884415055, 41.9467318416,
				-87.6883485854, 41.9394618483));
		segmentList.add(new SegmentModel("473", -87.5753648927, 41.7226422935,
				-87.5851058414, 41.7224793067));
		segmentList.add(new SegmentModel("517", -87.68489325, 41.82615333,
				-87.69448283, 41.82013776));
		segmentList.add(new SegmentModel("375", -87.6830303802, 41.7501038593,
				-87.6828624247, 41.7428167477));
		segmentList.add(new SegmentModel("304", -87.7767736096, 41.9531933493,
				-87.7865583352, 41.9530537114));
		segmentList.add(new SegmentModel("680", -87.6442914709, 41.8818287714,
				-87.6440417428, 41.874374782));
		segmentList.add(new SegmentModel("216", -87.7447639101, 41.8658134419,
				-87.7349660246, 41.8658956887));
		segmentList.add(new SegmentModel("530", -87.75093868, 41.99028834,
				-87.764172, 41.996247));
		segmentList.add(new SegmentModel("577", -87.7458024865, 41.9023415361,
				-87.7459028831, 41.9096276932));
		segmentList.add(new SegmentModel("27", -87.7217311602, 41.7495695299,
				-87.7223094048, 41.7640992823));
		segmentList.add(new SegmentModel("591", -87.61390637, 41.8918983,
				-87.61952598, 41.90097877));
		segmentList.add(new SegmentModel("1051", -87.664672601, 41.8826899771,
				-87.6566669933, 41.8829113042));
		segmentList.add(new SegmentModel("262", -87.6048243845, 41.7365122036,
				-87.5856381753, 41.7367762597));
		segmentList.add(new SegmentModel("114", -87.6658407141, 41.8523299896,
				-87.6659546034, 41.8577926807));
		segmentList.add(new SegmentModel("153", -87.6673262617, 41.8909784616,
				-87.6670550027, 41.8833000413));
		segmentList.add(new SegmentModel("1134", -87.7449852043, 41.8659627382,
				-87.7444337191, 41.8512451897));
		segmentList.add(new SegmentModel("592", -87.6195259779, 41.9009787676,
				-87.6242873281, 41.9039960653));
		segmentList.add(new SegmentModel("607", -87.5952757493, 41.8169491631,
				-87.5889841751, 41.8109450575));
		segmentList.add(new SegmentModel("930", -87.6883646017, 41.9175685137,
				-87.7002228515, 41.9247896604));
		segmentList.add(new SegmentModel("1206", -87.644221, 41.765201,
				-87.644407, 41.772472));
		segmentList.add(new SegmentModel("937", -87.700590308, 41.9247916859,
				-87.6887320123, 41.9175705769));
		segmentList.add(new SegmentModel("416", -87.7218815259, 41.7496709256,
				-87.7316040523, 41.7494782498));
		segmentList.add(new SegmentModel("596", -87.6318545747, 41.9334256266,
				-87.6382223471, 41.9403841461));
		segmentList.add(new SegmentModel("221", -87.6959088534, 41.8663734623,
				-87.6860397975, 41.8664753382));
		segmentList.add(new SegmentModel("645", -87.746169799, 41.9023434231,
				-87.7459957206, 41.8949874728));
		segmentList.add(new SegmentModel("398", -87.6878256352, 41.9249017152,
				-87.6875724135, 41.9168064565));
		segmentList.add(new SegmentModel("118", -87.6666877975, 41.8832979102,
				-87.6669590125, 41.8909763311));
		segmentList.add(new SegmentModel("608", -87.6005593398, 41.8252995274,
				-87.5950563226, 41.8169377172));
		segmentList.add(new SegmentModel("752", -87.5350924196, 41.71281167,
				-87.5350520018, 41.7213261115));
		segmentList.add(new SegmentModel("345", -87.6846933402, 41.8229949942,
				-87.6847191026, 41.8259368847));
		segmentList.add(new SegmentModel("839", -87.8066529833, 41.9308138672,
				-87.8064286323, 41.9239935733));
		segmentList.add(new SegmentModel("186", -87.7362643899, 41.9096183569,
				-87.7263320051, 41.9097494848));
		segmentList.add(new SegmentModel("673", -87.8367650119, 41.9842206477,
				-87.8368335094, 41.9666029184));
		segmentList.add(new SegmentModel("791", -87.6721450666, 41.9909172373,
				-87.6798577685, 41.9908246255));
		segmentList.add(new SegmentModel("1218", -87.646305, 41.852646,
				-87.646517, 41.859912));
		segmentList.add(new SegmentModel("943", -87.7609588782, 41.9678453326,
				-87.7546730264, 41.960634303));
		segmentList.add(new SegmentModel("653", -87.7477582908, 41.9622573117,
				-87.7474859561, 41.9534216145));
		segmentList.add(new SegmentModel("344", -87.6844449706, 41.8156948926,
				-87.6846933402, 41.8229949942));
		segmentList.add(new SegmentModel("142", -87.6649598466, 41.8013192816,
				-87.6647651619, 41.7940254304));
		segmentList.add(new SegmentModel("276", -87.6048212832, 41.7367866148,
				-87.6145264307, 41.7366402331));
		segmentList.add(new SegmentModel("1173", -87.618270448, 41.6591062937,
				-87.6174865167, 41.663379309));
		segmentList.add(new SegmentModel("1056", -87.6206419402, 41.8846520046,
				-87.6244501884, 41.8846086464));
		segmentList.add(new SegmentModel("1308", -87.639487, 41.874238,
				-87.627611, 41.874452));
		segmentList.add(new SegmentModel("559", -87.6194481677, 41.8530504929,
				-87.623818, 41.852991));
		segmentList.add(new SegmentModel("63", -87.721966073, 41.7279279345,
				-87.7215908065, 41.7205390182));
		segmentList.add(new SegmentModel("115", -87.6659546034, 41.8577926807,
				-87.6661999959, 41.8668604234));
		segmentList.add(new SegmentModel("718", -87.6176590907, 41.8456997096,
				-87.6174700788, 41.8384234955));
		segmentList.add(new SegmentModel("699", -87.6171031194, 41.8384212078,
				-87.6172921227, 41.8456974224));
		segmentList.add(new SegmentModel("656", -87.6276307364, 41.8754846848,
				-87.6242548163, 41.8755994887));
		segmentList.add(new SegmentModel("1224", -87.647555, 41.896397,
				-87.647904, 41.903636));
		segmentList.add(new SegmentModel("458", -87.5947345466, 41.722002538,
				-87.5851090249, 41.722204896));
		segmentList.add(new SegmentModel("243", -87.6304336988, 41.86751119,
				-87.6421863761, 41.8673568658));
		segmentList.add(new SegmentModel("46", -87.7261192748, 41.9026704832,
				-87.7262570347, 41.9061550576));
		segmentList.add(new SegmentModel("851", -87.7964600566, 41.9787314076,
				-87.787859013, 41.9761210286));
		segmentList.add(new SegmentModel("578", -87.5886173859, 41.8109426802,
				-87.5949089327, 41.8169468056));
		segmentList.add(new SegmentModel("1261", -87.648463, 41.91092,
				-87.648284, 41.903636));
		segmentList.add(new SegmentModel("597", -87.6382223471, 41.9403841461,
				-87.643175157, 41.9486486075));
		segmentList.add(new SegmentModel("31", -87.722778136, 41.7859356046,
				-87.7230445278, 41.7932034198));
		segmentList.add(new SegmentModel("521", -87.63481317, 41.85300225,
				-87.64651959, 41.84732087));
		segmentList.add(new SegmentModel("1118", -87.6811537636, 41.6919163675,
				-87.7008263623, 41.6917049977));
		segmentList.add(new SegmentModel("1232", -87.642797, 41.69964,
				-87.642567, 41.692355));
		segmentList.add(new SegmentModel("1272", -87.657142, 41.881515,
				-87.647361, 41.881676));
		segmentList.add(new SegmentModel("333", -87.6823308541, 41.7355262471,
				-87.6824960199, 41.7428146728));
		segmentList.add(new SegmentModel("847", -87.8068883617, 42.0044664214,
				-87.8069809576, 41.9977761215));
		segmentList.add(new SegmentModel("526", -87.7643967598, 41.9961393528,
				-87.751306501, 41.9902902084));
		segmentList.add(new SegmentModel("191", -87.6872220807, 41.9101836642,
				-87.6775874547, 41.9103355405));
		segmentList.add(new SegmentModel("688", -87.6148962271, 41.7584029267,
				-87.6151145145, 41.7657125565));
		segmentList.add(new SegmentModel("288", -87.7380652196, 41.9533921986,
				-87.727618462, 41.9535105845));
		segmentList.add(new SegmentModel("954", -87.637047557, 41.8923816602,
				-87.6325726363, 41.8924145112));
		segmentList.add(new SegmentModel("986", -87.5598487355, 41.7081692089,
				-87.5597578004, 41.700977697));
		segmentList.add(new SegmentModel("72", -87.7236744304, 41.8023203612,
				-87.7234089919, 41.793207314));
		segmentList.add(new SegmentModel("1260", -87.648284, 41.903636,
				-87.647935, 41.896397));
		segmentList.add(new SegmentModel("765", -87.8055690991, 41.9088375317,
				-87.8058078034, 41.9161689398));
		segmentList.add(new SegmentModel("1182", -87.6599416534, 41.9854613518,
				-87.6601728465, 41.9982075605));
		segmentList.add(new SegmentModel("1242", -87.644787, 41.772472,
				-87.644601, 41.765201));
		segmentList.add(new SegmentModel("880", -87.6330996716, 41.9038840385,
				-87.6329021476, 41.8966141219));
		segmentList.add(new SegmentModel("181", -87.6159795443, 41.7949380152,
				-87.6256995376, 41.7947803916));
		segmentList.add(new SegmentModel("319", -87.6445615662, 41.9547947184,
				-87.6496983683, 41.9546984352));
		segmentList.add(new SegmentModel("587", -87.6173044795, 41.8809165183,
				-87.6138613722, 41.8843876871));
		segmentList.add(new SegmentModel("36", -87.7238669791, 41.8229897759,
				-87.7242987603, 41.8368812942));
		segmentList.add(new SegmentModel("687", -87.6148109218, 41.7511190099,
				-87.6148962271, 41.7584029267));
		segmentList.add(new SegmentModel("453", -87.6536930095, 41.7505891635,
				-87.6634686872, 41.7505652402));
		segmentList.add(new SegmentModel("1059", -87.6474313736, 41.8844304739,
				-87.6567189866, 41.8842675466));
		segmentList.add(new SegmentModel("790", -87.6798577685, 41.9908246255,
				-87.6896910614, 41.9906579206));
		segmentList.add(new SegmentModel("234", -87.7154194668, 41.8664270139,
				-87.7251691897, 41.8663093356));
		segmentList.add(new SegmentModel("480", -87.6423662972, 41.6922327333,
				-87.6329245691, 41.6923240264));
		segmentList.add(new SegmentModel("327", -87.6809720935, 41.6917781183,
				-87.6812046376, 41.6990779218));
		segmentList.add(new SegmentModel("283", -87.7865606805, 41.9527793008,
				-87.7767759969, 41.9529189391));
		segmentList.add(new SegmentModel("1", -87.7231602513, 41.7930671862,
				-87.7136071496, 41.793140551));
		segmentList.add(new SegmentModel("485", -87.6521355509, 41.6923840472,
				-87.663399, 41.6922994183));
		segmentList.add(new SegmentModel("97", -87.7288919771, 41.9901383429,
				-87.728684246, 41.9828344352));
		segmentList.add(new SegmentModel("552", -87.6856447314, 41.8522071469,
				-87.695431287, 41.852014774));
		segmentList.add(new SegmentModel("166", -87.6700000222, 41.9834769032,
				-87.6697976396, 41.976173197));
		segmentList.add(new SegmentModel("544", -87.623799, 41.852665046,
				-87.6194512191, 41.8527760863));
		segmentList.add(new SegmentModel("572", -87.7445766986, 41.8659068958,
				-87.7448074201, 41.8731382595));
		segmentList.add(new SegmentModel("1172", -87.8073823878, 41.9683436725,
				-87.8075497455, 41.9538138239));
		segmentList.add(new SegmentModel("1203", -87.643641, 41.743359,
				-87.643853, 41.750643));
		segmentList.add(new SegmentModel("622", -87.6261484121, 41.9113324426,
				-87.6246546523, 41.9039983328));
		segmentList.add(new SegmentModel("145", -87.6654916893, 41.8231529963,
				-87.6653316028, 41.8158718637));
		segmentList.add(new SegmentModel("428", -87.6432247623, 41.7213210669,
				-87.628638933, 41.7215727836));
		segmentList.add(new SegmentModel("162", -87.6692326667, 41.9542914171,
				-87.6690419162, 41.9469911788));
		segmentList.add(new SegmentModel("272", -87.6533387061, 41.7360725783,
				-87.6630637062, 41.7359269914));
		segmentList.add(new SegmentModel("205", -87.706959124, 41.9102525328,
				-87.7166993605, 41.9101313576));
		segmentList.add(new SegmentModel("888", -87.5813917503, 41.8027381099,
				-87.5889190144, 41.8107917244));
		segmentList.add(new SegmentModel("1217", -87.646297, 41.847196,
				-87.646305, 41.852646));
		segmentList.add(new SegmentModel("425", -87.6727283985, 41.7208895929,
				-87.6626346092, 41.7210579504));
		segmentList.add(new SegmentModel("708", -87.6156002918, 41.7729490745,
				-87.6154810444, 41.7657148473));
		segmentList.add(new SegmentModel("24", -87.7215334269, 41.7279240361,
				-87.7213107758, 41.7348566529));
		segmentList.add(new SegmentModel("129", -87.6690743088, 41.9615905019,
				-87.6692552405, 41.9688759177));
		segmentList.add(new SegmentModel("1216", -87.646086, 41.838046,
				-87.646297, 41.847196));
		segmentList.add(new SegmentModel("256", -87.6727864295, 41.7355171745,
				-87.6630665594, 41.7356525768));
		segmentList.add(new SegmentModel("449", -87.6926364622, 41.7500402444,
				-87.7024134014, 41.7498503425));
		segmentList.add(new SegmentModel("974", -87.67507424, 41.82324972,
				-87.6849, 41.82317531));
		segmentList.add(new SegmentModel("75", -87.7243007082, 41.8229936666,
				-87.7241121224, 41.815198411));
		segmentList.add(new SegmentModel("271", -87.6630637062, 41.7359269914,
				-87.6727836177, 41.7357915897));
		segmentList.add(new SegmentModel("1292", -87.627318, 41.867413,
				-87.627518, 41.875639));
		segmentList.add(new SegmentModel("948", -87.8014390602, 42.0119685688,
				-87.7880742452, 41.9973530508));
		segmentList.add(new SegmentModel("493", -87.7817895727, 41.7922277907,
				-87.772082715, 41.7940678353));
		segmentList.add(new SegmentModel("313", -87.6884648539, 41.9541499435,
				-87.6982391845, 41.9541110923));
		segmentList.add(new SegmentModel("892", -87.6435427315, 41.9486508165,
				-87.6385898812, 41.9403863706));
		segmentList.add(new SegmentModel("838", -87.8064286323, 41.9239935733,
				-87.8061752063, 41.9161706271));
		segmentList.add(new SegmentModel("863", -87.6241289611, 41.890933613,
				-87.6202254172, 41.8910035937));
		segmentList.add(new SegmentModel("360", -87.6876989484, 41.9321780939,
				-87.6879810565, 41.9394597831));
		segmentList.add(new SegmentModel("569", -87.7428033166, 41.8003400449,
				-87.7429589865, 41.8076266165));
		segmentList.add(new SegmentModel("55", -87.727843711, 41.9682413338,
				-87.7281185167, 41.9755310394));
		segmentList.add(new SegmentModel("430", -87.6205342482, 41.721636209,
				-87.6140942229, 41.7217473));
		segmentList.add(new SegmentModel("700", -87.6172921227, 41.8456974224,
				-87.618133536, 41.8493386937));
		segmentList.add(new SegmentModel("537", -87.6954340282, 41.8517403632,
				-87.6856474998, 41.8519327365));
		segmentList.add(new SegmentModel("87", -87.726581748, 41.9098896012,
				-87.7266587113, 41.9061589395));
		segmentList.add(new SegmentModel("192", -87.6775874547, 41.9103355405,
				-87.6676930451, 41.9104930855));
		segmentList.add(new SegmentModel("501", -87.7042605902, 41.8139891446,
				-87.6944855458, 41.8198633558));
		segmentList.add(new SegmentModel("157", -87.6682766764, 41.9185478323,
				-87.6678753006, 41.9106313534));
		segmentList.add(new SegmentModel("136", -87.663620583, 41.7503581457,
				-87.6634347632, 41.7430778317));
		segmentList.add(new SegmentModel("322", -87.7849651041, 41.9089744604,
				-87.7756166957, 41.9091254301));
		segmentList.add(new SegmentModel("1089", -87.6176602275, 41.6635560289,
				-87.6413654096, 41.6634679215));
		segmentList.add(new SegmentModel("1235", -87.643402, 41.721458,
				-87.643194, 41.714215));
		segmentList.add(new SegmentModel("1225", -87.647904, 41.903636,
				-87.648083, 41.91092));
		segmentList.add(new SegmentModel("248", -87.77206742, 41.79240528,
				-87.76223503, 41.79240528));
		segmentList.add(new SegmentModel("873", -87.6325348871, 41.8966118812,
				-87.6327323363, 41.9038817979));
		segmentList.add(new SegmentModel("913", -87.62410876, 41.85285485,
				-87.62390743, 41.84564219));
		segmentList.add(new SegmentModel("10", -87.6311283131, 41.7943974487,
				-87.625702556, 41.7945059819));
		segmentList.add(new SegmentModel("598", -87.643175157, 41.9486486075,
				-87.6445812375, 41.9546565256));
		segmentList.add(new SegmentModel("200", -87.7557943854, 41.9096384783,
				-87.7657229523, 41.9095159354));
		segmentList.add(new SegmentModel("383", -87.684608746, 41.8084267863,
				-87.6844074011, 41.8011472177));
		segmentList.add(new SegmentModel("835", -87.8017113077, 41.7919400348,
				-87.801399484, 41.7846892828));
		segmentList.add(new SegmentModel("1245", -87.64535, 41.794301,
				-87.64516, 41.787025));
		segmentList.add(new SegmentModel("842", -87.8074731902, 41.9538807636,
				-87.8071886569, 41.9452646537));
		segmentList.add(new SegmentModel("824", -87.7543053641, 41.9606324493,
				-87.7605911887, 41.9678434988));
		segmentList.add(new SegmentModel("798", -87.5850694771, 41.7296111731,
				-87.5852385693, 41.7369134537));
		segmentList.add(new SegmentModel("38", -87.7243697591, 41.8442541875,
				-87.7246442132, 41.8515455888));
		segmentList.add(new SegmentModel("1300", -87.647241, 41.877947,
				-87.636914, 41.878077));
		segmentList.add(new SegmentModel("378", -87.6836275216, 41.7719786518,
				-87.6834259477, 41.76470325));
		segmentList.add(new SegmentModel("405", -87.689090429, 41.9686159566,
				-87.6888668215, 41.9613138803));
		segmentList.add(new SegmentModel("1211", -87.645156, 41.801585,
				-87.645349, 41.808864));
		segmentList.add(new SegmentModel("155", -87.6676967823, 41.904018258,
				-87.6674751541, 41.8960747044));
		segmentList.add(new SegmentModel("456", -87.6140942229, 41.7217473,
				-87.6045043683, 41.7219515062));
		segmentList.add(new SegmentModel("911", -87.623997, 41.892571,
				-87.62393627, 41.90082865));
		segmentList.add(new SegmentModel("440", -87.7316066149, 41.7492038321,
				-87.72188413, 41.7493965084));
		segmentList.add(new SegmentModel("1302", -87.627565, 41.872992,
				-87.617312, 41.873156));
		segmentList.add(new SegmentModel("1288", -87.632709, 41.896714,
				-87.647745, 41.896497));
		segmentList.add(new SegmentModel("1246", -87.645536, 41.801585,
				-87.64535, 41.794301));
		segmentList.add(new SegmentModel("208", -87.6775846462, 41.9106099476,
				-87.6872193134, 41.9104580718));
		segmentList.add(new SegmentModel("209", -87.6676901941, 41.9107674921,
				-87.6775846462, 41.9106099476));
		segmentList.add(new SegmentModel("625", -87.7460848509, 41.9242304183,
				-87.7464081568, 41.9315315648));
		segmentList.add(new SegmentModel("904", -87.62392868, 41.86745208,
				-87.624123, 41.875777));
		segmentList.add(new SegmentModel("64", -87.7216776788, 41.7348605537,
				-87.721966073, 41.7279279345));
		segmentList.add(new SegmentModel("803", -87.5859156196, 41.7660854419,
				-87.5860344826, 41.7733498484));
		segmentList.add(new SegmentModel("650", -87.7470620151, 41.9388205094,
				-87.7467756515, 41.9315334345));
		segmentList.add(new SegmentModel("955", -87.6325726363, 41.8924145112,
				-87.6280709409, 41.8924469959));
		segmentList.add(new SegmentModel("573", -87.7448074201, 41.8731382595,
				-87.7450741768, 41.8804946946));
		segmentList.add(new SegmentModel("758", -87.6241461501, 41.8917303986,
				-87.62806696, 41.8917151045));
		segmentList.add(new SegmentModel("67", -87.7226046555, 41.7641031795,
				-87.7221640524, 41.7495734287));
		segmentList.add(new SegmentModel("105", -87.6640374592, 41.7794635041,
				-87.6642111674, 41.7867457704));
		segmentList.add(new SegmentModel("826", -87.7675546457, 41.975654244,
				-87.774179251, 41.9829150282));
		segmentList.add(new SegmentModel("4", -87.693799302, 41.7935536023,
				-87.6840431555, 41.7937393759));
		segmentList.add(new SegmentModel("966", -87.6849, 41.82297531,
				-87.67507424, 41.82304972));
		segmentList.add(new SegmentModel("203", -87.7263294053, 41.9100238945,
				-87.7362618327, 41.9098927671));
		segmentList.add(new SegmentModel("711", -87.6161578443, 41.7946778372,
				-87.6160043658, 41.7875182));
		segmentList.add(new SegmentModel("777", -87.7286566934, 41.9900311655,
				-87.7188702116, 41.9901159749));
		segmentList.add(new SegmentModel("841", -87.8071886569, 41.9452646537,
				-87.8069118722, 41.9379889583));
		segmentList.add(new SegmentModel("140", -87.6645778209, 41.7867479054,
				-87.6644040713, 41.7794656394));
		segmentList.add(new SegmentModel("355", -87.686843103, 41.9030150932,
				-87.6870370163, 41.9103198343));
		segmentList.add(new SegmentModel("293", -87.6884676201, 41.9538755379,
				-87.6787557154, 41.9540197354));
		segmentList.add(new SegmentModel("1301", -87.636914, 41.878077,
				-87.624306, 41.87828));
		segmentList.add(new SegmentModel("350", -87.6858548579, 41.8666115084,
				-87.6860859175, 41.8760825857));
		segmentList.add(new SegmentModel("330", -87.6816602454, 41.713672748,
				-87.6818720444, 41.7209382823));
		segmentList.add(new SegmentModel("78", -87.7250091595, 41.8515494772,
				-87.7248037311, 41.8442580766));
		segmentList.add(new SegmentModel("636", -87.7421614891, 41.7930370853,
				-87.7415926253, 41.784318968));
		segmentList.add(new SegmentModel("227", -87.6421893317, 41.8670824586,
				-87.6304367047, 41.8672367835));
		segmentList.add(new SegmentModel("420", -87.6149102436, 41.7512885566,
				-87.6245246027, 41.7511042672));
		segmentList.add(new SegmentModel("757", -87.62806696, 41.8917151045,
				-87.6325878656, 41.8916126007));
		segmentList.add(new SegmentModel("781", -87.6896938259, 41.9903835167,
				-87.6798605752, 41.9905502221));
		segmentList.add(new SegmentModel("307", -87.7473036159, 41.9535555813,
				-87.7571464847, 41.9534369276));
		segmentList.add(new SegmentModel("571", -87.7431516294, 41.8149300238,
				-87.7433645658, 41.8220475654));
		segmentList.add(new SegmentModel("422", -87.595412204, 41.7514496528,
				-87.6051881522, 41.7513900229));
		segmentList.add(new SegmentModel("1276", -87.620301, 41.867512,
				-87.620488, 41.875774));
		segmentList.add(new SegmentModel("441", -87.72188413, 41.7493965084,
				-87.7118904749, 41.7495462277));
		segmentList.add(new SegmentModel("235", -87.7056678592, 41.8665425122,
				-87.7154194668, 41.8664270139));
		segmentList.add(new SegmentModel("1081", -87.6413683477, 41.6631935046,
				-87.6176632662, 41.6632816133));
		segmentList.add(new SegmentModel("394", -87.6870262366, 41.8957442792,
				-87.6868781339, 41.8906490928));
		segmentList.add(new SegmentModel("1198", -87.642643, 41.706916,
				-87.642814, 41.714215));
		segmentList.add(new SegmentModel("247", -87.7818067839, 41.7922117726,
				-87.77206742, 41.7924052792));
		segmentList.add(new SegmentModel("861", -87.6325588172, 41.890802544,
				-87.6280379804, 41.8908659481));
		segmentList.add(new SegmentModel("1205", -87.643993, 41.756089,
				-87.644221, 41.765201));
		segmentList.add(new SegmentModel("1234", -87.643194, 41.714215,
				-87.643023, 41.706916));
		segmentList.add(new SegmentModel("1052", -87.6566669933, 41.8829113042,
				-87.647404773, 41.883031561));
		segmentList.add(new SegmentModel("43", -87.7255232056, 41.8819364677,
				-87.7256546637, 41.8854658549));
		segmentList.add(new SegmentModel("490", -87.5988095261, 41.6926493901,
				-87.6098539827, 41.6929008891));
		segmentList.add(new SegmentModel("236", -87.6959061275, 41.8666478725,
				-87.7056678592, 41.8665425122));
		segmentList.add(new SegmentModel("340", -87.6836472764, 41.786527685,
				-87.6838584229, 41.793875546));
		segmentList.add(new SegmentModel("939", -87.7241340948, 41.9391425051,
				-87.7124336581, 41.9319531692));
		segmentList.add(new SegmentModel("486", -87.6423633676, 41.6925071489,
				-87.6521355509, 41.6923840472));
		segmentList.add(new SegmentModel("1105", -87.7394907937, 41.8515161194,
				-87.7442663916, 41.8514803382));
		segmentList.add(new SegmentModel("491", -87.6704846195, 41.6917909971,
				-87.663346, 41.692013));
		segmentList.add(new SegmentModel("120", -87.6671078757, 41.8960725742,
				-87.6673294583, 41.9040161282));
		segmentList.add(new SegmentModel("864", -87.6202254172, 41.8910035937,
				-87.6142290945, 41.8911049219));
		segmentList.add(new SegmentModel("704", -87.6149257801, 41.7438113955,
				-87.6146742766, 41.7365015302));
		segmentList.add(new SegmentModel("822", -87.5593916356, 41.7009752315,
				-87.5594825555, 41.7081667435));
		segmentList.add(new SegmentModel("489", -87.6098539827, 41.6929008891,
				-87.6210363283, 41.6927563144));
		segmentList.add(new SegmentModel("122", -87.6675079387, 41.9106292239,
				-87.6679092691, 41.9185457037));
		segmentList.add(new SegmentModel("382", -87.6844074011, 41.8011472177,
				-87.6842251186, 41.7938776185));
		segmentList.add(new SegmentModel("364", -87.6884991671, 41.9613118159,
				-87.6887227326, 41.9686138926));
		segmentList.add(new SegmentModel("581", -87.6081678831, 41.838571746,
				-87.6124560681, 41.848976339));
		segmentList.add(new SegmentModel("806", -87.5864754787, 41.7878796071,
				-87.5865342813, 41.7915685714));
		segmentList.add(new SegmentModel("169", -87.7329622535, 41.7932531887,
				-87.7419834738, 41.7931681777));
		segmentList.add(new SegmentModel("1298", -87.632157, 41.878134,
				-87.632384, 41.886928));
		segmentList.add(new SegmentModel("813", -87.5862821566, 41.7660878258,
				-87.5861128958, 41.7587855819));
		segmentList.add(new SegmentModel("778", -87.7188702116, 41.9901159749,
				-87.7111114564, 41.9902451513));
		segmentList.add(new SegmentModel("278", -87.5688698936, 41.7372907245,
				-87.5856349924, 41.7370506698));
		segmentList.add(new SegmentModel("506", -87.6465225077, 41.8470464552,
				-87.6348161557, 41.8527278475));
		segmentList.add(new SegmentModel("926", -87.6441331477, 41.8890200552,
				-87.6551983919, 41.8962333529));
		segmentList.add(new SegmentModel("139", -87.6644040713, 41.7794656394,
				-87.6642044154, 41.7721930844));
		segmentList.add(new SegmentModel("579", -87.5946895061, 41.816935359,
				-87.6001924641, 41.8252971863));
		segmentList.add(new SegmentModel("280", -87.8170669694, 41.9524069352,
				-87.8072619385, 41.9526256799));
		segmentList.add(new SegmentModel("793", -87.662406509, 41.9849056913,
				-87.6535201163, 41.9852595517));
		segmentList.add(new SegmentModel("266", -87.711992685, 41.7351586508,
				-87.7214553595, 41.734992492));
		segmentList.add(new SegmentModel("660", -87.624251783, 41.8758738945,
				-87.6276277176, 41.8757590907));
		segmentList.add(new SegmentModel("1222", -87.647171, 41.881776,
				-87.647427, 41.891185));
		segmentList.add(new SegmentModel("397", -87.6875724135, 41.9168064565,
				-87.6874043778, 41.9103219014));
		segmentList.add(new SegmentModel("369", -87.6818034645, 41.7063773615,
				-87.681570794, 41.699079999));
		segmentList.add(new SegmentModel("629", -87.7471183356, 41.9534197462,
				-87.7473906234, 41.9622554221));
		segmentList.add(new SegmentModel("811", -87.5859432626, 41.7515208628,
				-87.585774091, 41.7442186009));
		segmentList.add(new SegmentModel("1061", -87.6633319571, 41.8842641098,
				-87.6648232007, 41.8831805916));
		segmentList.add(new SegmentModel("1287", -87.632709, 41.896514,
				-87.624241, 41.896635));
		segmentList.add(new SegmentModel("1040", -87.61402527, 41.88763704,
				-87.62457619, 41.88830328));
		segmentList.add(new SegmentModel("548", -87.7150028281, 41.8517758038,
				-87.7248539636, 41.8517295572));
		segmentList.add(new SegmentModel("1248", -87.645915, 41.816184,
				-87.645729, 41.808864));
		segmentList.add(new SegmentModel("689", -87.6151145145, 41.7657125565,
				-87.615233728, 41.7729467839));
		segmentList.add(new SegmentModel("1257", -87.647551, 41.881776,
				-87.647315, 41.874338));
		segmentList.add(new SegmentModel("108", -87.6645931099, 41.8013171472,
				-87.6647891274, 41.8086033737));
		segmentList.add(new SegmentModel("1280", -87.620542, 41.884414,
				-87.620124, 41.891002));
		segmentList.add(new SegmentModel("805", -87.5862545245, 41.7806524044,
				-87.5864754787, 41.7878796071));
		segmentList.add(new SegmentModel("51", -87.726794963, 41.9317893922,
				-87.7271516758, 41.9411668426));
		segmentList.add(new SegmentModel("815", -87.5866211188, 41.7806547878,
				-87.5864010353, 41.7733522321));
		segmentList.add(new SegmentModel("903", -87.62377822, 41.860205,
				-87.62392868, 41.86745208));
		segmentList.add(new SegmentModel("1188", -87.6695265292, 41.9867518859,
				-87.6697997674, 41.9896973587));
		segmentList.add(new SegmentModel("15", -87.76223503, 41.7928797,
				-87.77206503, 41.7926797));
		segmentList.add(new SegmentModel("970", -87.63050842, 41.82371453,
				-87.62644842, 41.82381853));
		segmentList.add(new SegmentModel("119", -87.6669590125, 41.8909763311,
				-87.6671078757, 41.8960725742));
		segmentList.add(new SegmentModel("349", -87.685797, 41.857496,
				-87.6858548579, 41.8666115084));
		segmentList.add(new SegmentModel("786", -87.7188675725, 41.9903903804,
				-87.7286540964, 41.9903055715));
		segmentList.add(new SegmentModel("451", -87.6730824357, 41.750417551,
				-87.6827512753, 41.7501880334));
		segmentList.add(new SegmentModel("464", -87.6626317556, 41.7213323658,
				-87.6727255878, 41.7211640089));
		segmentList.add(new SegmentModel("74", -87.7241121224, 41.815198411,
				-87.7238367819, 41.8078865428));
		segmentList.add(new SegmentModel("802", -87.585746426, 41.7587831979,
				-87.5859156196, 41.7660854419));
		segmentList.add(new SegmentModel("1210", -87.64497, 41.794301,
				-87.645156, 41.801585));
		segmentList.add(new SegmentModel("828", -87.8068343518, 41.9754664535,
				-87.8067554164, 41.9827767713));
		segmentList.add(new SegmentModel("1221", -87.646935, 41.874338,
				-87.647171, 41.881776));
		segmentList.add(new SegmentModel("412", -87.6149133035, 41.7510141454,
				-87.6051912535, 41.7511156124));
		segmentList.add(new SegmentModel("821", -87.5592792181, 41.6919396448,
				-87.5593916356, 41.7009752315));
		segmentList.add(new SegmentModel("1226", -87.648083, 41.91092,
				-87.648318, 41.91818));
		segmentList.add(new SegmentModel("323", -87.7756166957, 41.9091254301,
				-87.7657253832, 41.9092415237));
		segmentList.add(new SegmentModel("566", -87.7421146239, 41.7784097411,
				-87.7412259766, 41.7843170707));
		segmentList.add(new SegmentModel("1238", -87.644021, 41.743359,
				-87.643756, 41.736073));
		segmentList.add(new SegmentModel("980", -87.60689442, 41.82407853,
				-87.61699842, 41.82407853));
		segmentList.add(new SegmentModel("644", -87.7459957206, 41.8949874728,
				-87.7457075823, 41.8879223958));
		segmentList.add(new SegmentModel("641", -87.7451745689, 41.8731401541,
				-87.7449438098, 41.8659087662));
		segmentList.add(new SegmentModel("877", -87.6315440404, 41.9132509892,
				-87.6268319095, 41.9128509892));
		segmentList.add(new SegmentModel("1295", -87.628076, 41.886813,
				-87.627718, 41.875639));
		segmentList.add(new SegmentModel("1189", -87.6701675838, 41.9896994841,
				-87.66971, 41.987541));
		segmentList.add(new SegmentModel("771", -87.8069498272, 41.9682596163,
				-87.8068343518, 41.9754664535));
		segmentList.add(new SegmentModel("1249", -87.646116, 41.823458,
				-87.645915, 41.816184));
		segmentList.add(new SegmentModel("857", -87.7878566714, 41.9763954381,
				-87.7964577516, 41.9790058174));
		segmentList.add(new SegmentModel("477", -87.6811681063, 41.6916347471,
				-87.6705815418, 41.6917886141));
		segmentList.add(new SegmentModel("1305", -87.627611, 41.874652,
				-87.639487, 41.874538));
		segmentList.add(new SegmentModel("189", -87.7069618067, 41.909978124,
				-87.6970362251, 41.9100801383));
		segmentList.add(new SegmentModel("447", -87.6634715402, 41.7502908262,
				-87.6536959041, 41.7503147501));
		segmentList.add(new SegmentModel("237", -87.6860370294, 41.8667497479,
				-87.6959061275, 41.8666478725));
		segmentList.add(new SegmentModel("71", -87.7234089919, 41.793207314,
				-87.7232114423, 41.7859394995));
		segmentList.add(new SegmentModel("478", -87.663245, 41.6920250017,
				-87.6521384462, 41.692109631));
		segmentList.add(new SegmentModel("823", -87.5594825555, 41.7081667435,
				-87.5595922635, 41.7154042389));
		segmentList.add(new SegmentModel("337", -87.6830594183, 41.764701176,
				-87.6832609507, 41.7719765782));
		segmentList.add(new SegmentModel("1062", -87.6648232007, 41.8831805916,
				-87.6668699742, 41.8834361798));
		segmentList.add(new SegmentModel("647", -87.7462962254, 41.9169319883,
				-87.7462702262, 41.9096295855));
		segmentList.add(new SegmentModel("362", -87.6880739349, 41.9467297764,
				-87.6882824308, 41.9540117081));
		segmentList.add(new SegmentModel("594", -87.6257810568, 41.9113301795,
				-87.6310264345, 41.9260827378));
		segmentList.add(new SegmentModel("560", -87.623818, 41.852991,
				-87.6270517604, 41.8529986469));
		segmentList.add(new SegmentModel("931", -87.7808506377, 41.9901946296,
				-87.7877063878, 41.9973513029));
		segmentList.add(new SegmentModel("646", -87.7462702262, 41.9096295855,
				-87.746169799, 41.9023434231));
		segmentList.add(new SegmentModel("739", -87.72376658, 41.9391405545,
				-87.7354431617, 41.9462431643));
		segmentList.add(new SegmentModel("80", -87.7254211571, 41.8661750444,
				-87.7252056371, 41.858871241));
		segmentList.add(new SegmentModel("516", -87.69448283, 41.82013776,
				-87.7042579, 41.81426355));
		segmentList.add(new SegmentModel("28", -87.7221715979, 41.7640992823,
				-87.7224617677, 41.7713729793));
		segmentList.add(new SegmentModel("178", -87.6451588943, 41.7944390571,
				-87.6548728011, 41.7943090849));
		segmentList.add(new SegmentModel("37", -87.7241670914, 41.8368812942,
				-87.7244396463, 41.8442541875));
		segmentList.add(new SegmentModel("827", -87.774179251, 41.9829150282,
				-87.7808506377, 41.9901946296));
		segmentList.add(new SegmentModel("365", -87.6887227326, 41.9686138926,
				-87.6889668295, 41.97589051));
		segmentList.add(new SegmentModel("912", -87.62390743, 41.84564219,
				-87.62363669, 41.83834404));
		segmentList.add(new SegmentModel("197", -87.7849627555, 41.909248873,
				-87.7948024476, 41.9091729382));
		segmentList.add(new SegmentModel("101", -87.6630683582, 41.7430756949,
				-87.6632541367, 41.7503560091));
		segmentList.add(new SegmentModel("156", -87.6678753006, 41.9106313534,
				-87.6676967823, 41.904018258));
		segmentList.add(new SegmentModel("45", -87.7258968524, 41.8953666789,
				-87.7261884496, 41.9026704832));
		segmentList.add(new SegmentModel("328", -87.6812046376, 41.6990779218,
				-87.6814372666, 41.7063752847));
		segmentList.add(new SegmentModel("40", -87.724771498, 41.8588673534,
				-87.7250561494, 41.8661711575));
		segmentList.add(new SegmentModel("450", -87.6827512753, 41.7501880334,
				-87.6926364622, 41.7500402444));
		segmentList.add(new SegmentModel("1031", -87.62457922, 41.88802888,
				-87.61402835, 41.88736263));
		segmentList.add(new SegmentModel("773", -87.7471035018, 41.9534177331,
				-87.7543053641, 41.9606324493));
		segmentList.add(new SegmentModel("23", -87.7211582444, 41.7205351178999,
				-87.7216034956, 41.7279240361));
		segmentList.add(new SegmentModel("557", -87.6369249316, 41.8529600788,
				-87.646459951, 41.852819781));
		segmentList.add(new SegmentModel("854", -87.7675633518, 41.970196534,
				-87.7614792272, 41.968577405));
		segmentList.add(new SegmentModel("867", -87.6424565074, 41.8817855514,
				-87.6426207291, 41.8844837459));
		segmentList.add(new SegmentModel("853", -87.7782373882, 41.9730538829,
				-87.7675633518, 41.970196534));
		segmentList.add(new SegmentModel("1035", -87.635626816, 41.886856376,
				-87.637155382, 41.8857258051));
		segmentList.add(new SegmentModel("274", -87.624761, 41.736485,
				-87.6436255734, 41.7364152726));
		segmentList.add(new SegmentModel("1266", -87.649676, 41.947316,
				-87.649457, 41.939979));
		segmentList.add(new SegmentModel("1063", -87.6668699742, 41.8834361798,
				-87.6766889546, 41.8832841185));
		segmentList.add(new SegmentModel("1230", -87.649077, 41.939979,
				-87.649296, 41.947316));
		segmentList.add(new SegmentModel("670", -87.8364657943, 41.9666029184,
				-87.8363972163, 41.9842190562));
		segmentList.add(new SegmentModel("309", -87.7276158638, 41.9537849922,
				-87.7380626662, 41.9536666068));
		segmentList.add(new SegmentModel("5", -87.6840431555, 41.7937393759,
				-87.6743019717, 41.7937791103));
		segmentList.add(new SegmentModel("492", -87.663494, 41.692177,
				-87.6704818022, 41.6920654143));
		segmentList.add(new SegmentModel("1286", -87.624241, 41.896835,
				-87.632709, 41.896714));
		segmentList.add(new SegmentModel("125", -87.668210266, 41.932402477,
				-87.6684779112, 41.939695436));
		segmentList.add(new SegmentModel("1133", -87.7444337191, 41.8512451897,
				-87.7439318058, 41.8367473974));
		segmentList.add(new SegmentModel("705", -87.6151773651, 41.751121301,
				-87.6149257801, 41.7438113955));
		segmentList.add(new SegmentModel("1025", -87.6367064128, 41.8819140751,
				-87.6367881652, 41.8857235783));
		segmentList.add(new SegmentModel("1250", -87.646295, 41.83075,
				-87.646116, 41.823458));
		segmentList.add(new SegmentModel("353", -87.6865108851, 41.8906470248,
				-87.6866589587, 41.8957422115));
		segmentList.add(new SegmentModel("199", -87.7657229523, 41.9095159354,
				-87.7756143071, 41.9093998422));
		segmentList.add(new SegmentModel("217", -87.7349660246, 41.8658956887,
				-87.7251717904, 41.8660349238));
		segmentList.add(new SegmentModel("845", -87.8070638759, 41.98997995,
				-87.8071231837, 41.9827784576));
		segmentList.add(new SegmentModel("498", -87.733172525, 41.8000225514,
				-87.7234847773, 41.8021841928));
		segmentList.add(new SegmentModel("317", -87.654543283, 41.954625578,
				-87.6622485204, 41.9545153063));
		segmentList.add(new SegmentModel("604", -87.5793749691, 41.7952204517,
				-87.5804845631, 41.7924190294));
		segmentList.add(new SegmentModel("987", -87.5599585029, 41.7154067044,
				-87.5598487355, 41.7081692089));
		segmentList.add(new SegmentModel("384", -87.6848117907, 41.8156969641,
				-87.684608746, 41.8084267863));
		segmentList.add(new SegmentModel("637", -87.7431700421, 41.8003419432,
				-87.7421614891, 41.7930370853));
		segmentList.add(new SegmentModel("844", -87.8071231837, 41.9827784576,
				-87.8072020843, 41.9754681394));
		segmentList.add(new SegmentModel("783", -87.7483246455, 41.9900367205,
				-87.7506659344, 41.9902977051));
		segmentList.add(new SegmentModel("367", -87.6892644434, 41.9831666552,
				-87.6894886422, 41.9904989723));
		segmentList.add(new SegmentModel("297", -87.6545461948, 41.9543511743,
				-87.6497013008, 41.9544240318));
		segmentList.add(new SegmentModel("1233", -87.643023, 41.706916,
				-87.642797, 41.69964));
		segmentList.add(new SegmentModel("1028", -87.6324858898, 41.8867920358,
				-87.6279765117, 41.8866764518));
		segmentList.add(new SegmentModel("1273", -87.657142, 41.881715,
				-87.666802, 41.881554));
		segmentList.add(new SegmentModel("230", -87.7545575569, 41.8658505637,
				-87.7643523849, 41.8657559551));
		segmentList.add(new SegmentModel("691", -87.6154529143, 41.7801815775,
				-87.6156377043, 41.7875159099));
		segmentList.add(new SegmentModel("1183", -87.6601728465, 41.9982075605,
				-87.6607357537, 42.0055389804));
		segmentList.add(new SegmentModel("938", -87.7124336581, 41.9319531692,
				-87.700590308, 41.9247916859));
		segmentList.add(new SegmentModel("1196", -87.642187, 41.692355,
				-87.642417, 41.69964));
		segmentList.add(new SegmentModel("1306", -87.630336, 41.867374,
				-87.630574, 41.874521));
		segmentList.add(new SegmentModel("411", -87.6245276216, 41.7508298555,
				-87.6149133035, 41.7510141454));
		segmentList.add(new SegmentModel("1185", -87.6605728465, 41.9982097226,
				-87.6603094445, 41.9854635087));
		segmentList.add(new SegmentModel("967", -87.67507424, 41.82304972,
				-87.66551, 41.82307531));
		segmentList.add(new SegmentModel("1026", -87.6367881652, 41.8857235783,
				-87.6352595929, 41.8868541443));
		segmentList.add(new SegmentModel("1083", -87.5888058664, 41.6598188126,
				-87.5592878166, 41.6590521297));
		segmentList.add(new SegmentModel("176", -87.6645803881, 41.7941615692,
				-87.6742991606, 41.7940535229));
		segmentList.add(new SegmentModel("1098", -87.8036133151, 41.8502380854,
				-87.7834806928, 41.8507279962));
		segmentList.add(new SegmentModel("391", -87.6864530829, 41.8760846544,
				-87.686221969, 41.8666135775));
		segmentList.add(new SegmentModel("1193", -87.6192241821, 41.8530029925,
				-87.6185256664, 41.8493505614));
		segmentList.add(new SegmentModel("817", -87.5869009635, 41.7915709546,
				-87.5868421143, 41.7878819901));
		segmentList.add(new SegmentModel("211", -87.6482701057, 41.9110568232,
				-87.6621596195, 41.910843339));
		segmentList.add(new SegmentModel("102", -87.6632541367, 41.7503560091,
				-87.663612718, 41.7649079607));
		segmentList.add(new SegmentModel("862", -87.6280379804, 41.8908659481,
				-87.6241289611, 41.890933613));
		segmentList.add(new SegmentModel("1270", -87.636891, 41.882014,
				-87.647361, 41.881876));
		segmentList.add(new SegmentModel("755", -87.5354182726, 41.7213286555,
				-87.5354586494, 41.7128142135));
		segmentList.add(new SegmentModel("696", -87.6165993704, 41.8166344948,
				-87.616805129, 41.823824691));
		segmentList.add(new SegmentModel("484", -87.670578725, 41.6920630313,
				-87.6811653381, 41.6919091649));
		segmentList.add(new SegmentModel("610", -87.6128230691, 41.8489786419,
				-87.6085348206, 41.8385740621));
		segmentList.add(new SegmentModel("1100", -87.7634806928, 41.8507279962,
				-87.7442689094, 41.8512059248));
		segmentList.add(new SegmentModel("268", -87.6921980271, 41.7355199254,
				-87.7020951833, 41.7353577848));
		segmentList.add(new SegmentModel("536", -87.705218541, 41.8517448606,
				-87.6954340136, 41.8517403631));
		segmentList.add(new SegmentModel("198", -87.7756143071, 41.9093998422,
				-87.7849627555, 41.909248873));
		segmentList.add(new SegmentModel("291", -87.708016216, 41.9537825128,
				-87.6982419087, 41.9538366862));
		segmentList.add(new SegmentModel("1229", -87.64882, 41.932719,
				-87.649077, 41.939979));
		segmentList.add(new SegmentModel("324", -87.7657253832, 41.9092415237,
				-87.7557968589, 41.9093640671));
		segmentList.add(new SegmentModel("512", -87.73316995, 41.80029696,
				-87.74290093, 41.79877485));
		segmentList.add(new SegmentModel("403", -87.6886500432, 41.954013773,
				-87.6884415055, 41.9467318416));
		segmentList.add(new SegmentModel("957", -87.6241579489, 41.8925430126,
				-87.6202722384, 41.8925990544));
		segmentList.add(new SegmentModel("674", -87.6302516413, 41.8382721184,
				-87.6309237336, 41.8455540437));
		segmentList.add(new SegmentModel("149", -87.6663216627, 41.8577948131,
				-87.6662077421, 41.8523321221));
		segmentList.add(new SegmentModel("1259", -87.647935, 41.896397,
				-87.647807, 41.891185));
		segmentList.add(new SegmentModel("296", -87.6622513991, 41.9542409021,
				-87.6545461948, 41.9543511743));
		segmentList.add(new SegmentModel("99", -87.6626684166, 41.7284810983,
				-87.6628819511, 41.7357887154));
		segmentList.add(new SegmentModel("62", -87.7215908065, 41.7205390182,
				-87.7213743744, 41.7131747577));
		segmentList.add(new SegmentModel("1192", -87.6181586591, 41.8493482767,
				-87.619411, 41.8530007099));
		segmentList.add(new SegmentModel("1053", -87.647404773, 41.883031561,
				-87.6370264614, 41.883144306));
		segmentList.add(new SegmentModel("692", -87.6156377043, 41.7875159099,
				-87.615791142, 41.7946755473));
		segmentList.add(new SegmentModel("738", -87.7120661817, 41.9319511814,
				-87.72376658, 41.9391405545));
		segmentList.add(new SegmentModel("452", -87.6634686872, 41.7505652402,
				-87.6730824357, 41.750417551));
		segmentList.add(new SegmentModel("648", -87.7464522852, 41.9242323024,
				-87.7462962254, 41.9169319883));
		segmentList.add(new SegmentModel("697", -87.616805129, 41.823824691,
				-87.6169702483, 41.8311007753));
		segmentList.add(new SegmentModel("1209", -87.64478, 41.787025,
				-87.64497, 41.794301));
		segmentList.add(new SegmentModel("500", -87.7140372137, 41.8077612143,
				-87.7042605902, 41.8139891446));
		segmentList.add(new SegmentModel("103", -87.663612718, 41.7649079607,
				-87.6638378447, 41.7721909488));
		segmentList.add(new SegmentModel("238", -87.6762482895, 41.8668917757,
				-87.6860370294, 41.8667497479));
		segmentList.add(new SegmentModel("33", -87.7232409373, 41.802316468,
				-87.7234560048, 41.8078826502));
		segmentList.add(new SegmentModel("753", -87.5350520018, 41.7213261115,
				-87.5363594103, 41.7229402903));
		segmentList.add(new SegmentModel("52", -87.7270628829, 41.9411668426,
				-87.727551496, 41.9536468185));
		segmentList.add(new SegmentModel("370", -87.6820264847, 41.7136748244,
				-87.6818034645, 41.7063773615));
		segmentList.add(new SegmentModel("138", -87.6642044154, 41.7721930844,
				-87.6639792472, 41.7649100967));
		segmentList.add(new SegmentModel("487", -87.6329215921, 41.6925984414,
				-87.6423633676, 41.6925071489));
		segmentList.add(new SegmentModel("1037", -87.627973493, 41.8869508682,
				-87.6324828907, 41.8870664305));
		segmentList.add(new SegmentModel("1178", -87.5838907781, 41.7925056725,
				-87.5803028186, 41.7922806244));
		segmentList.add(new SegmentModel("576", -87.7456284502, 41.8949856048,
				-87.7458024865, 41.9023415361));
		segmentList.add(new SegmentModel("25", -87.7212449539, 41.7348566529,
				-87.7215654587, 41.742178062));
		segmentList.add(new SegmentModel("513", -87.72348218, 41.80245859,
				-87.73316995, 41.80029696));
		segmentList.add(new SegmentModel("789", -87.6896910614, 41.9906579206,
				-87.6993974307, 41.9905751568));
		segmentList.add(new SegmentModel("804", -87.5860344826, 41.7733498484,
				-87.5862545245, 41.7806524044));
		segmentList.add(new SegmentModel("796", -87.5857288013, 41.7077680335,
				-87.5849507392, 41.722346361));
		segmentList.add(new SegmentModel("706", -87.6152627045, 41.7584052178,
				-87.6151773651, 41.751121301));
		segmentList.add(new SegmentModel("16", -87.75250618, 41.79302504,
				-87.76223503, 41.7928797));
		segmentList.add(new SegmentModel("883", -87.6319113969, 41.9133832339,
				-87.632854, 41.913172));
		segmentList.add(new SegmentModel("580", -87.6001924641, 41.8252971863,
				-87.6081678831, 41.838571746));
		segmentList.add(new SegmentModel("110", -87.6649647832, 41.8158697299,
				-87.6651248281, 41.8231508628));
		segmentList.add(new SegmentModel("173", -87.6937965741, 41.7938280159,
				-87.7035527348, 41.793651115));
		segmentList.add(new SegmentModel("504", -87.675372871, 41.831689289,
				-87.6657812595, 41.8375620822));
		segmentList.add(new SegmentModel("1251", -87.646466, 41.838046,
				-87.646295, 41.83075));
		segmentList.add(new SegmentModel("759", -87.6202037576, 41.891798492,
				-87.6241461501, 41.8917303986));
		segmentList.add(new SegmentModel("714", -87.6169661907, 41.816636783,
				-87.6167610807, 41.809387166));
		segmentList.add(new SegmentModel("858", -87.7782350055, 41.9733282922,
				-87.7878566714, 41.9763954381));
		segmentList.add(new SegmentModel("257", -87.6630665594, 41.7356525768,
				-87.6533416007, 41.7357981642));
		segmentList.add(new SegmentModel("1055", -87.6143562664, 41.8845180727,
				-87.6206419402, 41.8846520046));
		segmentList.add(new SegmentModel("601", -87.6477852109, 41.9694037972,
				-87.6502830414, 41.9765945008));
		segmentList.add(new SegmentModel("61", -87.7213743744, 41.7131747577,
				-87.7211571147, 41.7059057937));
		segmentList.add(new SegmentModel("444", -87.6926391909, 41.7497658287,
				-87.6827540461, 41.7499136183));
		segmentList.add(new SegmentModel("1184", -87.6607357537, 42.0055389804,
				-87.6632694105, 42.0128288601));
		segmentList.add(new SegmentModel("1181", -87.5802996067, 41.7925550314,
				-87.5838875815, 41.7927800797));
		segmentList.add(new SegmentModel("540", -87.6659431492, 41.8522153617,
				-87.6561829409, 41.8524053768));
		segmentList.add(new SegmentModel("908", -87.62426376, 41.88447407,
				-87.623997, 41.892571));
		segmentList.add(new SegmentModel("481", -87.6329245801, 41.6923240265,
				-87.6210393558, 41.6924819001));
		segmentList.add(new SegmentModel("302", -87.7962712058, 41.9528801018,
				-87.807259682, 41.9529000914));
		segmentList.add(new SegmentModel("960", -87.6202858565, 41.8934286118,
				-87.6242206362, 41.8933239978));
		segmentList.add(new SegmentModel("787", -87.7111087839, 41.9905195564,
				-87.7188675725, 41.9903903804));
		segmentList.add(new SegmentModel("1058", -87.637068542, 41.8845986991,
				-87.6474313736, 41.8844304739));
		segmentList.add(new SegmentModel("29", -87.7223927753, 41.7713729793,
				-87.722645881, 41.7786572624));
		segmentList.add(new SegmentModel("878", -87.6327415777, 41.891601818,
				-87.6326695061, 41.8869348661));
		segmentList.add(new SegmentModel("113", -87.6655581444, 41.8376827898,
				-87.6658407141, 41.8523299896));
		segmentList.add(new SegmentModel("600", -87.6460782274, 41.9620060197,
				-87.6477852109, 41.9694037972));
		segmentList.add(new SegmentModel("1124", -87.7406249198, 41.7201471215,
				-87.740933, 41.7344603497));
		segmentList.add(new SegmentModel("1247", -87.645729, 41.808864,
				-87.645536, 41.801585));
		segmentList.add(new SegmentModel("642", -87.7454413862, 41.8804965805,
				-87.7451745689, 41.8731401541));
		segmentList.add(new SegmentModel("1268", -87.617866, 41.66330931,
				-87.618769, 41.65900629));
		segmentList.add(new SegmentModel("599", -87.6445812375, 41.9546565256,
				-87.6460782274, 41.9620060197));
		segmentList.add(new SegmentModel("1281", -87.620424, 41.891002,
				-87.620742, 41.884414));
		segmentList.add(new SegmentModel("776", -87.7383865392, 41.9898734235,
				-87.7286566934, 41.9900311655));
		segmentList.add(new SegmentModel("852", -87.787859013, 41.9761210286,
				-87.7782373882, 41.9730538829));
		segmentList.add(new SegmentModel("1115", -87.7202991601, 41.6912250073,
				-87.7008290506, 41.6914305788));
		segmentList.add(new SegmentModel("109", -87.6647891274, 41.8086033737,
				-87.6649647832, 41.8158697299));
		segmentList.add(new SegmentModel("632", -87.7419654588, 41.7619000085,
				-87.7416296756, 41.7492033545));
		segmentList.add(new SegmentModel("1269", -87.624366, 41.882109,
				-87.636891, 41.882014));
		segmentList.add(new SegmentModel("860", -87.7614767729, 41.9688518136,
				-87.7675609235, 41.9704709429));
		segmentList.add(new SegmentModel("1244", -87.64516, 41.787025,
				-87.644977, 41.779751));
		segmentList.add(new SegmentModel("289", -87.727618462, 41.9535105845,
				-87.7178146252, 41.9536492536));
		segmentList.add(new SegmentModel("466", -87.6432218261, 41.7215954811,
				-87.6529423406, 41.7214266197));
		segmentList.add(new SegmentModel("895", -87.6481529198, 41.9694059924,
				-87.64644589, 41.96200822));
		segmentList.add(new SegmentModel("88", -87.7268100624, 41.917169067,
				-87.726581748, 41.9098896012));
		segmentList.add(new SegmentModel("482", -87.6210393704, 41.6924819001,
				-87.6098570578, 41.6926264754));
		segmentList.add(new SegmentModel("782", -87.6798605752, 41.9905502221,
				-87.6721479065, 41.9906428343));
		segmentList.add(new SegmentModel("564", -87.741598945, 41.7618981214,
				-87.7418663731, 41.7711254297));
		segmentList.add(new SegmentModel("843", -87.8072020843, 41.9754681394,
				-87.8073175404, 41.9682613016));
		segmentList.add(new SegmentModel("1049", -87.6766645172, 41.8820947137,
				-87.6668391286, 41.8822417003));
		segmentList.add(new SegmentModel("702", -87.6145559778, 41.7291923898,
				-87.6143380874, 41.7218576767));
		segmentList.add(new SegmentModel("12", -87.7915747868, 41.7922933877,
				-87.801548143, 41.7920840659));
		segmentList.add(new SegmentModel("532", -87.73451023, 41.8513081642,
				-87.7248565643, 41.8514551448));
		segmentList.add(new SegmentModel("800", -87.5854076784, 41.7442162163,
				-87.5855768194, 41.7515184785));
		segmentList.add(new SegmentModel("357", -87.6872050148, 41.9168043897,
				-87.68745819, 41.9248996489));
		segmentList.add(new SegmentModel("612", -87.6190382545, 41.8674673837,
				-87.6167859369, 41.8579627613));
		segmentList.add(new SegmentModel("100", -87.6628819511, 41.7357887154,
				-87.6630683582, 41.7430756949));
		segmentList.add(new SegmentModel("969", -87.64595204, 41.82339009,
				-87.63050842, 41.82371453));
		segmentList.add(new SegmentModel("640", -87.7437314373, 41.8220494381,
				-87.7435184383, 41.8149319078));
		segmentList.add(new SegmentModel("393", -87.6868781339, 41.8906490928,
				-87.6866681673, 41.8829972374));
		segmentList.add(new SegmentModel("347", -87.6850393262, 41.8390729803,
				-87.6854567493, 41.8520308712));
		return segmentList;
	}

	
}
