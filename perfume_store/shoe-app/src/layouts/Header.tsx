import React from 'react';
import { Link, useLocation, useNavigate } from 'react-router-dom';
import { FaSearch } from "react-icons/fa";
import { FaCartShopping } from "react-icons/fa6";
import { useCart } from '../contexts/CartContext';
import { isAuthenticated } from '../services/auth.service';

const Header: React.FC = () => {
    const navigate = useNavigate();
    const location = useLocation();
    const { cartTotal } = useCart();

    const handleChangeKeyword = (keyword: string) => {
        navigate('/product-page', { state: { keyword } });
        console.log(keyword);
    }

    return (
        <header className="bg-gradient-to-r from-blue-500 to-purple-600 p-5 fixed left-0 right-0 top-12 shadow-lg z-50">
            <div className="container mx-auto flex items-center justify-between">
                {/* Logo */}
                <div className="flex items-center mr-10">
                    <div>
                        <img
                            src="https://media.istockphoto.com/id/1406611044/vi/vec-to/thi%E1%BA%BFt-k%E1%BA%BF-logo-chai-n%C6%B0%E1%BB%9Bc-hoa-sang-tr%E1%BB%8Dng-minh-h%E1%BB%8Da-cho-m%E1%BB%B9-ph%E1%BA%A9m-l%C3%A0m-%C4%91%E1%BA%B9p-th%E1%BA%A9m-m%E1%BB%B9-vi%E1%BB%87n-s%E1%BA%A3n-ph%E1%BA%A9m.jpg?s=612x612&w=0&k=20&c=R6pze5UeNvGGQtJpRViiS9YlLduaF7HahXuVDuxhgnk="
                            alt="Logo"
                            width={40}
                            height={40}
                            className="cursor-pointer transform hover:scale-105 transition-transform"
                            onClick={() => navigate('/')}
                        />
                    </div>
                </div>

                {/* Navigation Links */}
                <nav className="flex-grow">
                    <ul className="flex space-x-8 justify-start text-lg text-white">
                        <li>
                            <Link to="/" className="hover:text-yellow-300 transition-colors duration-300 ease-in-out">TRANG CHỦ</Link>
                        </li>
                        <li>
                            <Link to="/product-page" className="hover:text-yellow-300 transition-colors duration-300 ease-in-out">SẢN PHẨM</Link>
                        </li>
                        <li>
                            <Link to="/contact" className="hover:text-yellow-300 transition-colors duration-300 ease-in-out">LIÊN HỆ</Link>
                        </li>
                        <li>
                            <Link to="/intro" className="hover:text-yellow-300 transition-colors duration-300 ease-in-out">GIỚI THIỆU</Link>
                        </li>
                    </ul>
                </nav>

                {/* Search Bar and Cart Icon */}
                <div className="flex items-center space-x-6">
                    {/* Search Bar */}
                    <div className="relative">
                        <input
                            type="text"
                            placeholder="Tìm kiếm..."
                            className="p-2 pl-4 pr-10 border border-gray-300 rounded-md focus:outline-none focus:ring-2 focus:ring-yellow-300 transition-all duration-300 ease-in-out"
                            onChange={(e) => handleChangeKeyword(e.target.value)}
                        />
                        <FaSearch className="absolute right-3 top-2 text-gray-600 hover:text-yellow-300 transition-colors duration-300" size={24} />
                    </div>

                    {/* Cart Icon */}
                    <div className="relative hover:scale-110 transition-transform duration-300 ease-in-out">
                        <Link to="/cart">
                            <FaCartShopping size={35} className="text-white hover:text-yellow-300 transition-colors duration-300 ease-in-out" />
                        </Link>
                        <span className="absolute bg-red-600 text-white rounded-full text-xs w-4 h-4 flex items-center justify-center" style={{ top: -5, right: -5 }}>
                            {isAuthenticated() ? cartTotal : 0}
                        </span>
                    </div>
                </div>
            </div>
        </header>
    );
};

export default Header;
